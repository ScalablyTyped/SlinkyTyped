package typingsSlinky.multer.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.multer.anon.PartialFile
import typingsSlinky.multer.mod.global.Express.Multer.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Implementations of this interface are responsible for storing files
  * encountered by Multer and returning information on how to access them
  * once stored. Implementations must also provide a method for removing
  * files in the event that an error occurs.
  */
trait StorageEngine extends js.Object {
  /**
    * Store the file described by `file`, then invoke the callback with
    * information about the stored file.
    *
    * File contents are available as a stream via `file.stream`. Information
    * passed to the callback will be merged with `file` for subsequent
    * middleware.
    *
    * @param req The Express `Request` object.
    * @param file Object with `stream`, `fieldname`, `originalname`, `encoding`, and `mimetype` defined.
    * @param callback Callback to specify file information.
    */
  def _handleFile(
    req: Request_[ParamsDictionary, _, _, Query],
    file: File,
    callback: js.Function2[/* error */ js.UndefOr[js.Any], /* info */ js.UndefOr[PartialFile], Unit]
  ): Unit
  /**
    * Remove the file described by `file`, then invoke the callback with.
    *
    * `file` contains all the properties available to `_handleFile`, as
    * well as those returned by `_handleFile`.
    *
    * @param req The Express `Request` object.
    * @param file Object containing information about the processed file.
    * @param callback Callback to indicate completion.
    */
  def _removeFile(
    req: Request_[ParamsDictionary, _, _, Query],
    file: File,
    callback: js.Function1[/* error */ js.Error, Unit]
  ): Unit
}

object StorageEngine {
  @scala.inline
  def apply(
    _handleFile: (Request_[ParamsDictionary, _, _, Query], File, js.Function2[/* error */ js.UndefOr[js.Any], /* info */ js.UndefOr[PartialFile], Unit]) => Unit,
    _removeFile: (Request_[ParamsDictionary, _, _, Query], File, js.Function1[/* error */ js.Error, Unit]) => Unit
  ): StorageEngine = {
    val __obj = js.Dynamic.literal(_handleFile = js.Any.fromFunction3(_handleFile), _removeFile = js.Any.fromFunction3(_removeFile))
    __obj.asInstanceOf[StorageEngine]
  }
}


package typingsSlinky.cordovaPluginFileTransfer

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class FileTransfer ()
    extends typingsSlinky.cordovaPluginFileTransfer.FileTransfer
  
  @js.native
  class FileTransferError protected ()
    extends typingsSlinky.cordovaPluginFileTransfer.FileTransferError {
    /** Constructor for FileTransferError object */
    def this(
      code: js.UndefOr[Double],
      source: js.UndefOr[String],
      target: js.UndefOr[String],
      status: js.UndefOr[Double],
      body: js.UndefOr[js.Any],
      exception: js.UndefOr[js.Any]
    ) = this()
  }
  
  @js.native
  object FileTransfer
    extends Instantiable0[typingsSlinky.cordovaPluginFileTransfer.FileTransfer]
  
  @js.native
  object FileTransferError
    extends /** Constructor for FileTransferError object */
  Instantiable6[
          js.UndefOr[/* code */ Double], 
          js.UndefOr[/* source */ String], 
          js.UndefOr[/* target */ String], 
          js.UndefOr[/* status */ Double], 
          js.UndefOr[/* body */ js.Any], 
          js.UndefOr[/* exception */ js.Any], 
          typingsSlinky.cordovaPluginFileTransfer.FileTransferError
        ] {
    var ABORT_ERR: Double = js.native
    var CONNECTION_ERR: Double = js.native
    var FILE_NOT_FOUND_ERR: Double = js.native
    var INVALID_URL_ERR: Double = js.native
    var NOT_MODIFIED_ERR: Double = js.native
  }
  
}


package typingsSlinky.expressFileupload.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.NextFunction
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://github.com/richardgirges/express-fileupload#available-options}
  */
@js.native
trait Options
  extends /* property */ StringDictionary[js.Any] {
  /**
    * Returns a HTTP 413 when the file is bigger than the size limit if `true`.
    * Otherwise, it will add a `truncated = true` to the resulting file structure.
    * @default false
    */
  var abortOnLimit: js.UndefOr[Boolean] = js.native
  /** Automatically creates the directory path specified in `.mv(filePathName)` */
  var createParentPath: js.UndefOr[Boolean] = js.native
  /**
    * Turn on/off upload process logging.
    * Can be useful for troubleshooting.
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * User defined limit handler which will be invoked if the file is bigger than configured limits.
    */
  var limitHandler: js.UndefOr[Boolean | (RequestHandler[ParamsDictionary, _, _, Query])] = js.native
  /**
    * By default, `req.body` and `req.files`
    * are flattened like this: `{'name': 'John', 'hobbies[0]': 'Cinema', 'hobbies[1]': 'Bike'}`
    *
    * When this option is enabled they are parsed in order to be nested like this:
    * `{'name': 'John', 'hobbies': ['Cinema', 'Bike']}`
    */
  var parseNested: js.UndefOr[Boolean] = js.native
  /**
    * Preserves filename extension when using safeFileNames option.
    * If set to `true`, will default to an extension length of 3.
    * If set to `Number`, this will be the max allowable extension length. If an extension is smaller than the extension length, it remains untouched. If the extension is longer, it is shifted.
    */
  var preserveExtension: js.UndefOr[Boolean | Double] = js.native
  /**
    * Response which will be send to client if file size limit exceeded when `abortOnLimit` set to `true`.
    */
  var responseOnLimit: js.UndefOr[String] = js.native
  /**
    * Strips characters from the upload's filename.
    * You can use custom regex to determine what to strip.
    * If set to true, non-alphanumeric characters except dashes and underscores will be stripped.
    * This option is off by default.
    */
  var safeFileNames: js.UndefOr[Boolean | js.RegExp] = js.native
  /**
    * Path to store temporary files.
    * Used along with the `useTempFiles` option.
    * By default this module uses 'tmp' folder in the current working directory.
    * You can use trailing slash, but it is not necessary.
    */
  var tempFileDir: js.UndefOr[String] = js.native
  /**
    * @default 60000
    */
  var uploadTimeout: js.UndefOr[Double] = js.native
  /**
    * Applies uri decoding to file names if set true.
    * @default false
    */
  var uriDecodeFileNames: js.UndefOr[Boolean] = js.native
  /**
    * By default this module uploads files into RAM.
    * Setting this option to True turns on using temporary files instead of utilising RAM. This avoids memory overflow issues when uploading large files
    * or in case of uploading lots of files at same time.
    */
  var useTempFiles: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbortOnLimit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortOnLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbortOnLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortOnLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateParentPath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createParentPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateParentPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createParentPath")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withLimitHandlerFunction3(
      value: (/* req */ Request[ParamsDictionary, _, _, Query], /* res */ Response[_], /* next */ NextFunction) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitHandler")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withLimitHandler(value: Boolean | (RequestHandler[ParamsDictionary, _, _, Query])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimitHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withParseNested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseNested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParseNested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseNested")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveExtension(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveExtension")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseOnLimit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseOnLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseOnLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseOnLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withSafeFileNamesRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeFileNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSafeFileNames(value: Boolean | js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeFileNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafeFileNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeFileNames")(js.undefined)
        ret
    }
    @scala.inline
    def withTempFileDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempFileDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTempFileDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempFileDir")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withUriDecodeFileNames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriDecodeFileNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUriDecodeFileNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriDecodeFileNames")(js.undefined)
        ret
    }
    @scala.inline
    def withUseTempFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTempFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseTempFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTempFiles")(js.undefined)
        ret
    }
  }
  
}


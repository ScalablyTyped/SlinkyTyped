package typingsSlinky.restify.mod.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ************ This module includes the following data parsing plugins:
@js.native
trait BodyParserOptions extends js.Object {
  /**
    * If you want checksums calculated for incoming files, set this to either sha1 or md5.
    */
  var hash: js.UndefOr[String] = js.native
  /**
    * If you want the uploaded files to include the extensions of the original files (multipart uploads only). Does nothing if multipartFileHandler is defined.
    */
  var keepExtensions: js.UndefOr[Boolean] = js.native
  /**
    * If req.params should be filled with the contents of files sent through a multipart request.
    * Formidable is used internally for parsing, and a file is denoted as a multipart part with the filename option set in its Content-Disposition.
    * This will only be performed if mapParams is true.
    */
  var mapFiles: js.UndefOr[Boolean] = js.native
  /**
    * If req.params should be filled with parsed parameters from HTTP body.
    */
  var mapParams: js.UndefOr[Boolean] = js.native
  /**
    * The maximum size in bytes allowed in the HTTP body. Useful for limiting clients from hogging server memory.
    */
  var maxBodySize: js.UndefOr[Double] = js.native
  var maxFieldsSize: js.UndefOr[Double] = js.native
  var maxFileSize: js.UndefOr[Double] = js.native
  /**
    * A callback to handle any multipart file.
    * It will be a file if the part have a Content-Disposition with the filename parameter set.
    * This typically happens when a browser sends a form and there is a parameter similar to <input type="file" />.
    * If this is not provided, the default behaviour is to map the contents into req.params.
    */
  var multipartFileHandler: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * A callback to handle any multipart part which is not a file.
    * If this is omitted, the default handler is invoked which may or may not map the parts into req.params, depending on the mapParams-option.
    */
  var multipartHandler: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * If you want to support html5 multiple attribute in upload fields.
    */
  var multiples: js.UndefOr[Boolean] = js.native
  /**
    * If an entry in req.params should be overwritten by the value in the body if the names are the same.
    * For instance, if you have the route /:someval, and someone posts an x-www-form-urlencoded Content-Type with the body someval=happy to /sad,
    * the value will be happy if overrideParams is true, sad otherwise.
    */
  var overrideParams: js.UndefOr[Boolean] = js.native
  /**
    * Set to true if you want to end the request with a UnsupportedMediaTypeError when none of the supported content types was given.
    */
  var rejectUnknown: js.UndefOr[Boolean] = js.native
  var requestBodyOnGet: js.UndefOr[Boolean] = js.native
  var reviver: js.UndefOr[js.Any] = js.native
  /**
    * Where uploaded files are intermediately stored during transfer before the contents is mapped into req.params. Does nothing if multipartFileHandler is defined.
    */
  var uploadDir: js.UndefOr[String] = js.native
}

object BodyParserOptions {
  @scala.inline
  def apply(): BodyParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BodyParserOptions]
  }
  @scala.inline
  implicit class BodyParserOptionsOps[Self <: BodyParserOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepExtensions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepExtensions")(js.undefined)
        ret
    }
    @scala.inline
    def withMapFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withMapParams(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapParams")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBodySize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBodySize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBodySize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBodySize")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFieldsSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFieldsSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFieldsSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFieldsSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFileSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFileSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFileSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMultipartFileHandler(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipartFileHandler")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutMultipartFileHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipartFileHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withMultipartHandler(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipartHandler")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutMultipartHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipartHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiples(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiples")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideParams(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideParams")(js.undefined)
        ret
    }
    @scala.inline
    def withRejectUnknown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectUnknown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejectUnknown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectUnknown")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestBodyOnGet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestBodyOnGet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestBodyOnGet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestBodyOnGet")(js.undefined)
        ret
    }
    @scala.inline
    def withReviver(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReviver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviver")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadDir")(js.undefined)
        ret
    }
  }
  
}


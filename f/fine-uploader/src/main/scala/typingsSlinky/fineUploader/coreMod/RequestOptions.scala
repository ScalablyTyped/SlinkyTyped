package typingsSlinky.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestOptions extends js.Object {
  /**
    * Additional headers sent along with each upload request
    */
  var customHeaders: js.UndefOr[js.Any] = js.native
  /**
    * The endpoint to send upload requests to
    *
    * @default `'/server/upload'`
    */
  var endpoint: js.UndefOr[String] = js.native
  /**
    * The name of the parameter passed if the original filename has been edited or a `Blob` is being sent
    *
    * @default `'qqfilename'`
    */
  var filenameParam: js.UndefOr[String] = js.native
  /**
    * Force all uploads to use multipart encoding
    *
    * @default `true`
    */
  var forceMultipart: js.UndefOr[Boolean] = js.native
  /**
    * The attribute of the input element which will contain the file name.
    *
    * For non-multipart-encoded upload requests, this will be included as a parameter in the query string of the URI with a value equal to the file name
    *
    * @default `'qqfile'`
    */
  var inputName: js.UndefOr[String] = js.native
  /**
    * Specify a method to use when sending files to a traditional endpoint. This option is ignored in older browsers (such as IE 9 and older)
    *
    * @default `'POST'`
    */
  var method: js.UndefOr[String] = js.native
  /**
    * If set to true, any Fine Uploader created parameters (qq*) will not be sent with the upload request
    * 
    * @default `false`
    */
  var omitDefaultParams: js.UndefOr[Boolean] = js.native
  /**
    * The parameters that shall be sent with each upload request
    */
  var params: js.UndefOr[js.Any] = js.native
  /**
    * Enable or disable sending parameters in the request body.
    *
    * If `false`, parameters are sent in the URL.
    * Otherwise, parameters are sent in the request body
    *
    * @default `true`
    */
  var paramsInBody: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, each upload response MUST contain a JSON message-body with `{success: true}` in order to be considered a success.
    * 
    * If set to false, the success of the request is determined by examining the response status code
    * 
    * @default `true`
    */
  var requireSuccessJson: js.UndefOr[Boolean] = js.native
  /**
    * The name of the parameter passed that specifies the total file size in bytes
    *
    * @default `'qqtotalfilesize'`
    */
  var totalFileSizeName: js.UndefOr[String] = js.native
  /**
    * The name of the parameter the uniquely identifies each associated item. The value is a Level 4 UUID
    *
    * @default `'qquuid'`
    */
  var uuidName: js.UndefOr[String] = js.native
}

object RequestOptions {
  @scala.inline
  def apply(): RequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestOptions]
  }
  @scala.inline
  implicit class RequestOptionsOps[Self <: RequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withFilenameParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filenameParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilenameParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filenameParam")(js.undefined)
        ret
    }
    @scala.inline
    def withForceMultipart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceMultipart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceMultipart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceMultipart")(js.undefined)
        ret
    }
    @scala.inline
    def withInputName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputName")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withOmitDefaultParams(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omitDefaultParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOmitDefaultParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omitDefaultParams")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withParamsInBody(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramsInBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParamsInBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramsInBody")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireSuccessJson(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireSuccessJson")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireSuccessJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireSuccessJson")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalFileSizeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalFileSizeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalFileSizeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalFileSizeName")(js.undefined)
        ret
    }
    @scala.inline
    def withUuidName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuidName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUuidName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuidName")(js.undefined)
        ret
    }
  }
  
}


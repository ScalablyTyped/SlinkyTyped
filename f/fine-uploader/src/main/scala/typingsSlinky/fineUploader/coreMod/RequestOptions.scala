package typingsSlinky.fineUploader.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestOptions extends StObject {
  
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
  implicit class RequestOptionsMutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomHeaders(value: js.Any): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
    
    @scala.inline
    def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    @scala.inline
    def setFilenameParam(value: String): Self = StObject.set(x, "filenameParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenameParamUndefined: Self = StObject.set(x, "filenameParam", js.undefined)
    
    @scala.inline
    def setForceMultipart(value: Boolean): Self = StObject.set(x, "forceMultipart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceMultipartUndefined: Self = StObject.set(x, "forceMultipart", js.undefined)
    
    @scala.inline
    def setInputName(value: String): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputNameUndefined: Self = StObject.set(x, "inputName", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setOmitDefaultParams(value: Boolean): Self = StObject.set(x, "omitDefaultParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOmitDefaultParamsUndefined: Self = StObject.set(x, "omitDefaultParams", js.undefined)
    
    @scala.inline
    def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsInBody(value: Boolean): Self = StObject.set(x, "paramsInBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsInBodyUndefined: Self = StObject.set(x, "paramsInBody", js.undefined)
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setRequireSuccessJson(value: Boolean): Self = StObject.set(x, "requireSuccessJson", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireSuccessJsonUndefined: Self = StObject.set(x, "requireSuccessJson", js.undefined)
    
    @scala.inline
    def setTotalFileSizeName(value: String): Self = StObject.set(x, "totalFileSizeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalFileSizeNameUndefined: Self = StObject.set(x, "totalFileSizeName", js.undefined)
    
    @scala.inline
    def setUuidName(value: String): Self = StObject.set(x, "uuidName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuidNameUndefined: Self = StObject.set(x, "uuidName", js.undefined)
  }
}

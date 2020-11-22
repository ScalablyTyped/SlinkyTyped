package typingsSlinky.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.maximMazurokGapiClientMl.maximMazurokGapiClientMlStrings.GoogleApi__HttpBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleApiHttpBody extends js.Object {
  
  /** The HTTP Content-Type header value specifying the content type of the body. */
  var contentType: js.UndefOr[String] = js.native
  
  /** The HTTP request/response body as raw binary. */
  var data: js.UndefOr[String] = js.native
  
  /** Application specific response metadata. Must be set in the first response for streaming APIs. */
  var extensions: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ GoogleApi__HttpBody with TopLevel[js.Any]
    ]
  ] = js.native
}
object GoogleApiHttpBody {
  
  @scala.inline
  def apply(): GoogleApiHttpBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleApiHttpBody]
  }
  
  @scala.inline
  implicit class GoogleApiHttpBodyOps[Self <: GoogleApiHttpBody] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ GoogleApi__HttpBody with TopLevel[js.Any])*
    ): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(
      value: js.Array[
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ GoogleApi__HttpBody with TopLevel[js.Any]
        ]
    ): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
  }
}

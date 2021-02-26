package typingsSlinky.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportApiRequest extends StObject {
  
  /**
    * Specifies how to interpret the base path of the API during import. Valid values are ignore, prepend, and split. The default value is ignore. To learn more, see Set the OpenAPI basePath Property. Supported only for HTTP APIs.
    */
  var Basepath: js.UndefOr[string] = js.native
  
  /**
    * The OpenAPI definition. Supported only for HTTP APIs.
    */
  var Body: string = js.native
  
  /**
    * Specifies whether to rollback the API creation when a warning is encountered. By default, API creation continues if a warning is encountered.
    */
  var FailOnWarnings: js.UndefOr[boolean] = js.native
}
object ImportApiRequest {
  
  @scala.inline
  def apply(Body: string): ImportApiRequest = {
    val __obj = js.Dynamic.literal(Body = Body.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportApiRequest]
  }
  
  @scala.inline
  implicit class ImportApiRequestMutableBuilder[Self <: ImportApiRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasepath(value: string): Self = StObject.set(x, "Basepath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasepathUndefined: Self = StObject.set(x, "Basepath", js.undefined)
    
    @scala.inline
    def setBody(value: string): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailOnWarnings(value: boolean): Self = StObject.set(x, "FailOnWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailOnWarningsUndefined: Self = StObject.set(x, "FailOnWarnings", js.undefined)
  }
}

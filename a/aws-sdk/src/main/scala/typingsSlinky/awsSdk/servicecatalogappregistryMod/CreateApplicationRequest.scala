package typingsSlinky.awsSdk.servicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateApplicationRequest extends StObject {
  
  /**
    * A unique identifier that you provide to ensure idempotency. If you retry a request that completed successfully using the same client token and the same parameters, the retry succeeds without performing any further actions. If you retry a successful request using the same client token, but one or more of the parameters are different, the retry fails.
    */
  var clientToken: ClientToken = js.native
  
  /**
    * The description of the application.
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    * The name of the application. The name must be unique in the region in which you are creating the application.
    */
  var name: Name = js.native
  
  /**
    * Key-value pairs you can use to associate with the application.
    */
  var tags: js.UndefOr[Tags] = js.native
}
object CreateApplicationRequest {
  
  @scala.inline
  def apply(clientToken: ClientToken, name: Name): CreateApplicationRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationRequest]
  }
  
  @scala.inline
  implicit class CreateApplicationRequestMutableBuilder[Self <: CreateApplicationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}

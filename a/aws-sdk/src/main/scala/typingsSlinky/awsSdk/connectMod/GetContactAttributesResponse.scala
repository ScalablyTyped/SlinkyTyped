package typingsSlinky.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetContactAttributesResponse extends StObject {
  
  /**
    * Information about the attributes.
    */
  var Attributes: js.UndefOr[typingsSlinky.awsSdk.connectMod.Attributes] = js.native
}
object GetContactAttributesResponse {
  
  @scala.inline
  def apply(): GetContactAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContactAttributesResponse]
  }
  
  @scala.inline
  implicit class GetContactAttributesResponseMutableBuilder[Self <: GetContactAttributesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: Attributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
  }
}

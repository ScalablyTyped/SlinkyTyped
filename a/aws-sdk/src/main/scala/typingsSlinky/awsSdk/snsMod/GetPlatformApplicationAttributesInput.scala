package typingsSlinky.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPlatformApplicationAttributesInput extends StObject {
  
  /**
    * PlatformApplicationArn for GetPlatformApplicationAttributesInput.
    */
  var PlatformApplicationArn: String = js.native
}
object GetPlatformApplicationAttributesInput {
  
  @scala.inline
  def apply(PlatformApplicationArn: String): GetPlatformApplicationAttributesInput = {
    val __obj = js.Dynamic.literal(PlatformApplicationArn = PlatformApplicationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPlatformApplicationAttributesInput]
  }
  
  @scala.inline
  implicit class GetPlatformApplicationAttributesInputMutableBuilder[Self <: GetPlatformApplicationAttributesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlatformApplicationArn(value: String): Self = StObject.set(x, "PlatformApplicationArn", value.asInstanceOf[js.Any])
  }
}

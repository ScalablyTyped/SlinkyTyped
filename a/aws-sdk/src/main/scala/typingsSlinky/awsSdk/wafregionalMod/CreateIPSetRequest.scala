package typingsSlinky.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateIPSetRequest extends StObject {
  
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typingsSlinky.awsSdk.wafregionalMod.ChangeToken = js.native
  
  /**
    * A friendly name or description of the IPSet. You can't change Name after you create the IPSet.
    */
  var Name: ResourceName = js.native
}
object CreateIPSetRequest {
  
  @scala.inline
  def apply(ChangeToken: ChangeToken, Name: ResourceName): CreateIPSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIPSetRequest]
  }
  
  @scala.inline
  implicit class CreateIPSetRequestMutableBuilder[Self <: CreateIPSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}

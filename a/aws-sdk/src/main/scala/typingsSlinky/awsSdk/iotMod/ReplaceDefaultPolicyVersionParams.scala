package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplaceDefaultPolicyVersionParams extends StObject {
  
  /**
    * The name of the template to be applied. The only supported value is BLANK_POLICY.
    */
  var templateName: PolicyTemplateName = js.native
}
object ReplaceDefaultPolicyVersionParams {
  
  @scala.inline
  def apply(templateName: PolicyTemplateName): ReplaceDefaultPolicyVersionParams = {
    val __obj = js.Dynamic.literal(templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceDefaultPolicyVersionParams]
  }
  
  @scala.inline
  implicit class ReplaceDefaultPolicyVersionParamsMutableBuilder[Self <: ReplaceDefaultPolicyVersionParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplateName(value: PolicyTemplateName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}

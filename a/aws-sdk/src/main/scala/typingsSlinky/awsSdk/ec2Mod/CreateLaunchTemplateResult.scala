package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLaunchTemplateResult extends StObject {
  
  /**
    * Information about the launch template.
    */
  var LaunchTemplate: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.LaunchTemplate] = js.native
  
  /**
    * If the launch template contains parameters or parameter combinations that are not valid, an error code and an error message are returned for each issue that's found.
    */
  var Warning: js.UndefOr[ValidationWarning] = js.native
}
object CreateLaunchTemplateResult {
  
  @scala.inline
  def apply(): CreateLaunchTemplateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLaunchTemplateResult]
  }
  
  @scala.inline
  implicit class CreateLaunchTemplateResultMutableBuilder[Self <: CreateLaunchTemplateResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLaunchTemplate(value: LaunchTemplate): Self = StObject.set(x, "LaunchTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateUndefined: Self = StObject.set(x, "LaunchTemplate", js.undefined)
    
    @scala.inline
    def setWarning(value: ValidationWarning): Self = StObject.set(x, "Warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "Warning", js.undefined)
  }
}

package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchTemplateSpecification extends js.Object {
  
  /**
    * A unique identifier for an existing EC2 launch template.
    */
  var LaunchTemplateId: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.LaunchTemplateId] = js.native
  
  /**
    * A readable identifier for an existing EC2 launch template. 
    */
  var LaunchTemplateName: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.LaunchTemplateName] = js.native
  
  /**
    * The version of the EC2 launch template to use. If no version is specified, the default version will be used. With Amazon EC2, you can specify a default version for a launch template. If none is set, the default is the first version created.
    */
  var Version: js.UndefOr[LaunchTemplateVersion] = js.native
}
object LaunchTemplateSpecification {
  
  @scala.inline
  def apply(): LaunchTemplateSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateSpecification]
  }
  
  @scala.inline
  implicit class LaunchTemplateSpecificationOps[Self <: LaunchTemplateSpecification] (val x: Self) extends AnyVal {
    
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
    def setLaunchTemplateId(value: LaunchTemplateId): Self = this.set("LaunchTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchTemplateId: Self = this.set("LaunchTemplateId", js.undefined)
    
    @scala.inline
    def setLaunchTemplateName(value: LaunchTemplateName): Self = this.set("LaunchTemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchTemplateName: Self = this.set("LaunchTemplateName", js.undefined)
    
    @scala.inline
    def setVersion(value: LaunchTemplateVersion): Self = this.set("Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
}

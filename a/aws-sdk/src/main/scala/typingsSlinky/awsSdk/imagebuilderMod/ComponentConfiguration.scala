package typingsSlinky.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentConfiguration extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the component. 
    */
  var componentArn: ComponentVersionArnOrBuildVersionArn = js.native
}

object ComponentConfiguration {
  @scala.inline
  def apply(componentArn: ComponentVersionArnOrBuildVersionArn): ComponentConfiguration = {
    val __obj = js.Dynamic.literal(componentArn = componentArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentConfiguration]
  }
  @scala.inline
  implicit class ComponentConfigurationOps[Self <: ComponentConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentArn(value: ComponentVersionArnOrBuildVersionArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


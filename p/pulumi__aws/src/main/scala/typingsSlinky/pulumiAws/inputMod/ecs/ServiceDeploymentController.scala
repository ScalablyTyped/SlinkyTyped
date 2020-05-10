package typingsSlinky.pulumiAws.inputMod.ecs

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceDeploymentController extends js.Object {
  var `type`: js.UndefOr[Input[String]] = js.native
}

object ServiceDeploymentController {
  @scala.inline
  def apply(): ServiceDeploymentController = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceDeploymentController]
  }
  @scala.inline
  implicit class ServiceDeploymentControllerOps[Self <: ServiceDeploymentController] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}


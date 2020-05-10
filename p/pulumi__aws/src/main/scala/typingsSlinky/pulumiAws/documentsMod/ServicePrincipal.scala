package typingsSlinky.pulumiAws.documentsMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServicePrincipal extends Principal {
  var Service: Input[js.Array[Input[String]] | String] = js.native
}

object ServicePrincipal {
  @scala.inline
  def apply(Service: Input[js.Array[Input[String]] | String]): ServicePrincipal = {
    val __obj = js.Dynamic.literal(Service = Service.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServicePrincipal]
  }
  @scala.inline
  implicit class ServicePrincipalOps[Self <: ServicePrincipal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withService(value: Input[js.Array[Input[String]] | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Service")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


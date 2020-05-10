package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateServiceResponse extends js.Object {
  /**
    * The full description of your service following the create call. If a service is using the ECS deployment controller, the deploymentController and taskSets parameters will not be returned. If the service is using the CODE_DEPLOY deployment controller, the deploymentController, taskSets and deployments parameters will be returned, however the deployments parameter will be an empty list.
    */
  var service: js.UndefOr[Service] = js.native
}

object CreateServiceResponse {
  @scala.inline
  def apply(): CreateServiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateServiceResponse]
  }
  @scala.inline
  implicit class CreateServiceResponseOps[Self <: CreateServiceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withService(value: Service): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(js.undefined)
        ret
    }
  }
  
}


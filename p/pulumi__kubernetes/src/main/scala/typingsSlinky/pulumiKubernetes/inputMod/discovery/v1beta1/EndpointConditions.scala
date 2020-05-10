package typingsSlinky.pulumiKubernetes.inputMod.discovery.v1beta1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EndpointConditions represents the current condition of an endpoint.
  */
@js.native
trait EndpointConditions extends js.Object {
  /**
    * ready indicates that this endpoint is prepared to receive traffic, according to whatever
    * system is managing the endpoint. A nil value indicates an unknown state. In most cases
    * consumers should interpret this unknown state as ready.
    */
  var ready: js.UndefOr[Input[Boolean]] = js.native
}

object EndpointConditions {
  @scala.inline
  def apply(): EndpointConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointConditions]
  }
  @scala.inline
  implicit class EndpointConditionsOps[Self <: EndpointConditions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReady(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(js.undefined)
        ret
    }
  }
  
}


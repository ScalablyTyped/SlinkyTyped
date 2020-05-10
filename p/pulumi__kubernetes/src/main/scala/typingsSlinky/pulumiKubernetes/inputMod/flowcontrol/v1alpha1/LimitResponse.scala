package typingsSlinky.pulumiKubernetes.inputMod.flowcontrol.v1alpha1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LimitResponse defines how to handle requests that can not be executed right now.
  */
@js.native
trait LimitResponse extends js.Object {
  /**
    * `queuing` holds the configuration parameters for queuing. This field may be non-empty only
    * if `type` is `"Queue"`.
    */
  var queuing: js.UndefOr[Input[QueuingConfiguration]] = js.native
  /**
    * `type` is "Queue" or "Reject". "Queue" means that requests that can not be executed upon
    * arrival are held in a queue until they can be executed or a queuing limit is reached.
    * "Reject" means that requests that can not be executed upon arrival are rejected. Required.
    */
  var `type`: Input[String] = js.native
}

object LimitResponse {
  @scala.inline
  def apply(`type`: Input[String]): LimitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitResponse]
  }
  @scala.inline
  implicit class LimitResponseOps[Self <: LimitResponse] (val x: Self) extends AnyVal {
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
    def withQueuing(value: Input[QueuingConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queuing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueuing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queuing")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.pulumiKubernetes.outputMod.flowcontrol.v1alpha1

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
  val queuing: QueuingConfiguration = js.native
  /**
    * `type` is "Queue" or "Reject". "Queue" means that requests that can not be executed upon
    * arrival are held in a queue until they can be executed or a queuing limit is reached.
    * "Reject" means that requests that can not be executed upon arrival are rejected. Required.
    */
  val `type`: String = js.native
}

object LimitResponse {
  @scala.inline
  def apply(queuing: QueuingConfiguration, `type`: String): LimitResponse = {
    val __obj = js.Dynamic.literal(queuing = queuing.asInstanceOf[js.Any])
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
    def withQueuing(value: QueuingConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queuing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


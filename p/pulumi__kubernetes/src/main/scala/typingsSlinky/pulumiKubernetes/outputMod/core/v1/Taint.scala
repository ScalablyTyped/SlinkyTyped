package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The node this Taint is attached to has the "effect" on any pod that does not tolerate the
  * Taint.
  */
@js.native
trait Taint extends js.Object {
  /**
    * Required. The effect of the taint on pods that do not tolerate the taint. Valid effects are
    * NoSchedule, PreferNoSchedule and NoExecute.
    */
  val effect: String = js.native
  /**
    * Required. The taint key to be applied to a node.
    */
  val key: String = js.native
  /**
    * TimeAdded represents the time at which the taint was added. It is only written for
    * NoExecute taints.
    */
  val timeAdded: String = js.native
  /**
    * Required. The taint value corresponding to the taint key.
    */
  val value: String = js.native
}

object Taint {
  @scala.inline
  def apply(effect: String, key: String, timeAdded: String, value: String): Taint = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], timeAdded = timeAdded.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Taint]
  }
  @scala.inline
  implicit class TaintOps[Self <: Taint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEffect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeAdded(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeAdded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


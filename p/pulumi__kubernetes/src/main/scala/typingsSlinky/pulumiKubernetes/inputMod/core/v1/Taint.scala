package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
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
  var effect: Input[String] = js.native
  /**
    * Required. The taint key to be applied to a node.
    */
  var key: Input[String] = js.native
  /**
    * TimeAdded represents the time at which the taint was added. It is only written for
    * NoExecute taints.
    */
  var timeAdded: js.UndefOr[Input[String]] = js.native
  /**
    * Required. The taint value corresponding to the taint key.
    */
  var value: js.UndefOr[Input[String]] = js.native
}

object Taint {
  @scala.inline
  def apply(effect: Input[String], key: Input[String]): Taint = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Taint]
  }
  @scala.inline
  implicit class TaintOps[Self <: Taint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEffect(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeAdded(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeAdded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeAdded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeAdded")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}


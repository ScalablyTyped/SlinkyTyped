package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLifecycleHooksAnswer extends js.Object {
  /**
    * The lifecycle hooks for the specified group.
    */
  var LifecycleHooks: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.LifecycleHooks] = js.native
}

object DescribeLifecycleHooksAnswer {
  @scala.inline
  def apply(): DescribeLifecycleHooksAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLifecycleHooksAnswer]
  }
  @scala.inline
  implicit class DescribeLifecycleHooksAnswerOps[Self <: DescribeLifecycleHooksAnswer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLifecycleHooks(value: LifecycleHooks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LifecycleHooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifecycleHooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LifecycleHooks")(js.undefined)
        ret
    }
  }
  
}


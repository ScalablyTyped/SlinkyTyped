package typingsSlinky.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecyclePolicy extends js.Object {
  /**
    *  A value that describes the period of time that a file is not accessed, after which it transitions to the IA storage class. Metadata operations such as listing the contents of a directory don't count as file access events.
    */
  var TransitionToIA: js.UndefOr[TransitionToIARules] = js.native
}

object LifecyclePolicy {
  @scala.inline
  def apply(): LifecyclePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecyclePolicy]
  }
  @scala.inline
  implicit class LifecyclePolicyOps[Self <: LifecyclePolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransitionToIA(value: TransitionToIARules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitionToIA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionToIA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitionToIA")(js.undefined)
        ret
    }
  }
  
}


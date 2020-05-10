package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelBundleTaskResult extends js.Object {
  /**
    * Information about the bundle task.
    */
  var BundleTask: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.BundleTask] = js.native
}

object CancelBundleTaskResult {
  @scala.inline
  def apply(): CancelBundleTaskResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelBundleTaskResult]
  }
  @scala.inline
  implicit class CancelBundleTaskResultOps[Self <: CancelBundleTaskResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBundleTask(value: BundleTask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BundleTask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBundleTask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BundleTask")(js.undefined)
        ret
    }
  }
  
}


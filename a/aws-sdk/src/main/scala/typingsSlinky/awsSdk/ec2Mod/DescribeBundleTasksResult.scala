package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBundleTasksResult extends js.Object {
  /**
    * Information about the bundle tasks.
    */
  var BundleTasks: js.UndefOr[BundleTaskList] = js.native
}

object DescribeBundleTasksResult {
  @scala.inline
  def apply(): DescribeBundleTasksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBundleTasksResult]
  }
  @scala.inline
  implicit class DescribeBundleTasksResultOps[Self <: DescribeBundleTasksResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBundleTasks(value: BundleTaskList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BundleTasks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBundleTasks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BundleTasks")(js.undefined)
        ret
    }
  }
  
}


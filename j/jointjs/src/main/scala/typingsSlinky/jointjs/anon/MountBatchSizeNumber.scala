package typingsSlinky.jointjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MountBatchSizeNumber extends js.Object {
  var mountBatchSize: js.UndefOr[Double] = js.native
}

object MountBatchSizeNumber {
  @scala.inline
  def apply(): MountBatchSizeNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MountBatchSizeNumber]
  }
  @scala.inline
  implicit class MountBatchSizeNumberOps[Self <: MountBatchSizeNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMountBatchSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountBatchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMountBatchSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountBatchSize")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.jointjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmountBatchSizeNumber extends js.Object {
  var unmountBatchSize: js.UndefOr[Double] = js.native
}

object UnmountBatchSizeNumber {
  @scala.inline
  def apply(): UnmountBatchSizeNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmountBatchSizeNumber]
  }
  @scala.inline
  implicit class UnmountBatchSizeNumberOps[Self <: UnmountBatchSizeNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUnmountBatchSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmountBatchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnmountBatchSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmountBatchSize")(js.undefined)
        ret
    }
  }
  
}


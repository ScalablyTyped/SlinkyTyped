package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDiskGb extends js.Object {
  var diskGb: js.UndefOr[Double] = js.native
}

object AnonDiskGb {
  @scala.inline
  def apply(): AnonDiskGb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDiskGb]
  }
  @scala.inline
  implicit class AnonDiskGbOps[Self <: AnonDiskGb] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiskGb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskGb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskGb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskGb")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.nodeOpenload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadProgress extends js.Object {
  var percent: Double = js.native
  var total: Double = js.native
  var transferred: Double = js.native
}

object UploadProgress {
  @scala.inline
  def apply(percent: Double, total: Double, transferred: Double): UploadProgress = {
    val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], transferred = transferred.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadProgress]
  }
  @scala.inline
  implicit class UploadProgressOps[Self <: UploadProgress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransferred(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferred")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


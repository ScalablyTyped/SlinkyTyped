package typingsSlinky.mongodbMemoryServerCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadProgressT extends js.Object {
  var current: Double = js.native
  var lastPrintedAt: Double = js.native
  var length: Double = js.native
  var totalMb: Double = js.native
}

object DownloadProgressT {
  @scala.inline
  def apply(current: Double, lastPrintedAt: Double, length: Double, totalMb: Double): DownloadProgressT = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], lastPrintedAt = lastPrintedAt.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], totalMb = totalMb.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadProgressT]
  }
  @scala.inline
  implicit class DownloadProgressTOps[Self <: DownloadProgressT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastPrintedAt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPrintedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalMb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalMb")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


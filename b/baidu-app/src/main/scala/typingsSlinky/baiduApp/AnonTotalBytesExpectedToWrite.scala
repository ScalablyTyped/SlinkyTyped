package typingsSlinky.baiduApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTotalBytesExpectedToWrite extends js.Object {
  /** 下载进度百分比 */
  var progress: Double = js.native
  /** 预期需要下载的数据总长度，单位 Bytes */
  var totalBytesExpectedToWrite: Double = js.native
  /** 已经下载的数据长度，单位 Bytes */
  var totalBytesWritten: Double = js.native
}

object AnonTotalBytesExpectedToWrite {
  @scala.inline
  def apply(progress: Double, totalBytesExpectedToWrite: Double, totalBytesWritten: Double): AnonTotalBytesExpectedToWrite = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any], totalBytesExpectedToWrite = totalBytesExpectedToWrite.asInstanceOf[js.Any], totalBytesWritten = totalBytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTotalBytesExpectedToWrite]
  }
  @scala.inline
  implicit class AnonTotalBytesExpectedToWriteOps[Self <: AnonTotalBytesExpectedToWrite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalBytesExpectedToWrite(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesExpectedToWrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalBytesWritten(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesWritten")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


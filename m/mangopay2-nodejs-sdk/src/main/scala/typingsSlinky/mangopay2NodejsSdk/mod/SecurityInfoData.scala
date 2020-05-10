package typingsSlinky.mangopay2NodejsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityInfoData extends js.Object {
  var AVSResult: typingsSlinky.mangopay2NodejsSdk.mod.AVSResult = js.native
}

object SecurityInfoData {
  @scala.inline
  def apply(AVSResult: AVSResult): SecurityInfoData = {
    val __obj = js.Dynamic.literal(AVSResult = AVSResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityInfoData]
  }
  @scala.inline
  implicit class SecurityInfoDataOps[Self <: SecurityInfoData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAVSResult(value: AVSResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AVSResult")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


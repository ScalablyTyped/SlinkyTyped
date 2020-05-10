package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOCRPageResult extends js.Object {
  val OCRZoneResults: IOCRZoneResults = js.native
  val PageNum: Double = js.native
}

object IOCRPageResult {
  @scala.inline
  def apply(OCRZoneResults: IOCRZoneResults, PageNum: Double): IOCRPageResult = {
    val __obj = js.Dynamic.literal(OCRZoneResults = OCRZoneResults.asInstanceOf[js.Any], PageNum = PageNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOCRPageResult]
  }
  @scala.inline
  implicit class IOCRPageResultOps[Self <: IOCRPageResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOCRZoneResults(value: IOCRZoneResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OCRZoneResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageNum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageNum")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


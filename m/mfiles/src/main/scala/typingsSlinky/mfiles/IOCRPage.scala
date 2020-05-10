package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOCRPage extends js.Object {
  var OCRZones: IOCRZones = js.native
  var PageNum: Double = js.native
  def Clone(): IOCRPage = js.native
}

object IOCRPage {
  @scala.inline
  def apply(Clone: () => IOCRPage, OCRZones: IOCRZones, PageNum: Double): IOCRPage = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), OCRZones = OCRZones.asInstanceOf[js.Any], PageNum = PageNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOCRPage]
  }
  @scala.inline
  implicit class IOCRPageOps[Self <: IOCRPage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IOCRPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOCRZones(value: IOCRZones): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OCRZones")(value.asInstanceOf[js.Any])
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


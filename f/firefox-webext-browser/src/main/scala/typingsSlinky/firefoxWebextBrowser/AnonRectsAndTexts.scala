package typingsSlinky.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRectsAndTexts extends js.Object {
  var rectsAndTexts: AnonRectList = js.native
  var textList: String = js.native
}

object AnonRectsAndTexts {
  @scala.inline
  def apply(rectsAndTexts: AnonRectList, textList: String): AnonRectsAndTexts = {
    val __obj = js.Dynamic.literal(rectsAndTexts = rectsAndTexts.asInstanceOf[js.Any], textList = textList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRectsAndTexts]
  }
  @scala.inline
  implicit class AnonRectsAndTextsOps[Self <: AnonRectsAndTexts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRectsAndTexts(value: AnonRectList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectsAndTexts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextList(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


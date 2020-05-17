package typingsSlinky.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RectsAndTexts extends js.Object {
  var rectsAndTexts: RectList = js.native
  var textList: String = js.native
}

object RectsAndTexts {
  @scala.inline
  def apply(rectsAndTexts: RectList, textList: String): RectsAndTexts = {
    val __obj = js.Dynamic.literal(rectsAndTexts = rectsAndTexts.asInstanceOf[js.Any], textList = textList.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectsAndTexts]
  }
  @scala.inline
  implicit class RectsAndTextsOps[Self <: RectsAndTexts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRectsAndTexts(value: RectList): Self = {
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


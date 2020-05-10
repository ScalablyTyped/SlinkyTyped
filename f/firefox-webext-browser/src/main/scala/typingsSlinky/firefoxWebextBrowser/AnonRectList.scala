package typingsSlinky.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRectList extends js.Object {
  var rectList: js.Array[AnonBottom] = js.native
  var textList: js.Array[String] = js.native
}

object AnonRectList {
  @scala.inline
  def apply(rectList: js.Array[AnonBottom], textList: js.Array[String]): AnonRectList = {
    val __obj = js.Dynamic.literal(rectList = rectList.asInstanceOf[js.Any], textList = textList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRectList]
  }
  @scala.inline
  implicit class AnonRectListOps[Self <: AnonRectList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRectList(value: js.Array[AnonBottom]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextList(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


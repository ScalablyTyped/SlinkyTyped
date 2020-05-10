package typingsSlinky.activexAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonScreenTipText extends js.Object {
  val ScreenTipText: js.Any = js.native
  val SourceObject: js.Any = js.native
}

object AnonScreenTipText {
  @scala.inline
  def apply(ScreenTipText: js.Any, SourceObject: js.Any): AnonScreenTipText = {
    val __obj = js.Dynamic.literal(ScreenTipText = ScreenTipText.asInstanceOf[js.Any], SourceObject = SourceObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScreenTipText]
  }
  @scala.inline
  implicit class AnonScreenTipTextOps[Self <: AnonScreenTipText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScreenTipText(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScreenTipText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceObject(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceObject")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


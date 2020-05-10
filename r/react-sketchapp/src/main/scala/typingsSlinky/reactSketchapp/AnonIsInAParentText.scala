package typingsSlinky.reactSketchapp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsInAParentText extends js.Object {
  var isInAParentText: Boolean = js.native
}

object AnonIsInAParentText {
  @scala.inline
  def apply(isInAParentText: Boolean): AnonIsInAParentText = {
    val __obj = js.Dynamic.literal(isInAParentText = isInAParentText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsInAParentText]
  }
  @scala.inline
  implicit class AnonIsInAParentTextOps[Self <: AnonIsInAParentText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsInAParentText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInAParentText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.reactSketchapp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsInAParentText extends js.Object {
  var isInAParentText: Boolean = js.native
}

object IsInAParentText {
  @scala.inline
  def apply(isInAParentText: Boolean): IsInAParentText = {
    val __obj = js.Dynamic.literal(isInAParentText = isInAParentText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsInAParentText]
  }
  @scala.inline
  implicit class IsInAParentTextOps[Self <: IsInAParentText] (val x: Self) extends AnyVal {
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


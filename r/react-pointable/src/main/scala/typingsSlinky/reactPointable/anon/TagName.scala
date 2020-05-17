package typingsSlinky.reactPointable.anon

import typingsSlinky.reactPointable.reactPointableStrings.auto
import typingsSlinky.reactPointable.reactPointableStrings.div
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagName extends js.Object {
  var tagName: div = js.native
  var touchAction: auto = js.native
}

object TagName {
  @scala.inline
  def apply(tagName: div, touchAction: auto): TagName = {
    val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any], touchAction = touchAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagName]
  }
  @scala.inline
  implicit class TagNameOps[Self <: TagName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTagName(value: div): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchAction(value: auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchAction")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


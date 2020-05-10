package typingsSlinky.reactMovable

import org.scalajs.dom.raw.ClientRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNewIndex extends js.Object {
  var newIndex: Double = js.native
  var oldIndex: Double = js.native
  var targetRect: ClientRect = js.native
}

object AnonNewIndex {
  @scala.inline
  def apply(newIndex: Double, oldIndex: Double, targetRect: ClientRect): AnonNewIndex = {
    val __obj = js.Dynamic.literal(newIndex = newIndex.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any], targetRect = targetRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNewIndex]
  }
  @scala.inline
  implicit class AnonNewIndexOps[Self <: AnonNewIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetRect(value: ClientRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetRect")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.atom.anon

import typingsSlinky.atom.mod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewExtent extends js.Object {
  /** A Point representing the replacement extent. */
  var newExtent: Point = js.native
  /** A String representing the replacement text. */
  var newText: String = js.native
  /** A Point representing the replaced extent. */
  var oldExtent: Point = js.native
  /** A Point representing where the change started. */
  var start: Point = js.native
}

object NewExtent {
  @scala.inline
  def apply(newExtent: Point, newText: String, oldExtent: Point, start: Point): NewExtent = {
    val __obj = js.Dynamic.literal(newExtent = newExtent.asInstanceOf[js.Any], newText = newText.asInstanceOf[js.Any], oldExtent = oldExtent.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewExtent]
  }
  @scala.inline
  implicit class NewExtentOps[Self <: NewExtent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewExtent(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldExtent(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.carbonIconHelpers.mod

import typingsSlinky.carbonIconHelpers.anon.Height
import typingsSlinky.carbonIconHelpers.carbonIconHelpersStrings.rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rect extends js.Object {
  var attrs: Height = js.native
  var elem: rect = js.native
}

object Rect {
  @scala.inline
  def apply(attrs: Height, elem: rect): Rect = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], elem = elem.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rect]
  }
  @scala.inline
  implicit class RectOps[Self <: Rect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttrs(value: Height): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElem(value: rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elem")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.reactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutWidth extends js.Object {
  var layout: Width = js.native
}

object LayoutWidth {
  @scala.inline
  def apply(layout: Width): LayoutWidth = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutWidth]
  }
  @scala.inline
  implicit class LayoutWidthOps[Self <: LayoutWidth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayout(value: Width): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


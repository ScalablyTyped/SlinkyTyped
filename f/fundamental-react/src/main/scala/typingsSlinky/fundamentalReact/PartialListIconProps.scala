package typingsSlinky.fundamentalReact

import typingsSlinky.fundamentalReact.iconMod.IconGlyph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/List/List.ListIconProps> */
@js.native
trait PartialListIconProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var glyph: js.UndefOr[IconGlyph] = js.native
}

object PartialListIconProps {
  @scala.inline
  def apply(): PartialListIconProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListIconProps]
  }
  @scala.inline
  implicit class PartialListIconPropsOps[Self <: PartialListIconProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withGlyph(value: IconGlyph): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlyph: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyph")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.fundamentalReact.anon

import typingsSlinky.fundamentalReact.iconMod.IconGlyph
import typingsSlinky.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/List/List.ListIconProps> */
@js.native
trait WeakValidationMapListIcon extends js.Object {
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var glyph: js.UndefOr[Validator[js.UndefOr[IconGlyph | Null]]] = js.native
}

object WeakValidationMapListIcon {
  @scala.inline
  def apply(): WeakValidationMapListIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapListIcon]
  }
  @scala.inline
  implicit class WeakValidationMapListIconOps[Self <: WeakValidationMapListIcon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: Validator[js.UndefOr[Null | String]]): Self = {
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
    def withGlyph(value: Validator[js.UndefOr[IconGlyph | Null]]): Self = {
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


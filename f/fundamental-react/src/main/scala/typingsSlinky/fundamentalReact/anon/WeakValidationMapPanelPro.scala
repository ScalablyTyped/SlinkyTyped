package typingsSlinky.fundamentalReact.anon

import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`1`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`2`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`3`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`4`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`5`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`6`
import typingsSlinky.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Panel/Panel.PanelProps> */
@js.native
trait WeakValidationMapPanelPro extends js.Object {
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var colSpan: js.UndefOr[Validator[js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | Null]]] = js.native
  var disableStyles: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
}

object WeakValidationMapPanelPro {
  @scala.inline
  def apply(): WeakValidationMapPanelPro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapPanelPro]
  }
  @scala.inline
  implicit class WeakValidationMapPanelProOps[Self <: WeakValidationMapPanelPro] (val x: Self) extends AnyVal {
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
    def withColSpan(value: Validator[js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableStyles(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStyles")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.fundamentalReact.anon

import typingsSlinky.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/InputGroup/InputGroup.InputGroupAddonProps> */
@js.native
trait WeakValidationMapInputGro extends js.Object {
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var compact: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var isButton: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
}

object WeakValidationMapInputGro {
  @scala.inline
  def apply(): WeakValidationMapInputGro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapInputGro]
  }
  @scala.inline
  implicit class WeakValidationMapInputGroOps[Self <: WeakValidationMapInputGro] (val x: Self) extends AnyVal {
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
    def withCompact(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(js.undefined)
        ret
    }
    @scala.inline
    def withIsButton(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isButton")(js.undefined)
        ret
    }
  }
  
}


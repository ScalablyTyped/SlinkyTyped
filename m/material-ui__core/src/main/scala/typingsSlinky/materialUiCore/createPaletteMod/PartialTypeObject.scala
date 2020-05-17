package typingsSlinky.materialUiCore.createPaletteMod

import typingsSlinky.materialUiCore.anon.PartialTypeAction
import typingsSlinky.materialUiCore.anon.PartialTypeBackground
import typingsSlinky.materialUiCore.anon.PartialTypeText
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ P in keyof @material-ui/core.@material-ui/core/styles/createPalette.TypeObject ]:? std.Partial<@material-ui/core.@material-ui/core/styles/createPalette.TypeObject[P]>} */
@js.native
trait PartialTypeObject extends js.Object {
  var action: js.UndefOr[PartialTypeAction] = js.native
  var background: js.UndefOr[PartialTypeBackground] = js.native
  var divider: js.UndefOr[Partial[TypeDivider]] = js.native
  var text: js.UndefOr[PartialTypeText] = js.native
}

object PartialTypeObject {
  @scala.inline
  def apply(): PartialTypeObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTypeObject]
  }
  @scala.inline
  implicit class PartialTypeObjectOps[Self <: PartialTypeObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: PartialTypeAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withBackground(value: PartialTypeBackground): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withDivider(value: Partial[TypeDivider]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDivider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divider")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: PartialTypeText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}


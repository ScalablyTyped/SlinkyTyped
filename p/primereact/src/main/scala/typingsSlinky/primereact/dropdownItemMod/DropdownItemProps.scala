package typingsSlinky.primereact.dropdownItemMod

import slinky.core.facade.ReactElement
import typingsSlinky.primereact.anon.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropdownItemProps extends js.Object {
  var onClick: js.UndefOr[js.Function1[/* e */ Option, Unit]] = js.native
  var option: js.UndefOr[js.Object] = js.native
  var selected: js.UndefOr[Boolean] = js.native
  var template: js.UndefOr[js.Function1[/* option */ js.Any, js.UndefOr[ReactElement]]] = js.native
}

object DropdownItemProps {
  @scala.inline
  def apply(): DropdownItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropdownItemProps]
  }
  @scala.inline
  implicit class DropdownItemPropsOps[Self <: DropdownItemProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnClick(value: /* e */ Option => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOption(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("option")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("option")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: /* option */ js.Any => js.UndefOr[ReactElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
  }
  
}


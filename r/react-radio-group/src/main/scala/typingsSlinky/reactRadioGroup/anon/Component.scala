package typingsSlinky.reactRadioGroup.anon

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.reactRadioGroup.mod.Omit
import typingsSlinky.reactRadioGroup.reactRadioGroupStrings.onChange
import typingsSlinky.reactRadioGroup.reactRadioGroupStrings.role
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Component extends js.Object {
  var Component: js.UndefOr[ReactComponentClass[Omit[HTMLProps[_], onChange | role]]] = js.native
  var onChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
  var selectedValue: js.UndefOr[js.Any] = js.native
}

object Component {
  @scala.inline
  def apply(): Component = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Component]
  }
  @scala.inline
  implicit class ComponentOps[Self <: Component] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentFunctionComponent(value: ReactComponentClass[Omit[HTMLProps[_], onChange | role]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentComponentClass(value: ReactComponentClass[Omit[HTMLProps[_], onChange | role]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponent(value: ReactComponentClass[Omit[HTMLProps[_], onChange | role]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Component")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* value */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedValue")(js.undefined)
        ret
    }
  }
  
}


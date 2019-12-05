package typingsSlinky.reactDashRadioDashGroup

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.HTMLProps
import typingsSlinky.reactDashRadioDashGroup.reactDashRadioDashGroupMod.Omit
import typingsSlinky.reactDashRadioDashGroup.reactDashRadioDashGroupStrings.onChange
import typingsSlinky.reactDashRadioDashGroup.reactDashRadioDashGroupStrings.role
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Component extends js.Object {
  var Component: js.UndefOr[ReactComponentClass[Omit[HTMLProps[_], onChange | role]]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
  var selectedValue: js.UndefOr[js.Any] = js.undefined
}

object Anon_Component {
  @scala.inline
  def apply(
    Component: ReactComponentClass[Omit[HTMLProps[_], onChange | role]] = null,
    onChange: /* value */ js.Any => Unit = null,
    selectedValue: js.Any = null
  ): Anon_Component = {
    val __obj = js.Dynamic.literal()
    if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (selectedValue != null) __obj.updateDynamic("selectedValue")(selectedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Component]
  }
}


package typingsSlinky.reactDashGamepad.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashGamepad.reactDashGamepadMod.Axis
import typingsSlinky.reactDashGamepad.reactDashGamepadMod.Button
import typingsSlinky.reactDashGamepad.reactDashGamepadMod.Layout
import typingsSlinky.reactDashGamepad.reactDashGamepadMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashGamepad
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-gamepad", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    deadZone: Int | Double = null,
    gamepadIndex: Int | Double = null,
    layout: Layout = null,
    onA: () => Unit = null,
    onAxisChange: (/* axisName */ Axis, /* value */ Double, /* previousValue */ Double) => Unit = null,
    onB: () => Unit = null,
    onButtonChange: (/* buttonName */ Button, /* pressed */ Boolean) => Unit = null,
    onButtonDown: /* buttonName */ Button => Unit = null,
    onButtonUp: /* buttonName */ Button => Unit = null,
    onConnect: /* gamepadIndex */ Double => Unit = null,
    onDisconnect: /* gamepadIndex */ Double => Unit = null,
    onDown: () => Unit = null,
    onLB: () => Unit = null,
    onLS: () => Unit = null,
    onLT: () => Unit = null,
    onLeft: () => Unit = null,
    onRB: () => Unit = null,
    onRS: () => Unit = null,
    onRT: () => Unit = null,
    onRight: () => Unit = null,
    onUp: () => Unit = null,
    onX: () => Unit = null,
    onY: () => Unit = null,
    stickThreshold: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (deadZone != null) __obj.updateDynamic("deadZone")(deadZone.asInstanceOf[js.Any])
    if (gamepadIndex != null) __obj.updateDynamic("gamepadIndex")(gamepadIndex.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (onA != null) __obj.updateDynamic("onA")(js.Any.fromFunction0(onA))
    if (onAxisChange != null) __obj.updateDynamic("onAxisChange")(js.Any.fromFunction3(onAxisChange))
    if (onB != null) __obj.updateDynamic("onB")(js.Any.fromFunction0(onB))
    if (onButtonChange != null) __obj.updateDynamic("onButtonChange")(js.Any.fromFunction2(onButtonChange))
    if (onButtonDown != null) __obj.updateDynamic("onButtonDown")(js.Any.fromFunction1(onButtonDown))
    if (onButtonUp != null) __obj.updateDynamic("onButtonUp")(js.Any.fromFunction1(onButtonUp))
    if (onConnect != null) __obj.updateDynamic("onConnect")(js.Any.fromFunction1(onConnect))
    if (onDisconnect != null) __obj.updateDynamic("onDisconnect")(js.Any.fromFunction1(onDisconnect))
    if (onDown != null) __obj.updateDynamic("onDown")(js.Any.fromFunction0(onDown))
    if (onLB != null) __obj.updateDynamic("onLB")(js.Any.fromFunction0(onLB))
    if (onLS != null) __obj.updateDynamic("onLS")(js.Any.fromFunction0(onLS))
    if (onLT != null) __obj.updateDynamic("onLT")(js.Any.fromFunction0(onLT))
    if (onLeft != null) __obj.updateDynamic("onLeft")(js.Any.fromFunction0(onLeft))
    if (onRB != null) __obj.updateDynamic("onRB")(js.Any.fromFunction0(onRB))
    if (onRS != null) __obj.updateDynamic("onRS")(js.Any.fromFunction0(onRS))
    if (onRT != null) __obj.updateDynamic("onRT")(js.Any.fromFunction0(onRT))
    if (onRight != null) __obj.updateDynamic("onRight")(js.Any.fromFunction0(onRight))
    if (onUp != null) __obj.updateDynamic("onUp")(js.Any.fromFunction0(onUp))
    if (onX != null) __obj.updateDynamic("onX")(js.Any.fromFunction0(onX))
    if (onY != null) __obj.updateDynamic("onY")(js.Any.fromFunction0(onY))
    if (stickThreshold != null) __obj.updateDynamic("stickThreshold")(stickThreshold.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashGamepad.reactDashGamepadMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = typingsSlinky.reactDashGamepad.reactDashGamepadMod.Props
}


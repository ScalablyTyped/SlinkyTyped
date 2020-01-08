package typingsSlinky.reactDashTouch.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashTouch.reactDashTouchMod.HoldableConfig
import typingsSlinky.reactDashTouch.reactDashTouchMod.HoldableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Holdable
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashTouch.reactDashTouchMod.Holdable] {
  @JSImport("react-touch", "Holdable")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    config: HoldableConfig = null,
    onHoldComplete: () => Unit = null,
    onHoldProgress: () => Unit = null,
    onMouseDown: () => Unit = null,
    onTouchStart: () => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashTouch.reactDashTouchMod.Holdable] = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (onHoldComplete != null) __obj.updateDynamic("onHoldComplete")(js.Any.fromFunction0(onHoldComplete))
    if (onHoldProgress != null) __obj.updateDynamic("onHoldProgress")(js.Any.fromFunction0(onHoldProgress))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction0(onMouseDown))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction0(onTouchStart))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactDashTouch.reactDashTouchMod.Holdable] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashTouch.reactDashTouchMod.Holdable](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = HoldableProps
}


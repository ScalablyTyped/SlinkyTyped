package typingsSlinky.reactDashTouch.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashTouch.reactDashTouchMod.SwipeableConfig
import typingsSlinky.reactDashTouch.reactDashTouchMod.SwipeableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Swipeable
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashTouch.reactDashTouchMod.Swipeable] {
  @JSImport("react-touch", "Swipeable")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    config: SwipeableConfig = null,
    onMouseDown: () => Unit = null,
    onSwipeDown: () => Unit = null,
    onSwipeLeft: () => Unit = null,
    onSwipeRight: () => Unit = null,
    onSwipeUp: () => Unit = null,
    onTouchStart: () => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashTouch.reactDashTouchMod.Swipeable] = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction0(onMouseDown))
    if (onSwipeDown != null) __obj.updateDynamic("onSwipeDown")(js.Any.fromFunction0(onSwipeDown))
    if (onSwipeLeft != null) __obj.updateDynamic("onSwipeLeft")(js.Any.fromFunction0(onSwipeLeft))
    if (onSwipeRight != null) __obj.updateDynamic("onSwipeRight")(js.Any.fromFunction0(onSwipeRight))
    if (onSwipeUp != null) __obj.updateDynamic("onSwipeUp")(js.Any.fromFunction0(onSwipeUp))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction0(onTouchStart))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactDashTouch.reactDashTouchMod.Swipeable] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashTouch.reactDashTouchMod.Swipeable](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SwipeableProps
}


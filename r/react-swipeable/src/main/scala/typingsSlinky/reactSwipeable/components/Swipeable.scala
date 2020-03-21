package typingsSlinky.reactSwipeable.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactSwipeable.mod.EventData
import typingsSlinky.reactSwipeable.mod.SwipeableOptions
import typingsSlinky.reactSwipeable.mod.SwipeableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Swipeable
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactSwipeable.mod.Swipeable] {
  @JSImport("react-swipeable", "Swipeable")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, style */
  def apply(
    delta: Int | Double = null,
    innerRef: /* element */ HTMLElement | Null => Unit = null,
    nodeName: String = null,
    onSwiped: /* eventData */ EventData => Unit = null,
    onSwipedDown: /* eventData */ EventData => Unit = null,
    onSwipedLeft: /* eventData */ EventData => Unit = null,
    onSwipedRight: /* eventData */ EventData => Unit = null,
    onSwipedUp: /* eventData */ EventData => Unit = null,
    onSwiping: /* eventData */ EventData => Unit = null,
    preventDefaultTouchmoveEvent: js.UndefOr[Boolean] = js.undefined,
    rotationAngle: Int | Double = null,
    trackMouse: js.UndefOr[Boolean] = js.undefined,
    trackTouch: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactSwipeable.mod.Swipeable] = {
    val __obj = js.Dynamic.literal()
    if (delta != null) __obj.updateDynamic("delta")(delta.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(js.Any.fromFunction1(innerRef))
    if (nodeName != null) __obj.updateDynamic("nodeName")(nodeName.asInstanceOf[js.Any])
    if (onSwiped != null) __obj.updateDynamic("onSwiped")(js.Any.fromFunction1(onSwiped))
    if (onSwipedDown != null) __obj.updateDynamic("onSwipedDown")(js.Any.fromFunction1(onSwipedDown))
    if (onSwipedLeft != null) __obj.updateDynamic("onSwipedLeft")(js.Any.fromFunction1(onSwipedLeft))
    if (onSwipedRight != null) __obj.updateDynamic("onSwipedRight")(js.Any.fromFunction1(onSwipedRight))
    if (onSwipedUp != null) __obj.updateDynamic("onSwipedUp")(js.Any.fromFunction1(onSwipedUp))
    if (onSwiping != null) __obj.updateDynamic("onSwiping")(js.Any.fromFunction1(onSwiping))
    if (!js.isUndefined(preventDefaultTouchmoveEvent)) __obj.updateDynamic("preventDefaultTouchmoveEvent")(preventDefaultTouchmoveEvent.asInstanceOf[js.Any])
    if (rotationAngle != null) __obj.updateDynamic("rotationAngle")(rotationAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(trackMouse)) __obj.updateDynamic("trackMouse")(trackMouse.asInstanceOf[js.Any])
    if (!js.isUndefined(trackTouch)) __obj.updateDynamic("trackTouch")(trackTouch.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactSwipeable.mod.Swipeable] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactSwipeable.mod.Swipeable](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SwipeableProps with SwipeableOptions
}


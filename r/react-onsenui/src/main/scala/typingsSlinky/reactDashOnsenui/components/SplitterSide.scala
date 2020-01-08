package typingsSlinky.reactDashOnsenui.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashOnsenui.HTMLAttributesidclassNamestylesideleftrightcollaps
import typingsSlinky.reactDashOnsenui.reactDashOnsenuiMod.AnimationOptions
import typingsSlinky.reactDashOnsenui.reactDashOnsenuiStrings.collapse
import typingsSlinky.reactDashOnsenui.reactDashOnsenuiStrings.default
import typingsSlinky.reactDashOnsenui.reactDashOnsenuiStrings.landscape
import typingsSlinky.reactDashOnsenui.reactDashOnsenuiStrings.left
import typingsSlinky.reactDashOnsenui.reactDashOnsenuiStrings.overlay
import typingsSlinky.reactDashOnsenui.reactDashOnsenuiStrings.portrait
import typingsSlinky.reactDashOnsenui.reactDashOnsenuiStrings.right
import typingsSlinky.reactDashOnsenui.reactDashOnsenuiStrings.split
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SplitterSide
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashOnsenui.reactDashOnsenuiMod.SplitterSide] {
  @JSImport("react-onsenui", "SplitterSide")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id */
  def apply(
    animation: overlay | default = null,
    animationOptions: AnimationOptions = null,
    collapse: portrait | landscape | Boolean = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    mode: collapse | split = null,
    onClose: /* e */ js.UndefOr[Event] => Unit = null,
    onModeChange: /* e */ js.UndefOr[Event] => Unit = null,
    onOpen: /* e */ js.UndefOr[Event] => Unit = null,
    onPreClose: /* e */ js.UndefOr[Event] => Unit = null,
    onPreOpen: /* e */ js.UndefOr[Event] => Unit = null,
    openThreshold: Int | Double = null,
    side: left | right = null,
    style: CSSProperties = null,
    swipeTargetWidth: Int | Double = null,
    swipeable: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashOnsenui.reactDashOnsenuiMod.SplitterSide] = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationOptions != null) __obj.updateDynamic("animationOptions")(animationOptions.asInstanceOf[js.Any])
    if (collapse != null) __obj.updateDynamic("collapse")(collapse.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onModeChange != null) __obj.updateDynamic("onModeChange")(js.Any.fromFunction1(onModeChange))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1(onOpen))
    if (onPreClose != null) __obj.updateDynamic("onPreClose")(js.Any.fromFunction1(onPreClose))
    if (onPreOpen != null) __obj.updateDynamic("onPreOpen")(js.Any.fromFunction1(onPreOpen))
    if (openThreshold != null) __obj.updateDynamic("openThreshold")(openThreshold.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (swipeTargetWidth != null) __obj.updateDynamic("swipeTargetWidth")(swipeTargetWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeable)) __obj.updateDynamic("swipeable")(swipeable.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactDashOnsenui.reactDashOnsenuiMod.SplitterSide] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashOnsenui.reactDashOnsenuiMod.SplitterSide](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = HTMLAttributesidclassNamestylesideleftrightcollaps
}


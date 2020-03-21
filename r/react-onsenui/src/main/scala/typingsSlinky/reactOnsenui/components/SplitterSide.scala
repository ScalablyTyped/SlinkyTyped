package typingsSlinky.reactOnsenui.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactOnsenui.HTMLAttributesidclassNameAnimation
import typingsSlinky.reactOnsenui.mod.AnimationOptions
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.collapse
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.default
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.landscape
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.left
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.overlay
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.portrait
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.right
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.split
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SplitterSide
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactOnsenui.mod.SplitterSide] {
  @JSImport("react-onsenui", "SplitterSide")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id, style */
  def apply(
    animation: overlay | default = null,
    animationOptions: AnimationOptions = null,
    collapse: portrait | landscape | Boolean = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    mode: collapse | split = null,
    onClose: /* e */ js.UndefOr[Event_] => Unit = null,
    onModeChange: /* e */ js.UndefOr[Event_] => Unit = null,
    onOpen: /* e */ js.UndefOr[Event_] => Unit = null,
    onPreClose: /* e */ js.UndefOr[Event_] => Unit = null,
    onPreOpen: /* e */ js.UndefOr[Event_] => Unit = null,
    openThreshold: Int | Double = null,
    side: left | right = null,
    swipeTargetWidth: Int | Double = null,
    swipeable: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactOnsenui.mod.SplitterSide] = {
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
    if (swipeTargetWidth != null) __obj.updateDynamic("swipeTargetWidth")(swipeTargetWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeable)) __obj.updateDynamic("swipeable")(swipeable.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactOnsenui.mod.SplitterSide] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactOnsenui.mod.SplitterSide](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = HTMLAttributesidclassNameAnimation
}


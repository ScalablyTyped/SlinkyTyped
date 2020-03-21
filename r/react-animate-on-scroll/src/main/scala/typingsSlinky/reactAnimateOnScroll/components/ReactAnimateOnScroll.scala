package typingsSlinky.reactAnimateOnScroll.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactAnimateOnScroll.mod.ScrollAnimationProps
import typingsSlinky.reactAnimateOnScroll.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactAnimateOnScroll
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-animate-on-scroll", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    animateIn: String = null,
    animateOnce: js.UndefOr[Boolean] = js.undefined,
    animateOut: String = null,
    delay: Int | Double = null,
    duration: Int | Double = null,
    initiallyVisible: js.UndefOr[Boolean] = js.undefined,
    offset: Int | Double = null,
    scrollableParentSelector: String = null,
    style: js.Object = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (animateIn != null) __obj.updateDynamic("animateIn")(animateIn.asInstanceOf[js.Any])
    if (!js.isUndefined(animateOnce)) __obj.updateDynamic("animateOnce")(animateOnce.asInstanceOf[js.Any])
    if (animateOut != null) __obj.updateDynamic("animateOut")(animateOut.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(initiallyVisible)) __obj.updateDynamic("initiallyVisible")(initiallyVisible.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (scrollableParentSelector != null) __obj.updateDynamic("scrollableParentSelector")(scrollableParentSelector.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactAnimateOnScroll.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ScrollAnimationProps
}


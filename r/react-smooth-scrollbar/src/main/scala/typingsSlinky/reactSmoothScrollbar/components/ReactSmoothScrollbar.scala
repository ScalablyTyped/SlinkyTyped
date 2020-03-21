package typingsSlinky.reactSmoothScrollbar.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.EventTarget
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactSmoothScrollbar.mod.ScrollbarProps
import typingsSlinky.reactSmoothScrollbar.mod.^
import typingsSlinky.smoothScrollbar.mod.default
import typingsSlinky.smoothScrollbar.scrollbarMod.ScrollStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactSmoothScrollbar
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-smooth-scrollbar", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, style */
  def apply(
    alwaysShowTracks: js.UndefOr[Boolean] = js.undefined,
    continuousScrolling: js.UndefOr[Boolean] = js.undefined,
    damping: Int | Double = null,
    delegateTo: EventTarget = null,
    onScroll: (/* status */ ScrollStatus, /* scrollbarInstance */ default) => Unit = null,
    plugins: js.Any = null,
    renderByPixels: js.UndefOr[Boolean] = js.undefined,
    thumbMinSize: Int | Double = null,
    wheelEventTarget: EventTarget = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysShowTracks)) __obj.updateDynamic("alwaysShowTracks")(alwaysShowTracks.asInstanceOf[js.Any])
    if (!js.isUndefined(continuousScrolling)) __obj.updateDynamic("continuousScrolling")(continuousScrolling.asInstanceOf[js.Any])
    if (damping != null) __obj.updateDynamic("damping")(damping.asInstanceOf[js.Any])
    if (delegateTo != null) __obj.updateDynamic("delegateTo")(delegateTo.asInstanceOf[js.Any])
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction2(onScroll))
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(renderByPixels)) __obj.updateDynamic("renderByPixels")(renderByPixels.asInstanceOf[js.Any])
    if (thumbMinSize != null) __obj.updateDynamic("thumbMinSize")(thumbMinSize.asInstanceOf[js.Any])
    if (wheelEventTarget != null) __obj.updateDynamic("wheelEventTarget")(wheelEventTarget.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ^] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactSmoothScrollbar.mod.^](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ScrollbarProps
}


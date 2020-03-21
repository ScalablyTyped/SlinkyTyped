package typingsSlinky.reactLazyload.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactLazyload.mod.LazyLoadProps
import typingsSlinky.reactLazyload.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactLazyload
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-lazyload", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: height */
  def apply(
    debounce: Double | Boolean = null,
    offset: Double | js.Array[Double] = null,
    once: js.UndefOr[Boolean] = js.undefined,
    overflow: js.UndefOr[Boolean] = js.undefined,
    placeholder: TagMod[Any] = null,
    preventLoading: js.UndefOr[Boolean] = js.undefined,
    resize: js.UndefOr[Boolean] = js.undefined,
    scroll: js.UndefOr[Boolean] = js.undefined,
    scrollContainer: String | org.scalajs.dom.raw.Element = null,
    throttle: Double | Boolean = null,
    unmountIfInvisible: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once.asInstanceOf[js.Any])
    if (!js.isUndefined(overflow)) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(preventLoading)) __obj.updateDynamic("preventLoading")(preventLoading.asInstanceOf[js.Any])
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    if (scrollContainer != null) __obj.updateDynamic("scrollContainer")(scrollContainer.asInstanceOf[js.Any])
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    if (!js.isUndefined(unmountIfInvisible)) __obj.updateDynamic("unmountIfInvisible")(unmountIfInvisible.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactLazyload.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = LazyLoadProps
}


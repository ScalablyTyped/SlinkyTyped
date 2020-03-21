package typingsSlinky.reactOnsenui.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactOnsenui.HTMLAttributesidclassNameIgnoreEdgeWidth
import typingsSlinky.reactOnsenui.mod.AnimationOptions
import typingsSlinky.reactOnsenui.mod.TabbarRenderTab
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.auto
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.bottom
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.none
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.slide
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tabbar
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactOnsenui.mod.Tabbar] {
  @JSImport("react-onsenui", "Tabbar")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id, style */
  def apply(
    index: Double,
    renderTabs: () => js.Array[TabbarRenderTab],
    animation: none | slide = null,
    animationOptions: AnimationOptions = null,
    ignoreEdgeWidth: Int | Double = null,
    onPostChange: () => Unit = null,
    onPreChange: () => Unit = null,
    onReactive: () => Unit = null,
    onSwipe: (/* index */ Double, /* animationOptions */ AnimationOptions) => Unit = null,
    position: bottom | top | auto = null,
    swipeable: js.UndefOr[Boolean] = js.undefined,
    tabBorder: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactOnsenui.mod.Tabbar] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], renderTabs = js.Any.fromFunction0(renderTabs))
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationOptions != null) __obj.updateDynamic("animationOptions")(animationOptions.asInstanceOf[js.Any])
    if (ignoreEdgeWidth != null) __obj.updateDynamic("ignoreEdgeWidth")(ignoreEdgeWidth.asInstanceOf[js.Any])
    if (onPostChange != null) __obj.updateDynamic("onPostChange")(js.Any.fromFunction0(onPostChange))
    if (onPreChange != null) __obj.updateDynamic("onPreChange")(js.Any.fromFunction0(onPreChange))
    if (onReactive != null) __obj.updateDynamic("onReactive")(js.Any.fromFunction0(onReactive))
    if (onSwipe != null) __obj.updateDynamic("onSwipe")(js.Any.fromFunction2(onSwipe))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeable)) __obj.updateDynamic("swipeable")(swipeable.asInstanceOf[js.Any])
    if (!js.isUndefined(tabBorder)) __obj.updateDynamic("tabBorder")(tabBorder.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = HTMLAttributesidclassNameIgnoreEdgeWidth
}


package typingsSlinky.reactDashSwipe.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashSwipe.reactDashSwipeMod.Style
import typingsSlinky.reactDashSwipe.reactDashSwipeMod.^
import typingsSlinky.swipe.SwipeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashSwipe
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-swipe", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id */
  def apply(
    childCount: Int | Double = null,
    style: Style = null,
    swipeOptions: SwipeOptions = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal()
    if (childCount != null) __obj.updateDynamic("childCount")(childCount.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (swipeOptions != null) __obj.updateDynamic("swipeOptions")(swipeOptions.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ^] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactDashSwipe.reactDashSwipeMod.^](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = typingsSlinky.reactDashSwipe.reactDashSwipeMod.Props
}


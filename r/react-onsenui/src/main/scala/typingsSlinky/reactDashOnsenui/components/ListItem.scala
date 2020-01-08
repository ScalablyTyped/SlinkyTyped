package typingsSlinky.reactDashOnsenui.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashOnsenui.HTMLAttributesidclassNamestylemodifierstringtappab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashOnsenui.reactDashOnsenuiMod.ListItem] {
  @JSImport("react-onsenui", "ListItem")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id, onClick */
  def apply(
    expandable: js.UndefOr[Boolean] = js.undefined,
    expanded: js.UndefOr[Boolean] = js.undefined,
    lockOnDrag: js.UndefOr[Boolean] = js.undefined,
    modifier: String = null,
    style: CSSProperties = null,
    tapBackgroundColor: String = null,
    tappable: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashOnsenui.reactDashOnsenuiMod.ListItem] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable.asInstanceOf[js.Any])
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (!js.isUndefined(lockOnDrag)) __obj.updateDynamic("lockOnDrag")(lockOnDrag.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tapBackgroundColor != null) __obj.updateDynamic("tapBackgroundColor")(tapBackgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(tappable)) __obj.updateDynamic("tappable")(tappable.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactDashOnsenui.reactDashOnsenuiMod.ListItem] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashOnsenui.reactDashOnsenuiMod.ListItem](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = HTMLAttributesidclassNamestylemodifierstringtappab
}


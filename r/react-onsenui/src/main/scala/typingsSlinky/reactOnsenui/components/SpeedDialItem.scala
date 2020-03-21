package typingsSlinky.reactOnsenui.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.reactOnsenui.HTMLAttributesidclassNameIdModifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SpeedDialItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactOnsenui.mod.SpeedDialItem] {
  @JSImport("react-onsenui", "SpeedDialItem")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id, style */
  def apply(
    modifier: String = null,
    onClick: /* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement]] => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactOnsenui.mod.SpeedDialItem] = {
    val __obj = js.Dynamic.literal()
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactOnsenui.mod.SpeedDialItem] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactOnsenui.mod.SpeedDialItem](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = HTMLAttributesidclassNameIdModifier
}


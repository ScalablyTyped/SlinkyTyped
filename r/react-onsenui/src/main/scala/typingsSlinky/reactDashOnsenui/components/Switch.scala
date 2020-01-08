package typingsSlinky.reactDashOnsenui.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashOnsenui.HTMLAttributesidclassNamestylemodifierstringonChanChecked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Switch
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashOnsenui.reactDashOnsenuiMod.Switch] {
  @JSImport("react-onsenui", "Switch")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: checked, className, disabled, id, name, onChange */
  def apply(
    inputId: String = null,
    modifier: String = null,
    style: CSSProperties = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashOnsenui.reactDashOnsenuiMod.Switch] = {
    val __obj = js.Dynamic.literal()
    if (inputId != null) __obj.updateDynamic("inputId")(inputId.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactDashOnsenui.reactDashOnsenuiMod.Switch] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashOnsenui.reactDashOnsenuiMod.Switch](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = HTMLAttributesidclassNamestylemodifierstringonChanChecked
}


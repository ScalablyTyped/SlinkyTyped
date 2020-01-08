package typingsSlinky.reactDashOnsenui.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashOnsenui.HTMLAttributesidclassNamestylemodifierstringdisablAutofocus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Select
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashOnsenui.reactDashOnsenuiMod.Select] {
  @JSImport("react-onsenui", "Select")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled, id, multiple, name, onChange, required */
  def apply(
    autofocus: js.UndefOr[Boolean] = js.undefined,
    form: String = null,
    modifier: String = null,
    size: String = null,
    style: CSSProperties = null,
    value: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashOnsenui.reactDashOnsenuiMod.Select] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autofocus)) __obj.updateDynamic("autofocus")(autofocus.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactDashOnsenui.reactDashOnsenuiMod.Select] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashOnsenui.reactDashOnsenuiMod.Select](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = HTMLAttributesidclassNamestylemodifierstringdisablAutofocus
}


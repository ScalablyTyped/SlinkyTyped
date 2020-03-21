package typingsSlinky.reactBootstrapTable.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.SyntheticKeyboardEvent
import slinky.web.html.`*`.tag
import typingsSlinky.reactBootstrapTable.mod.SearchFieldProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SearchField
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactBootstrapTable.mod.SearchField] {
  @JSImport("react-bootstrap-table", "SearchField")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, placeholder */
  def apply(
    defaultValue: String = null,
    onKeyUp: /* e */ SyntheticKeyboardEvent[_] => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactBootstrapTable.mod.SearchField] = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactBootstrapTable.mod.SearchField] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactBootstrapTable.mod.SearchField](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SearchFieldProps
}


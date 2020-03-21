package typingsSlinky.griddleReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.griddleReact.mod.components.RowDefinition
import typingsSlinky.griddleReact.mod.components.RowDefinitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ComponentsRowDefinition
  extends ExternalComponentWithAttributesWithRefType[tag.type, RowDefinition] {
  @JSImport("griddle-react", "components.RowDefinition")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    childColumnName: String = null,
    cssClassName: String | (js.Function1[/* props */ js.Any, String]) = null,
    rowKey: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, RowDefinition] = {
    val __obj = js.Dynamic.literal()
    if (childColumnName != null) __obj.updateDynamic("childColumnName")(childColumnName.asInstanceOf[js.Any])
    if (cssClassName != null) __obj.updateDynamic("cssClassName")(cssClassName.asInstanceOf[js.Any])
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, RowDefinition] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.griddleReact.mod.components.RowDefinition](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = RowDefinitionProps
}


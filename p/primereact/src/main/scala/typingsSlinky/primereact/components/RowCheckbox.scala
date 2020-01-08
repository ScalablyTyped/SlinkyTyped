package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.componentsDatatableRowCheckboxMod.RowCheckboxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RowCheckbox
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.componentsDatatableRowCheckboxMod.RowCheckbox] {
  @JSImport("primereact/components/datatable/RowCheckbox", "RowCheckbox")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: onClick */
  def apply(rowData: js.Object = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.primereact.componentsDatatableRowCheckboxMod.RowCheckbox] = {
    val __obj = js.Dynamic.literal()
    if (rowData != null) __obj.updateDynamic("rowData")(rowData.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.componentsDatatableRowCheckboxMod.RowCheckbox] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.primereact.componentsDatatableRowCheckboxMod.RowCheckbox](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = RowCheckboxProps
}


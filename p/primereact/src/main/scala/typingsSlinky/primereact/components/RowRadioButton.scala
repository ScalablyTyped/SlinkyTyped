package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.componentsDatatableRowRadioButtonMod.RowRadioButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RowRadioButton
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.primereact.componentsDatatableRowRadioButtonMod.RowRadioButton
    ] {
  @JSImport("primereact/components/datatable/RowRadioButton", "RowRadioButton")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: onClick, selected */
  def apply(rowData: js.Object = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[
    tag.type, 
    typingsSlinky.primereact.componentsDatatableRowRadioButtonMod.RowRadioButton
  ] = {
    val __obj = js.Dynamic.literal()
    if (rowData != null) __obj.updateDynamic("rowData")(rowData.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = RowRadioButtonProps
}


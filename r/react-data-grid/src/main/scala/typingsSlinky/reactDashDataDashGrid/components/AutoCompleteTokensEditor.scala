package typingsSlinky.reactDashDataDashGrid.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashDataDashGrid.AdazzleReactDataGrid.ExcelColumn
import typingsSlinky.reactDashDataDashGrid.AdazzleReactDataGridPlugins.AutoCompleteTokensEditorProps
import typingsSlinky.reactDashDataDashGrid.Anon_Caption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AutoCompleteTokensEditor
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashDataDashGrid.AdazzleReactDataGridPlugins.Editors.AutoCompleteTokensEditor
    ] {
  @JSGlobal("AdazzleReactDataGridPlugins.Editors.AutoCompleteTokensEditor")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    options: js.Array[String | Anon_Caption],
    column: ExcelColumn = null,
    value: js.Array[_] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashDataDashGrid.AdazzleReactDataGridPlugins.Editors.AutoCompleteTokensEditor
  ] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AutoCompleteTokensEditorProps
}


package typingsSlinky.reactDataGrid.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDataGrid.AdazzleReactDataGrid.ExcelColumn
import typingsSlinky.reactDataGrid.AdazzleReactDataGridPlugins.AutoCompleteEditorProps
import typingsSlinky.reactDataGrid.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AutoComplete
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDataGrid.AdazzleReactDataGridPlugins.Editors.AutoComplete
    ] {
  @JSGlobal("AdazzleReactDataGridPlugins.Editors.AutoComplete")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    column: ExcelColumn = null,
    editorDisplayValue: (/* column */ ExcelColumn, /* value */ js.Any) => String = null,
    height: Int | Double = null,
    label: js.Any = null,
    onCommit: () => Unit = null,
    onFocus: () => Unit = null,
    onKeyDown: () => Unit = null,
    options: js.Array[AnonId] = null,
    resultIdentifier: String = null,
    search: String = null,
    value: js.Any = null,
    valueParams: js.Array[String] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDataGrid.AdazzleReactDataGridPlugins.Editors.AutoComplete
  ] = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (editorDisplayValue != null) __obj.updateDynamic("editorDisplayValue")(js.Any.fromFunction2(editorDisplayValue))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onCommit != null) __obj.updateDynamic("onCommit")(js.Any.fromFunction0(onCommit))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction0(onFocus))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction0(onKeyDown))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (resultIdentifier != null) __obj.updateDynamic("resultIdentifier")(resultIdentifier.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueParams != null) __obj.updateDynamic("valueParams")(valueParams.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDataGrid.AdazzleReactDataGridPlugins.Editors.AutoComplete
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDataGrid.AdazzleReactDataGridPlugins.Editors.AutoComplete](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = AutoCompleteEditorProps
}


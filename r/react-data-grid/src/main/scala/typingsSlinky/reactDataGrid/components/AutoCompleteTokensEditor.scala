package typingsSlinky.reactDataGrid.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactDataGrid.AdazzleReactDataGrid.ExcelColumn
import typingsSlinky.reactDataGrid.AdazzleReactDataGridPlugins.AutoCompleteTokensEditorProps
import typingsSlinky.reactDataGrid.anon.Caption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AutoCompleteTokensEditor {
  @JSGlobal("AdazzleReactDataGridPlugins.Editors.AutoCompleteTokensEditor")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[
          tag.type, 
          typingsSlinky.reactDataGrid.global.AdazzleReactDataGridPlugins.Editors.AutoCompleteTokensEditor
        ] {
    @scala.inline
    def column(value: ExcelColumn): this.type = set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: js.Array[_]): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AutoCompleteTokensEditorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(options: js.Array[String | Caption]): Builder = {
    val __props = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AutoCompleteTokensEditorProps]))
  }
}


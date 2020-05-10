package typingsSlinky.reactDataGrid.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactDataGrid.AdazzleReactDataGrid.ExcelColumn
import typingsSlinky.reactDataGrid.AdazzleReactDataGridPlugins.AutoCompleteEditorProps
import typingsSlinky.reactDataGrid.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AutoComplete {
  @JSGlobal("AdazzleReactDataGridPlugins.Editors.AutoComplete")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[
          tag.type, 
          typingsSlinky.reactDataGrid.AdazzleReactDataGridPlugins.Editors.AutoComplete
        ] {
    @scala.inline
    def column(value: ExcelColumn): this.type = set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def editorDisplayValue(value: (/* column */ ExcelColumn, /* value */ js.Any) => String): this.type = set("editorDisplayValue", js.Any.fromFunction2(value))
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def label(value: js.Any): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def onCommit(value: () => Unit): this.type = set("onCommit", js.Any.fromFunction0(value))
    @scala.inline
    def onFocus(value: () => Unit): this.type = set("onFocus", js.Any.fromFunction0(value))
    @scala.inline
    def onKeyDown(value: () => Unit): this.type = set("onKeyDown", js.Any.fromFunction0(value))
    @scala.inline
    def options(value: js.Array[AnonId]): this.type = set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def resultIdentifier(value: String): this.type = set("resultIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def search(value: String): this.type = set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: js.Any): this.type = set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def valueParams(value: js.Array[String]): this.type = set("valueParams", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AutoCompleteEditorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: AutoComplete.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}


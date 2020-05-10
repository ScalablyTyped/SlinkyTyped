package typingsSlinky.primereact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.AnonField
import typingsSlinky.primereact.columnColumnMod.ColumnProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Column {
  @JSImport("primereact/column", "Column")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.columnMod.Column] {
    @scala.inline
    def body(value: js.Any): this.type = set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def bodyClassName(value: String): this.type = set("bodyClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def bodyStyle(value: js.Object): this.type = set("bodyStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def colSpan(value: Double): this.type = set("colSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def columnKey(value: String): this.type = set("columnKey", value.asInstanceOf[js.Any])
    @scala.inline
    def editor(value: /* props */ js.Any => js.UndefOr[ReactElement]): this.type = set("editor", js.Any.fromFunction1(value))
    @scala.inline
    def editorValidator(value: /* props */ js.Any => Boolean): this.type = set("editorValidator", js.Any.fromFunction1(value))
    @scala.inline
    def editorValidatorEvent(value: String): this.type = set("editorValidatorEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def excludeGlobalFilter(value: Boolean): this.type = set("excludeGlobalFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def expander(value: Boolean): this.type = set("expander", value.asInstanceOf[js.Any])
    @scala.inline
    def exportable(value: Boolean): this.type = set("exportable", value.asInstanceOf[js.Any])
    @scala.inline
    def field(value: String): this.type = set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def filter(value: Boolean): this.type = set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def filterElement(value: js.Object): this.type = set("filterElement", value.asInstanceOf[js.Any])
    @scala.inline
    def filterFunction(value: (/* value */ js.Any, /* filter */ js.Any) => Unit): this.type = set("filterFunction", js.Any.fromFunction2(value))
    @scala.inline
    def filterMatchMode(value: String): this.type = set("filterMatchMode", value.asInstanceOf[js.Any])
    @scala.inline
    def filterMaxLength(value: Double): this.type = set("filterMaxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def filterPlaceholder(value: String): this.type = set("filterPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def filterType(value: String): this.type = set("filterType", value.asInstanceOf[js.Any])
    @scala.inline
    def footer(value: js.Any): this.type = set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def footerClassName(value: String): this.type = set("footerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def footerStyle(value: js.Object): this.type = set("footerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def frozen(value: Boolean): this.type = set("frozen", value.asInstanceOf[js.Any])
    @scala.inline
    def header(value: js.Any): this.type = set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def headerClassName(value: String): this.type = set("headerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def headerStyle(value: js.Object): this.type = set("headerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def loadingBody(value: js.Any): this.type = set("loadingBody", value.asInstanceOf[js.Any])
    @scala.inline
    def onEditorCancel(value: /* props */ js.Any => Unit): this.type = set("onEditorCancel", js.Any.fromFunction1(value))
    @scala.inline
    def onEditorSubmit(value: /* props */ js.Any => Unit): this.type = set("onEditorSubmit", js.Any.fromFunction1(value))
    @scala.inline
    def rowEditor(value: Boolean): this.type = set("rowEditor", value.asInstanceOf[js.Any])
    @scala.inline
    def rowReorder(value: Boolean): this.type = set("rowReorder", value.asInstanceOf[js.Any])
    @scala.inline
    def rowReorderIcon(value: String): this.type = set("rowReorderIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def rowSpan(value: Double): this.type = set("rowSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def selectionMode(value: String): this.type = set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def sortField(value: String): this.type = set("sortField", value.asInstanceOf[js.Any])
    @scala.inline
    def sortFunction(value: /* e */ AnonField => Unit): this.type = set("sortFunction", js.Any.fromFunction1(value))
    @scala.inline
    def sortable(value: Boolean): this.type = set("sortable", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ColumnProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Column.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}


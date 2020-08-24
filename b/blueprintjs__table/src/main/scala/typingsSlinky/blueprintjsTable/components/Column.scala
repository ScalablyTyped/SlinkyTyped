package typingsSlinky.blueprintjsTable.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsTable.columnMod.IColumnProps
import typingsSlinky.blueprintjsTable.esmRegionsMod.ColumnLoadingOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Column {
  @JSImport("@blueprintjs/table", "Column")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsTable.mod.Column] {
    @scala.inline
    def cellRenderer(value: (/* rowIndex */ Double, /* columnIndex */ Double) => ReactElement): this.type = set("cellRenderer", js.Any.fromFunction2(value))
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def columnHeaderCellRenderer(value: /* columnIndex */ Double => ReactElement): this.type = set("columnHeaderCellRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def id(value: String | Double): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def loadingOptionsVarargs(value: ColumnLoadingOption*): this.type = set("loadingOptions", js.Array(value :_*))
    @scala.inline
    def loadingOptions(value: js.Array[ColumnLoadingOption]): this.type = set("loadingOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def nameRenderer(value: (/* name */ String, /* index */ js.UndefOr[Double]) => ReactElement): this.type = set("nameRenderer", js.Any.fromFunction2(value))
  }
  
  def withProps(p: IColumnProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Column.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}


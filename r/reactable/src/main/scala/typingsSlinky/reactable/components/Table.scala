package typingsSlinky.reactable.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactable.anon.Column
import typingsSlinky.reactable.mod.ColumnsType
import typingsSlinky.reactable.mod.TableComponentProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Table {
  @JSImport("reactable", "Table")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactable.mod.Table[js.Any]] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def columns(value: js.Array[ColumnsType]): this.type = set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def currentPage(value: Double): this.type = set("currentPage", value.asInstanceOf[js.Any])
    @scala.inline
    def data(value: js.Array[T]): this.type = set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultSort(value: Column): this.type = set("defaultSort", value.asInstanceOf[js.Any])
    @scala.inline
    def filterBy(value: String): this.type = set("filterBy", value.asInstanceOf[js.Any])
    @scala.inline
    def filterable(value: js.Array[String]): this.type = set("filterable", value.asInstanceOf[js.Any])
    @scala.inline
    def hideFilterInput(value: Boolean): this.type = set("hideFilterInput", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def itemsPerPage(value: Double): this.type = set("itemsPerPage", value.asInstanceOf[js.Any])
    @scala.inline
    def noDataText(value: String): this.type = set("noDataText", value.asInstanceOf[js.Any])
    @scala.inline
    def onFilter(value: /* text */ String => Unit): this.type = set("onFilter", js.Any.fromFunction1(value))
    @scala.inline
    def pageButtonLimit(value: Double): this.type = set("pageButtonLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def sortBy(value: Boolean): this.type = set("sortBy", value.asInstanceOf[js.Any])
    @scala.inline
    def sortable(value: js.Array[String] | Boolean): this.type = set("sortable", value.asInstanceOf[js.Any])
  }
  
  def withProps[T](p: TableComponentProperties[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[T](companion: Table.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
}


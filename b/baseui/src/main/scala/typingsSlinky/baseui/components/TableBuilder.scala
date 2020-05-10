package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.baseuiStrings.ASC
import typingsSlinky.baseui.baseuiStrings.DESC
import typingsSlinky.baseui.tableSemanticMod.BuilderOverrides
import typingsSlinky.baseui.tableSemanticMod.TableBuilderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableBuilder {
  @JSImport("baseui/table-semantic", "TableBuilder")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[RowT] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.baseui.tableSemanticMod.TableBuilder[js.Any]] {
    @scala.inline
    def horizontalScrollWidth(value: String): this.type = set("horizontalScrollWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def onSort(value: /* columnId */ String => Unit): this.type = set("onSort", js.Any.fromFunction1(value))
    @scala.inline
    def overrides(value: BuilderOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def sortColumn(value: String): this.type = set("sortColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def sortColumnNull: this.type = set("sortColumn", null)
    @scala.inline
    def sortOrder(value: ASC | DESC): this.type = set("sortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def sortOrderNull: this.type = set("sortOrder", null)
  }
  
  def withProps[RowT](p: TableBuilderProps[RowT]): Builder[RowT] = new Builder[RowT](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[RowT](data: js.Array[RowT]): Builder[RowT] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder[RowT](js.Array(this.component, __props.asInstanceOf[TableBuilderProps[RowT]]))
  }
}


package typingsSlinky.baseui.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.tableSemanticMod.ColumnOverrides
import typingsSlinky.baseui.tableSemanticMod.TableBuilderColumnProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableBuilderColumn {
  @JSImport("baseui/table-semantic", "TableBuilderColumn")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[RowT] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.baseui.tableSemanticMod.TableBuilderColumn[RowT]] {
    @scala.inline
    def headerReactElement(value: ReactElement): this.type = set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def header(value: ReactElement): this.type = set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def numeric(value: Boolean): this.type = set("numeric", value.asInstanceOf[js.Any])
    @scala.inline
    def overrides(value: ColumnOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def sortable(value: Boolean): this.type = set("sortable", value.asInstanceOf[js.Any])
  }
  
  def withProps[RowT](p: TableBuilderColumnProps[RowT]): Builder[RowT] = new Builder[RowT](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[RowT](children: (js.Any | RowT, js.UndefOr[Double]) => ReactElement): Builder[RowT] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction2(children))
    new Builder[RowT](js.Array(this.component, __props.asInstanceOf[TableBuilderColumnProps[RowT]]))
  }
}


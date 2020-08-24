package typingsSlinky.reactVirtualized.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactVirtualized.esTableMod.ColumnProps
import typingsSlinky.reactVirtualized.esTableMod.SortDirectionType
import typingsSlinky.reactVirtualized.esTableMod.TableCellDataGetterParams
import typingsSlinky.reactVirtualized.esTableMod.TableCellProps
import typingsSlinky.reactVirtualized.esTableMod.TableHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Column {
  @JSImport("react-virtualized", "Column")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactVirtualized.mod.Column] {
    @scala.inline
    def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    @scala.inline
    def cellDataGetter(value: /* params */ TableCellDataGetterParams => js.Any): this.type = set("cellDataGetter", js.Any.fromFunction1(value))
    @scala.inline
    def cellRenderer(value: /* props */ TableCellProps => ReactElement): this.type = set("cellRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def columnData(value: js.Any): this.type = set("columnData", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultSortDirection(value: SortDirectionType): this.type = set("defaultSortDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def disableSort(value: Boolean): this.type = set("disableSort", value.asInstanceOf[js.Any])
    @scala.inline
    def flexGrow(value: Double): this.type = set("flexGrow", value.asInstanceOf[js.Any])
    @scala.inline
    def flexShrink(value: Double): this.type = set("flexShrink", value.asInstanceOf[js.Any])
    @scala.inline
    def headerClassName(value: String): this.type = set("headerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def headerRenderer(value: /* props */ TableHeaderProps => ReactElement): this.type = set("headerRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def headerStyle(value: CSSProperties): this.type = set("headerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def labelReactElement(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def label(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def maxWidth(value: Double): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def minWidth(value: Double): this.type = set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ColumnProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(dataKey: js.Any, width: Double): Builder = {
    val __props = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ColumnProps]))
  }
}


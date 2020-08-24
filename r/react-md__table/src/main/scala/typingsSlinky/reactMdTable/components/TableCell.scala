package typingsSlinky.reactMdTable.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdTable.configMod.TableCellHorizontalAlignment
import typingsSlinky.reactMdTable.configMod.TableCellVerticalAlignment
import typingsSlinky.reactMdTable.reactMdTableStrings.`100Percentsign`
import typingsSlinky.reactMdTable.reactMdTableStrings.`header-cell`
import typingsSlinky.reactMdTable.reactMdTableStrings.cell
import typingsSlinky.reactMdTable.reactMdTableStrings.col
import typingsSlinky.reactMdTable.reactMdTableStrings.colgroup
import typingsSlinky.reactMdTable.reactMdTableStrings.header
import typingsSlinky.reactMdTable.reactMdTableStrings.padded
import typingsSlinky.reactMdTable.reactMdTableStrings.row
import typingsSlinky.reactMdTable.reactMdTableStrings.rowgroup
import typingsSlinky.reactMdTable.tableCellContentMod.SortOrder
import typingsSlinky.reactMdTable.tableCellMod.TableCellElement
import typingsSlinky.reactMdTable.tableCellMod.TableCellProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableCell {
  @JSImport("@react-md/table", "TableCell")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, TableCellElement with js.Object] {
    @scala.inline
    def `aria-sort`(value: SortOrder): this.type = set("aria-sort", value.asInstanceOf[js.Any])
    @scala.inline
    def colSpan(value: Double | `100Percentsign`): this.type = set("colSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def disablePadding(value: Boolean): this.type = set("disablePadding", value.asInstanceOf[js.Any])
    @scala.inline
    def grow(value: Boolean): this.type = set("grow", value.asInstanceOf[js.Any])
    @scala.inline
    def hAlign(value: TableCellHorizontalAlignment): this.type = set("hAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def header(value: Boolean): this.type = set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def lineWrap(value: Boolean | padded): this.type = set("lineWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def scope(value: row | col | rowgroup | colgroup): this.type = set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def sortIconReactElement(value: ReactElement): this.type = set("sortIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def sortIcon(value: ReactElement): this.type = set("sortIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def sortIconAfter(value: Boolean): this.type = set("sortIconAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def sortIconRotated(value: Boolean): this.type = set("sortIconRotated", value.asInstanceOf[js.Any])
    @scala.inline
    def sticky(value: Boolean | header | cell | `header-cell`): this.type = set("sticky", value.asInstanceOf[js.Any])
    @scala.inline
    def vAlign(value: TableCellVerticalAlignment): this.type = set("vAlign", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TableCellProps with RefAttributes[TableCellElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TableCell.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}


package typingsSlinky.rcTable.components

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcTable.anon.CurrentTarget
import typingsSlinky.rcTable.fixedHeaderMod.FixedHeaderProps
import typingsSlinky.rcTable.interfaceMod.ColumnType
import typingsSlinky.rcTable.interfaceMod.ColumnsType
import typingsSlinky.rcTable.interfaceMod.StickyOffsets
import typingsSlinky.rcTable.rcTableStrings.ltr
import typingsSlinky.rcTable.rcTableStrings.rtl
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FixedHeader {
  
  @JSImport("rc-table/lib/Header/FixedHeader", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLDivElement] {
    
    @scala.inline
    def stickyClassName(value: String): this.type = set("stickyClassName", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FixedHeaderProps[js.Any] with RefAttributes[HTMLDivElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    colWidths: js.Array[Double],
    columCount: Double,
    columns: ColumnsType[js.Any],
    direction: ltr | rtl,
    fixHeader: Boolean,
    flattenColumns: js.Array[ColumnType[js.Any]],
    noData: Boolean,
    offsetHeader: Double,
    onHeaderRow: (js.Array[ColumnType[js.Any]], /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement],
    onScroll: CurrentTarget => Unit,
    stickyOffsets: StickyOffsets
  ): Builder = {
    val __props = js.Dynamic.literal(colWidths = colWidths.asInstanceOf[js.Any], columCount = columCount.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], fixHeader = fixHeader.asInstanceOf[js.Any], flattenColumns = flattenColumns.asInstanceOf[js.Any], noData = noData.asInstanceOf[js.Any], offsetHeader = offsetHeader.asInstanceOf[js.Any], onHeaderRow = js.Any.fromFunction2(onHeaderRow), onScroll = js.Any.fromFunction1(onScroll), stickyOffsets = stickyOffsets.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FixedHeaderProps[js.Any] with RefAttributes[HTMLDivElement]]))
  }
}

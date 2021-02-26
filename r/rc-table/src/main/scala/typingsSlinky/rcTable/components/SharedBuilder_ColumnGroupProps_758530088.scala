package typingsSlinky.rcTable.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcTable.interfaceMod.AlignType
import typingsSlinky.rcTable.interfaceMod.CellEllipsisType
import typingsSlinky.rcTable.interfaceMod.DataIndex
import typingsSlinky.rcTable.interfaceMod.FixedType
import typingsSlinky.rcTable.interfaceMod.RenderedCell
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_ColumnGroupProps_758530088[RecordType] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def align(value: AlignType): this.type = set("align", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def colSpan(value: Double): this.type = set("colSpan", value.asInstanceOf[js.Any])
  
  @scala.inline
  def dataIndex(value: DataIndex): this.type = set("dataIndex", value.asInstanceOf[js.Any])
  
  @scala.inline
  def dataIndexVarargs(value: (String | Double)*): this.type = set("dataIndex", js.Array(value :_*))
  
  @scala.inline
  def ellipsis(value: CellEllipsisType): this.type = set("ellipsis", value.asInstanceOf[js.Any])
  
  @scala.inline
  def fixed(value: FixedType): this.type = set("fixed", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onCell(value: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]): this.type = set("onCell", js.Any.fromFunction2(value))
  
  @scala.inline
  def onCellClick(value: (RecordType, /* e */ SyntheticMouseEvent[HTMLElement]) => Unit): this.type = set("onCellClick", js.Any.fromFunction2(value))
  
  @scala.inline
  def onHeaderCell(
    value: (/* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]
  ): this.type = set("onHeaderCell", js.Any.fromFunction2(value))
  
  @scala.inline
  def render(
    value: (/* value */ js.Any, RecordType, /* index */ Double) => ReactElement | RenderedCell[RecordType]
  ): this.type = set("render", js.Any.fromFunction3(value))
  
  @scala.inline
  def rowSpan(value: Double): this.type = set("rowSpan", value.asInstanceOf[js.Any])
  
  @scala.inline
  def shouldCellUpdate(value: (RecordType, RecordType) => Boolean): this.type = set("shouldCellUpdate", js.Any.fromFunction2(value))
  
  @scala.inline
  def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  
  @scala.inline
  def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  
  @scala.inline
  def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
}

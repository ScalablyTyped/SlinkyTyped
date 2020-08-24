package typingsSlinky.rcPicker.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcPicker.panelBodyMod.PanelBodyProps
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PanelBody {
  @JSImport("rc-picker/es/panels/PanelBody", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[DateType] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def disabledDate(value: DateType => Boolean): this.type = set("disabledDate", js.Any.fromFunction1(value))
    @scala.inline
    def getCellNode(value: DateType => ReactElement): this.type = set("getCellNode", js.Any.fromFunction1(value))
    @scala.inline
    def headerCellsReactElement(value: ReactElement): this.type = set("headerCells", value.asInstanceOf[js.Any])
    @scala.inline
    def headerCells(value: ReactElement): this.type = set("headerCells", value.asInstanceOf[js.Any])
    @scala.inline
    def prefixColumn(value: DateType => ReactElement): this.type = set("prefixColumn", js.Any.fromFunction1(value))
    @scala.inline
    def rowClassName(value: DateType => String): this.type = set("rowClassName", js.Any.fromFunction1(value))
    @scala.inline
    def titleCell(value: DateType => String): this.type = set("titleCell", js.Any.fromFunction1(value))
  }
  
  def withProps[DateType](p: PanelBodyProps[DateType]): Builder[DateType] = new Builder[DateType](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[DateType](
    baseDate: DateType,
    colNum: Double,
    getCellClassName: DateType => Record[String, js.UndefOr[Boolean]],
    getCellDate: (DateType, Double) => DateType,
    getCellText: DateType => ReactElement,
    onSelect: DateType => Unit,
    prefixCls: String,
    rowNum: Double
  ): Builder[DateType] = {
    val __props = js.Dynamic.literal(baseDate = baseDate.asInstanceOf[js.Any], colNum = colNum.asInstanceOf[js.Any], getCellClassName = js.Any.fromFunction1(getCellClassName), getCellDate = js.Any.fromFunction2(getCellDate), getCellText = js.Any.fromFunction1(getCellText), onSelect = js.Any.fromFunction1(onSelect), prefixCls = prefixCls.asInstanceOf[js.Any], rowNum = rowNum.asInstanceOf[js.Any])
    new Builder[DateType](js.Array(this.component, __props.asInstanceOf[PanelBodyProps[DateType]]))
  }
}


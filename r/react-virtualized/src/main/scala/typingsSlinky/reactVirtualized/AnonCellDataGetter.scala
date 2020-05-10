package typingsSlinky.reactVirtualized

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Requireable
import typingsSlinky.react.mod.Validator
import typingsSlinky.reactVirtualized.esTableMod.TableCellDataGetter
import typingsSlinky.reactVirtualized.esTableMod.TableCellRenderer
import typingsSlinky.reactVirtualized.esTableMod.TableHeaderRowRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCellDataGetter extends js.Object {
  var `aria-label`: Requireable[String] = js.native
  var cellDataGetter: Requireable[TableCellDataGetter] = js.native
  var cellRenderer: Requireable[TableCellRenderer] = js.native
  var className: Requireable[String] = js.native
  var columnData: Requireable[js.Object] = js.native
  var dataKey: Validator[String] = js.native
  var disableSort: Requireable[Boolean] = js.native
  var flexGrow: Requireable[Double] = js.native
  var flexShrink: Requireable[Double] = js.native
  var headerClassName: Requireable[String] = js.native
  var headerRenderer: Validator[TableHeaderRowRenderer] = js.native
  var id: Requireable[String] = js.native
  var label: Requireable[String] = js.native
  var maxWidth: Requireable[Double] = js.native
  var minWidth: Requireable[Double] = js.native
  var style: Requireable[CSSProperties] = js.native
  var width: Validator[Double] = js.native
}

object AnonCellDataGetter {
  @scala.inline
  def apply(
    `aria-label`: Requireable[String],
    cellDataGetter: Requireable[TableCellDataGetter],
    cellRenderer: Requireable[TableCellRenderer],
    className: Requireable[String],
    columnData: Requireable[js.Object],
    dataKey: Validator[String],
    disableSort: Requireable[Boolean],
    flexGrow: Requireable[Double],
    flexShrink: Requireable[Double],
    headerClassName: Requireable[String],
    headerRenderer: Validator[TableHeaderRowRenderer],
    id: Requireable[String],
    label: Requireable[String],
    maxWidth: Requireable[Double],
    minWidth: Requireable[Double],
    style: Requireable[CSSProperties],
    width: Validator[Double]
  ): AnonCellDataGetter = {
    val __obj = js.Dynamic.literal(cellDataGetter = cellDataGetter.asInstanceOf[js.Any], cellRenderer = cellRenderer.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], columnData = columnData.asInstanceOf[js.Any], dataKey = dataKey.asInstanceOf[js.Any], disableSort = disableSort.asInstanceOf[js.Any], flexGrow = flexGrow.asInstanceOf[js.Any], flexShrink = flexShrink.asInstanceOf[js.Any], headerClassName = headerClassName.asInstanceOf[js.Any], headerRenderer = headerRenderer.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCellDataGetter]
  }
  @scala.inline
  implicit class AnonCellDataGetterOps[Self <: AnonCellDataGetter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withAria-label`(value: Requireable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellDataGetter(value: Requireable[TableCellDataGetter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellDataGetter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellRenderer(value: Requireable[TableCellRenderer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: Requireable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnData(value: Requireable[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataKey(value: Validator[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableSort(value: Requireable[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlexGrow(value: Requireable[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexGrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlexShrink(value: Requireable[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexShrink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderClassName(value: Requireable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderRenderer(value: Validator[TableHeaderRowRenderer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Requireable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: Requireable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxWidth(value: Requireable[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinWidth(value: Requireable[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: Requireable[CSSProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Validator[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


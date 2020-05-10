package typingsSlinky.reactVirtualized.esListMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactVirtualized.esCellMeasurerMod.MeasuredCellParent
import typingsSlinky.reactVirtualized.esGridMod.GridCoreProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-virtualized.react-virtualized/dist/es/Grid.GridCellProps, std.Exclude<keyof react-virtualized.react-virtualized/dist/es/Grid.GridCellProps, 'rowIndex'>> & {  index  :react-virtualized.react-virtualized/dist/es/Grid.GridCellProps['rowIndex']} */
@js.native
trait ListRowProps extends js.Object {
  var columnIndex: Double = js.native
  var index: Double = js.native
  var isScrolling: Boolean = js.native
  var isVisible: Boolean = js.native
  var key: String = js.native
  var parent: ReactComponentClass[GridCoreProps] with MeasuredCellParent = js.native
  var style: CSSProperties = js.native
}

object ListRowProps {
  @scala.inline
  def apply(
    columnIndex: Double,
    index: Double,
    isScrolling: Boolean,
    isVisible: Boolean,
    key: String,
    parent: ReactComponentClass[GridCoreProps] with MeasuredCellParent,
    style: CSSProperties
  ): ListRowProps = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRowProps]
  }
  @scala.inline
  implicit class ListRowPropsOps[Self <: ListRowProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: ReactComponentClass[GridCoreProps] with MeasuredCellParent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


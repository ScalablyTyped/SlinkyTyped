package typingsSlinky.reactWindow.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridOnItemsRenderedProps extends js.Object {
  var overscanColumnStartIndex: Double = js.native
  var overscanColumnStopIndex: Double = js.native
  var overscanRowStartIndex: Double = js.native
  var overscanRowStopIndex: Double = js.native
  var visibleColumnStartIndex: Double = js.native
  var visibleColumnStopIndex: Double = js.native
  var visibleRowStartIndex: Double = js.native
  var visibleRowStopIndex: Double = js.native
}

object GridOnItemsRenderedProps {
  @scala.inline
  def apply(
    overscanColumnStartIndex: Double,
    overscanColumnStopIndex: Double,
    overscanRowStartIndex: Double,
    overscanRowStopIndex: Double,
    visibleColumnStartIndex: Double,
    visibleColumnStopIndex: Double,
    visibleRowStartIndex: Double,
    visibleRowStopIndex: Double
  ): GridOnItemsRenderedProps = {
    val __obj = js.Dynamic.literal(overscanColumnStartIndex = overscanColumnStartIndex.asInstanceOf[js.Any], overscanColumnStopIndex = overscanColumnStopIndex.asInstanceOf[js.Any], overscanRowStartIndex = overscanRowStartIndex.asInstanceOf[js.Any], overscanRowStopIndex = overscanRowStopIndex.asInstanceOf[js.Any], visibleColumnStartIndex = visibleColumnStartIndex.asInstanceOf[js.Any], visibleColumnStopIndex = visibleColumnStopIndex.asInstanceOf[js.Any], visibleRowStartIndex = visibleRowStartIndex.asInstanceOf[js.Any], visibleRowStopIndex = visibleRowStopIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridOnItemsRenderedProps]
  }
  @scala.inline
  implicit class GridOnItemsRenderedPropsOps[Self <: GridOnItemsRenderedProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOverscanColumnStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanColumnStartIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverscanColumnStopIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanColumnStopIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverscanRowStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanRowStartIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverscanRowStopIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanRowStopIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibleColumnStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleColumnStartIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibleColumnStopIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleColumnStopIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibleRowStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleRowStartIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibleRowStopIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleRowStopIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


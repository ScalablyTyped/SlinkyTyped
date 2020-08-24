package typingsSlinky.reactVis.mod

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RVNearestXYData[T /* <: AbstractSeriesPoint */] extends js.Object {
  var event: SyntheticMouseEvent[HTMLElement] = js.native
  var index: Double = js.native
  var innerX: /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any = js.native
  var innerY: /* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any = js.native
}

object RVNearestXYData {
  @scala.inline
  def apply[/* <: typingsSlinky.reactVis.mod.AbstractSeriesPoint */ T](
    event: SyntheticMouseEvent[HTMLElement],
    index: Double,
    innerX: /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any,
    innerY: /* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any
  ): RVNearestXYData[T] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], innerX = innerX.asInstanceOf[js.Any], innerY = innerY.asInstanceOf[js.Any])
    __obj.asInstanceOf[RVNearestXYData[T]]
  }
  @scala.inline
  implicit class RVNearestXYDataOps[Self <: RVNearestXYData[_], /* <: typingsSlinky.reactVis.mod.AbstractSeriesPoint */ T] (val x: Self with RVNearestXYData[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEvent(value: SyntheticMouseEvent[HTMLElement]): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setInnerX(value: /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any): Self = this.set("innerX", value.asInstanceOf[js.Any])
    @scala.inline
    def setInnerY(value: /* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any): Self = this.set("innerY", value.asInstanceOf[js.Any])
  }
  
}


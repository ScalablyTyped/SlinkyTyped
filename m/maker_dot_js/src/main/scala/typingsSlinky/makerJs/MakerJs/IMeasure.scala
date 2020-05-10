package typingsSlinky.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A measurement of extents, the high and low points.
  */
@js.native
trait IMeasure extends js.Object {
  /**
    * The point containing both the highest x and y values of the rectangle containing the item being measured.
    */
  var high: IPoint = js.native
  /**
    * The point containing both the lowest x and y values of the rectangle containing the item being measured.
    */
  var low: IPoint = js.native
}

object IMeasure {
  @scala.inline
  def apply(high: IPoint, low: IPoint): IMeasure = {
    val __obj = js.Dynamic.literal(high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMeasure]
  }
  @scala.inline
  implicit class IMeasureOps[Self <: IMeasure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHigh(value: IPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("high")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLow(value: IPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("low")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


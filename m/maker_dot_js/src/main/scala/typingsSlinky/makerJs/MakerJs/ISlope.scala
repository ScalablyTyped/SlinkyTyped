package typingsSlinky.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Slope and y-intercept of a line.
  */
@js.native
trait ISlope extends js.Object {
  /**
    * Boolean to see if line has slope or is vertical.
    */
  var hasSlope: Boolean = js.native
  /**
    * Line used to calculate this slope.
    */
  var line: IPathLine = js.native
  /**
    * Optional value of non-vertical slope.
    */
  var slope: js.UndefOr[Double] = js.native
  /**
    * Optional value of y when x = 0.
    */
  var yIntercept: js.UndefOr[Double] = js.native
}

object ISlope {
  @scala.inline
  def apply(hasSlope: Boolean, line: IPathLine): ISlope = {
    val __obj = js.Dynamic.literal(hasSlope = hasSlope.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISlope]
  }
  @scala.inline
  implicit class ISlopeOps[Self <: ISlope] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasSlope(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSlope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine(value: IPathLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlope(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slope")(js.undefined)
        ret
    }
    @scala.inline
    def withYIntercept(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yIntercept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYIntercept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yIntercept")(js.undefined)
        ret
    }
  }
  
}


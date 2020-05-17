package typingsSlinky.activexLibreoffice.com_.sun.star.style

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure is used to specify the height of a text line.
  * @see LineSpacingMode
  */
@js.native
trait LineSpacing extends js.Object {
  /** This value specifies the height in regard to **Mode** . */
  var Height: Double = js.native
  /** This value specifies the way the height is specified. */
  var Mode: Double = js.native
}

object LineSpacing {
  @scala.inline
  def apply(Height: Double, Mode: Double): LineSpacing = {
    val __obj = js.Dynamic.literal(Height = Height.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineSpacing]
  }
  @scala.inline
  implicit class LineSpacingOps[Self <: LineSpacing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


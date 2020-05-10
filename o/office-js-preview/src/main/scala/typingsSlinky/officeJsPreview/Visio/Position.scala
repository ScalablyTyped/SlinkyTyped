package typingsSlinky.officeJsPreview.Visio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Position of the object in the view.
  *
  * [Api set:  1.1]
  */
@js.native
trait Position extends js.Object {
  /**
    *
    * An integer that specifies the x-coordinate of the object, which is the signed value of the distance in pixels from the viewport's center to the left boundary of the page.
    *
    * [Api set:  1.1]
    */
  var x: Double = js.native
  /**
    *
    * An integer that specifies the y-coordinate of the object, which is the signed value of the distance in pixels from the viewport's center to the top boundary of the page.
    *
    * [Api set:  1.1]
    */
  var y: Double = js.native
}

object Position {
  @scala.inline
  def apply(x: Double, y: Double): Position = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
  @scala.inline
  implicit class PositionOps[Self <: Position] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.appleMapkitJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCircle extends js.Object {
  val Circle: String = js.native
  val Rectangle: String = js.native
}

object AnonCircle {
  @scala.inline
  def apply(Circle: String, Rectangle: String): AnonCircle = {
    val __obj = js.Dynamic.literal(Circle = Circle.asInstanceOf[js.Any], Rectangle = Rectangle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCircle]
  }
  @scala.inline
  implicit class AnonCircleOps[Self <: AnonCircle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCircle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Circle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRectangle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rectangle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


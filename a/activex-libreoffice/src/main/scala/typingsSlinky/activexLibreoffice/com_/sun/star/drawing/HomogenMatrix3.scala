package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a homogeneous matrix by three homogeneous lines */
@js.native
trait HomogenMatrix3 extends js.Object {
  var Line1: HomogenMatrixLine3 = js.native
  var Line2: HomogenMatrixLine3 = js.native
  var Line3: HomogenMatrixLine3 = js.native
}

object HomogenMatrix3 {
  @scala.inline
  def apply(Line1: HomogenMatrixLine3, Line2: HomogenMatrixLine3, Line3: HomogenMatrixLine3): HomogenMatrix3 = {
    val __obj = js.Dynamic.literal(Line1 = Line1.asInstanceOf[js.Any], Line2 = Line2.asInstanceOf[js.Any], Line3 = Line3.asInstanceOf[js.Any])
    __obj.asInstanceOf[HomogenMatrix3]
  }
  @scala.inline
  implicit class HomogenMatrix3Ops[Self <: HomogenMatrix3] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLine1(value: HomogenMatrixLine3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Line1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine2(value: HomogenMatrixLine3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Line2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine3(value: HomogenMatrixLine3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Line3")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


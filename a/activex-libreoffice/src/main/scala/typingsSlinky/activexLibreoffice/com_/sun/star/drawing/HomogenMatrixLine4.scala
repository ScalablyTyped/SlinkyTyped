package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a single line for a {@link HomogenMatrix4} . */
@js.native
trait HomogenMatrixLine4 extends js.Object {
  var Column1: Double = js.native
  var Column2: Double = js.native
  var Column3: Double = js.native
  var Column4: Double = js.native
}

object HomogenMatrixLine4 {
  @scala.inline
  def apply(Column1: Double, Column2: Double, Column3: Double, Column4: Double): HomogenMatrixLine4 = {
    val __obj = js.Dynamic.literal(Column1 = Column1.asInstanceOf[js.Any], Column2 = Column2.asInstanceOf[js.Any], Column3 = Column3.asInstanceOf[js.Any], Column4 = Column4.asInstanceOf[js.Any])
    __obj.asInstanceOf[HomogenMatrixLine4]
  }
  @scala.inline
  implicit class HomogenMatrixLine4Ops[Self <: HomogenMatrixLine4] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Column1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumn2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Column2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumn3(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Column3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumn4(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Column4")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


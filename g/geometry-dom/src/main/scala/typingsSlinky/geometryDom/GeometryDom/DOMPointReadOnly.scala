package typingsSlinky.geometryDom.GeometryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMPointReadOnly extends js.Object {
  /**
    * w coordinate / readonly
    */
  var w: Double = js.native
  /**
    * x coordinate / readonly
    */
  var x: Double = js.native
  /**
    * y coordinate / readonly
    */
  var y: Double = js.native
  /**
    * z coordinate / readonly
    */
  var z: Double = js.native
  /**
    * Post-multiply point with matrix.
    * @param matrix
    */
  def matrixTransform(matrix: DOMMatrixReadOnly): DOMPoint = js.native
}

object DOMPointReadOnly {
  @scala.inline
  def apply(matrixTransform: DOMMatrixReadOnly => DOMPoint, w: Double, x: Double, y: Double, z: Double): DOMPointReadOnly = {
    val __obj = js.Dynamic.literal(matrixTransform = js.Any.fromFunction1(matrixTransform), w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMPointReadOnly]
  }
  @scala.inline
  implicit class DOMPointReadOnlyOps[Self <: DOMPointReadOnly] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatrixTransform(value: DOMMatrixReadOnly => DOMPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrixTransform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withW(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("w")(value.asInstanceOf[js.Any])
        ret
    }
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
    @scala.inline
    def withZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


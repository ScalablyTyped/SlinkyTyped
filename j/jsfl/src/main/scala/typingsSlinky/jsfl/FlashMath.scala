package typingsSlinky.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashMath extends js.Object {
  /** Method; performs a matrix concatenation and returns the result. */
  def concatMatrix(mat1: FlashMatrix, mat2: FlashMatrix): FlashMatrix = js.native
  /** A Matrix object that is the inverse of the original matrix. */
  def invertMatrix(mat: FlashMatrix): FlashMatrix = js.native
  /** A floating-point value that represents the distance between the points. */
  def pointDistance(pt1: FlashPoint, pt2: FlashPoint): Double = js.native
}

object FlashMath {
  @scala.inline
  def apply(
    concatMatrix: (FlashMatrix, FlashMatrix) => FlashMatrix,
    invertMatrix: FlashMatrix => FlashMatrix,
    pointDistance: (FlashPoint, FlashPoint) => Double
  ): FlashMath = {
    val __obj = js.Dynamic.literal(concatMatrix = js.Any.fromFunction2(concatMatrix), invertMatrix = js.Any.fromFunction1(invertMatrix), pointDistance = js.Any.fromFunction2(pointDistance))
    __obj.asInstanceOf[FlashMath]
  }
  @scala.inline
  implicit class FlashMathOps[Self <: FlashMath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConcatMatrix(value: (FlashMatrix, FlashMatrix) => FlashMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concatMatrix")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInvertMatrix(value: FlashMatrix => FlashMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invertMatrix")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPointDistance(value: (FlashPoint, FlashPoint) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointDistance")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}


package typingsSlinky.jsts.jsts.operation.relate

import typingsSlinky.jsts.jsts.geom.Geometry
import typingsSlinky.jsts.jsts.geom.IntersectionMatrix
import typingsSlinky.jsts.jsts.geom.PrecisionModel
import typingsSlinky.jsts.jsts.operation.GeometryGraphOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelateOp extends GeometryGraphOperation {
  def getIntersectionMatrix(): IntersectionMatrix = js.native
}

object RelateOp {
  @scala.inline
  def apply(
    getArgGeometry: Double => Geometry,
    getIntersectionMatrix: () => IntersectionMatrix,
    setComputationPrecision: PrecisionModel => Unit
  ): RelateOp = {
    val __obj = js.Dynamic.literal(getArgGeometry = js.Any.fromFunction1(getArgGeometry), getIntersectionMatrix = js.Any.fromFunction0(getIntersectionMatrix), setComputationPrecision = js.Any.fromFunction1(setComputationPrecision))
    __obj.asInstanceOf[RelateOp]
  }
  @scala.inline
  implicit class RelateOpOps[Self <: RelateOp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetIntersectionMatrix(value: () => IntersectionMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIntersectionMatrix")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}


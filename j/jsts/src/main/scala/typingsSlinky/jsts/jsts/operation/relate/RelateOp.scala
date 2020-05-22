package typingsSlinky.jsts.jsts.operation.relate

import typingsSlinky.jsts.jsts.geom.Geometry
import typingsSlinky.jsts.jsts.geom.IntersectionMatrix
import typingsSlinky.jsts.jsts.geom.PrecisionModel
import typingsSlinky.jsts.jsts.operation.GeometryGraphOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelateOp extends GeometryGraphOperation {
  def getIntersectionMatrix(): IntersectionMatrix
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
}


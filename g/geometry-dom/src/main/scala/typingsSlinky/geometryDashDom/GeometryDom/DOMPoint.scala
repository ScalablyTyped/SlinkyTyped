package typingsSlinky.geometryDashDom.GeometryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMPoint
  extends typingsSlinky.geometryDashDom.GeometryDom.DOMPointReadOnly

object DOMPoint {
  @scala.inline
  def apply(
    matrixTransform: typingsSlinky.geometryDashDom.GeometryDom.DOMMatrixReadOnly => typingsSlinky.geometryDashDom.GeometryDom.DOMPoint,
    w: Double,
    x: Double,
    y: Double,
    z: Double
  ): DOMPoint = {
    val __obj = js.Dynamic.literal(matrixTransform = js.Any.fromFunction1(matrixTransform), w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DOMPoint]
  }
}


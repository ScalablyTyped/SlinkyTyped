package typingsSlinky.jsts.jsts.operation

import typingsSlinky.jsts.jsts.geom.Geometry
import typingsSlinky.jsts.jsts.geom.PrecisionModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeometryGraphOperation extends js.Object {
  def getArgGeometry(i: Double): Geometry = js.native
  def setComputationPrecision(pm: PrecisionModel): Unit = js.native
}

object GeometryGraphOperation {
  @scala.inline
  def apply(getArgGeometry: Double => Geometry, setComputationPrecision: PrecisionModel => Unit): GeometryGraphOperation = {
    val __obj = js.Dynamic.literal(getArgGeometry = js.Any.fromFunction1(getArgGeometry), setComputationPrecision = js.Any.fromFunction1(setComputationPrecision))
    __obj.asInstanceOf[GeometryGraphOperation]
  }
  @scala.inline
  implicit class GeometryGraphOperationOps[Self <: GeometryGraphOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetArgGeometry(value: Double => Geometry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getArgGeometry")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetComputationPrecision(value: PrecisionModel => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setComputationPrecision")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


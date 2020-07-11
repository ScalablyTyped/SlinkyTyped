package typingsSlinky.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ARMatrices extends js.Object {
  var projectionMatrix: Matrix
  var transform: Matrix
  var viewMatrix: Matrix
}

object ARMatrices {
  @scala.inline
  def apply(projectionMatrix: Matrix, transform: Matrix, viewMatrix: Matrix): ARMatrices = {
    val __obj = js.Dynamic.literal(projectionMatrix = projectionMatrix.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], viewMatrix = viewMatrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARMatrices]
  }
  @scala.inline
  implicit class ARMatricesOps[Self <: ARMatrices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProjectionMatrixVarargs(value: Double*): Self = this.set("projectionMatrix", js.Array(value :_*))
    @scala.inline
    def setProjectionMatrix(value: Matrix): Self = this.set("projectionMatrix", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformVarargs(value: Double*): Self = this.set("transform", js.Array(value :_*))
    @scala.inline
    def setTransform(value: Matrix): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewMatrixVarargs(value: Double*): Self = this.set("viewMatrix", js.Array(value :_*))
    @scala.inline
    def setViewMatrix(value: Matrix): Self = this.set("viewMatrix", value.asInstanceOf[js.Any])
  }
  
}


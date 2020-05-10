package typingsSlinky.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ARMatrices extends js.Object {
  var projectionMatrix: Matrix = js.native
  var transform: Matrix = js.native
  var viewMatrix: Matrix = js.native
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
    def withProjectionMatrix(value: Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectionMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransform(value: Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewMatrix(value: Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewMatrix")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


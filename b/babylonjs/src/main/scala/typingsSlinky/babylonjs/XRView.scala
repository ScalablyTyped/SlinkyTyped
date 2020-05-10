package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XRView extends js.Object {
  var eye: XREye = js.native
  var projectionMatrix: js.typedarray.Float32Array = js.native
  var transform: XRRigidTransform = js.native
}

object XRView {
  @scala.inline
  def apply(eye: XREye, projectionMatrix: js.typedarray.Float32Array, transform: XRRigidTransform): XRView = {
    val __obj = js.Dynamic.literal(eye = eye.asInstanceOf[js.Any], projectionMatrix = projectionMatrix.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRView]
  }
  @scala.inline
  implicit class XRViewOps[Self <: XRView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEye(value: XREye): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eye")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectionMatrix(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectionMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransform(value: XRRigidTransform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


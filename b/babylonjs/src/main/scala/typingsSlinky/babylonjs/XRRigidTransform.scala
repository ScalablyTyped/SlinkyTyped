package typingsSlinky.babylonjs

import typingsSlinky.std.DOMPointReadOnly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XRRigidTransform extends js.Object {
  var inverse: XRRigidTransform = js.native
  var matrix: js.typedarray.Float32Array = js.native
  var orientation: DOMPointReadOnly = js.native
  var position: DOMPointReadOnly = js.native
}

object XRRigidTransform {
  @scala.inline
  def apply(
    inverse: XRRigidTransform,
    matrix: js.typedarray.Float32Array,
    orientation: DOMPointReadOnly,
    position: DOMPointReadOnly
  ): XRRigidTransform = {
    val __obj = js.Dynamic.literal(inverse = inverse.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRRigidTransform]
  }
  @scala.inline
  implicit class XRRigidTransformOps[Self <: XRRigidTransform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInverse(value: XRRigidTransform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatrix(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: DOMPointReadOnly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: DOMPointReadOnly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


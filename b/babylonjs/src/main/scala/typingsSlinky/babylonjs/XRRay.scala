package typingsSlinky.babylonjs

import typingsSlinky.std.DOMPointReadOnly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Experimental(er) features
@js.native
trait XRRay extends js.Object {
  var direction: DOMPointReadOnly = js.native
  var matrix: js.typedarray.Float32Array = js.native
  var origin: DOMPointReadOnly = js.native
}

object XRRay {
  @scala.inline
  def apply(direction: DOMPointReadOnly, matrix: js.typedarray.Float32Array, origin: DOMPointReadOnly): XRRay = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRRay]
  }
  @scala.inline
  implicit class XRRayOps[Self <: XRRay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: DOMPointReadOnly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatrix(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigin(value: DOMPointReadOnly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


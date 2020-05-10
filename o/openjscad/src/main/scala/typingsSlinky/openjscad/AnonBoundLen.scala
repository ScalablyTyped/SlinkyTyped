package typingsSlinky.openjscad

import typingsSlinky.three.mod.Mesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBoundLen extends js.Object {
  var boundLen: Double = js.native
  var colorMesh: Mesh = js.native
  var wireframe: Mesh = js.native
}

object AnonBoundLen {
  @scala.inline
  def apply(boundLen: Double, colorMesh: Mesh, wireframe: Mesh): AnonBoundLen = {
    val __obj = js.Dynamic.literal(boundLen = boundLen.asInstanceOf[js.Any], colorMesh = colorMesh.asInstanceOf[js.Any], wireframe = wireframe.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBoundLen]
  }
  @scala.inline
  implicit class AnonBoundLenOps[Self <: AnonBoundLen] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundLen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundLen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorMesh(value: Mesh): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMesh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWireframe(value: Mesh): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wireframe")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


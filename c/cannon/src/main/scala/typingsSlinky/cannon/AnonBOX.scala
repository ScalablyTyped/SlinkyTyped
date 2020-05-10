package typingsSlinky.cannon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBOX extends js.Object {
  var BOX: Double = js.native
  var COMPOUND: Double = js.native
  var CONVEXPOLYHEDRON: Double = js.native
  var CYLINDER: Double = js.native
  var HEIGHTFIELD: Double = js.native
  var PARTICLE: Double = js.native
  var PLANE: Double = js.native
  var SPHERE: Double = js.native
}

object AnonBOX {
  @scala.inline
  def apply(
    BOX: Double,
    COMPOUND: Double,
    CONVEXPOLYHEDRON: Double,
    CYLINDER: Double,
    HEIGHTFIELD: Double,
    PARTICLE: Double,
    PLANE: Double,
    SPHERE: Double
  ): AnonBOX = {
    val __obj = js.Dynamic.literal(BOX = BOX.asInstanceOf[js.Any], COMPOUND = COMPOUND.asInstanceOf[js.Any], CONVEXPOLYHEDRON = CONVEXPOLYHEDRON.asInstanceOf[js.Any], CYLINDER = CYLINDER.asInstanceOf[js.Any], HEIGHTFIELD = HEIGHTFIELD.asInstanceOf[js.Any], PARTICLE = PARTICLE.asInstanceOf[js.Any], PLANE = PLANE.asInstanceOf[js.Any], SPHERE = SPHERE.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBOX]
  }
  @scala.inline
  implicit class AnonBOXOps[Self <: AnonBOX] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBOX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BOX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCOMPOUND(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("COMPOUND")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCONVEXPOLYHEDRON(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CONVEXPOLYHEDRON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCYLINDER(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CYLINDER")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHEIGHTFIELD(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HEIGHTFIELD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPARTICLE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PARTICLE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPLANE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PLANE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSPHERE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SPHERE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


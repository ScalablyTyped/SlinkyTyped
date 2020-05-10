package typingsSlinky.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPhysics extends js.Object {
  var physics: AnonGravity = js.native
  var render: AnonExposure = js.native
}

object AnonPhysics {
  @scala.inline
  def apply(physics: AnonGravity, render: AnonExposure): AnonPhysics = {
    val __obj = js.Dynamic.literal(physics = physics.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPhysics]
  }
  @scala.inline
  implicit class AnonPhysicsOps[Self <: AnonPhysics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPhysics(value: AnonGravity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("physics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRender(value: AnonExposure): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


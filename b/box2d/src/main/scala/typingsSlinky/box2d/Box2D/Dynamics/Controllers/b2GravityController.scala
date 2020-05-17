package typingsSlinky.box2d.Box2D.Dynamics.Controllers

import typingsSlinky.box2d.Box2D.Dynamics.b2Body
import typingsSlinky.box2d.Box2D.Dynamics.b2DebugDraw
import typingsSlinky.box2d.Box2D.Dynamics.b2World
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2GravityController extends b2Controller {
  /**
  		* Specifies the strength of the gravitation force.
  		* @default = 1
  		**/
  var G: Double = js.native
  /**
  		* If true, gravity is proportional to r^-2, otherwise r^-1.
  		**/
  var invSqr: Boolean = js.native
}

object b2GravityController {
  @scala.inline
  def apply(
    AddBody: b2Body => Unit,
    Clear: () => Unit,
    Draw: b2DebugDraw => Unit,
    G: Double,
    GetBodyList: () => b2ControllerEdge,
    GetNext: () => b2Controller,
    GetWorld: () => b2World,
    RemoveBody: b2Body => Unit,
    Step: js.Any => Unit,
    invSqr: Boolean,
    m_bodyCount: Double,
    m_bodyList: b2ControllerEdge
  ): b2GravityController = {
    val __obj = js.Dynamic.literal(AddBody = js.Any.fromFunction1(AddBody), Clear = js.Any.fromFunction0(Clear), Draw = js.Any.fromFunction1(Draw), G = G.asInstanceOf[js.Any], GetBodyList = js.Any.fromFunction0(GetBodyList), GetNext = js.Any.fromFunction0(GetNext), GetWorld = js.Any.fromFunction0(GetWorld), RemoveBody = js.Any.fromFunction1(RemoveBody), Step = js.Any.fromFunction1(Step), invSqr = invSqr.asInstanceOf[js.Any], m_bodyCount = m_bodyCount.asInstanceOf[js.Any], m_bodyList = m_bodyList.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2GravityController]
  }
  @scala.inline
  implicit class b2GravityControllerOps[Self <: b2GravityController] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withG(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("G")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvSqr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invSqr")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


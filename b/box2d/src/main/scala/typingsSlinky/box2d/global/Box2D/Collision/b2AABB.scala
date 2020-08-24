package typingsSlinky.box2d.global.Box2D.Collision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.b2AABB")
@js.native
class b2AABB ()
  extends typingsSlinky.box2d.Box2D.Collision.b2AABB

/* static members */
@JSGlobal("Box2D.Collision.b2AABB")
@js.native
object b2AABB extends js.Object {
  /**
    * Combines two AABBs into one with max values for upper bound and min values for lower bound.
    * @param aabb1 First AABB to combine.
    * @param aabb2 Second AABB to combine.
    * @return New AABB with max values from aabb1 and aabb2.
    **/
  def Combine(
    aabb1: typingsSlinky.box2d.Box2D.Collision.b2AABB,
    aabb2: typingsSlinky.box2d.Box2D.Collision.b2AABB
  ): typingsSlinky.box2d.Box2D.Collision.b2AABB = js.native
}


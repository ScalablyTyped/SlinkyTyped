package typingsSlinky.box2d.Box2D.Dynamics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2ContactFilter extends js.Object {
  /**
  		* Return true if the given fixture should be considered for ray intersection. By default, userData is cast as a b2Fixture and collision is resolved according to ShouldCollide.
  		* @note This function is not in the box2dweb.as code -- might not work.
  		* @see b2World.Raycast()
  		* @see b2ContactFilter.ShouldCollide()
  		* @param userData User provided data.  Comments indicate that this might be a b2Fixture.
  		* @return True if the fixture should be considered for ray intersection, otherwise false.
  		**/
  def RayCollide(userData: js.Any): Boolean = js.native
  /**
  		* Return true if contact calculations should be performed between these two fixtures.
  		* @warning For performance reasons this is only called when the AABBs begin to overlap.
  		* @param fixtureA b2Fixture potentially colliding with fixtureB.
  		* @param fixtureB b2Fixture potentially colliding with fixtureA.
  		* @return True if fixtureA and fixtureB probably collide requiring more calculations, otherwise false.
  		**/
  def ShouldCollide(fixtureA: b2Fixture, fixtureB: b2Fixture): Boolean = js.native
}

object b2ContactFilter {
  @scala.inline
  def apply(RayCollide: js.Any => Boolean, ShouldCollide: (b2Fixture, b2Fixture) => Boolean): b2ContactFilter = {
    val __obj = js.Dynamic.literal(RayCollide = js.Any.fromFunction1(RayCollide), ShouldCollide = js.Any.fromFunction2(ShouldCollide))
    __obj.asInstanceOf[b2ContactFilter]
  }
  @scala.inline
  implicit class b2ContactFilterOps[Self <: b2ContactFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRayCollide(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RayCollide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShouldCollide(value: (b2Fixture, b2Fixture) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShouldCollide")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}


package typingsSlinky.box2d.Box2D.Dynamics

import typingsSlinky.box2d.Box2D.Collision.Shapes.b2Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2FixtureDef extends js.Object {
  /**
  		* The density, usually in kg/m^2.
  		**/
  var density: Double = js.native
  /**
  		* Contact filtering data.
  		**/
  var filter: b2FilterData = js.native
  /**
  		* The friction coefficient, usually in the range [0,1].
  		**/
  var friction: Double = js.native
  /**
  		* A sensor shape collects contact information but never generates a collision response.
  		**/
  var isSensor: Boolean = js.native
  /**
  		* The restitution (elasticity) usually in the range [0,1].
  		**/
  var restitution: Double = js.native
  /**
  		* The shape, this must be set. The shape will be cloned, so you can create the shape on the stack.
  		**/
  var shape: b2Shape = js.native
  /**
  		* Use this to store application specific fixture data.
  		**/
  var userData: js.Any = js.native
}

object b2FixtureDef {
  @scala.inline
  def apply(
    density: Double,
    filter: b2FilterData,
    friction: Double,
    isSensor: Boolean,
    restitution: Double,
    shape: b2Shape,
    userData: js.Any
  ): b2FixtureDef = {
    val __obj = js.Dynamic.literal(density = density.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], friction = friction.asInstanceOf[js.Any], isSensor = isSensor.asInstanceOf[js.Any], restitution = restitution.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2FixtureDef]
  }
  @scala.inline
  implicit class b2FixtureDefOps[Self <: b2FixtureDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDensity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("density")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: b2FilterData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFriction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSensor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSensor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestitution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restitution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShape(value: b2Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


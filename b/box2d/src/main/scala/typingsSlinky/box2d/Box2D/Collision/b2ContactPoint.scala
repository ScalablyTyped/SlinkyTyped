package typingsSlinky.box2d.Box2D.Collision

import typingsSlinky.box2d.Box2D.Collision.Shapes.b2Shape
import typingsSlinky.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2ContactPoint extends js.Object {
  /**
  		* The combined friction coefficient.
  		**/
  var friction: Double = js.native
  /**
  		* The contact id identifies the features in contact.
  		**/
  var id: b2ContactID = js.native
  /**
  		* Points from shape1 to shape2.
  		**/
  var normal: b2Vec2 = js.native
  /**
  		* Position in world coordinates.
  		**/
  var position: b2Vec2 = js.native
  /**
  		* The combined restitution coefficient.
  		**/
  var restitution: Double = js.native
  /**
  		* The separation is negative when shapes are touching.
  		**/
  var separation: Double = js.native
  /**
  		* The first shape.
  		**/
  var shape1: b2Shape = js.native
  /**
  		* The second shape.
  		**/
  var shape2: b2Shape = js.native
  /**
  		* Velocity of point on body2 relative to point on body1 (pre-solver).
  		**/
  var velocity: b2Vec2 = js.native
}

object b2ContactPoint {
  @scala.inline
  def apply(
    friction: Double,
    id: b2ContactID,
    normal: b2Vec2,
    position: b2Vec2,
    restitution: Double,
    separation: Double,
    shape1: b2Shape,
    shape2: b2Shape,
    velocity: b2Vec2
  ): b2ContactPoint = {
    val __obj = js.Dynamic.literal(friction = friction.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], restitution = restitution.asInstanceOf[js.Any], separation = separation.asInstanceOf[js.Any], shape1 = shape1.asInstanceOf[js.Any], shape2 = shape2.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2ContactPoint]
  }
  @scala.inline
  implicit class b2ContactPointOps[Self <: b2ContactPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFriction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: b2ContactID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormal(value: b2Vec2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: b2Vec2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestitution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restitution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeparation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShape1(value: b2Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShape2(value: b2Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVelocity(value: b2Vec2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


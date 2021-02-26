package typingsSlinky.box2d.Box2D.Dynamics

import typingsSlinky.box2d.Box2D.Common.Math.b2Vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait b2BodyDef extends StObject {
  
  /**
    * Does this body start out active?
    **/
  var active: Boolean = js.native
  
  /**
    * Set this flag to false if this body should never fall asleep. Note that this increases CPU usage.
    **/
  var allowSleep: Boolean = js.native
  
  /**
    * The world angle of the body in radians.
    **/
  var angle: Double = js.native
  
  /**
    * Angular damping is use to reduce the angular velocity. The damping parameter can be larger than 1.0f but the damping effect becomes sensitive to the time step when the damping parameter is large.
    **/
  var angularDamping: Double = js.native
  
  /**
    * The angular velocity of the body.
    **/
  var angularVelocity: Double = js.native
  
  /**
    * Is this body initially awake or sleeping?
    **/
  var awake: Boolean = js.native
  
  /**
    * Is this a fast moving body that should be prevented from tunneling through other moving bodies? Note that all bodies are prevented from tunneling through static bodies.
    * @warning You should use this flag sparingly since it increases processing time.
    **/
  var bullet: Boolean = js.native
  
  /**
    * Should this body be prevented from rotating? Useful for characters.
    **/
  var fixedRotation: Boolean = js.native
  
  /**
    * Scales the inertia tensor.
    * @warning Experimental
    **/
  var inertiaScale: Double = js.native
  
  /**
    * Linear damping is use to reduce the linear velocity. The damping parameter can be larger than 1.0f but the damping effect becomes sensitive to the time step when the damping parameter is large.
    **/
  var linearDamping: Double = js.native
  
  /**
    * The linear velocity of the body's origin in world co-ordinates.
    **/
  var linearVelocity: b2Vec2 = js.native
  
  /**
    * The world position of the body. Avoid creating bodies at the origin since this can lead to many overlapping shapes.
    **/
  var position: b2Vec2 = js.native
  
  /**
    * The body type: static, kinematic, or dynamic. A member of the b2BodyType class .
    * @note If a dynamic body would have zero mass, the mass is set to one.
    **/
  var `type`: Double = js.native
  
  /**
    * Use this to store application specific body data.
    **/
  var userData: js.Any = js.native
}
object b2BodyDef {
  
  @scala.inline
  def apply(
    active: Boolean,
    allowSleep: Boolean,
    angle: Double,
    angularDamping: Double,
    angularVelocity: Double,
    awake: Boolean,
    bullet: Boolean,
    fixedRotation: Boolean,
    inertiaScale: Double,
    linearDamping: Double,
    linearVelocity: b2Vec2,
    position: b2Vec2,
    `type`: Double,
    userData: js.Any
  ): b2BodyDef = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], allowSleep = allowSleep.asInstanceOf[js.Any], angle = angle.asInstanceOf[js.Any], angularDamping = angularDamping.asInstanceOf[js.Any], angularVelocity = angularVelocity.asInstanceOf[js.Any], awake = awake.asInstanceOf[js.Any], bullet = bullet.asInstanceOf[js.Any], fixedRotation = fixedRotation.asInstanceOf[js.Any], inertiaScale = inertiaScale.asInstanceOf[js.Any], linearDamping = linearDamping.asInstanceOf[js.Any], linearVelocity = linearVelocity.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2BodyDef]
  }
  
  @scala.inline
  implicit class b2BodyDefMutableBuilder[Self <: b2BodyDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSleep(value: Boolean): Self = StObject.set(x, "allowSleep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngularDamping(value: Double): Self = StObject.set(x, "angularDamping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngularVelocity(value: Double): Self = StObject.set(x, "angularVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwake(value: Boolean): Self = StObject.set(x, "awake", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBullet(value: Boolean): Self = StObject.set(x, "bullet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedRotation(value: Boolean): Self = StObject.set(x, "fixedRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInertiaScale(value: Double): Self = StObject.set(x, "inertiaScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearDamping(value: Double): Self = StObject.set(x, "linearDamping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearVelocity(value: b2Vec2): Self = StObject.set(x, "linearVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: b2Vec2): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserData(value: js.Any): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
  }
}

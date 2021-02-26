package typingsSlinky.phaser.Phaser.Types.Physics.Matter

import typingsSlinky.phaser.MatterJS.BodyType
import typingsSlinky.phaser.MatterJS.Vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatterCollisionPair extends StObject {
  
  /**
    * An array containing all of the active contacts between bodies A and B.
    */
  var activeContacts: js.Array[Vector] = js.native
  
  /**
    * A reference to the first body involved in the collision.
    */
  var bodyA: BodyType = js.native
  
  /**
    * A reference to the second body involved in the collision.
    */
  var bodyB: BodyType = js.native
  
  /**
    * The collision data object.
    */
  var collision: MatterCollisionData = js.native
  
  /**
    * Has Matter determined the collision are being active yet?
    */
  var confirmedActive: Boolean = js.native
  
  /**
    * The resulting friction from the collision.
    */
  var friction: Double = js.native
  
  /**
    * The resulting static friction from the collision.
    */
  var frictionStatic: Double = js.native
  
  /**
    * The unique auto-generated collision pair id. A combination of the body A and B IDs.
    */
  var id: String = js.native
  
  /**
    * The resulting inverse mass from the collision.
    */
  var inverseMass: Double = js.native
  
  /**
    * Is the collision still active or not?
    */
  var isActive: Boolean = js.native
  
  /**
    * Is either body A or B a sensor?
    */
  var isSensor: Boolean = js.native
  
  /**
    * The resulting restitution from the collision.
    */
  var restitution: Double = js.native
  
  /**
    * The amount of separation that occured between bodies A and B.
    */
  var separation: Double = js.native
  
  /**
    * The resulting slop from the collision.
    */
  var slop: Double = js.native
  
  /**
    * The timestamp when the collision pair was created.
    */
  var timeCreated: Double = js.native
  
  /**
    * The timestamp when the collision pair was most recently updated.
    */
  var timeUpdated: Double = js.native
}
object MatterCollisionPair {
  
  @scala.inline
  def apply(
    activeContacts: js.Array[Vector],
    bodyA: BodyType,
    bodyB: BodyType,
    collision: MatterCollisionData,
    confirmedActive: Boolean,
    friction: Double,
    frictionStatic: Double,
    id: String,
    inverseMass: Double,
    isActive: Boolean,
    isSensor: Boolean,
    restitution: Double,
    separation: Double,
    slop: Double,
    timeCreated: Double,
    timeUpdated: Double
  ): MatterCollisionPair = {
    val __obj = js.Dynamic.literal(activeContacts = activeContacts.asInstanceOf[js.Any], bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collision = collision.asInstanceOf[js.Any], confirmedActive = confirmedActive.asInstanceOf[js.Any], friction = friction.asInstanceOf[js.Any], frictionStatic = frictionStatic.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inverseMass = inverseMass.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isSensor = isSensor.asInstanceOf[js.Any], restitution = restitution.asInstanceOf[js.Any], separation = separation.asInstanceOf[js.Any], slop = slop.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeUpdated = timeUpdated.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatterCollisionPair]
  }
  
  @scala.inline
  implicit class MatterCollisionPairMutableBuilder[Self <: MatterCollisionPair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveContacts(value: js.Array[Vector]): Self = StObject.set(x, "activeContacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveContactsVarargs(value: Vector*): Self = StObject.set(x, "activeContacts", js.Array(value :_*))
    
    @scala.inline
    def setBodyA(value: BodyType): Self = StObject.set(x, "bodyA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyB(value: BodyType): Self = StObject.set(x, "bodyB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollision(value: MatterCollisionData): Self = StObject.set(x, "collision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmedActive(value: Boolean): Self = StObject.set(x, "confirmedActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrictionStatic(value: Double): Self = StObject.set(x, "frictionStatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInverseMass(value: Double): Self = StObject.set(x, "inverseMass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSensor(value: Boolean): Self = StObject.set(x, "isSensor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestitution(value: Double): Self = StObject.set(x, "restitution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparation(value: Double): Self = StObject.set(x, "separation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlop(value: Double): Self = StObject.set(x, "slop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeCreated(value: Double): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUpdated(value: Double): Self = StObject.set(x, "timeUpdated", value.asInstanceOf[js.Any])
  }
}

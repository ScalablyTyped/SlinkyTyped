package typingsSlinky.phaser.Phaser.Physics.Impact

import typingsSlinky.phaser.Phaser.GameObjects.Image
import typingsSlinky.phaser.Phaser.Physics.Impact.Components.Acceleration
import typingsSlinky.phaser.Phaser.Physics.Impact.Components.BodyScale
import typingsSlinky.phaser.Phaser.Physics.Impact.Components.BodyType
import typingsSlinky.phaser.Phaser.Physics.Impact.Components.Bounce
import typingsSlinky.phaser.Phaser.Physics.Impact.Components.CheckAgainst
import typingsSlinky.phaser.Phaser.Physics.Impact.Components.Collides
import typingsSlinky.phaser.Phaser.Physics.Impact.Components.Debug
import typingsSlinky.phaser.Phaser.Physics.Impact.Components.Friction
import typingsSlinky.phaser.Phaser.Physics.Impact.Components.Gravity
import typingsSlinky.phaser.Phaser.Physics.Impact.Components.Offset
import typingsSlinky.phaser.Phaser.Physics.Impact.Components.SetGameObject
import typingsSlinky.phaser.Phaser.Physics.Impact.Components.Velocity
import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Impact Physics Image Game Object.
  * 
  * An Image is a light-weight Game Object useful for the display of static images in your game,
  * such as logos, backgrounds, scenery or other non-animated elements. Images can have input
  * events and physics bodies, or be tweened, tinted or scrolled. The main difference between an
  * Image and a Sprite is that you cannot animate an Image as they do not have the Animation component.
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.phaser.Phaser.GameObjects.Components.Texture because var conflicts: frame, texture. Inlined  */ @JSGlobal("Phaser.Physics.Impact.ImpactImage")
@js.native
class ImpactImage protected ()
  extends Image
     with Acceleration
     with BodyScale
     with BodyType
     with Bounce
     with CheckAgainst
     with Collides
     with Debug
     with Friction
     with Gravity
     with Offset
     with SetGameObject
     with Velocity {
  /**
    * 
    * @param world The physics world of the Impact physics system.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    */
  def this(world: World, x: Double, y: Double, texture: String) = this()
  def this(world: World, x: Double, y: Double, texture: String, frame: String) = this()
  def this(world: World, x: Double, y: Double, texture: String, frame: integer) = this()
  /**
    * The acceleration is the rate of change of the velocity. Measured in pixels per second squared.
    */
  var accel: js.Object = js.native
  /**
    * The Physics Body linked to an ImpactImage.
    */
  @JSName("body")
  var body_ImpactImage: Body = js.native
  /**
    * Friction between colliding bodies.
    */
  var friction: js.Object = js.native
  /**
    * The maximum velocity of the body.
    */
  var maxVel: js.Object = js.native
  /**
    * The X and Y offset of the Body from the left and top of the Image.
    */
  var offset: js.Object = js.native
  /**
    * The size of the physics Body.
    */
  var size: js.Object = js.native
  /**
    * The velocity, or rate of change the Body's position. Measured in pixels per second.
    */
  var vel: js.Object = js.native
}


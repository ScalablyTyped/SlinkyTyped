package typingsSlinky.phaser.Phaser.Physics.Impact

import typingsSlinky.phaser.Phaser.GameObjects.Sprite
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
  * An Impact Physics Sprite Game Object.
  * 
  * A Sprite Game Object is used for the display of both static and animated images in your game.
  * Sprites can have input events and physics bodies. They can also be tweened, tinted, scrolled
  * and animated.
  * 
  * The main difference between a Sprite and an Image Game Object is that you cannot animate Images.
  * As such, Sprites take a fraction longer to process and have a larger API footprint due to the Animation
  * Component. If you do not require animation then you can safely use Images to replace Sprites in all cases.
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.phaser.Phaser.GameObjects.Components.Texture because var conflicts: frame, texture. Inlined  */ @JSGlobal("Phaser.Physics.Impact.ImpactSprite")
@js.native
class ImpactSprite protected ()
  extends Sprite
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
    * @param world [description]
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    */
  def this(world: World, x: Double, y: Double, texture: String) = this()
  def this(world: World, x: Double, y: Double, texture: String, frame: String) = this()
  def this(world: World, x: Double, y: Double, texture: String, frame: integer) = this()
  /**
    * [description]
    */
  var accel: js.Object = js.native
  /**
    * [description]
    */
  @JSName("body")
  var body_ImpactSprite: Body = js.native
  /**
    * [description]
    */
  var friction: js.Object = js.native
  /**
    * [description]
    */
  var maxVel: js.Object = js.native
  /**
    * [description]
    */
  var offset: js.Object = js.native
  /**
    * [description]
    */
  var size: js.Object = js.native
  /**
    * [description]
    */
  var vel: js.Object = js.native
}


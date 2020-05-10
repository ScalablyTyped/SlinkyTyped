package typingsSlinky.phaser.Phaser.Physics.Matter

import typingsSlinky.phaser.Phaser.Physics.Matter.Components.Bounce
import typingsSlinky.phaser.Phaser.Physics.Matter.Components.Collision
import typingsSlinky.phaser.Phaser.Physics.Matter.Components.Force
import typingsSlinky.phaser.Phaser.Physics.Matter.Components.Friction
import typingsSlinky.phaser.Phaser.Physics.Matter.Components.Gravity
import typingsSlinky.phaser.Phaser.Physics.Matter.Components.Mass
import typingsSlinky.phaser.Phaser.Physics.Matter.Components.Sensor
import typingsSlinky.phaser.Phaser.Physics.Matter.Components.SetBody
import typingsSlinky.phaser.Phaser.Physics.Matter.Components.Sleep
import typingsSlinky.phaser.Phaser.Physics.Matter.Components.Static
import typingsSlinky.phaser.Phaser.Physics.Matter.Components.Velocity
import typingsSlinky.phaser.Phaser.Types.Physics.Matter.MatterBodyConfig
import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Matter Physics Sprite Game Object.
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
- typingsSlinky.phaser.Phaser.Types.Physics.Matter.MatterBody because Already inherited
- typingsSlinky.phaser.Phaser.GameObjects.Components.Texture because var conflicts: frame, texture. Inlined 
- typingsSlinky.phaser.Phaser.Physics.Matter.Components.Transform because var conflicts: angle, rotation, scaleX, scaleY, x, y. Inlined setFixedRotation */ @JSGlobal("Phaser.Physics.Matter.Sprite")
@js.native
class Sprite protected ()
  extends typingsSlinky.phaser.Phaser.GameObjects.Sprite
     with Bounce
     with Collision
     with Force
     with Friction
     with Gravity
     with Mass
     with Sensor
     with SetBody
     with Sleep
     with Static
     with Velocity {
  /**
    * 
    * @param world A reference to the Matter.World instance that this body belongs to.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    * @param options An optional Body configuration object that is used to set initial Body properties on creation.
    */
  def this(world: World, x: Double, y: Double, texture: String) = this()
  def this(world: World, x: Double, y: Double, texture: String, frame: String) = this()
  def this(world: World, x: Double, y: Double, texture: String, frame: integer) = this()
  def this(world: World, x: Double, y: Double, texture: String, frame: String, options: MatterBodyConfig) = this()
  def this(world: World, x: Double, y: Double, texture: String, frame: integer, options: MatterBodyConfig) = this()
  /**
    * A reference to the Matter.World instance that this body belongs to.
    */
  var world: World = js.native
  /**
    * Setting fixed rotation sets the Body inertia to Infinity, which stops it
    * from being able to rotate when forces are applied to it.
    */
  /**
    * Setting fixed rotation sets the Body inertia to Infinity, which stops it
    * from being able to rotate when forces are applied to it.
    */
  def setFixedRotation(): this.type = js.native
}


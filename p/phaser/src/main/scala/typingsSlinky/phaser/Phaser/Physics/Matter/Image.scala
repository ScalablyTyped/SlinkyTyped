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
  * A Matter Physics Image Game Object.
  * 
  * An Image is a light-weight Game Object useful for the display of static images in your game,
  * such as logos, backgrounds, scenery or other non-animated elements. Images can have input
  * events and physics bodies, or be tweened, tinted or scrolled. The main difference between an
  * Image and a Sprite is that you cannot animate an Image as they do not have the Animation component.
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.phaser.Phaser.Types.Physics.Matter.MatterBody because Already inherited
- typingsSlinky.phaser.Phaser.GameObjects.Components.Texture because var conflicts: frame, texture. Inlined 
- typingsSlinky.phaser.Phaser.Physics.Matter.Components.Transform because var conflicts: angle, rotation, scaleX, scaleY, x, y. Inlined setFixedRotation */ @JSGlobal("Phaser.Physics.Matter.Image")
@js.native
class Image protected ()
  extends typingsSlinky.phaser.Phaser.GameObjects.Image
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


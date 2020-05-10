package typingsSlinky.phaser.Phaser.Physics.Arcade

import typingsSlinky.phaser.Phaser.Physics.Arcade.Components.Acceleration
import typingsSlinky.phaser.Phaser.Physics.Arcade.Components.Angular
import typingsSlinky.phaser.Phaser.Physics.Arcade.Components.Bounce
import typingsSlinky.phaser.Phaser.Physics.Arcade.Components.Debug
import typingsSlinky.phaser.Phaser.Physics.Arcade.Components.Drag
import typingsSlinky.phaser.Phaser.Physics.Arcade.Components.Enable
import typingsSlinky.phaser.Phaser.Physics.Arcade.Components.Friction
import typingsSlinky.phaser.Phaser.Physics.Arcade.Components.Gravity
import typingsSlinky.phaser.Phaser.Physics.Arcade.Components.Immovable
import typingsSlinky.phaser.Phaser.Physics.Arcade.Components.Mass
import typingsSlinky.phaser.Phaser.Physics.Arcade.Components.Size
import typingsSlinky.phaser.Phaser.Physics.Arcade.Components.Velocity
import typingsSlinky.phaser.Phaser.Scene
import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Arcade Physics Image is an Image with an Arcade Physics body and related components.
  * The body can be dynamic or static.
  * 
  * The main difference between an Arcade Image and an Arcade Sprite is that you cannot animate an Arcade Image.
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.phaser.Phaser.Types.Physics.Arcade._ArcadeColliderType because Already inherited
- typingsSlinky.phaser.Phaser.GameObjects.Components.Texture because var conflicts: frame, texture. Inlined  */ @JSGlobal("Phaser.Physics.Arcade.Image")
@js.native
class Image protected ()
  extends typingsSlinky.phaser.Phaser.GameObjects.Image
     with Acceleration
     with Angular
     with Bounce
     with Debug
     with Drag
     with Enable
     with Friction
     with Gravity
     with Immovable
     with Mass
     with Size
     with Velocity {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    */
  def this(scene: Scene, x: Double, y: Double, texture: String) = this()
  def this(scene: Scene, x: Double, y: Double, texture: String, frame: String) = this()
  def this(scene: Scene, x: Double, y: Double, texture: String, frame: integer) = this()
  /**
    * Sets the internal size of this Game Object, as used for frame or physics body creation.
    * 
    * This will not change the size that the Game Object is rendered in-game.
    * For that you need to either set the scale of the Game Object (`setScale`) or call the
    * `setDisplaySize` method, which is the same thing as changing the scale but allows you
    * to do so by giving pixel values.
    * 
    * If you have enabled this Game Object for input, changing the size will _not_ change the
    * size of the hit area. To do this you should adjust the `input.hitArea` object directly.
    * @param width The width of this Game Object.
    * @param height The height of this Game Object.
    */
  /* InferMemberOverrides */
  override def setSize(width: Double, height: Double): this.type = js.native
}


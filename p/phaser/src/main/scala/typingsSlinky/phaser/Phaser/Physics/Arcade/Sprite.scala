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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Arcade Physics Sprite is a Sprite with an Arcade Physics body and related components.
  * The body can be dynamic or static.
  * 
  * The main difference between an Arcade Sprite and an Arcade Image is that you cannot animate an Arcade Image.
  * If you do not require animation then you can safely use Arcade Images instead of Arcade Sprites.
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.phaser.Phaser.Types.Physics.Arcade._ArcadeColliderType because Already inherited
- typingsSlinky.phaser.Phaser.GameObjects.Components.Texture because var conflicts: frame, texture. Inlined  */ @js.native
trait Sprite
  extends typingsSlinky.phaser.Phaser.GameObjects.Sprite
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


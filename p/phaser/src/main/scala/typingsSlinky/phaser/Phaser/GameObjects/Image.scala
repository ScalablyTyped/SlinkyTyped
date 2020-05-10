package typingsSlinky.phaser.Phaser.GameObjects

import typingsSlinky.phaser.Phaser.GameObjects.Components.Alpha
import typingsSlinky.phaser.Phaser.GameObjects.Components.BlendMode
import typingsSlinky.phaser.Phaser.GameObjects.Components.Depth
import typingsSlinky.phaser.Phaser.GameObjects.Components.Flip
import typingsSlinky.phaser.Phaser.GameObjects.Components.GetBounds
import typingsSlinky.phaser.Phaser.GameObjects.Components.Mask
import typingsSlinky.phaser.Phaser.GameObjects.Components.Origin
import typingsSlinky.phaser.Phaser.GameObjects.Components.Pipeline
import typingsSlinky.phaser.Phaser.GameObjects.Components.ScrollFactor
import typingsSlinky.phaser.Phaser.GameObjects.Components.Size
import typingsSlinky.phaser.Phaser.GameObjects.Components.TextureCrop
import typingsSlinky.phaser.Phaser.GameObjects.Components.Tint
import typingsSlinky.phaser.Phaser.GameObjects.Components.Transform
import typingsSlinky.phaser.Phaser.GameObjects.Components.Visible
import typingsSlinky.phaser.Phaser.Scene
import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Image Game Object.
  * 
  * An Image is a light-weight Game Object useful for the display of static images in your game,
  * such as logos, backgrounds, scenery or other non-animated elements. Images can have input
  * events and physics bodies, or be tweened, tinted or scrolled. The main difference between an
  * Image and a Sprite is that you cannot animate an Image as they do not have the Animation component.
  */
@JSGlobal("Phaser.GameObjects.Image")
@js.native
class Image protected ()
  extends GameObject
     with Alpha
     with BlendMode
     with Depth
     with Flip
     with GetBounds
     with Mask
     with Origin
     with Pipeline
     with ScrollFactor
     with Size
     with TextureCrop
     with Tint
     with Transform
     with Visible {
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
}


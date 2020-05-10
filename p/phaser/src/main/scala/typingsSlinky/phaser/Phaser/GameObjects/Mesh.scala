package typingsSlinky.phaser.Phaser.GameObjects

import typingsSlinky.phaser.Phaser.GameObjects.Components.BlendMode
import typingsSlinky.phaser.Phaser.GameObjects.Components.Depth
import typingsSlinky.phaser.Phaser.GameObjects.Components.Mask
import typingsSlinky.phaser.Phaser.GameObjects.Components.Pipeline
import typingsSlinky.phaser.Phaser.GameObjects.Components.ScrollFactor
import typingsSlinky.phaser.Phaser.GameObjects.Components.Size
import typingsSlinky.phaser.Phaser.GameObjects.Components.Texture
import typingsSlinky.phaser.Phaser.GameObjects.Components.Transform
import typingsSlinky.phaser.Phaser.GameObjects.Components.Visible
import typingsSlinky.phaser.Phaser.Scene
import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Mesh Game Object.
  */
@JSGlobal("Phaser.GameObjects.Mesh")
@js.native
class Mesh protected ()
  extends GameObject
     with BlendMode
     with Depth
     with Mask
     with Pipeline
     with Size
     with Texture
     with Transform
     with Visible
     with ScrollFactor {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param vertices An array containing the vertices data for this Mesh.
    * @param uv An array containing the uv data for this Mesh.
    * @param colors An array containing the color data for this Mesh.
    * @param alphas An array containing the alpha data for this Mesh.
    * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    */
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    vertices: js.Array[Double],
    uv: js.Array[Double],
    colors: js.Array[Double],
    alphas: js.Array[Double],
    texture: String
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    vertices: js.Array[Double],
    uv: js.Array[Double],
    colors: js.Array[Double],
    alphas: js.Array[Double],
    texture: String,
    frame: String
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    vertices: js.Array[Double],
    uv: js.Array[Double],
    colors: js.Array[Double],
    alphas: js.Array[Double],
    texture: String,
    frame: integer
  ) = this()
  /**
    * An array containing the alpha data for this Mesh.
    */
  var alphas: js.typedarray.Float32Array = js.native
  /**
    * An array containing the color data for this Mesh.
    */
  var colors: js.typedarray.Uint32Array = js.native
  /**
    * Fill or additive mode used when blending the color values?
    */
  var tintFill: Boolean = js.native
  /**
    * An array containing the uv data for this Mesh.
    */
  var uv: js.typedarray.Float32Array = js.native
  /**
    * An array containing the vertices data for this Mesh.
    */
  var vertices: js.typedarray.Float32Array = js.native
  /**
    * This method is left intentionally empty and does not do anything.
    * It is retained to allow a Mesh or Quad to be added to a Container.
    */
  def setAlpha(): Unit = js.native
}


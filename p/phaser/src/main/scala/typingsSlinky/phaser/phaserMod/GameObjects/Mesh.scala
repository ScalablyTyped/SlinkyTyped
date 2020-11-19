package typingsSlinky.phaser.phaserMod.GameObjects

import typingsSlinky.phaser.Phaser.Scene
import typingsSlinky.phaser.Phaser.Textures.Texture
import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Mesh Game Object.
  */
@JSImport("phaser", "GameObjects.Mesh")
@js.native
class Mesh protected ()
  extends typingsSlinky.phaser.Phaser.GameObjects.Mesh {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param vertices An array containing the vertices data for this Mesh.
    * @param uv An array containing the uv data for this Mesh.
    * @param colors An array containing the color data for this Mesh.
    * @param alphas An array containing the alpha data for this Mesh.
    * @param texture The key, or instance of the Texture this Game Object will use to render with, as stored in the Texture Manager.
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
    texture: Texture
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
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    vertices: js.Array[Double],
    uv: js.Array[Double],
    colors: js.Array[Double],
    alphas: js.Array[Double],
    texture: Texture,
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
    texture: Texture,
    frame: integer
  ) = this()
}

package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.RefractionTexture")
@js.native
class RefractionTexture protected ()
  extends typingsSlinky.babylonjs.BABYLON.RefractionTexture {
  /**
    * Creates a refraction texture used by refraction channel of the standard material.
    * It is like a mirror but to see through a material.
    * @see https://doc.babylonjs.com/how_to/reflect#refraction
    * @param name Define the texture name
    * @param size Define the size of the underlying texture
    * @param scene Define the scene the refraction belongs to
    * @param generateMipMaps Define if we need to generate mips level for the refraction
    */
  def this(name: String, size: Double, scene: typingsSlinky.babylonjs.BABYLON.Scene) = this()
  def this(name: String, size: Double, scene: typingsSlinky.babylonjs.BABYLON.Scene, generateMipMaps: Boolean) = this()
  /**
    * Array of animations
    */
  /* CompleteClass */
  override var animations: Nullable[js.Array[typingsSlinky.babylonjs.BABYLON.Animation]] = js.native
}


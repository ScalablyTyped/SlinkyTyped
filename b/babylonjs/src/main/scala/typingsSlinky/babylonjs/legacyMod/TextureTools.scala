package typingsSlinky.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "TextureTools")
@js.native
class TextureTools ()
  extends typingsSlinky.babylonjs.indexMod.TextureTools

/* static members */
@JSImport("babylonjs/Legacy/legacy", "TextureTools")
@js.native
object TextureTools extends js.Object {
  /**
    * Uses the GPU to create a copy texture rescaled at a given size
    * @param texture Texture to copy from
    * @param width defines the desired width
    * @param height defines the desired height
    * @param useBilinearMode defines if bilinear mode has to be used
    * @return the generated texture
    */
  def CreateResizedCopy(texture: typingsSlinky.babylonjs.textureMod.Texture, width: Double, height: Double): typingsSlinky.babylonjs.textureMod.Texture = js.native
  def CreateResizedCopy(
    texture: typingsSlinky.babylonjs.textureMod.Texture,
    width: Double,
    height: Double,
    useBilinearMode: Boolean
  ): typingsSlinky.babylonjs.textureMod.Texture = js.native
}


package typingsSlinky.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "TextureTools")
@js.native
class TextureTools ()
  extends typingsSlinky.babylonjs.indexMod.TextureTools
/* static members */
object TextureTools {
  
  /**
    * Uses the GPU to create a copy texture rescaled at a given size
    * @param texture Texture to copy from
    * @param width defines the desired width
    * @param height defines the desired height
    * @param useBilinearMode defines if bilinear mode has to be used
    * @return the generated texture
    */
  @JSImport("babylonjs/Legacy/legacy", "TextureTools.CreateResizedCopy")
  @js.native
  def CreateResizedCopy(texture: typingsSlinky.babylonjs.textureMod.Texture, width: Double, height: Double): typingsSlinky.babylonjs.textureMod.Texture = js.native
  @JSImport("babylonjs/Legacy/legacy", "TextureTools.CreateResizedCopy")
  @js.native
  def CreateResizedCopy(
    texture: typingsSlinky.babylonjs.textureMod.Texture,
    width: Double,
    height: Double,
    useBilinearMode: Boolean
  ): typingsSlinky.babylonjs.textureMod.Texture = js.native
}

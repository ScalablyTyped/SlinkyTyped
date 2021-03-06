package typingsSlinky.babylonjs.mod

import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "CopyTools")
@js.native
class CopyTools ()
  extends typingsSlinky.babylonjs.legacyMod.CopyTools
/* static members */
object CopyTools {
  
  /**
    * Reads the pixels stored in the webgl texture and returns them as a base64 string
    * @param texture defines the texture to read pixels from
    * @param faceIndex defines the face of the texture to read (in case of cube texture)
    * @param level defines the LOD level of the texture to read (in case of Mip Maps)
    * @returns The base64 encoded string or null
    */
  @JSImport("babylonjs", "CopyTools.GenerateBase64StringFromTexture")
  @js.native
  def GenerateBase64StringFromTexture(texture: typingsSlinky.babylonjs.baseTextureMod.BaseTexture): Nullable[String] = js.native
  @JSImport("babylonjs", "CopyTools.GenerateBase64StringFromTexture")
  @js.native
  def GenerateBase64StringFromTexture(
    texture: typingsSlinky.babylonjs.baseTextureMod.BaseTexture,
    faceIndex: js.UndefOr[scala.Nothing],
    level: Double
  ): Nullable[String] = js.native
  @JSImport("babylonjs", "CopyTools.GenerateBase64StringFromTexture")
  @js.native
  def GenerateBase64StringFromTexture(texture: typingsSlinky.babylonjs.baseTextureMod.BaseTexture, faceIndex: Double): Nullable[String] = js.native
  @JSImport("babylonjs", "CopyTools.GenerateBase64StringFromTexture")
  @js.native
  def GenerateBase64StringFromTexture(texture: typingsSlinky.babylonjs.baseTextureMod.BaseTexture, faceIndex: Double, level: Double): Nullable[String] = js.native
}

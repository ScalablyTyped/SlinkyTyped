package typingsSlinky.babylonjs.miscIndexMod

import typingsSlinky.babylonjs.baseTextureMod.BaseTexture
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/index", "CopyTools")
@js.native
class CopyTools ()
  extends typingsSlinky.babylonjs.copyToolsMod.CopyTools
/* static members */
@JSImport("babylonjs/Misc/index", "CopyTools")
@js.native
object CopyTools extends js.Object {
  
  /**
    * Reads the pixels stored in the webgl texture and returns them as a base64 string
    * @param texture defines the texture to read pixels from
    * @param faceIndex defines the face of the texture to read (in case of cube texture)
    * @param level defines the LOD level of the texture to read (in case of Mip Maps)
    * @returns The base64 encoded string or null
    */
  def GenerateBase64StringFromTexture(texture: BaseTexture): Nullable[String] = js.native
  def GenerateBase64StringFromTexture(texture: BaseTexture, faceIndex: js.UndefOr[scala.Nothing], level: Double): Nullable[String] = js.native
  def GenerateBase64StringFromTexture(texture: BaseTexture, faceIndex: Double): Nullable[String] = js.native
  def GenerateBase64StringFromTexture(texture: BaseTexture, faceIndex: Double, level: Double): Nullable[String] = js.native
}

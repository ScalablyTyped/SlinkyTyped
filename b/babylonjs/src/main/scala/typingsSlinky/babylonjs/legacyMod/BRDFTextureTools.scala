package typingsSlinky.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "BRDFTextureTools")
@js.native
class BRDFTextureTools ()
  extends typingsSlinky.babylonjs.indexMod.BRDFTextureTools
/* static members */
@JSImport("babylonjs/Legacy/legacy", "BRDFTextureTools")
@js.native
object BRDFTextureTools extends js.Object {
  
  /**
    * Gets a default environment BRDF for MS-BRDF Height Correlated BRDF
    * @param scene defines the hosting scene
    * @returns the environment BRDF texture
    */
  def GetEnvironmentBRDFTexture(scene: typingsSlinky.babylonjs.sceneMod.Scene): typingsSlinky.babylonjs.baseTextureMod.BaseTexture = js.native
  
  var _environmentBRDFBase64Texture: js.Any = js.native
}

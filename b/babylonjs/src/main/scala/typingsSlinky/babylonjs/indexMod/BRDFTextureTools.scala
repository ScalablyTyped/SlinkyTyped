package typingsSlinky.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "BRDFTextureTools")
@js.native
class BRDFTextureTools ()
  extends typingsSlinky.babylonjs.miscIndexMod.BRDFTextureTools

/* static members */
@JSImport("babylonjs/index", "BRDFTextureTools")
@js.native
object BRDFTextureTools extends js.Object {
  var _environmentBRDFBase64Texture: js.Any = js.native
  /**
    * Gets a default environment BRDF for MS-BRDF Height Correlated BRDF
    * @param scene defines the hosting scene
    * @returns the environment BRDF texture
    */
  def GetEnvironmentBRDFTexture(scene: typingsSlinky.babylonjs.sceneMod.Scene): typingsSlinky.babylonjs.baseTextureMod.BaseTexture = js.native
}


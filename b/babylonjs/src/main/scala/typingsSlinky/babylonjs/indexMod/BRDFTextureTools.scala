package typingsSlinky.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "BRDFTextureTools")
@js.native
class BRDFTextureTools ()
  extends typingsSlinky.babylonjs.miscIndexMod.BRDFTextureTools
/* static members */
object BRDFTextureTools {
  
  @JSImport("babylonjs/index", "BRDFTextureTools")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets a default environment BRDF for MS-BRDF Height Correlated BRDF
    * @param scene defines the hosting scene
    * @returns the environment BRDF texture
    */
  @JSImport("babylonjs/index", "BRDFTextureTools.GetEnvironmentBRDFTexture")
  @js.native
  def GetEnvironmentBRDFTexture(scene: typingsSlinky.babylonjs.sceneMod.Scene): typingsSlinky.babylonjs.baseTextureMod.BaseTexture = js.native
  
  @JSImport("babylonjs/index", "BRDFTextureTools._environmentBRDFBase64Texture")
  @js.native
  def _environmentBRDFBase64Texture: js.Any = js.native
  @scala.inline
  def _environmentBRDFBase64Texture_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_environmentBRDFBase64Texture")(x.asInstanceOf[js.Any])
  
  /**
    * Prevents texture cache collision
    */
  @JSImport("babylonjs/index", "BRDFTextureTools._instanceNumber")
  @js.native
  def _instanceNumber: js.Any = js.native
  @scala.inline
  def _instanceNumber_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instanceNumber")(x.asInstanceOf[js.Any])
}

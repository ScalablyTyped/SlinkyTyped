package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.baseTextureMod.BaseTexture
import typingsSlinky.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object brdfTextureToolsMod {
  
  @JSImport("babylonjs/Misc/brdfTextureTools", "BRDFTextureTools")
  @js.native
  class BRDFTextureTools () extends StObject
  /* static members */
  object BRDFTextureTools {
    
    @JSImport("babylonjs/Misc/brdfTextureTools", "BRDFTextureTools")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets a default environment BRDF for MS-BRDF Height Correlated BRDF
      * @param scene defines the hosting scene
      * @returns the environment BRDF texture
      */
    @JSImport("babylonjs/Misc/brdfTextureTools", "BRDFTextureTools.GetEnvironmentBRDFTexture")
    @js.native
    def GetEnvironmentBRDFTexture(scene: Scene): BaseTexture = js.native
    
    @JSImport("babylonjs/Misc/brdfTextureTools", "BRDFTextureTools._environmentBRDFBase64Texture")
    @js.native
    def _environmentBRDFBase64Texture: js.Any = js.native
    @scala.inline
    def _environmentBRDFBase64Texture_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_environmentBRDFBase64Texture")(x.asInstanceOf[js.Any])
    
    /**
      * Prevents texture cache collision
      */
    @JSImport("babylonjs/Misc/brdfTextureTools", "BRDFTextureTools._instanceNumber")
    @js.native
    def _instanceNumber: js.Any = js.native
    @scala.inline
    def _instanceNumber_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instanceNumber")(x.asInstanceOf[js.Any])
  }
}

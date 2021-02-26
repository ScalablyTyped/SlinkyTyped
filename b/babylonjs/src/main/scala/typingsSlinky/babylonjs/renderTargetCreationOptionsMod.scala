package typingsSlinky.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderTargetCreationOptionsMod {
  
  @JSImport("babylonjs/Materials/Textures/renderTargetCreationOptions", "RenderTargetCreationOptions")
  @js.native
  class RenderTargetCreationOptions () extends StObject {
    
    /** Defines format (RGBA by default) */
    var format: js.UndefOr[Double] = js.native
    
    /** Specifies whether or not a depth should be allocated in the texture (true by default) */
    var generateDepthBuffer: js.UndefOr[Boolean] = js.native
    
    /**
      * Specifies is mipmaps must be generated
      */
    var generateMipMaps: js.UndefOr[Boolean] = js.native
    
    /** Specifies whether or not a stencil should be allocated in the texture (false by default)*/
    var generateStencilBuffer: js.UndefOr[Boolean] = js.native
    
    /** Defines sampling mode (trilinear by default) */
    var samplingMode: js.UndefOr[Double] = js.native
    
    /** Defines texture type (int by default) */
    var `type`: js.UndefOr[Double] = js.native
  }
}

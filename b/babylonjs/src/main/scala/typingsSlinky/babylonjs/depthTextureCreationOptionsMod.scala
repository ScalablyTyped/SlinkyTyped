package typingsSlinky.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object depthTextureCreationOptionsMod {
  
  @JSImport("babylonjs/Engines/depthTextureCreationOptions", "DepthTextureCreationOptions")
  @js.native
  class DepthTextureCreationOptions () extends StObject {
    
    /** Specifies whether or not bilinear filtering is enable on the texture */
    var bilinearFiltering: js.UndefOr[Boolean] = js.native
    
    /** Specifies the comparison function to set on the texture. If 0 or undefined, the texture is not in comparison mode */
    var comparisonFunction: js.UndefOr[Double] = js.native
    
    /** Specifies whether or not a stencil should be allocated in the texture */
    var generateStencil: js.UndefOr[Boolean] = js.native
    
    /** Specifies if the created texture is a cube texture */
    var isCube: js.UndefOr[Boolean] = js.native
  }
}

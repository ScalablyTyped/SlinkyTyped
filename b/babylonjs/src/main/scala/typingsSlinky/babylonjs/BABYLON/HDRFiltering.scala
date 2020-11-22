package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HDRFiltering extends js.Object {
  
  var _createEffect: js.Any = js.native
  
  var _createRenderTarget: js.Any = js.native
  
  var _effectRenderer: js.Any = js.native
  
  var _effectWrapper: js.Any = js.native
  
  var _engine: js.Any = js.native
  
  var _lodGenerationOffset: js.Any = js.native
  
  var _lodGenerationScale: js.Any = js.native
  
  var _prefilterInternal: js.Any = js.native
  
  /**
    * Scales pixel intensity for the input HDR map.
    */
  var hdrScale: Double = js.native
  
  /**
    * Get a value indicating if the filter is ready to be used
    * @param texture Texture to filter
    * @returns true if the filter is ready
    */
  def isReady(texture: BaseTexture): Boolean = js.native
  
  /**
    * Prefilters a cube texture to have mipmap levels representing roughness values.
    * Prefiltering will be invoked at the end of next rendering pass.
    * This has to be done once the map is loaded, and has not been prefiltered by a third party software.
    * See http://blog.selfshadow.com/publications/s2013-shading-course/karis/s2013_pbs_epic_notes_v2.pdf for more information
    * @param texture Texture to filter
    * @param onFinished Callback when filtering is done
    * @return Promise called when prefiltering is done
    */
  def prefilter(texture: BaseTexture): js.UndefOr[js.Promise[_]] = js.native
  def prefilter(texture: BaseTexture, onFinished: Nullable[js.Function0[Unit]]): js.UndefOr[js.Promise[_]] = js.native
  
  /**
    * Quality switch for prefiltering. Should be set to `Constants.TEXTURE_FILTERING_QUALITY_OFFLINE` unless
    * you care about baking speed.
    */
  var quality: Double = js.native
}

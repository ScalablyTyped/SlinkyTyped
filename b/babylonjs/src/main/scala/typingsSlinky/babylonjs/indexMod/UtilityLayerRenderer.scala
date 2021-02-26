package typingsSlinky.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "UtilityLayerRenderer")
@js.native
class UtilityLayerRenderer protected ()
  extends typingsSlinky.babylonjs.renderingIndexMod.UtilityLayerRenderer {
  /**
    * Instantiates a UtilityLayerRenderer
    * @param originalScene the original scene that will be rendered on top of
    * @param handleEvents boolean indicating if the utility layer should handle events
    */
  def this(/** the original scene that will be rendered on top of */
  originalScene: typingsSlinky.babylonjs.sceneMod.Scene) = this()
  def this(
    /** the original scene that will be rendered on top of */
  originalScene: typingsSlinky.babylonjs.sceneMod.Scene,
    handleEvents: Boolean
  ) = this()
}
/* static members */
object UtilityLayerRenderer {
  
  @JSImport("babylonjs/index", "UtilityLayerRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/index", "UtilityLayerRenderer._DefaultKeepDepthUtilityLayer")
  @js.native
  def _DefaultKeepDepthUtilityLayer: js.Any = js.native
  @scala.inline
  def _DefaultKeepDepthUtilityLayer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DefaultKeepDepthUtilityLayer")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "UtilityLayerRenderer._DefaultUtilityLayer")
  @js.native
  def _DefaultUtilityLayer: js.Any = js.native
  @scala.inline
  def _DefaultUtilityLayer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DefaultUtilityLayer")(x.asInstanceOf[js.Any])
}

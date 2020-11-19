package typingsSlinky.babylonjs.indexMod

import typingsSlinky.babylonjs.anon.PartialIHighlightLayerOpt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "HighlightLayer")
@js.native
class HighlightLayer protected ()
  extends typingsSlinky.babylonjs.layersIndexMod.HighlightLayer {
  /**
    * Instantiates a new highlight Layer and references it to the scene..
    * @param name The name of the layer
    * @param scene The scene to use the layer in
    * @param options Sets of none mandatory options to use with the layer (see IHighlightLayerOptions for more information)
    */
  def this(name: String, scene: typingsSlinky.babylonjs.sceneMod.Scene) = this()
  def this(name: String, scene: typingsSlinky.babylonjs.sceneMod.Scene, options: PartialIHighlightLayerOpt) = this()
}
/* static members */
@JSImport("babylonjs/index", "HighlightLayer")
@js.native
object HighlightLayer extends js.Object {
  
  /**
    * Effect Name of the highlight layer.
    */
  val EffectName: String = js.native
  
  /**
    * Stencil value used for glowing meshes.
    */
  var GlowingMeshStencilReference: Double = js.native
  
  /**
    * The neutral color used during the preparation of the glow effect.
    * This is black by default as the blend operation is a blend operation.
    */
  var NeutralColor: typingsSlinky.babylonjs.mathColorMod.Color4 = js.native
  
  /**
    * Stencil value used for the other meshes in the scene.
    */
  var NormalMeshStencilReference: Double = js.native
  
  /**
    * Creates a Highlight layer from parsed Highlight layer data
    * @param parsedHightlightLayer defines the Highlight layer data
    * @param scene defines the current scene
    * @param rootUrl defines the root URL containing the Highlight layer information
    * @returns a parsed Highlight layer
    */
  def Parse(parsedHightlightLayer: js.Any, scene: typingsSlinky.babylonjs.sceneMod.Scene, rootUrl: String): typingsSlinky.babylonjs.highlightLayerMod.HighlightLayer = js.native
}

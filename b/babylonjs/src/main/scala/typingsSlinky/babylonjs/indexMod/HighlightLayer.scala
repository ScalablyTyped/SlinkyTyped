package typingsSlinky.babylonjs.indexMod

import typingsSlinky.babylonjs.anon.PartialIHighlightLayerOpt
import org.scalablytyped.runtime.StObject
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
object HighlightLayer {
  
  @JSImport("babylonjs/index", "HighlightLayer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Effect Name of the highlight layer.
    */
  @JSImport("babylonjs/index", "HighlightLayer.EffectName")
  @js.native
  val EffectName: String = js.native
  
  /**
    * Stencil value used for glowing meshes.
    */
  @JSImport("babylonjs/index", "HighlightLayer.GlowingMeshStencilReference")
  @js.native
  def GlowingMeshStencilReference: Double = js.native
  @scala.inline
  def GlowingMeshStencilReference_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GlowingMeshStencilReference")(x.asInstanceOf[js.Any])
  
  /**
    * The neutral color used during the preparation of the glow effect.
    * This is black by default as the blend operation is a blend operation.
    */
  @JSImport("babylonjs/index", "HighlightLayer.NeutralColor")
  @js.native
  def NeutralColor: typingsSlinky.babylonjs.mathColorMod.Color4 = js.native
  @scala.inline
  def NeutralColor_=(x: typingsSlinky.babylonjs.mathColorMod.Color4): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NeutralColor")(x.asInstanceOf[js.Any])
  
  /**
    * Stencil value used for the other meshes in the scene.
    */
  @JSImport("babylonjs/index", "HighlightLayer.NormalMeshStencilReference")
  @js.native
  def NormalMeshStencilReference: Double = js.native
  @scala.inline
  def NormalMeshStencilReference_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NormalMeshStencilReference")(x.asInstanceOf[js.Any])
  
  /**
    * Creates a Highlight layer from parsed Highlight layer data
    * @param parsedHightlightLayer defines the Highlight layer data
    * @param scene defines the current scene
    * @param rootUrl defines the root URL containing the Highlight layer information
    * @returns a parsed Highlight layer
    */
  @JSImport("babylonjs/index", "HighlightLayer.Parse")
  @js.native
  def Parse(parsedHightlightLayer: js.Any, scene: typingsSlinky.babylonjs.sceneMod.Scene, rootUrl: String): typingsSlinky.babylonjs.highlightLayerMod.HighlightLayer = js.native
}

package typingsSlinky.babylonjs.legacyMod

import typingsSlinky.babylonjs.anon.PartialIGlowLayerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "GlowLayer")
@js.native
class GlowLayer protected ()
  extends typingsSlinky.babylonjs.indexMod.GlowLayer {
  /**
    * Instantiates a new glow Layer and references it to the scene.
    * @param name The name of the layer
    * @param scene The scene to use the layer in
    * @param options Sets of none mandatory options to use with the layer (see IGlowLayerOptions for more information)
    */
  def this(name: String, scene: typingsSlinky.babylonjs.sceneMod.Scene) = this()
  def this(name: String, scene: typingsSlinky.babylonjs.sceneMod.Scene, options: PartialIGlowLayerOptions) = this()
}
/* static members */
object GlowLayer {
  
  @JSImport("babylonjs/Legacy/legacy", "GlowLayer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The default blur kernel size used for the glow.
    */
  @JSImport("babylonjs/Legacy/legacy", "GlowLayer.DefaultBlurKernelSize")
  @js.native
  def DefaultBlurKernelSize: Double = js.native
  @scala.inline
  def DefaultBlurKernelSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultBlurKernelSize")(x.asInstanceOf[js.Any])
  
  /**
    * The default texture size ratio used for the glow.
    */
  @JSImport("babylonjs/Legacy/legacy", "GlowLayer.DefaultTextureRatio")
  @js.native
  def DefaultTextureRatio: Double = js.native
  @scala.inline
  def DefaultTextureRatio_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultTextureRatio")(x.asInstanceOf[js.Any])
  
  /**
    * Effect Name of the layer.
    */
  @JSImport("babylonjs/Legacy/legacy", "GlowLayer.EffectName")
  @js.native
  val EffectName: String = js.native
  
  /**
    * Creates a Glow Layer from parsed glow layer data
    * @param parsedGlowLayer defines glow layer data
    * @param scene defines the current scene
    * @param rootUrl defines the root URL containing the glow layer information
    * @returns a parsed Glow Layer
    */
  @JSImport("babylonjs/Legacy/legacy", "GlowLayer.Parse")
  @js.native
  def Parse(parsedGlowLayer: js.Any, scene: typingsSlinky.babylonjs.sceneMod.Scene, rootUrl: String): typingsSlinky.babylonjs.glowLayerMod.GlowLayer = js.native
}

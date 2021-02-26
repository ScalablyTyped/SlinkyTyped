package typingsSlinky.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGlowLayerOptions extends StObject {
  
  /**
    * How big is the kernel of the blur texture.
    */
  var blurKernelSize: Double = js.native
  
  /**
    * The camera attached to the layer.
    */
  var camera: Nullable[Camera] = js.native
  
  /**
    * Enforces a fixed size texture to ensure resize independant blur.
    */
  var mainTextureFixedSize: js.UndefOr[Double] = js.native
  
  /**
    * Multiplication factor apply to the canvas size to compute the render target size
    * used to generated the glowing objects (the smaller the faster).
    */
  var mainTextureRatio: Double = js.native
  
  /**
    * Enable MSAA by chosing the number of samples.
    */
  var mainTextureSamples: js.UndefOr[Double] = js.native
  
  /**
    * The rendering group to draw the layer in.
    */
  var renderingGroupId: Double = js.native
}
object IGlowLayerOptions {
  
  @scala.inline
  def apply(blurKernelSize: Double, mainTextureRatio: Double, renderingGroupId: Double): IGlowLayerOptions = {
    val __obj = js.Dynamic.literal(blurKernelSize = blurKernelSize.asInstanceOf[js.Any], mainTextureRatio = mainTextureRatio.asInstanceOf[js.Any], renderingGroupId = renderingGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGlowLayerOptions]
  }
  
  @scala.inline
  implicit class IGlowLayerOptionsMutableBuilder[Self <: IGlowLayerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlurKernelSize(value: Double): Self = StObject.set(x, "blurKernelSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCamera(value: Nullable[Camera]): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraNull: Self = StObject.set(x, "camera", null)
    
    @scala.inline
    def setMainTextureFixedSize(value: Double): Self = StObject.set(x, "mainTextureFixedSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainTextureFixedSizeUndefined: Self = StObject.set(x, "mainTextureFixedSize", js.undefined)
    
    @scala.inline
    def setMainTextureRatio(value: Double): Self = StObject.set(x, "mainTextureRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainTextureSamples(value: Double): Self = StObject.set(x, "mainTextureSamples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainTextureSamplesUndefined: Self = StObject.set(x, "mainTextureSamples", js.undefined)
    
    @scala.inline
    def setRenderingGroupId(value: Double): Self = StObject.set(x, "renderingGroupId", value.asInstanceOf[js.Any])
  }
}

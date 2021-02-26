package typingsSlinky.babylonjs

import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.ImageData
import typingsSlinky.babylonjs.internalTextureMod.InternalTexture
import typingsSlinky.babylonjs.typesMod.Nullable
import typingsSlinky.std.OffscreenCanvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineDynamicTextureMod {
  
  /* augmented module */
  object babylonjsEnginesThinEngineAugmentingMod {
    
    @js.native
    trait ThinEngine extends StObject {
      
      /**
        * Creates a dynamic texture
        * @param width defines the width of the texture
        * @param height defines the height of the texture
        * @param generateMipMaps defines if the engine should generate the mip levels
        * @param samplingMode defines the required sampling mode (Texture.NEAREST_SAMPLINGMODE by default)
        * @returns the dynamic texture inside an InternalTexture
        */
      def createDynamicTexture(width: Double, height: Double, generateMipMaps: Boolean, samplingMode: Double): InternalTexture = js.native
      
      /**
        * Update the content of a dynamic texture
        * @param texture defines the texture to update
        * @param source defines the source containing the data
        * @param invertY defines if data must be stored with Y axis inverted
        * @param premulAlpha defines if alpha is stored as premultiplied
        * @param format defines the format of the data
        * @param forceBindTexture if the texture should be forced to be bound eg. after a graphics context loss (Default: false)
        */
      def updateDynamicTexture(
        texture: Nullable[InternalTexture],
        source: ImageBitmap | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | OffscreenCanvas,
        invertY: js.UndefOr[Boolean],
        premulAlpha: js.UndefOr[Boolean],
        format: js.UndefOr[Double],
        forceBindTexture: js.UndefOr[Boolean]
      ): Unit = js.native
    }
    object ThinEngine {
      
      @scala.inline
      def apply(
        createDynamicTexture: (Double, Double, Boolean, Double) => InternalTexture,
        updateDynamicTexture: (Nullable[InternalTexture], ImageBitmap | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | OffscreenCanvas, js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Double], js.UndefOr[Boolean]) => Unit
      ): ThinEngine = {
        val __obj = js.Dynamic.literal(createDynamicTexture = js.Any.fromFunction4(createDynamicTexture), updateDynamicTexture = js.Any.fromFunction6(updateDynamicTexture))
        __obj.asInstanceOf[ThinEngine]
      }
      
      @scala.inline
      implicit class ThinEngineMutableBuilder[Self <: ThinEngine] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCreateDynamicTexture(value: (Double, Double, Boolean, Double) => InternalTexture): Self = StObject.set(x, "createDynamicTexture", js.Any.fromFunction4(value))
        
        @scala.inline
        def setUpdateDynamicTexture(
          value: (Nullable[InternalTexture], ImageBitmap | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | OffscreenCanvas, js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Double], js.UndefOr[Boolean]) => Unit
        ): Self = StObject.set(x, "updateDynamicTexture", js.Any.fromFunction6(value))
      }
    }
  }
}

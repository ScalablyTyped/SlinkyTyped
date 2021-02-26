package typingsSlinky.ol

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.ol.colorMod.Color
import typingsSlinky.ol.imageStateMod.ImageState
import typingsSlinky.ol.sizeMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconImageMod {
  
  @JSImport("ol/style/IconImage", JSImport.Default)
  @js.native
  class default protected () extends IconImage {
    def this(
      image: HTMLCanvasElement,
      src: js.UndefOr[scala.Nothing],
      size: Size,
      crossOrigin: String,
      imageState: ImageState,
      color: Color
    ) = this()
    def this(
      image: HTMLCanvasElement,
      src: String,
      size: Size,
      crossOrigin: String,
      imageState: ImageState,
      color: Color
    ) = this()
    def this(
      image: HTMLImageElement,
      src: js.UndefOr[scala.Nothing],
      size: Size,
      crossOrigin: String,
      imageState: ImageState,
      color: Color
    ) = this()
    def this(
      image: HTMLImageElement,
      src: String,
      size: Size,
      crossOrigin: String,
      imageState: ImageState,
      color: Color
    ) = this()
  }
  
  @JSImport("ol/style/IconImage", "get")
  @js.native
  def get(
    image: HTMLCanvasElement,
    src: String,
    size: Size,
    crossOrigin: String,
    imageState: ImageState,
    color: Color
  ): IconImage = js.native
  @JSImport("ol/style/IconImage", "get")
  @js.native
  def get(
    image: HTMLImageElement,
    src: String,
    size: Size,
    crossOrigin: String,
    imageState: ImageState,
    color: Color
  ): IconImage = js.native
  
  @js.native
  trait IconImage
    extends typingsSlinky.ol.targetMod.default {
    
    def getHitDetectionImage(): HTMLImageElement | HTMLCanvasElement = js.native
    
    def getImage(pixelRatio: Double): HTMLImageElement | HTMLCanvasElement = js.native
    
    def getImageState(): ImageState = js.native
    
    def getPixelRatio(pixelRatio: Double): Double = js.native
    
    /**
      * Get the size of the icon (in pixels).
      */
    def getSize(): Size = js.native
    
    def getSrc(): js.UndefOr[String] = js.native
    
    /**
      * Load not yet loaded URI.
      */
    def load(): Unit = js.native
  }
}

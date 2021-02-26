package typingsSlinky.browserImageCompression

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("browser-image-compression", JSImport.Namespace)
  @js.native
  def apply(image: Blob, options: Options): js.Promise[File | Blob] = js.native
  @JSImport("browser-image-compression", JSImport.Namespace)
  @js.native
  def apply(image: File, options: Options): js.Promise[File | Blob] = js.native
  
  @JSImport("browser-image-compression", "canvasToFile")
  @js.native
  def canvasToFile(canvas: HTMLCanvasElement, fileType: String, fileName: String, fileLastModified: Double): js.Promise[File | Blob] = js.native
  @JSImport("browser-image-compression", "canvasToFile")
  @js.native
  def canvasToFile(
    canvas: HTMLCanvasElement,
    fileType: String,
    fileName: String,
    fileLastModified: Double,
    quality: Double
  ): js.Promise[File | Blob] = js.native
  
  @JSImport("browser-image-compression", "drawFileInCanvas")
  @js.native
  def drawFileInCanvas(file: Blob): js.Promise[js.Tuple2[ImageBitmap | HTMLImageElement, HTMLCanvasElement]] = js.native
  @JSImport("browser-image-compression", "drawFileInCanvas")
  @js.native
  def drawFileInCanvas(file: File): js.Promise[js.Tuple2[ImageBitmap | HTMLImageElement, HTMLCanvasElement]] = js.native
  
  @JSImport("browser-image-compression", "drawImageInCanvas")
  @js.native
  def drawImageInCanvas(img: HTMLImageElement): HTMLCanvasElement = js.native
  
  @JSImport("browser-image-compression", "getDataUrlFromFile")
  @js.native
  def getDataUrlFromFile(file: Blob): js.Promise[String] = js.native
  @JSImport("browser-image-compression", "getDataUrlFromFile")
  @js.native
  def getDataUrlFromFile(file: File): js.Promise[String] = js.native
  
  @JSImport("browser-image-compression", "getExifOrientation")
  @js.native
  def getExifOrientation(file: Blob): js.Promise[Double] = js.native
  @JSImport("browser-image-compression", "getExifOrientation")
  @js.native
  def getExifOrientation(file: File): js.Promise[Double] = js.native
  
  @JSImport("browser-image-compression", "getFilefromDataUrl")
  @js.native
  def getFilefromDataUrl(dataUrl: String, filename: String): js.Promise[File | Blob] = js.native
  @JSImport("browser-image-compression", "getFilefromDataUrl")
  @js.native
  def getFilefromDataUrl(dataUrl: String, filename: String, lastModified: Double): js.Promise[File | Blob] = js.native
  
  @JSImport("browser-image-compression", "loadImage")
  @js.native
  def loadImage(src: String): js.Promise[HTMLImageElement] = js.native
  
  @js.native
  trait Options extends StObject {
    
    /** Default to be the exif orientation from the image file */
    var exifOrientation: js.UndefOr[Double] = js.native
    
    /** Default to be the original mime type from the image file */
    var fileType: js.UndefOr[String] = js.native
    
    /** @default 10 */
    var maxIteration: js.UndefOr[Double] = js.native
    
    /** @default Number.POSITIVE_INFINITY */
    var maxSizeMB: js.UndefOr[Double] = js.native
    
    /** @default undefined */
    var maxWidthOrHeight: js.UndefOr[Double] = js.native
    
    /** A function takes one progress argument (progress from 0 to 100) */
    var onProgress: js.UndefOr[js.Function1[/* progress */ Double, Unit]] = js.native
    
    /** @default false */
    var useWebWorker: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExifOrientation(value: Double): Self = StObject.set(x, "exifOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExifOrientationUndefined: Self = StObject.set(x, "exifOrientation", js.undefined)
      
      @scala.inline
      def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
      
      @scala.inline
      def setMaxIteration(value: Double): Self = StObject.set(x, "maxIteration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxIterationUndefined: Self = StObject.set(x, "maxIteration", js.undefined)
      
      @scala.inline
      def setMaxSizeMB(value: Double): Self = StObject.set(x, "maxSizeMB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSizeMBUndefined: Self = StObject.set(x, "maxSizeMB", js.undefined)
      
      @scala.inline
      def setMaxWidthOrHeight(value: Double): Self = StObject.set(x, "maxWidthOrHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthOrHeightUndefined: Self = StObject.set(x, "maxWidthOrHeight", js.undefined)
      
      @scala.inline
      def setOnProgress(value: /* progress */ Double => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      @scala.inline
      def setUseWebWorker(value: Boolean): Self = StObject.set(x, "useWebWorker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseWebWorkerUndefined: Self = StObject.set(x, "useWebWorker", js.undefined)
    }
  }
}

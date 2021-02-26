package typingsSlinky.croppie

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.croppie.anon.Height
import typingsSlinky.croppie.anon.Orientation
import typingsSlinky.croppie.anon.ResultOptionstypebase64ca
import typingsSlinky.croppie.anon.ResultOptionstypeblob
import typingsSlinky.croppie.anon.ResultOptionstypehtml
import typingsSlinky.croppie.anon.ResultOptionstyperawcanva
import typingsSlinky.croppie.croppieNumbers.`-180`
import typingsSlinky.croppie.croppieNumbers.`-270`
import typingsSlinky.croppie.croppieNumbers.`-90`
import typingsSlinky.croppie.croppieNumbers.`180`
import typingsSlinky.croppie.croppieNumbers.`270`
import typingsSlinky.croppie.croppieNumbers.`90`
import typingsSlinky.croppie.croppieStrings.original
import typingsSlinky.croppie.croppieStrings.viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("croppie", JSImport.Namespace)
  @js.native
  class ^ protected () extends Croppie {
    def this(container: HTMLElement) = this()
    def this(container: HTMLElement, options: CroppieOptions) = this()
  }
  
  @js.native
  trait CropData extends StObject {
    
    var orientation: js.UndefOr[Double] = js.native
    
    var points: js.UndefOr[js.Array[Double]] = js.native
    
    var zoom: js.UndefOr[Double] = js.native
  }
  object CropData {
    
    @scala.inline
    def apply(): CropData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CropData]
    }
    
    @scala.inline
    implicit class CropDataMutableBuilder[Self <: CropData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOrientation(value: Double): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setPoints(value: js.Array[Double]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
      
      @scala.inline
      def setPointsVarargs(value: Double*): Self = StObject.set(x, "points", js.Array(value :_*))
      
      @scala.inline
      def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.croppie.croppieStrings.square
    - typingsSlinky.croppie.croppieStrings.circle
  */
  trait CropType extends StObject
  object CropType {
    
    @scala.inline
    def circle: typingsSlinky.croppie.croppieStrings.circle = "circle".asInstanceOf[typingsSlinky.croppie.croppieStrings.circle]
    
    @scala.inline
    def square: typingsSlinky.croppie.croppieStrings.square = "square".asInstanceOf[typingsSlinky.croppie.croppieStrings.square]
  }
  
  @js.native
  trait Croppie extends StObject {
    
    def bind(options: Orientation): js.Promise[Unit] = js.native
    
    def destroy(): Unit = js.native
    
    def get(): CropData = js.native
    
    def result(): js.Promise[HTMLCanvasElement] = js.native
    def result(options: ResultOptionstypebase64ca): js.Promise[String] = js.native
    def result(options: ResultOptionstypeblob): js.Promise[Blob] = js.native
    def result(options: ResultOptionstypehtml): js.Promise[HTMLElement] = js.native
    def result(options: ResultOptionstyperawcanva): js.Promise[HTMLCanvasElement] = js.native
    def result(options: ResultOptions): js.Promise[HTMLCanvasElement] = js.native
    
    @JSName("rotate")
    def rotate_180(degrees: `-180`): Unit = js.native
    @JSName("rotate")
    def rotate_180(degrees: `180`): Unit = js.native
    @JSName("rotate")
    def rotate_270(degrees: `-270`): Unit = js.native
    @JSName("rotate")
    def rotate_270(degrees: `270`): Unit = js.native
    @JSName("rotate")
    def rotate_90(degrees: `-90`): Unit = js.native
    @JSName("rotate")
    def rotate_90(degrees: `90`): Unit = js.native
    
    def setZoom(zoom: Double): Unit = js.native
  }
  
  @js.native
  trait CroppieOptions extends StObject {
    
    var boundary: js.UndefOr[Height] = js.native
    
    var customClass: js.UndefOr[String] = js.native
    
    var enableExif: js.UndefOr[Boolean] = js.native
    
    var enableOrientation: js.UndefOr[Boolean] = js.native
    
    var enableZoom: js.UndefOr[Boolean] = js.native
    
    var enforceBoundary: js.UndefOr[Boolean] = js.native
    
    var mouseWheelZoom: js.UndefOr[Boolean] = js.native
    
    var showZoomer: js.UndefOr[Boolean] = js.native
    
    var viewport: js.UndefOr[typingsSlinky.croppie.anon.Type] = js.native
  }
  object CroppieOptions {
    
    @scala.inline
    def apply(): CroppieOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CroppieOptions]
    }
    
    @scala.inline
    implicit class CroppieOptionsMutableBuilder[Self <: CroppieOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoundary(value: Height): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
      
      @scala.inline
      def setCustomClass(value: String): Self = StObject.set(x, "customClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomClassUndefined: Self = StObject.set(x, "customClass", js.undefined)
      
      @scala.inline
      def setEnableExif(value: Boolean): Self = StObject.set(x, "enableExif", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableExifUndefined: Self = StObject.set(x, "enableExif", js.undefined)
      
      @scala.inline
      def setEnableOrientation(value: Boolean): Self = StObject.set(x, "enableOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableOrientationUndefined: Self = StObject.set(x, "enableOrientation", js.undefined)
      
      @scala.inline
      def setEnableZoom(value: Boolean): Self = StObject.set(x, "enableZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableZoomUndefined: Self = StObject.set(x, "enableZoom", js.undefined)
      
      @scala.inline
      def setEnforceBoundary(value: Boolean): Self = StObject.set(x, "enforceBoundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnforceBoundaryUndefined: Self = StObject.set(x, "enforceBoundary", js.undefined)
      
      @scala.inline
      def setMouseWheelZoom(value: Boolean): Self = StObject.set(x, "mouseWheelZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseWheelZoomUndefined: Self = StObject.set(x, "mouseWheelZoom", js.undefined)
      
      @scala.inline
      def setShowZoomer(value: Boolean): Self = StObject.set(x, "showZoomer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowZoomerUndefined: Self = StObject.set(x, "showZoomer", js.undefined)
      
      @scala.inline
      def setViewport(value: typingsSlinky.croppie.anon.Type): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.croppie.croppieStrings.jpeg
    - typingsSlinky.croppie.croppieStrings.png
    - typingsSlinky.croppie.croppieStrings.webp
  */
  trait Format extends StObject
  object Format {
    
    @scala.inline
    def jpeg: typingsSlinky.croppie.croppieStrings.jpeg = "jpeg".asInstanceOf[typingsSlinky.croppie.croppieStrings.jpeg]
    
    @scala.inline
    def png: typingsSlinky.croppie.croppieStrings.png = "png".asInstanceOf[typingsSlinky.croppie.croppieStrings.png]
    
    @scala.inline
    def webp: typingsSlinky.croppie.croppieStrings.webp = "webp".asInstanceOf[typingsSlinky.croppie.croppieStrings.webp]
  }
  
  @js.native
  trait ResultOptions extends StObject {
    
    var circle: js.UndefOr[Boolean] = js.native
    
    var format: js.UndefOr[Format] = js.native
    
    var quality: js.UndefOr[Double] = js.native
    
    var size: js.UndefOr[viewport | original | Height] = js.native
    
    var `type`: js.UndefOr[Type] = js.native
  }
  object ResultOptions {
    
    @scala.inline
    def apply(): ResultOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResultOptions]
    }
    
    @scala.inline
    implicit class ResultOptionsMutableBuilder[Self <: ResultOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCircle(value: Boolean): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
      
      @scala.inline
      def setFormat(value: Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setSize(value: viewport | original | Height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.croppie.croppieStrings.canvas
    - typingsSlinky.croppie.croppieStrings.base64
    - typingsSlinky.croppie.croppieStrings.html
    - typingsSlinky.croppie.croppieStrings.blob
    - typingsSlinky.croppie.croppieStrings.rawcanvas
  */
  trait Type extends StObject
  object Type {
    
    @scala.inline
    def base64: typingsSlinky.croppie.croppieStrings.base64 = "base64".asInstanceOf[typingsSlinky.croppie.croppieStrings.base64]
    
    @scala.inline
    def blob: typingsSlinky.croppie.croppieStrings.blob = "blob".asInstanceOf[typingsSlinky.croppie.croppieStrings.blob]
    
    @scala.inline
    def canvas: typingsSlinky.croppie.croppieStrings.canvas = "canvas".asInstanceOf[typingsSlinky.croppie.croppieStrings.canvas]
    
    @scala.inline
    def html: typingsSlinky.croppie.croppieStrings.html = "html".asInstanceOf[typingsSlinky.croppie.croppieStrings.html]
    
    @scala.inline
    def rawcanvas: typingsSlinky.croppie.croppieStrings.rawcanvas = "rawcanvas".asInstanceOf[typingsSlinky.croppie.croppieStrings.rawcanvas]
  }
}

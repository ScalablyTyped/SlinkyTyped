package typingsSlinky.reactMediumImageZoom

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-medium-image-zoom", JSImport.Default)
  @js.native
  class default ()
    extends Component[ImageZoomProps, js.Any, js.Any]
  
  type ImageZoom = ReactComponentClass[ImageZoomProps]
  
  @js.native
  trait ImageZoomDefaultStyles extends StObject {
    
    var image: js.UndefOr[js.Object] = js.native
    
    var overlay: js.UndefOr[js.Object] = js.native
    
    var zoomContainer: js.UndefOr[js.Object] = js.native
    
    var zoomImage: js.UndefOr[js.Object] = js.native
  }
  object ImageZoomDefaultStyles {
    
    @scala.inline
    def apply(): ImageZoomDefaultStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageZoomDefaultStyles]
    }
    
    @scala.inline
    implicit class ImageZoomDefaultStylesMutableBuilder[Self <: ImageZoomDefaultStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImage(value: js.Object): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setOverlay(value: js.Object): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      @scala.inline
      def setZoomContainer(value: js.Object): Self = StObject.set(x, "zoomContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomContainerUndefined: Self = StObject.set(x, "zoomContainer", js.undefined)
      
      @scala.inline
      def setZoomImage(value: js.Object): Self = StObject.set(x, "zoomImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomImageUndefined: Self = StObject.set(x, "zoomImage", js.undefined)
    }
  }
  
  @js.native
  trait ImageZoomImage extends StObject {
    
    var alt: js.UndefOr[String] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var src: String = js.native
    
    var style: js.UndefOr[js.Object] = js.native
  }
  object ImageZoomImage {
    
    @scala.inline
    def apply(src: String): ImageZoomImage = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageZoomImage]
    }
    
    @scala.inline
    implicit class ImageZoomImageMutableBuilder[Self <: ImageZoomImage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait ImageZoomProps extends StObject {
    
    var defaultStyles: js.UndefOr[ImageZoomDefaultStyles] = js.native
    
    var image: ImageZoomImage = js.native
    
    var isZoomed: js.UndefOr[Boolean] = js.native
    
    var onUnzoom: js.UndefOr[js.Function0[js.Object]] = js.native
    
    var onZoom: js.UndefOr[js.Function0[js.Object]] = js.native
    
    var shouldHandleZoom: js.UndefOr[js.Function0[Boolean]] = js.native
    
    var shouldReplaceImage: js.UndefOr[Boolean] = js.native
    
    var shouldRespectMaxDimension: js.UndefOr[Boolean] = js.native
    
    var zoomImage: js.UndefOr[ImageZoomZoomImage] = js.native
    
    var zoomMargin: js.UndefOr[Double] = js.native
  }
  object ImageZoomProps {
    
    @scala.inline
    def apply(image: ImageZoomImage): ImageZoomProps = {
      val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageZoomProps]
    }
    
    @scala.inline
    implicit class ImageZoomPropsMutableBuilder[Self <: ImageZoomProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultStyles(value: ImageZoomDefaultStyles): Self = StObject.set(x, "defaultStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultStylesUndefined: Self = StObject.set(x, "defaultStyles", js.undefined)
      
      @scala.inline
      def setImage(value: ImageZoomImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsZoomed(value: Boolean): Self = StObject.set(x, "isZoomed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsZoomedUndefined: Self = StObject.set(x, "isZoomed", js.undefined)
      
      @scala.inline
      def setOnUnzoom(value: () => js.Object): Self = StObject.set(x, "onUnzoom", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnUnzoomUndefined: Self = StObject.set(x, "onUnzoom", js.undefined)
      
      @scala.inline
      def setOnZoom(value: () => js.Object): Self = StObject.set(x, "onZoom", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnZoomUndefined: Self = StObject.set(x, "onZoom", js.undefined)
      
      @scala.inline
      def setShouldHandleZoom(value: () => Boolean): Self = StObject.set(x, "shouldHandleZoom", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShouldHandleZoomUndefined: Self = StObject.set(x, "shouldHandleZoom", js.undefined)
      
      @scala.inline
      def setShouldReplaceImage(value: Boolean): Self = StObject.set(x, "shouldReplaceImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldReplaceImageUndefined: Self = StObject.set(x, "shouldReplaceImage", js.undefined)
      
      @scala.inline
      def setShouldRespectMaxDimension(value: Boolean): Self = StObject.set(x, "shouldRespectMaxDimension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldRespectMaxDimensionUndefined: Self = StObject.set(x, "shouldRespectMaxDimension", js.undefined)
      
      @scala.inline
      def setZoomImage(value: ImageZoomZoomImage): Self = StObject.set(x, "zoomImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomImageUndefined: Self = StObject.set(x, "zoomImage", js.undefined)
      
      @scala.inline
      def setZoomMargin(value: Double): Self = StObject.set(x, "zoomMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomMarginUndefined: Self = StObject.set(x, "zoomMargin", js.undefined)
    }
  }
  
  @js.native
  trait ImageZoomZoomImage extends StObject {
    
    var alt: js.UndefOr[String] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var src: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
  }
  object ImageZoomZoomImage {
    
    @scala.inline
    def apply(): ImageZoomZoomImage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageZoomZoomImage]
    }
    
    @scala.inline
    implicit class ImageZoomZoomImageMutableBuilder[Self <: ImageZoomZoomImage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}

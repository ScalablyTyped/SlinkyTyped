package typingsSlinky.antDesignReactNative

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageItemMod {
  
  @JSImport("@ant-design/react-native/lib/image-picker/ImageItem", JSImport.Default)
  @js.native
  class default protected () extends ImageItem {
    def this(props: ImageItemProps) = this()
  }
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("@ant-design/react-native/lib/image-picker/ImageItem", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@ant-design/react-native/lib/image-picker/ImageItem", "default.defaultProps.selected")
      @js.native
      def selected: Boolean = js.native
      @scala.inline
      def selected_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selected")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ImageItem
    extends Component[ImageItemProps, js.Object, js.Any] {
    
    @JSName("UNSAFE_componentWillMount")
    def UNSAFE_componentWillMount_MImageItem(): Unit = js.native
    
    def _handleClick(item: js.Any): Unit = js.native
    
    var _imageSize: Double = js.native
  }
  
  @js.native
  trait ImageItemProps extends StObject {
    
    var containerWidth: js.UndefOr[Double] = js.native
    
    var imageMargin: Double = js.native
    
    var imagesPerRow: Double = js.native
    
    var item: js.UndefOr[js.Any] = js.native
    
    var onPress: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    var selected: js.UndefOr[Boolean] = js.native
    
    var selectedMarker: js.UndefOr[ReactElement] = js.native
  }
  object ImageItemProps {
    
    @scala.inline
    def apply(imageMargin: Double, imagesPerRow: Double): ImageItemProps = {
      val __obj = js.Dynamic.literal(imageMargin = imageMargin.asInstanceOf[js.Any], imagesPerRow = imagesPerRow.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageItemProps]
    }
    
    @scala.inline
    implicit class ImageItemPropsMutableBuilder[Self <: ImageItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerWidth(value: Double): Self = StObject.set(x, "containerWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerWidthUndefined: Self = StObject.set(x, "containerWidth", js.undefined)
      
      @scala.inline
      def setImageMargin(value: Double): Self = StObject.set(x, "imageMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagesPerRow(value: Double): Self = StObject.set(x, "imagesPerRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      @scala.inline
      def setOnPress(value: /* repeated */ js.Any => _): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedMarker(value: ReactElement): Self = StObject.set(x, "selectedMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedMarkerUndefined: Self = StObject.set(x, "selectedMarker", js.undefined)
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
}

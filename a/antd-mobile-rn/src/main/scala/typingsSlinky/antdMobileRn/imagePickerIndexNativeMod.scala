package typingsSlinky.antdMobileRn

import typingsSlinky.antdMobileRn.anon.Files
import typingsSlinky.antdMobileRn.imagePickerPropsTypeMod.ImagePickerPropTypes
import typingsSlinky.antdMobileRn.imagePickerStyleIndexNativeMod.IImagePickerStyle
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imagePickerIndexNativeMod {
  
  @JSImport("antd-mobile-rn/lib/image-picker/index.native", JSImport.Default)
  @js.native
  class default protected () extends ImagePicker {
    def this(props: ImagePickerNativeProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/image-picker/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/image-picker/index.native", "default.defaultProps")
    @js.native
    def defaultProps: Files = js.native
    @scala.inline
    def defaultProps_=(x: Files): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ImagePicker
    extends Component[ImagePickerNativeProps, js.Any, js.Any] {
    
    def addImage(imageObj: js.Any): Unit = js.native
    
    def hideImageRoll(): Unit = js.native
    
    def onImageClick(index: Double): Unit = js.native
    
    def onPressIn(): Unit = js.native
    
    def onPressOut(): Unit = js.native
    
    var plusText: js.Any = js.native
    
    var plusWrap: js.Any = js.native
    
    def removeImage(idx: Double): Unit = js.native
    
    def showPicker(): Unit = js.native
  }
  
  @js.native
  trait ImagePickerNativeProps extends ImagePickerPropTypes {
    
    @JSName("styles")
    var styles_ImagePickerNativeProps: js.UndefOr[IImagePickerStyle] = js.native
  }
  object ImagePickerNativeProps {
    
    @scala.inline
    def apply(): ImagePickerNativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImagePickerNativeProps]
    }
    
    @scala.inline
    implicit class ImagePickerNativePropsMutableBuilder[Self <: ImagePickerNativeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyles(value: IImagePickerStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}

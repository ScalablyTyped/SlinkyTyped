package typingsSlinky.fundamentalReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.fundamentalReact.fundamentalReactStrings.circle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageMod extends Shortcut {
  
  @JSImport("fundamental-react/lib/Image/Image", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ImageProps] = js.native
  
  @js.native
  trait ImageProps
    extends /* x */ StringDictionary[js.Any] {
    
    var className: js.UndefOr[String] = js.native
    
    var disableStyles: js.UndefOr[Boolean] = js.native
    
    var photo: String = js.native
    
    var size: imageSize = js.native
    
    var `type`: js.UndefOr[imageType] = js.native
  }
  object ImageProps {
    
    @scala.inline
    def apply(photo: String, size: imageSize): ImageProps = {
      val __obj = js.Dynamic.literal(photo = photo.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageProps]
    }
    
    @scala.inline
    implicit class ImagePropsMutableBuilder[Self <: ImageProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      @scala.inline
      def setPhoto(value: String): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: imageSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: imageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ImageProps]
  
  /* This means you don't have to write `default`, but can instead just say `imageMod.foo` */
  override def _to: ReactComponentClass[ImageProps] = default
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.fundamentalReact.fundamentalReactStrings.s
    - typingsSlinky.fundamentalReact.fundamentalReactStrings.m
    - typingsSlinky.fundamentalReact.fundamentalReactStrings.l
  */
  trait imageSize extends StObject
  object imageSize {
    
    @scala.inline
    def l: typingsSlinky.fundamentalReact.fundamentalReactStrings.l = "l".asInstanceOf[typingsSlinky.fundamentalReact.fundamentalReactStrings.l]
    
    @scala.inline
    def m: typingsSlinky.fundamentalReact.fundamentalReactStrings.m = "m".asInstanceOf[typingsSlinky.fundamentalReact.fundamentalReactStrings.m]
    
    @scala.inline
    def s: typingsSlinky.fundamentalReact.fundamentalReactStrings.s = "s".asInstanceOf[typingsSlinky.fundamentalReact.fundamentalReactStrings.s]
  }
  
  type imageType = circle
}

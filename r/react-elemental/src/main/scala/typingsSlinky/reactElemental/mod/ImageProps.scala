package typingsSlinky.reactElemental.mod

import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ImgHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageProps extends ImgHTMLAttributes[HTMLImageElement] {
  
  @JSName("alt")
  val alt_ImageProps: String = js.native
  
  @JSName("height")
  val height_ImageProps: js.UndefOr[String] = js.native
  
  val imgStyle: js.UndefOr[CSSProperties] = js.native
  
  val `lazy`: js.UndefOr[Boolean] = js.native
  
  val showIntermediate: js.UndefOr[Boolean] = js.native
  
  @JSName("width")
  val width_ImageProps: js.UndefOr[String] = js.native
}
object ImageProps {
  
  @scala.inline
  def apply(alt: String): ImageProps = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageProps]
  }
  
  @scala.inline
  implicit class ImagePropsMutableBuilder[Self <: ImageProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setImgStyle(value: CSSProperties): Self = StObject.set(x, "imgStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImgStyleUndefined: Self = StObject.set(x, "imgStyle", js.undefined)
    
    @scala.inline
    def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
    
    @scala.inline
    def setShowIntermediate(value: Boolean): Self = StObject.set(x, "showIntermediate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowIntermediateUndefined: Self = StObject.set(x, "showIntermediate", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

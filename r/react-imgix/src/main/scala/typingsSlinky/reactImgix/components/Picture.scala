package typingsSlinky.reactImgix.components

import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLSourceElement
import slinky.core.facade.ReactRef
import slinky.web.html.img.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.reactImgix.mod.CommonProps
import typingsSlinky.reactImgix.mod.ImgixHTMLAttributes
import typingsSlinky.std.HTMLPictureElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Picture {
  
  @JSImport("react-imgix", "Picture")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactImgix.mod.Picture] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def htmlAttributes(value: ImgixHTMLAttributes): this.type = set("htmlAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMounted(
      value: /* ref */ js.UndefOr[ReactRef[HTMLPictureElement | HTMLImageElement | HTMLSourceElement]] => Unit
    ): this.type = set("onMounted", js.Any.fromFunction1(value))
  }
  
  def withProps(p: PropsWithChildren[CommonProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Picture.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

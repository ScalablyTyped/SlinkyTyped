package typingsSlinky.reactImgix.components

import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLSourceElement
import slinky.core.facade.ReactRef
import slinky.web.html.img.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactImgix.mod.AttributeConfig
import typingsSlinky.reactImgix.mod.ImgixHTMLAttributes
import typingsSlinky.reactImgix.mod.ImigixParams
import typingsSlinky.std.HTMLPictureElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_SharedImigixAndSourceProps_1406058917[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def attributeConfig(value: AttributeConfig): this.type = set("attributeConfig", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def disableLibraryParam(value: Boolean): this.type = set("disableLibraryParam", value.asInstanceOf[js.Any])
  
  @scala.inline
  def disableQualityByDPR(value: Boolean): this.type = set("disableQualityByDPR", value.asInstanceOf[js.Any])
  
  @scala.inline
  def disableSrcSet(value: Boolean): this.type = set("disableSrcSet", value.asInstanceOf[js.Any])
  
  @scala.inline
  def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
  
  @scala.inline
  def htmlAttributes(value: ImgixHTMLAttributes): this.type = set("htmlAttributes", value.asInstanceOf[js.Any])
  
  @scala.inline
  def imgixParams(value: ImigixParams): this.type = set("imgixParams", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onMounted(
    value: /* ref */ js.UndefOr[ReactRef[HTMLPictureElement | HTMLImageElement | HTMLSourceElement]] => Unit
  ): this.type = set("onMounted", js.Any.fromFunction1(value))
  
  @scala.inline
  def sizes(value: String): this.type = set("sizes", value.asInstanceOf[js.Any])
  
  @scala.inline
  def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
}

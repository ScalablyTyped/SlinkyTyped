package typingsSlinky.reactImgix.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.reactImgix.mod.BackgroundProps
import typingsSlinky.reactImgix.mod.ImgixHTMLAttributes
import typingsSlinky.reactImgix.mod.ImigixParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Background {
  
  @scala.inline
  def apply(src: String): Builder = {
    val __props = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PropsWithChildren[BackgroundProps]]))
  }
  
  @JSImport("react-imgix", "Background")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableLibraryParam(value: Boolean): this.type = set("disableLibraryParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def htmlAttributes(value: ImgixHTMLAttributes): this.type = set("htmlAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def imgixParams(value: ImigixParams): this.type = set("imgixParams", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropsWithChildren[BackgroundProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

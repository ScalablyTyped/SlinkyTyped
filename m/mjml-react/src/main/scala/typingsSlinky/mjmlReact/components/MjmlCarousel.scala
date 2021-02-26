package typingsSlinky.mjmlReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.csstype.mod.BackgroundColorProperty
import typingsSlinky.csstype.mod.BorderProperty
import typingsSlinky.csstype.mod.BorderRadiusProperty
import typingsSlinky.mjmlReact.mjmlReactStrings.hidden
import typingsSlinky.mjmlReact.mjmlReactStrings.visible
import typingsSlinky.mjmlReact.mod.ClassNameProps
import typingsSlinky.mjmlReact.mod.MjmlCarouselProps
import typingsSlinky.mjmlReact.mod.RequiredChildrenProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MjmlCarousel {
  
  @JSImport("mjml-react", "MjmlCarousel")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.mjmlReact.mod.MjmlCarousel] {
    
    @scala.inline
    def align(value: String): this.type = set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backgroundColor(value: BackgroundColorProperty): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderRadius(value: String | Double): this.type = set("borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cssClass(value: String): this.type = set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconWidth(value: String): this.type = set("iconWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def leftIcon(value: String): this.type = set("leftIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rightIcon(value: String): this.type = set("rightIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tbBorder(value: BorderProperty[String | Double]): this.type = set("tbBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tbBorderRadius(value: BorderRadiusProperty[String | Double]): this.type = set("tbBorderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tbHoverBorderColor(value: String): this.type = set("tbHoverBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tbSelectedBorderColor(value: String): this.type = set("tbSelectedBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tbWidth(value: String): this.type = set("tbWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def thumbnails(value: hidden | visible): this.type = set("thumbnails", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MjmlCarousel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RequiredChildrenProps with MjmlCarouselProps with ClassNameProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

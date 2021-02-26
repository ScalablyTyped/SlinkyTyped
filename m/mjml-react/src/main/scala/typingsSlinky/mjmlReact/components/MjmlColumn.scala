package typingsSlinky.mjmlReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.csstype.mod.BackgroundColorProperty
import typingsSlinky.csstype.mod.VerticalAlignProperty
import typingsSlinky.mjmlReact.mod.BorderProps
import typingsSlinky.mjmlReact.mod.ClassNameProps
import typingsSlinky.mjmlReact.mod.MjmlColumnProps
import typingsSlinky.mjmlReact.mod.PaddingProps
import typingsSlinky.mjmlReact.mod.RequiredChildrenProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MjmlColumn {
  
  @JSImport("mjml-react", "MjmlColumn")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.mjmlReact.mod.MjmlColumn] {
    
    @scala.inline
    def backgroundColor(value: BackgroundColorProperty): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def border(value: String): this.type = set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderBottom(value: String): this.type = set("borderBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderLeft(value: String): this.type = set("borderLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderRadius(value: String | Double): this.type = set("borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderRight(value: String): this.type = set("borderRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderTop(value: String): this.type = set("borderTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cssClass(value: String): this.type = set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def padding(value: String | Double): this.type = set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingBottom(value: String | Double): this.type = set("paddingBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingLeft(value: String | Double): this.type = set("paddingLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingRight(value: String | Double): this.type = set("paddingRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingTop(value: String | Double): this.type = set("paddingTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def verticalAlign(value: VerticalAlignProperty[String | Double]): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: String | Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MjmlColumn.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: RequiredChildrenProps with MjmlColumnProps with PaddingProps with ClassNameProps with BorderProps
  ): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

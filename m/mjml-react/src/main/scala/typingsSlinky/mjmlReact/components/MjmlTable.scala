package typingsSlinky.mjmlReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.csstype.mod.BackgroundColorProperty
import typingsSlinky.csstype.mod.ColorProperty
import typingsSlinky.mjmlReact.mjmlReactStrings.auto
import typingsSlinky.mjmlReact.mjmlReactStrings.center
import typingsSlinky.mjmlReact.mjmlReactStrings.fixed
import typingsSlinky.mjmlReact.mjmlReactStrings.inherit
import typingsSlinky.mjmlReact.mjmlReactStrings.initial
import typingsSlinky.mjmlReact.mjmlReactStrings.left
import typingsSlinky.mjmlReact.mjmlReactStrings.right
import typingsSlinky.mjmlReact.mod.MjmlTableProps
import typingsSlinky.mjmlReact.mod.PaddingProps
import typingsSlinky.mjmlReact.mod.RequiredChildrenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MjmlTable {
  
  @JSImport("mjml-react", "MjmlTable")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.mjmlReact.mod.MjmlTable] {
    
    @scala.inline
    def align(value: left | right | center): this.type = set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cellpadding(value: String): this.type = set("cellpadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cellspacing(value: String): this.type = set("cellspacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: ColorProperty): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerBackgroundColor(value: BackgroundColorProperty): this.type = set("containerBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontFamily(value: String): this.type = set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontSize(value: String | Double): this.type = set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontStyle(value: String): this.type = set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lineHeight(value: String | Double): this.type = set("lineHeight", value.asInstanceOf[js.Any])
    
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
    def tableLayout(value: auto | fixed | initial | inherit): this.type = set("tableLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: String | Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MjmlTableProps with RequiredChildrenProps with PaddingProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: MjmlTable.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

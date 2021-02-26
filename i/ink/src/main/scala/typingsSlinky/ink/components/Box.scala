package typingsSlinky.ink.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.ink.anon.readonlymarginnumberundef
import typingsSlinky.ink.domMod.DOMElement
import typingsSlinky.ink.inkStrings.`column-reverse`
import typingsSlinky.ink.inkStrings.`flex-end`
import typingsSlinky.ink.inkStrings.`flex-start`
import typingsSlinky.ink.inkStrings.`row-reverse`
import typingsSlinky.ink.inkStrings.`space-around`
import typingsSlinky.ink.inkStrings.`space-between`
import typingsSlinky.ink.inkStrings.absolute
import typingsSlinky.ink.inkStrings.auto
import typingsSlinky.ink.inkStrings.bold
import typingsSlinky.ink.inkStrings.center
import typingsSlinky.ink.inkStrings.classic
import typingsSlinky.ink.inkStrings.column
import typingsSlinky.ink.inkStrings.double
import typingsSlinky.ink.inkStrings.doubleSingle
import typingsSlinky.ink.inkStrings.flex
import typingsSlinky.ink.inkStrings.none
import typingsSlinky.ink.inkStrings.relative
import typingsSlinky.ink.inkStrings.round
import typingsSlinky.ink.inkStrings.row
import typingsSlinky.ink.inkStrings.single
import typingsSlinky.ink.inkStrings.singleDouble
import typingsSlinky.ink.inkStrings.stretch
import typingsSlinky.typeFest.literalUnionMod.LiteralUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Box {
  
  @JSImport("ink", "Box")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, DOMElement] {
    
    @scala.inline
    def alignItems(value: `flex-start` | center | `flex-end` | stretch): this.type = set("alignItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def alignSelf(value: `flex-start` | center | `flex-end` | auto): this.type = set("alignSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderColor(
      value: LiteralUnion[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ForegroundColor */ _, 
          String
        ]
    ): this.type = set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderStyle(value: single | double | round | bold | singleDouble | doubleSingle | classic): this.type = set("borderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def display(value: flex | none): this.type = set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flexBasis(value: Double | String): this.type = set("flexBasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flexDirection(value: row | column | `row-reverse` | `column-reverse`): this.type = set("flexDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flexGrow(value: Double): this.type = set("flexGrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flexShrink(value: Double): this.type = set("flexShrink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double | String): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def justifyContent(value: `flex-start` | `flex-end` | `space-between` | `space-around` | center): this.type = set("justifyContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def margin(value: Double): this.type = set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginBottom(value: Double): this.type = set("marginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginLeft(value: Double): this.type = set("marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginRight(value: Double): this.type = set("marginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginTop(value: Double): this.type = set("marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginX(value: Double): this.type = set("marginX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginY(value: Double): this.type = set("marginY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minHeight(value: Double | String): this.type = set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minWidth(value: Double | String): this.type = set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def padding(value: Double): this.type = set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingBottom(value: Double): this.type = set("paddingBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingLeft(value: Double): this.type = set("paddingLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingRight(value: Double): this.type = set("paddingRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingTop(value: Double): this.type = set("paddingTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingX(value: Double): this.type = set("paddingX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingY(value: Double): this.type = set("paddingY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def position(value: absolute | relative): this.type = set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Box.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: readonlymarginnumberundef): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

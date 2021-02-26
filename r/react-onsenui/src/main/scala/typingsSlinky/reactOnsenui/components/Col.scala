package typingsSlinky.reactOnsenui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactOnsenui.anon.HTMLAttributesidclassName
import typingsSlinky.reactOnsenui.anon.VerticalAlign
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.bottom
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.center
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Col {
  
  @JSImport("react-onsenui", "Col")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactOnsenui.mod.Col] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def verticalAlign(value: top | bottom | center): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Col.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HTMLAttributesidclassName with VerticalAlign): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

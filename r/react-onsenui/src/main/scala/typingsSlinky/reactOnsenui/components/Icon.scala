package typingsSlinky.reactOnsenui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactOnsenui.anon.HTMLAttributesidclassNameFixedWidth
import typingsSlinky.reactOnsenui.mod.ModifiersNumber
import typingsSlinky.reactOnsenui.mod.ModifiersString
import typingsSlinky.reactOnsenui.reactOnsenuiNumbers.`180`
import typingsSlinky.reactOnsenui.reactOnsenuiNumbers.`270`
import typingsSlinky.reactOnsenui.reactOnsenuiNumbers.`90`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Icon {
  
  @JSImport("react-onsenui", "Icon")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactOnsenui.mod.Icon] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fixedWidth(value: Boolean): this.type = set("fixedWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: String | ModifiersString): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def modifier(value: String): this.type = set("modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rotate(value: `90` | `180` | `270`): this.type = set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: Double | ModifiersNumber): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def spin(value: Boolean): this.type = set("spin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HTMLAttributesidclassNameFixedWidth): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Icon.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

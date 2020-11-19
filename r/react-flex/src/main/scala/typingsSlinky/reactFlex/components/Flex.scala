package typingsSlinky.reactFlex.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactFlex.mod.FlexProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Flex {
  
  @JSImport("react-flex", "Flex")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactFlex.mod.Flex] {
    
    @scala.inline
    def alignContent(value: String): this.type = set("alignContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def alignItems(value: String): this.type = set("alignItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def column(value: Boolean): this.type = set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def display(value: String): this.type = set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flex(value: Double | String | Boolean): this.type = set("flex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def justifyContent(value: String): this.type = set("justifyContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def reverse(value: Boolean): this.type = set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def row(value: Boolean): this.type = set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Any): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrap(value: Boolean): this.type = set("wrap", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FlexProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Flex.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

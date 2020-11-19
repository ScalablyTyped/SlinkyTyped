package typingsSlinky.reactFlexr.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactFlexr.ReactFlexr.CellProps
import typingsSlinky.reactFlexr.reactFlexrStrings.bottom
import typingsSlinky.reactFlexr.reactFlexrStrings.center
import typingsSlinky.reactFlexr.reactFlexrStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Cell {
  
  @JSImport("react-flexr", "Cell")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactFlexr.mod.Cell] {
    
    @scala.inline
    def align(value: top | center | bottom): this.type = set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def desk(value: String | Double): this.type = set("desk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flex(value: Boolean): this.type = set("flex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gutter(value: String): this.type = set("gutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lap(value: String | Double): this.type = set("lap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def palm(value: String | Double): this.type = set("palm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def portable(value: String | Double): this.type = set("portable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: String | Double): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CellProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Cell.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

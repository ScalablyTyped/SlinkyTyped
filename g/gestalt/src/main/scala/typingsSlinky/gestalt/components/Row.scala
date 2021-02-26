package typingsSlinky.gestalt.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.gestalt.gestaltStrings.around
import typingsSlinky.gestalt.gestaltStrings.auto
import typingsSlinky.gestalt.gestaltStrings.baseline
import typingsSlinky.gestalt.gestaltStrings.between
import typingsSlinky.gestalt.gestaltStrings.center
import typingsSlinky.gestalt.gestaltStrings.end
import typingsSlinky.gestalt.gestaltStrings.evenly
import typingsSlinky.gestalt.gestaltStrings.grow
import typingsSlinky.gestalt.gestaltStrings.none
import typingsSlinky.gestalt.gestaltStrings.shrink
import typingsSlinky.gestalt.gestaltStrings.start
import typingsSlinky.gestalt.gestaltStrings.stretch
import typingsSlinky.gestalt.mod.RowProps
import typingsSlinky.gestalt.mod.UnsignedUpTo12
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Row {
  
  @JSImport("gestalt", "Row")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.gestalt.mod.Row] {
    
    @scala.inline
    def alignContent(value: start | end | center | between | around | evenly | stretch): this.type = set("alignContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def alignItems(value: start | end | center | baseline | stretch): this.type = set("alignItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def alignSelf(value: auto | start | end | center | baseline | stretch): this.type = set("alignSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fit(value: Boolean): this.type = set("fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flex(value: grow | shrink | none): this.type = set("flex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gap(value: UnsignedUpTo12): this.type = set("gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double | String): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def justifyContent(value: start | end | center | between | around | evenly): this.type = set("justifyContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxHeight(value: Double | String): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxWidth(value: Double | String): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minHeight(value: Double | String): this.type = set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minWidth(value: Double | String): this.type = set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrap(value: Boolean): this.type = set("wrap", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Row.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RowProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

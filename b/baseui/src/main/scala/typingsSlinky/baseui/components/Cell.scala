package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.layoutGridMod.ALIGNMENT
import typingsSlinky.baseui.layoutGridMod.CellOverrides
import typingsSlinky.baseui.layoutGridMod.CellProps
import typingsSlinky.baseui.layoutGridMod.Responsive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Cell {
  
  @JSImport("baseui/layout-grid", "Cell")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def align(value: Responsive[ALIGNMENT]): this.type = set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def alignVarargs(value: ALIGNMENT*): this.type = set("align", js.Array(value :_*))
    
    @scala.inline
    def order(value: Responsive[Double]): this.type = set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def orderVarargs(value: Double*): this.type = set("order", js.Array(value :_*))
    
    @scala.inline
    def overrides(value: CellOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def skip(value: Responsive[Double]): this.type = set("skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def skipVarargs(value: Double*): this.type = set("skip", js.Array(value :_*))
    
    @scala.inline
    def span(value: Responsive[Double]): this.type = set("span", value.asInstanceOf[js.Any])
    
    @scala.inline
    def spanVarargs(value: Double*): this.type = set("span", js.Array(value :_*))
  }
  
  implicit def make(companion: Cell.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CellProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

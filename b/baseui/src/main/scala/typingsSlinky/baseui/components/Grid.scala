package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.layoutGridMod.ALIGNMENT
import typingsSlinky.baseui.layoutGridMod.BEHAVIOR
import typingsSlinky.baseui.layoutGridMod.GridOverrides
import typingsSlinky.baseui.layoutGridMod.GridProps
import typingsSlinky.baseui.layoutGridMod.Responsive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Grid {
  
  @JSImport("baseui/layout-grid", "Grid")
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
    def behavior(value: BEHAVIOR): this.type = set("behavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridColumns(value: Responsive[Double]): this.type = set("gridColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridColumnsVarargs(value: Double*): this.type = set("gridColumns", js.Array(value :_*))
    
    @scala.inline
    def gridGaps(value: Responsive[Double]): this.type = set("gridGaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridGapsVarargs(value: Double*): this.type = set("gridGaps", js.Array(value :_*))
    
    @scala.inline
    def gridGutters(value: Responsive[Double]): this.type = set("gridGutters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridGuttersVarargs(value: Double*): this.type = set("gridGutters", js.Array(value :_*))
    
    @scala.inline
    def gridMargins(value: Responsive[Double]): this.type = set("gridMargins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridMarginsVarargs(value: Double*): this.type = set("gridMargins", js.Array(value :_*))
    
    @scala.inline
    def gridMaxWidth(value: Double): this.type = set("gridMaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridUnit(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSLengthUnitT */ js.Any
    ): this.type = set("gridUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overrides(value: GridOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Grid.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: GridProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

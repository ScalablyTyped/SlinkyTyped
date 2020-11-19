package typingsSlinky.nivoAxes.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.nivoAxes.mod.AxisProps
import typingsSlinky.nivoAxes.mod.GridValues
import typingsSlinky.nivoAxes.mod.Orient
import typingsSlinky.nivoAxes.mod.TickFormatter
import typingsSlinky.nivoAxes.nivoAxesStrings.end
import typingsSlinky.nivoAxes.nivoAxesStrings.middle
import typingsSlinky.nivoAxes.nivoAxesStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Axis {
  
  @JSImport("@nivo/axes", "Axis")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def formatFunction1(value: /* value */ Double | String | js.Date => String | Double): this.type = set("format", js.Any.fromFunction1(value))
    
    @scala.inline
    def format(value: String | TickFormatter): this.type = set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def legendReactElement(value: ReactElement): this.type = set("legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def legend(value: ReactElement): this.type = set("legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def legendOffset(value: Double): this.type = set("legendOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def legendPosition(value: start | middle | end): this.type = set("legendPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def orient(value: Orient): this.type = set("orient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderTick(value: /* data */ js.Any => ReactElement): this.type = set("renderTick", js.Any.fromFunction1(value))
    
    @scala.inline
    def tickPadding(value: Double): this.type = set("tickPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tickRotation(value: Double): this.type = set("tickRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tickSize(value: Double): this.type = set("tickSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tickValuesVarargs(value: (js.Date | Double | String)*): this.type = set("tickValues", js.Array(value :_*))
    
    @scala.inline
    def tickValues(value: (GridValues[Double | String | js.Date]) | String): this.type = set("tickValues", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AxisProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Axis.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

package typingsSlinky.nivoAxes.mod

import slinky.core.facade.ReactElement
import typingsSlinky.nivoAxes.nivoAxesStrings.end
import typingsSlinky.nivoAxes.nivoAxesStrings.middle
import typingsSlinky.nivoAxes.nivoAxesStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxisProps extends js.Object {
  
  var format: js.UndefOr[String | TickFormatter] = js.native
  
  var legend: js.UndefOr[ReactElement] = js.native
  
  var legendOffset: js.UndefOr[Double] = js.native
  
  var legendPosition: js.UndefOr[start | middle | end] = js.native
  
  var orient: js.UndefOr[Orient] = js.native
  
  var renderTick: js.UndefOr[js.Function1[/* data */ js.Any, ReactElement]] = js.native
  
  var tickPadding: js.UndefOr[Double] = js.native
  
  var tickRotation: js.UndefOr[Double] = js.native
  
  var tickSize: js.UndefOr[Double] = js.native
  
  var tickValues: js.UndefOr[(GridValues[Double | String | js.Date]) | String] = js.native
}
object AxisProps {
  
  @scala.inline
  def apply(): AxisProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisProps]
  }
  
  @scala.inline
  implicit class AxisPropsOps[Self <: AxisProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFormatFunction1(value: /* value */ Double | String | js.Date => String | Double): Self = this.set("format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormat(value: String | TickFormatter): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setLegendReactElement(value: ReactElement): Self = this.set("legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegend(value: ReactElement): Self = this.set("legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    
    @scala.inline
    def setLegendOffset(value: Double): Self = this.set("legendOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendOffset: Self = this.set("legendOffset", js.undefined)
    
    @scala.inline
    def setLegendPosition(value: start | middle | end): Self = this.set("legendPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendPosition: Self = this.set("legendPosition", js.undefined)
    
    @scala.inline
    def setOrient(value: Orient): Self = this.set("orient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrient: Self = this.set("orient", js.undefined)
    
    @scala.inline
    def setRenderTick(value: /* data */ js.Any => ReactElement): Self = this.set("renderTick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderTick: Self = this.set("renderTick", js.undefined)
    
    @scala.inline
    def setTickPadding(value: Double): Self = this.set("tickPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickPadding: Self = this.set("tickPadding", js.undefined)
    
    @scala.inline
    def setTickRotation(value: Double): Self = this.set("tickRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickRotation: Self = this.set("tickRotation", js.undefined)
    
    @scala.inline
    def setTickSize(value: Double): Self = this.set("tickSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickSize: Self = this.set("tickSize", js.undefined)
    
    @scala.inline
    def setTickValuesVarargs(value: (js.Date | Double | String)*): Self = this.set("tickValues", js.Array(value :_*))
    
    @scala.inline
    def setTickValues(value: (GridValues[Double | String | js.Date]) | String): Self = this.set("tickValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickValues: Self = this.set("tickValues", js.undefined)
  }
}

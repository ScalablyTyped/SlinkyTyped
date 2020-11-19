package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZAxisCurrentDateIndicatorEventsOptions extends js.Object {
  
  /**
    * (Gantt) Click event on a plot band.
    */
  var click: js.UndefOr[EventCallbackFunction[PlotLineOrBand]] = js.native
  
  /**
    * (Gantt) Mouse move event on a plot band.
    */
  var mousemove: js.UndefOr[EventCallbackFunction[PlotLineOrBand]] = js.native
  
  /**
    * (Gantt) Mouse out event on the corner of a plot band.
    */
  var mouseout: js.UndefOr[EventCallbackFunction[PlotLineOrBand]] = js.native
  
  /**
    * (Gantt) Mouse over event on a plot band.
    */
  var mouseover: js.UndefOr[EventCallbackFunction[PlotLineOrBand]] = js.native
}
object ZAxisCurrentDateIndicatorEventsOptions {
  
  @scala.inline
  def apply(): ZAxisCurrentDateIndicatorEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZAxisCurrentDateIndicatorEventsOptions]
  }
  
  @scala.inline
  implicit class ZAxisCurrentDateIndicatorEventsOptionsOps[Self <: ZAxisCurrentDateIndicatorEventsOptions] (val x: Self) extends AnyVal {
    
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
    def setClick(value: EventCallbackFunction[PlotLineOrBand]): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    
    @scala.inline
    def setMousemove(value: EventCallbackFunction[PlotLineOrBand]): Self = this.set("mousemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMousemove: Self = this.set("mousemove", js.undefined)
    
    @scala.inline
    def setMouseout(value: EventCallbackFunction[PlotLineOrBand]): Self = this.set("mouseout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseout: Self = this.set("mouseout", js.undefined)
    
    @scala.inline
    def setMouseover(value: EventCallbackFunction[PlotLineOrBand]): Self = this.set("mouseover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseover: Self = this.set("mouseover", js.undefined)
  }
}

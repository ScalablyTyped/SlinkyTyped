package typingsSlinky.highchartsReactOfficial.anon

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactRef
import typingsSlinky.highcharts.mod.Chart_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chart extends js.Object {
  
  /**
    * Chart reference
    */
  var chart: Chart_ = js.native
  
  /**
    * React reference
    */
  var container: ReactRef[HTMLDivElement] = js.native
}
object Chart {
  
  @scala.inline
  def apply(chart: Chart_, container: ReactRef[HTMLDivElement]): Chart = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chart]
  }
  
  @scala.inline
  implicit class ChartOps[Self <: Chart] (val x: Self) extends AnyVal {
    
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
    def setChart(value: Chart_): Self = this.set("chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainer(value: ReactRef[HTMLDivElement]): Self = this.set("container", value.asInstanceOf[js.Any])
  }
}

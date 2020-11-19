package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipHidingEventUIParam extends js.Object {
  
  /**
    * Used to get item brush.
    */
  var actualItemBrush: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to get series brush.
    */
  var actualSeriesBrush: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to get reference to chart object.
    */
  var chart: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to get reference to tooltip DOM element.
    */
  var element: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to get reference to current series item object.
    */
  var item: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to get reference to current series object.
    */
  var series: js.UndefOr[js.Any] = js.native
}
object TooltipHidingEventUIParam {
  
  @scala.inline
  def apply(): TooltipHidingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipHidingEventUIParam]
  }
  
  @scala.inline
  implicit class TooltipHidingEventUIParamOps[Self <: TooltipHidingEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setActualItemBrush(value: js.Any): Self = this.set("actualItemBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActualItemBrush: Self = this.set("actualItemBrush", js.undefined)
    
    @scala.inline
    def setActualSeriesBrush(value: js.Any): Self = this.set("actualSeriesBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActualSeriesBrush: Self = this.set("actualSeriesBrush", js.undefined)
    
    @scala.inline
    def setChart(value: js.Any): Self = this.set("chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChart: Self = this.set("chart", js.undefined)
    
    @scala.inline
    def setElement(value: js.Any): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setItem(value: js.Any): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    
    @scala.inline
    def setSeries(value: js.Any): Self = this.set("series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
  }
}

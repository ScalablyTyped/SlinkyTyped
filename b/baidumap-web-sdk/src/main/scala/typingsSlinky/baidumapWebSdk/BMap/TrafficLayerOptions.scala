package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrafficLayerOptions extends js.Object {
  
  var predictDate: js.UndefOr[PredictDate] = js.native
}
object TrafficLayerOptions {
  
  @scala.inline
  def apply(): TrafficLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficLayerOptions]
  }
  
  @scala.inline
  implicit class TrafficLayerOptionsOps[Self <: TrafficLayerOptions] (val x: Self) extends AnyVal {
    
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
    def setPredictDate(value: PredictDate): Self = this.set("predictDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePredictDate: Self = this.set("predictDate", js.undefined)
  }
}

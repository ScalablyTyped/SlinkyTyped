package typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntervalCondition extends js.Object {
  
  var high: js.UndefOr[Double] = js.native
  
  var low: js.UndefOr[Double] = js.native
}
object IntervalCondition {
  
  @scala.inline
  def apply(): IntervalCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntervalCondition]
  }
  
  @scala.inline
  implicit class IntervalConditionOps[Self <: IntervalCondition] (val x: Self) extends AnyVal {
    
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
    def setHigh(value: Double): Self = this.set("high", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHigh: Self = this.set("high", js.undefined)
    
    @scala.inline
    def setLow(value: Double): Self = this.set("low", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLow: Self = this.set("low", js.undefined)
  }
}

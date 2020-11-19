package typingsSlinky.awsSdkClientXrayNode.typesServiceStatisticsMod

import typingsSlinky.awsSdkClientXrayNode.typesErrorStatisticsMod.UnmarshalledErrorStatistics
import typingsSlinky.awsSdkClientXrayNode.typesFaultStatisticsMod.UnmarshalledFaultStatistics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledServiceStatistics extends ServiceStatistics {
  
  /**
    * <p>Information about requests that failed with a 4xx Client Error status code.</p>
    */
  @JSName("ErrorStatistics")
  var ErrorStatistics_UnmarshalledServiceStatistics: js.UndefOr[UnmarshalledErrorStatistics] = js.native
  
  /**
    * <p>Information about requests that failed with a 5xx Server Error status code.</p>
    */
  @JSName("FaultStatistics")
  var FaultStatistics_UnmarshalledServiceStatistics: js.UndefOr[UnmarshalledFaultStatistics] = js.native
}
object UnmarshalledServiceStatistics {
  
  @scala.inline
  def apply(): UnmarshalledServiceStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledServiceStatistics]
  }
  
  @scala.inline
  implicit class UnmarshalledServiceStatisticsOps[Self <: UnmarshalledServiceStatistics] (val x: Self) extends AnyVal {
    
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
    def setErrorStatistics(value: UnmarshalledErrorStatistics): Self = this.set("ErrorStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorStatistics: Self = this.set("ErrorStatistics", js.undefined)
    
    @scala.inline
    def setFaultStatistics(value: UnmarshalledFaultStatistics): Self = this.set("FaultStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaultStatistics: Self = this.set("FaultStatistics", js.undefined)
  }
}

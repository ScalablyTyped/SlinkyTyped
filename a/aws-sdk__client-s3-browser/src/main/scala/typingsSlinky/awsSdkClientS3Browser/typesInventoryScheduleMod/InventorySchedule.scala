package typingsSlinky.awsSdkClientS3Browser.typesInventoryScheduleMod

import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Daily
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Weekly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventorySchedule extends js.Object {
  
  /**
    * <p>Specifies how frequently inventory results are produced.</p>
    */
  var Frequency: Daily | Weekly | String = js.native
}
object InventorySchedule {
  
  @scala.inline
  def apply(Frequency: Daily | Weekly | String): InventorySchedule = {
    val __obj = js.Dynamic.literal(Frequency = Frequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventorySchedule]
  }
  
  @scala.inline
  implicit class InventoryScheduleOps[Self <: InventorySchedule] (val x: Self) extends AnyVal {
    
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
    def setFrequency(value: Daily | Weekly | String): Self = this.set("Frequency", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTimeToLiveOutput extends js.Object {
  
  /**
    * Represents the output of an UpdateTimeToLive operation.
    */
  var TimeToLiveSpecification: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.TimeToLiveSpecification] = js.native
}
object UpdateTimeToLiveOutput {
  
  @scala.inline
  def apply(): UpdateTimeToLiveOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTimeToLiveOutput]
  }
  
  @scala.inline
  implicit class UpdateTimeToLiveOutputOps[Self <: UpdateTimeToLiveOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTimeToLiveSpecification(value: TimeToLiveSpecification): Self = this.set("TimeToLiveSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeToLiveSpecification: Self = this.set("TimeToLiveSpecification", js.undefined)
  }
}

package typingsSlinky.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LambdaOutputDescription extends js.Object {
  
  /**
    * Amazon Resource Name (ARN) of the destination Lambda function.
    */
  var ResourceARN: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.ResourceARN] = js.native
  
  /**
    * ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the destination function.
    */
  var RoleARN: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.RoleARN] = js.native
}
object LambdaOutputDescription {
  
  @scala.inline
  def apply(): LambdaOutputDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaOutputDescription]
  }
  
  @scala.inline
  implicit class LambdaOutputDescriptionOps[Self <: LambdaOutputDescription] (val x: Self) extends AnyVal {
    
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
    def setResourceARN(value: ResourceARN): Self = this.set("ResourceARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceARN: Self = this.set("ResourceARN", js.undefined)
    
    @scala.inline
    def setRoleARN(value: RoleARN): Self = this.set("RoleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleARN: Self = this.set("RoleARN", js.undefined)
  }
}

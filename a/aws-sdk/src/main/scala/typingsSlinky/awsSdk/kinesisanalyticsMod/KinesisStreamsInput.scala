package typingsSlinky.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KinesisStreamsInput extends StObject {
  
  /**
    * ARN of the input Amazon Kinesis stream to read.
    */
  var ResourceARN: typingsSlinky.awsSdk.kinesisanalyticsMod.ResourceARN = js.native
  
  /**
    * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf. You need to grant the necessary permissions to this role.
    */
  var RoleARN: typingsSlinky.awsSdk.kinesisanalyticsMod.RoleARN = js.native
}
object KinesisStreamsInput {
  
  @scala.inline
  def apply(ResourceARN: ResourceARN, RoleARN: RoleARN): KinesisStreamsInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisStreamsInput]
  }
  
  @scala.inline
  implicit class KinesisStreamsInputMutableBuilder[Self <: KinesisStreamsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
  }
}

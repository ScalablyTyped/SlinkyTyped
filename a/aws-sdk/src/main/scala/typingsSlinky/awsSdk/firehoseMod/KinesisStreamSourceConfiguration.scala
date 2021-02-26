package typingsSlinky.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KinesisStreamSourceConfiguration extends StObject {
  
  /**
    * The ARN of the source Kinesis data stream. For more information, see Amazon Kinesis Data Streams ARN Format.
    */
  var KinesisStreamARN: typingsSlinky.awsSdk.firehoseMod.KinesisStreamARN = js.native
  
  /**
    * The ARN of the role that provides access to the source Kinesis data stream. For more information, see AWS Identity and Access Management (IAM) ARN Format.
    */
  var RoleARN: typingsSlinky.awsSdk.firehoseMod.RoleARN = js.native
}
object KinesisStreamSourceConfiguration {
  
  @scala.inline
  def apply(KinesisStreamARN: KinesisStreamARN, RoleARN: RoleARN): KinesisStreamSourceConfiguration = {
    val __obj = js.Dynamic.literal(KinesisStreamARN = KinesisStreamARN.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisStreamSourceConfiguration]
  }
  
  @scala.inline
  implicit class KinesisStreamSourceConfigurationMutableBuilder[Self <: KinesisStreamSourceConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKinesisStreamARN(value: KinesisStreamARN): Self = StObject.set(x, "KinesisStreamARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
  }
}

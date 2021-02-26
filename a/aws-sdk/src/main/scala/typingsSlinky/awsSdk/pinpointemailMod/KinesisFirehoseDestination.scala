package typingsSlinky.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KinesisFirehoseDestination extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon Kinesis Data Firehose stream that Amazon Pinpoint sends email events to.
    */
  var DeliveryStreamArn: AmazonResourceName = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that Amazon Pinpoint uses when sending email events to the Amazon Kinesis Data Firehose stream.
    */
  var IamRoleArn: AmazonResourceName = js.native
}
object KinesisFirehoseDestination {
  
  @scala.inline
  def apply(DeliveryStreamArn: AmazonResourceName, IamRoleArn: AmazonResourceName): KinesisFirehoseDestination = {
    val __obj = js.Dynamic.literal(DeliveryStreamArn = DeliveryStreamArn.asInstanceOf[js.Any], IamRoleArn = IamRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisFirehoseDestination]
  }
  
  @scala.inline
  implicit class KinesisFirehoseDestinationMutableBuilder[Self <: KinesisFirehoseDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliveryStreamArn(value: AmazonResourceName): Self = StObject.set(x, "DeliveryStreamArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamRoleArn(value: AmazonResourceName): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
  }
}

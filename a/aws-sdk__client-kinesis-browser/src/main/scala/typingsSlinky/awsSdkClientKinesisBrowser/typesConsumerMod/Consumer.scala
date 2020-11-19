package typingsSlinky.awsSdkClientKinesisBrowser.typesConsumerMod

import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ACTIVE
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.CREATING
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.DELETING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Consumer extends js.Object {
  
  /**
    * <p>When you register a consumer, Kinesis Data Streams generates an ARN for it. You need this ARN to be able to call <a>SubscribeToShard</a>.</p> <p>If you delete a consumer and then create a new one with the same name, it won't have the same ARN. That's because consumer ARNs contain the creation timestamp. This is important to keep in mind if you have IAM policies that reference consumer ARNs.</p>
    */
  var ConsumerARN: String = js.native
  
  /**
    * <p/>
    */
  var ConsumerCreationTimestamp: js.Date | String | Double = js.native
  
  /**
    * <p>The name of the consumer is something you choose when you register the consumer.</p>
    */
  var ConsumerName: String = js.native
  
  /**
    * <p>A consumer can't read data while in the <code>CREATING</code> or <code>DELETING</code> states.</p>
    */
  var ConsumerStatus: CREATING | DELETING | ACTIVE | String = js.native
}
object Consumer {
  
  @scala.inline
  def apply(
    ConsumerARN: String,
    ConsumerCreationTimestamp: js.Date | String | Double,
    ConsumerName: String,
    ConsumerStatus: CREATING | DELETING | ACTIVE | String
  ): Consumer = {
    val __obj = js.Dynamic.literal(ConsumerARN = ConsumerARN.asInstanceOf[js.Any], ConsumerCreationTimestamp = ConsumerCreationTimestamp.asInstanceOf[js.Any], ConsumerName = ConsumerName.asInstanceOf[js.Any], ConsumerStatus = ConsumerStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Consumer]
  }
  
  @scala.inline
  implicit class ConsumerOps[Self <: Consumer] (val x: Self) extends AnyVal {
    
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
    def setConsumerARN(value: String): Self = this.set("ConsumerARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerCreationTimestampDate(value: js.Date): Self = this.set("ConsumerCreationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerCreationTimestamp(value: js.Date | String | Double): Self = this.set("ConsumerCreationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerName(value: String): Self = this.set("ConsumerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerStatus(value: CREATING | DELETING | ACTIVE | String): Self = this.set("ConsumerStatus", value.asInstanceOf[js.Any])
  }
}

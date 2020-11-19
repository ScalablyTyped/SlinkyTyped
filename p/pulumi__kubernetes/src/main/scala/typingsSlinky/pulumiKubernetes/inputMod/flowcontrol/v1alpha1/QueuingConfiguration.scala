package typingsSlinky.pulumiKubernetes.inputMod.flowcontrol.v1alpha1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * QueuingConfiguration holds the configuration parameters for queuing
  */
@js.native
trait QueuingConfiguration extends js.Object {
  
  /**
    * `handSize` is a small positive number that configures the shuffle sharding of requests into queues.  When enqueuing a request at this priority level the request's flow identifier (a string pair) is hashed and the hash value is used to shuffle the list of queues and deal a hand of the size specified here.  The request is put into one of the shortest queues in that hand. `handSize` must be no larger than `queues`, and should be significantly smaller (so that a few heavy flows do not saturate most of the queues).  See the user-facing documentation for more extensive guidance on setting this field.  This field has a default value of 8.
    */
  var handSize: js.UndefOr[Input[Double]] = js.native
  
  /**
    * `queueLengthLimit` is the maximum number of requests allowed to be waiting in a given queue of this priority level at a time; excess requests are rejected.  This value must be positive.  If not specified, it will be defaulted to 50.
    */
  var queueLengthLimit: js.UndefOr[Input[Double]] = js.native
  
  /**
    * `queues` is the number of queues for this priority level. The queues exist independently at each apiserver. The value must be positive.  Setting it to 1 effectively precludes shufflesharding and thus makes the distinguisher method of associated flow schemas irrelevant.  This field has a default value of 64.
    */
  var queues: js.UndefOr[Input[Double]] = js.native
}
object QueuingConfiguration {
  
  @scala.inline
  def apply(): QueuingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueuingConfiguration]
  }
  
  @scala.inline
  implicit class QueuingConfigurationOps[Self <: QueuingConfiguration] (val x: Self) extends AnyVal {
    
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
    def setHandSize(value: Input[Double]): Self = this.set("handSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandSize: Self = this.set("handSize", js.undefined)
    
    @scala.inline
    def setQueueLengthLimit(value: Input[Double]): Self = this.set("queueLengthLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueueLengthLimit: Self = this.set("queueLengthLimit", js.undefined)
    
    @scala.inline
    def setQueues(value: Input[Double]): Self = this.set("queues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueues: Self = this.set("queues", js.undefined)
  }
}

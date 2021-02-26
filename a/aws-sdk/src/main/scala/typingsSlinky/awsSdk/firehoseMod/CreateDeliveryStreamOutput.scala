package typingsSlinky.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDeliveryStreamOutput extends StObject {
  
  /**
    * The ARN of the delivery stream.
    */
  var DeliveryStreamARN: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.DeliveryStreamARN] = js.native
}
object CreateDeliveryStreamOutput {
  
  @scala.inline
  def apply(): CreateDeliveryStreamOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDeliveryStreamOutput]
  }
  
  @scala.inline
  implicit class CreateDeliveryStreamOutputMutableBuilder[Self <: CreateDeliveryStreamOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliveryStreamARN(value: DeliveryStreamARN): Self = StObject.set(x, "DeliveryStreamARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryStreamARNUndefined: Self = StObject.set(x, "DeliveryStreamARN", js.undefined)
  }
}

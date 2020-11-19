package typingsSlinky.pulumiAws.inputMod.lambda

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventSourceMappingDestinationConfigOnFailure extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the destination resource.
    */
  var destinationArn: Input[String] = js.native
}
object EventSourceMappingDestinationConfigOnFailure {
  
  @scala.inline
  def apply(destinationArn: Input[String]): EventSourceMappingDestinationConfigOnFailure = {
    val __obj = js.Dynamic.literal(destinationArn = destinationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSourceMappingDestinationConfigOnFailure]
  }
  
  @scala.inline
  implicit class EventSourceMappingDestinationConfigOnFailureOps[Self <: EventSourceMappingDestinationConfigOnFailure] (val x: Self) extends AnyVal {
    
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
    def setDestinationArn(value: Input[String]): Self = this.set("destinationArn", value.asInstanceOf[js.Any])
  }
}

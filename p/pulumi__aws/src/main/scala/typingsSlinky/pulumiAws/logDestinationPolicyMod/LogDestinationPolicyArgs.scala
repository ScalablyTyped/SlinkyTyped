package typingsSlinky.pulumiAws.logDestinationPolicyMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogDestinationPolicyArgs extends js.Object {
  
  /**
    * The policy document. This is a JSON formatted string.
    */
  val accessPolicy: Input[String] = js.native
  
  /**
    * A name for the subscription filter
    */
  val destinationName: Input[String] = js.native
}
object LogDestinationPolicyArgs {
  
  @scala.inline
  def apply(accessPolicy: Input[String], destinationName: Input[String]): LogDestinationPolicyArgs = {
    val __obj = js.Dynamic.literal(accessPolicy = accessPolicy.asInstanceOf[js.Any], destinationName = destinationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogDestinationPolicyArgs]
  }
  
  @scala.inline
  implicit class LogDestinationPolicyArgsOps[Self <: LogDestinationPolicyArgs] (val x: Self) extends AnyVal {
    
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
    def setAccessPolicy(value: Input[String]): Self = this.set("accessPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationName(value: Input[String]): Self = this.set("destinationName", value.asInstanceOf[js.Any])
  }
}

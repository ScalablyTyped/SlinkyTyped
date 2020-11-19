package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateEndpointOutput extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the endpoint.
    */
  var EndpointArn: typingsSlinky.awsSdk.sagemakerMod.EndpointArn = js.native
}
object CreateEndpointOutput {
  
  @scala.inline
  def apply(EndpointArn: EndpointArn): CreateEndpointOutput = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEndpointOutput]
  }
  
  @scala.inline
  implicit class CreateEndpointOutputOps[Self <: CreateEndpointOutput] (val x: Self) extends AnyVal {
    
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
    def setEndpointArn(value: EndpointArn): Self = this.set("EndpointArn", value.asInstanceOf[js.Any])
  }
}

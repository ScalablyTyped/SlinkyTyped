package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEndpointConfigOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the endpoint configuration. 
    */
  var EndpointConfigArn: typingsSlinky.awsSdk.sagemakerMod.EndpointConfigArn = js.native
}

object CreateEndpointConfigOutput {
  @scala.inline
  def apply(EndpointConfigArn: EndpointConfigArn): CreateEndpointConfigOutput = {
    val __obj = js.Dynamic.literal(EndpointConfigArn = EndpointConfigArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEndpointConfigOutput]
  }
  @scala.inline
  implicit class CreateEndpointConfigOutputOps[Self <: CreateEndpointConfigOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpointConfigArn(value: EndpointConfigArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointConfigArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


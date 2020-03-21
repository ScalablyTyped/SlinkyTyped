package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEndpointConfigInput extends js.Object {
  /**
    * The name of the endpoint configuration that you want to delete.
    */
  var EndpointConfigName: typingsSlinky.awsSdk.sagemakerMod.EndpointConfigName = js.native
}

object DeleteEndpointConfigInput {
  @scala.inline
  def apply(EndpointConfigName: EndpointConfigName): DeleteEndpointConfigInput = {
    val __obj = js.Dynamic.literal(EndpointConfigName = EndpointConfigName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteEndpointConfigInput]
  }
}


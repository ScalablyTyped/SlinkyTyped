package typingsSlinky.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEndpointInput extends js.Object {
  /**
    * The name of the new endpoint configuration.
    */
  var EndpointConfigName: typingsSlinky.awsDashSdk.clientsSagemakerMod.EndpointConfigName = js.native
  /**
    * The name of the endpoint whose configuration you want to update.
    */
  var EndpointName: typingsSlinky.awsDashSdk.clientsSagemakerMod.EndpointName = js.native
}

object UpdateEndpointInput {
  @scala.inline
  def apply(EndpointConfigName: EndpointConfigName, EndpointName: EndpointName): UpdateEndpointInput = {
    val __obj = js.Dynamic.literal(EndpointConfigName = EndpointConfigName.asInstanceOf[js.Any], EndpointName = EndpointName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateEndpointInput]
  }
}


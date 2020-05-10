package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConnectorDefinitionRequest extends js.Object {
  /**
    * The ID of the connector definition.
    */
  var ConnectorDefinitionId: string = js.native
}

object GetConnectorDefinitionRequest {
  @scala.inline
  def apply(ConnectorDefinitionId: string): GetConnectorDefinitionRequest = {
    val __obj = js.Dynamic.literal(ConnectorDefinitionId = ConnectorDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectorDefinitionRequest]
  }
  @scala.inline
  implicit class GetConnectorDefinitionRequestOps[Self <: GetConnectorDefinitionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectorDefinitionId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectorDefinitionId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


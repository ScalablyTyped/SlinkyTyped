package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyClientPropertiesRequest extends js.Object {
  /**
    * Information about the Amazon WorkSpaces client.
    */
  var ClientProperties: typingsSlinky.awsSdk.workspacesMod.ClientProperties = js.native
  /**
    * The resource identifiers, in the form of directory IDs.
    */
  var ResourceId: NonEmptyString = js.native
}

object ModifyClientPropertiesRequest {
  @scala.inline
  def apply(ClientProperties: ClientProperties, ResourceId: NonEmptyString): ModifyClientPropertiesRequest = {
    val __obj = js.Dynamic.literal(ClientProperties = ClientProperties.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClientPropertiesRequest]
  }
  @scala.inline
  implicit class ModifyClientPropertiesRequestOps[Self <: ModifyClientPropertiesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientProperties(value: ClientProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientPropertiesResult extends js.Object {
  /**
    * Information about the Amazon WorkSpaces client.
    */
  var ClientProperties: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.ClientProperties] = js.native
  /**
    * The resource identifier, in the form of a directory ID.
    */
  var ResourceId: js.UndefOr[NonEmptyString] = js.native
}

object ClientPropertiesResult {
  @scala.inline
  def apply(): ClientPropertiesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientPropertiesResult]
  }
  @scala.inline
  implicit class ClientPropertiesResultOps[Self <: ClientPropertiesResult] (val x: Self) extends AnyVal {
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
    def withoutClientProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(js.undefined)
        ret
    }
  }
  
}


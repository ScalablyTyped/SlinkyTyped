package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientProperties extends js.Object {
  /**
    * Specifies whether users can cache their credentials on the Amazon WorkSpaces client. When enabled, users can choose to reconnect to their WorkSpaces without re-entering their credentials. 
    */
  var ReconnectEnabled: js.UndefOr[ReconnectEnum] = js.native
}

object ClientProperties {
  @scala.inline
  def apply(): ClientProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientProperties]
  }
  @scala.inline
  implicit class ClientPropertiesOps[Self <: ClientProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReconnectEnabled(value: ReconnectEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReconnectEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconnectEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReconnectEnabled")(js.undefined)
        ret
    }
  }
  
}


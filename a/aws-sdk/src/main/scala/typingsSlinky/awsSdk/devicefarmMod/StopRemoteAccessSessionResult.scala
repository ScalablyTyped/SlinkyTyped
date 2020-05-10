package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopRemoteAccessSessionResult extends js.Object {
  /**
    * A container that represents the metadata from the service about the remote access session you are stopping.
    */
  var remoteAccessSession: js.UndefOr[RemoteAccessSession] = js.native
}

object StopRemoteAccessSessionResult {
  @scala.inline
  def apply(): StopRemoteAccessSessionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopRemoteAccessSessionResult]
  }
  @scala.inline
  implicit class StopRemoteAccessSessionResultOps[Self <: StopRemoteAccessSessionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemoteAccessSession(value: RemoteAccessSession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteAccessSession")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteAccessSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteAccessSession")(js.undefined)
        ret
    }
  }
  
}


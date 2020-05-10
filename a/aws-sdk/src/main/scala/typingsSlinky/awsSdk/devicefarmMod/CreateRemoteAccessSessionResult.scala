package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRemoteAccessSessionResult extends js.Object {
  /**
    * A container that describes the remote access session when the request to create a remote access session is sent.
    */
  var remoteAccessSession: js.UndefOr[RemoteAccessSession] = js.native
}

object CreateRemoteAccessSessionResult {
  @scala.inline
  def apply(): CreateRemoteAccessSessionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRemoteAccessSessionResult]
  }
  @scala.inline
  implicit class CreateRemoteAccessSessionResultOps[Self <: CreateRemoteAccessSessionResult] (val x: Self) extends AnyVal {
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


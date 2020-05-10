package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRemoteAccessSessionsResult extends js.Object {
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * A container that represents the metadata from the service about each remote access session you are requesting.
    */
  var remoteAccessSessions: js.UndefOr[RemoteAccessSessions] = js.native
}

object ListRemoteAccessSessionsResult {
  @scala.inline
  def apply(): ListRemoteAccessSessionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRemoteAccessSessionsResult]
  }
  @scala.inline
  implicit class ListRemoteAccessSessionsResultOps[Self <: ListRemoteAccessSessionsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: PaginationToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteAccessSessions(value: RemoteAccessSessions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteAccessSessions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteAccessSessions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteAccessSessions")(js.undefined)
        ret
    }
  }
  
}


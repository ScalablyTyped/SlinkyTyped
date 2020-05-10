package typingsSlinky.matrixJsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInviteSignUrl extends js.Object {
  // True to do a room initial sync on the resulting room. If false, the returned Room object will have no current state. Default: true.
  var inviteSignUrl: js.UndefOr[Boolean] = js.native
  var syncRoom: js.UndefOr[Boolean] = js.native
  // If the caller has a keypair 3pid invite, the signing URL is passed in this parameter.
  var viaServers: js.UndefOr[js.Array[String]] = js.native
}

object AnonInviteSignUrl {
  @scala.inline
  def apply(): AnonInviteSignUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonInviteSignUrl]
  }
  @scala.inline
  implicit class AnonInviteSignUrlOps[Self <: AnonInviteSignUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInviteSignUrl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inviteSignUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInviteSignUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inviteSignUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncRoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncRoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncRoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncRoom")(js.undefined)
        ret
    }
    @scala.inline
    def withViaServers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viaServers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViaServers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viaServers")(js.undefined)
        ret
    }
  }
  
}


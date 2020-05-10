package typingsSlinky.gapiClientGames.gapi.client.games

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientGames.AnonAlt
import typingsSlinky.gapiClientGames.AnonLanguage
import typingsSlinky.gapiClientGames.AnonQuotaUser
import typingsSlinky.gapiClientGames.AnonRoomId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoomsResource extends js.Object {
  /** Create a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def create(request: AnonLanguage): Request_[Room] = js.native
  /** Decline an invitation to join a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def decline(request: AnonQuotaUser): Request_[Room] = js.native
  /** Dismiss an invitation to join a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def dismiss(request: AnonRoomId): Request_[Unit] = js.native
  /** Get the data for a room. */
  def get(request: AnonQuotaUser): Request_[Room] = js.native
  /** Join a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def join(request: AnonQuotaUser): Request_[Room] = js.native
  /** Leave a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def leave(request: AnonQuotaUser): Request_[Room] = js.native
  /** Returns invitations to join rooms. */
  def list(request: AnonAlt): Request_[RoomList] = js.native
  /** Updates sent by a client reporting the status of peers in a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def reportStatus(request: AnonQuotaUser): Request_[RoomStatus] = js.native
}

object RoomsResource {
  @scala.inline
  def apply(
    create: AnonLanguage => Request_[Room],
    decline: AnonQuotaUser => Request_[Room],
    dismiss: AnonRoomId => Request_[Unit],
    get: AnonQuotaUser => Request_[Room],
    join: AnonQuotaUser => Request_[Room],
    leave: AnonQuotaUser => Request_[Room],
    list: AnonAlt => Request_[RoomList],
    reportStatus: AnonQuotaUser => Request_[RoomStatus]
  ): RoomsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), decline = js.Any.fromFunction1(decline), dismiss = js.Any.fromFunction1(dismiss), get = js.Any.fromFunction1(get), join = js.Any.fromFunction1(join), leave = js.Any.fromFunction1(leave), list = js.Any.fromFunction1(list), reportStatus = js.Any.fromFunction1(reportStatus))
    __obj.asInstanceOf[RoomsResource]
  }
  @scala.inline
  implicit class RoomsResourceOps[Self <: RoomsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonLanguage => Request_[Room]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDecline(value: AnonQuotaUser => Request_[Room]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decline")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDismiss(value: AnonRoomId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismiss")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonQuotaUser => Request_[Room]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withJoin(value: AnonQuotaUser => Request_[Room]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("join")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLeave(value: AnonQuotaUser => Request_[Room]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonAlt => Request_[RoomList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReportStatus(value: AnonQuotaUser => Request_[RoomStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportStatus")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


package typingsSlinky.agoraRtcSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Statistics of the session connection.
  *
  * If {@link getSessionStats} is called successfully, this interface provides the statistics.
  */
@js.native
trait SessionStats extends js.Object {
  /** Call duration in seconds, represented by an aggregate value. */
  val Duration: js.UndefOr[String] = js.native
  /** Total received bitrate of the stream, in Kbps, represented by an instantaneous value. */
  val RecvBitrate: js.UndefOr[String] = js.native
  /** Total number of bytes received, represented by an aggregate value. */
  val RecvBytes: js.UndefOr[String] = js.native
  /** Total sent bitrate of the stream, in Kbps, represented by an instantaneous value. */
  val SendBitrate: js.UndefOr[String] = js.native
  /** Total number of bytes sent, represented by an aggregate value. */
  val SendBytes: js.UndefOr[String] = js.native
  /**
    * Number of users in the channel.
    *
    * - rtc mode: The number of all users in the channel.
    * - live mode
    *  - If the local user is an audience: The number of hosts in the channel + 1.
    *  - If the user is a host: The number of hosts in the channel.
    */
  val UserCount: js.UndefOr[String] = js.native
}

object SessionStats {
  @scala.inline
  def apply(): SessionStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionStats]
  }
  @scala.inline
  implicit class SessionStatsOps[Self <: SessionStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Duration")(js.undefined)
        ret
    }
    @scala.inline
    def withRecvBitrate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecvBitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecvBitrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecvBitrate")(js.undefined)
        ret
    }
    @scala.inline
    def withRecvBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecvBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecvBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecvBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withSendBitrate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendBitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendBitrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendBitrate")(js.undefined)
        ret
    }
    @scala.inline
    def withSendBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withUserCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserCount")(js.undefined)
        ret
    }
  }
  
}


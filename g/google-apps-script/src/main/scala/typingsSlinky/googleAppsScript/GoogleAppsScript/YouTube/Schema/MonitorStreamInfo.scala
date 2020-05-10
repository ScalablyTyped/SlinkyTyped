package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitorStreamInfo extends js.Object {
  var broadcastStreamDelayMs: js.UndefOr[Double] = js.native
  var embedHtml: js.UndefOr[String] = js.native
  var enableMonitorStream: js.UndefOr[Boolean] = js.native
}

object MonitorStreamInfo {
  @scala.inline
  def apply(): MonitorStreamInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitorStreamInfo]
  }
  @scala.inline
  implicit class MonitorStreamInfoOps[Self <: MonitorStreamInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBroadcastStreamDelayMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcastStreamDelayMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBroadcastStreamDelayMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcastStreamDelayMs")(js.undefined)
        ret
    }
    @scala.inline
    def withEmbedHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embedHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmbedHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embedHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableMonitorStream(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMonitorStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableMonitorStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMonitorStream")(js.undefined)
        ret
    }
  }
  
}


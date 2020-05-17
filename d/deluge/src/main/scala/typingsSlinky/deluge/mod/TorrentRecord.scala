package typingsSlinky.deluge.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.deluge.anon.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TorrentRecord extends js.Object {
  var connected: Boolean = js.native
  var filters: State = js.native
  var stats: DelugeStats = js.native
  var torrents: StringDictionary[Torrent] = js.native
}

object TorrentRecord {
  @scala.inline
  def apply(connected: Boolean, filters: State, stats: DelugeStats, torrents: StringDictionary[Torrent]): TorrentRecord = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], torrents = torrents.asInstanceOf[js.Any])
    __obj.asInstanceOf[TorrentRecord]
  }
  @scala.inline
  implicit class TorrentRecordOps[Self <: TorrentRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilters(value: State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStats(value: DelugeStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTorrents(value: StringDictionary[Torrent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("torrents")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.deluge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Torrent extends js.Object {
  var distributed_copies: Double = js.native
  var download_payload_rate: Double = js.native
  var eta: Double = js.native
  var is_auto_managed: Boolean = js.native
  var max_download_speed: Double = js.native
  var max_upload_speed: Double = js.native
  var name: String = js.native
  var num_peers: Double = js.native
  var num_seeds: Double = js.native
  var progress: Double = js.native
  var queue: Double = js.native
  var ratio: Double = js.native
  var save_path: String = js.native
  var seeds_peers_ratio: Double = js.native
  var state: String = js.native
  var time_added: Double = js.native
  var total_done: Double = js.native
  var total_peers: Double = js.native
  var total_seeds: Double = js.native
  var total_uploaded: Double = js.native
  var total_wanted: Double = js.native
  var tracker_host: String = js.native
  var upload_payload_rate: Double = js.native
}

object Torrent {
  @scala.inline
  def apply(
    distributed_copies: Double,
    download_payload_rate: Double,
    eta: Double,
    is_auto_managed: Boolean,
    max_download_speed: Double,
    max_upload_speed: Double,
    name: String,
    num_peers: Double,
    num_seeds: Double,
    progress: Double,
    queue: Double,
    ratio: Double,
    save_path: String,
    seeds_peers_ratio: Double,
    state: String,
    time_added: Double,
    total_done: Double,
    total_peers: Double,
    total_seeds: Double,
    total_uploaded: Double,
    total_wanted: Double,
    tracker_host: String,
    upload_payload_rate: Double
  ): Torrent = {
    val __obj = js.Dynamic.literal(distributed_copies = distributed_copies.asInstanceOf[js.Any], download_payload_rate = download_payload_rate.asInstanceOf[js.Any], eta = eta.asInstanceOf[js.Any], is_auto_managed = is_auto_managed.asInstanceOf[js.Any], max_download_speed = max_download_speed.asInstanceOf[js.Any], max_upload_speed = max_upload_speed.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], num_peers = num_peers.asInstanceOf[js.Any], num_seeds = num_seeds.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any], save_path = save_path.asInstanceOf[js.Any], seeds_peers_ratio = seeds_peers_ratio.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], time_added = time_added.asInstanceOf[js.Any], total_done = total_done.asInstanceOf[js.Any], total_peers = total_peers.asInstanceOf[js.Any], total_seeds = total_seeds.asInstanceOf[js.Any], total_uploaded = total_uploaded.asInstanceOf[js.Any], total_wanted = total_wanted.asInstanceOf[js.Any], tracker_host = tracker_host.asInstanceOf[js.Any], upload_payload_rate = upload_payload_rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Torrent]
  }
  @scala.inline
  implicit class TorrentOps[Self <: Torrent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistributed_copies(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distributed_copies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownload_payload_rate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download_payload_rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_auto_managed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_auto_managed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax_download_speed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_download_speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax_upload_speed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_upload_speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNum_peers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_peers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNum_seeds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_seeds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSave_path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeeds_peers_ratio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seeds_peers_ratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime_added(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time_added")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_done(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_done")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_peers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_peers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_seeds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_seeds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_uploaded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_uploaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_wanted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_wanted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTracker_host(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracker_host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpload_payload_rate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload_payload_rate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.deluge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DelugeStats extends js.Object {
  var dht_nodes: Double = js.native
  var download_protocol_rate: Double = js.native
  var download_rate: Double = js.native
  var free_space: Double = js.native
  var has_incoming_connections: Boolean = js.native
  var max_download: Double = js.native
  var max_num_connections: Double = js.native
  var max_upload: Double = js.native
  var num_connections: Double = js.native
  var upload_protocol_rate: Double = js.native
  var upload_rate: Double = js.native
}

object DelugeStats {
  @scala.inline
  def apply(
    dht_nodes: Double,
    download_protocol_rate: Double,
    download_rate: Double,
    free_space: Double,
    has_incoming_connections: Boolean,
    max_download: Double,
    max_num_connections: Double,
    max_upload: Double,
    num_connections: Double,
    upload_protocol_rate: Double,
    upload_rate: Double
  ): DelugeStats = {
    val __obj = js.Dynamic.literal(dht_nodes = dht_nodes.asInstanceOf[js.Any], download_protocol_rate = download_protocol_rate.asInstanceOf[js.Any], download_rate = download_rate.asInstanceOf[js.Any], free_space = free_space.asInstanceOf[js.Any], has_incoming_connections = has_incoming_connections.asInstanceOf[js.Any], max_download = max_download.asInstanceOf[js.Any], max_num_connections = max_num_connections.asInstanceOf[js.Any], max_upload = max_upload.asInstanceOf[js.Any], num_connections = num_connections.asInstanceOf[js.Any], upload_protocol_rate = upload_protocol_rate.asInstanceOf[js.Any], upload_rate = upload_rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelugeStats]
  }
  @scala.inline
  implicit class DelugeStatsOps[Self <: DelugeStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDht_nodes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dht_nodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownload_protocol_rate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download_protocol_rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownload_rate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download_rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFree_space(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("free_space")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_incoming_connections(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_incoming_connections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax_download(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_download")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax_num_connections(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_num_connections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax_upload(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_upload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNum_connections(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_connections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpload_protocol_rate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload_protocol_rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpload_rate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload_rate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.redisInfo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stats extends js.Object {
  var active_defrag_hits: String = js.native
  var active_defrag_key_hits: String = js.native
  var active_defrag_key_misses: String = js.native
  var active_defrag_misses: String = js.native
  var evicted_keys: String = js.native
  var expired_keys: String = js.native
  var expired_stale_perc: String = js.native
  var expired_time_cap_reached_count: String = js.native
  var instantaneous_input_kbps: String = js.native
  var instantaneous_ops_per_sec: String = js.native
  var instantaneous_output_kbps: String = js.native
  var keyspace_hits: String = js.native
  var keyspace_misses: String = js.native
  var latest_fork_usec: String = js.native
  var migrate_cached_sockets: String = js.native
  var pubsub_channels: String = js.native
  var pubsub_patterns: String = js.native
  var rejected_connections: String = js.native
  var slave_expires_tracked_keys: String = js.native
  var sync_full: String = js.native
  var sync_partial_err: String = js.native
  var sync_partial_ok: String = js.native
  var total_commands_processed: String = js.native
  var total_connections_received: String = js.native
  var total_net_input_bytes: String = js.native
  var total_net_output_bytes: String = js.native
}

object Stats {
  @scala.inline
  def apply(
    active_defrag_hits: String,
    active_defrag_key_hits: String,
    active_defrag_key_misses: String,
    active_defrag_misses: String,
    evicted_keys: String,
    expired_keys: String,
    expired_stale_perc: String,
    expired_time_cap_reached_count: String,
    instantaneous_input_kbps: String,
    instantaneous_ops_per_sec: String,
    instantaneous_output_kbps: String,
    keyspace_hits: String,
    keyspace_misses: String,
    latest_fork_usec: String,
    migrate_cached_sockets: String,
    pubsub_channels: String,
    pubsub_patterns: String,
    rejected_connections: String,
    slave_expires_tracked_keys: String,
    sync_full: String,
    sync_partial_err: String,
    sync_partial_ok: String,
    total_commands_processed: String,
    total_connections_received: String,
    total_net_input_bytes: String,
    total_net_output_bytes: String
  ): Stats = {
    val __obj = js.Dynamic.literal(active_defrag_hits = active_defrag_hits.asInstanceOf[js.Any], active_defrag_key_hits = active_defrag_key_hits.asInstanceOf[js.Any], active_defrag_key_misses = active_defrag_key_misses.asInstanceOf[js.Any], active_defrag_misses = active_defrag_misses.asInstanceOf[js.Any], evicted_keys = evicted_keys.asInstanceOf[js.Any], expired_keys = expired_keys.asInstanceOf[js.Any], expired_stale_perc = expired_stale_perc.asInstanceOf[js.Any], expired_time_cap_reached_count = expired_time_cap_reached_count.asInstanceOf[js.Any], instantaneous_input_kbps = instantaneous_input_kbps.asInstanceOf[js.Any], instantaneous_ops_per_sec = instantaneous_ops_per_sec.asInstanceOf[js.Any], instantaneous_output_kbps = instantaneous_output_kbps.asInstanceOf[js.Any], keyspace_hits = keyspace_hits.asInstanceOf[js.Any], keyspace_misses = keyspace_misses.asInstanceOf[js.Any], latest_fork_usec = latest_fork_usec.asInstanceOf[js.Any], migrate_cached_sockets = migrate_cached_sockets.asInstanceOf[js.Any], pubsub_channels = pubsub_channels.asInstanceOf[js.Any], pubsub_patterns = pubsub_patterns.asInstanceOf[js.Any], rejected_connections = rejected_connections.asInstanceOf[js.Any], slave_expires_tracked_keys = slave_expires_tracked_keys.asInstanceOf[js.Any], sync_full = sync_full.asInstanceOf[js.Any], sync_partial_err = sync_partial_err.asInstanceOf[js.Any], sync_partial_ok = sync_partial_ok.asInstanceOf[js.Any], total_commands_processed = total_commands_processed.asInstanceOf[js.Any], total_connections_received = total_connections_received.asInstanceOf[js.Any], total_net_input_bytes = total_net_input_bytes.asInstanceOf[js.Any], total_net_output_bytes = total_net_output_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
  @scala.inline
  implicit class StatsOps[Self <: Stats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive_defrag_hits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active_defrag_hits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActive_defrag_key_hits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active_defrag_key_hits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActive_defrag_key_misses(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active_defrag_key_misses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActive_defrag_misses(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active_defrag_misses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvicted_keys(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evicted_keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpired_keys(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expired_keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpired_stale_perc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expired_stale_perc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpired_time_cap_reached_count(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expired_time_cap_reached_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstantaneous_input_kbps(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instantaneous_input_kbps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstantaneous_ops_per_sec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instantaneous_ops_per_sec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstantaneous_output_kbps(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instantaneous_output_kbps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyspace_hits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyspace_hits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyspace_misses(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyspace_misses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatest_fork_usec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latest_fork_usec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMigrate_cached_sockets(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrate_cached_sockets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPubsub_channels(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubsub_channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPubsub_patterns(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubsub_patterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRejected_connections(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejected_connections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlave_expires_tracked_keys(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slave_expires_tracked_keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSync_full(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync_full")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSync_partial_err(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync_partial_err")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSync_partial_ok(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync_partial_ok")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_commands_processed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_commands_processed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_connections_received(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_connections_received")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_net_input_bytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_net_input_bytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_net_output_bytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_net_output_bytes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


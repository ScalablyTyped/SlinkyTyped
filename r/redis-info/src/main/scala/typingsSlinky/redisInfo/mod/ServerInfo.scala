package typingsSlinky.redisInfo.mod

import typingsSlinky.redisInfo.redisInfoStrings.`32`
import typingsSlinky.redisInfo.redisInfoStrings.`64`
import typingsSlinky.redisInfo.redisInfoStrings.cluster
import typingsSlinky.redisInfo.redisInfoStrings.sentinel
import typingsSlinky.redisInfo.redisInfoStrings.standalone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerInfo extends js.Object {
  var arch_bits: `32` | `64` = js.native
  var atomicvar_api: String = js.native
  var config_file: String = js.native
  var executable: String = js.native
  var gcc_version: String = js.native
  var hz: String = js.native
  var lru_clock: String = js.native
  var multiplexing_api: String = js.native
  var os: String = js.native
  var process_id: String = js.native
  var redis_build_id: String = js.native
  var redis_git_dirty: Flag = js.native
  var redis_git_sha1: String = js.native
  var redis_mode: standalone | sentinel | cluster = js.native
  var redis_version: String = js.native
  var run_id: String = js.native
  var tcp_port: String = js.native
  var uptime_in_days: String = js.native
  var uptime_in_seconds: String = js.native
}

object ServerInfo {
  @scala.inline
  def apply(
    arch_bits: `32` | `64`,
    atomicvar_api: String,
    config_file: String,
    executable: String,
    gcc_version: String,
    hz: String,
    lru_clock: String,
    multiplexing_api: String,
    os: String,
    process_id: String,
    redis_build_id: String,
    redis_git_dirty: Flag,
    redis_git_sha1: String,
    redis_mode: standalone | sentinel | cluster,
    redis_version: String,
    run_id: String,
    tcp_port: String,
    uptime_in_days: String,
    uptime_in_seconds: String
  ): ServerInfo = {
    val __obj = js.Dynamic.literal(arch_bits = arch_bits.asInstanceOf[js.Any], atomicvar_api = atomicvar_api.asInstanceOf[js.Any], config_file = config_file.asInstanceOf[js.Any], executable = executable.asInstanceOf[js.Any], gcc_version = gcc_version.asInstanceOf[js.Any], hz = hz.asInstanceOf[js.Any], lru_clock = lru_clock.asInstanceOf[js.Any], multiplexing_api = multiplexing_api.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], process_id = process_id.asInstanceOf[js.Any], redis_build_id = redis_build_id.asInstanceOf[js.Any], redis_git_dirty = redis_git_dirty.asInstanceOf[js.Any], redis_git_sha1 = redis_git_sha1.asInstanceOf[js.Any], redis_mode = redis_mode.asInstanceOf[js.Any], redis_version = redis_version.asInstanceOf[js.Any], run_id = run_id.asInstanceOf[js.Any], tcp_port = tcp_port.asInstanceOf[js.Any], uptime_in_days = uptime_in_days.asInstanceOf[js.Any], uptime_in_seconds = uptime_in_seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerInfo]
  }
  @scala.inline
  implicit class ServerInfoOps[Self <: ServerInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArch_bits(value: `32` | `64`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arch_bits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAtomicvar_api(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atomicvar_api")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfig_file(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config_file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecutable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGcc_version(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcc_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHz(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLru_clock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lru_clock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiplexing_api(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiplexing_api")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcess_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("process_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedis_build_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redis_build_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedis_git_dirty(value: Flag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redis_git_dirty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedis_git_sha1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redis_git_sha1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedis_mode(value: standalone | sentinel | cluster): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redis_mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedis_version(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redis_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRun_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTcp_port(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcp_port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUptime_in_days(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uptime_in_days")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUptime_in_seconds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uptime_in_seconds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


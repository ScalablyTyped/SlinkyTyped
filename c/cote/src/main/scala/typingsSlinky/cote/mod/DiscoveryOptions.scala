package typingsSlinky.cote.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiscoveryOptions extends js.Object {
  /**
    * Address to bind to.
    */
  var address: js.UndefOr[String] = js.native
  /**
    * Broadcast address if using broadcast.
    */
  var broadcast: js.UndefOr[String] = js.native
  /**
    * How often to to check for missing nodes in milliseconds.
    */
  var checkInterval: js.UndefOr[Double] = js.native
  /**
    * Prevents Monitor from drawing.
    */
  var disableScreen: js.UndefOr[Boolean] = js.native
  /**
    * How often to broadcast a hello packet in milliseconds.
    */
  var helloInterval: js.UndefOr[Double] = js.native
  /**
    * Notifies when another service goes online.
    */
  var helloLogsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Ignores messages from other services within the same process.
    */
  var ignoreProcess: js.UndefOr[Boolean] = js.native
  /**
    * If false, disables `helloLogsEnabled` and `statusLogsEnabled` no matter
    * what value they have, and also own hello log.
    */
  var log: js.UndefOr[Boolean] = js.native
  /**
    * Consider a master node dead if not seen in this many milliseconds.
    */
  var masterTimeout: js.UndefOr[Double] = js.native
  /**
    * Skips key equality checks when logging.
    */
  var monitor: js.UndefOr[Boolean] = js.native
  /**
    * Multicast address if using multicast.
    */
  var multicast: js.UndefOr[String] = js.native
  /**
    * Consider a node dead if not seen in this many milliseconds.
    */
  var nodeTimeout: js.UndefOr[Double] = js.native
  /**
    * Milliseconds between emissions of own status for monitoring.
    */
  var statusInterval: js.UndefOr[Double] = js.native
  /**
    * Notifies when another service goes online or offline. If false, disables
    * `helloLogsEnabled` as well.
    */
  var statusLogsEnabled: js.UndefOr[Boolean] = js.native
}

object DiscoveryOptions {
  @scala.inline
  def apply(): DiscoveryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiscoveryOptions]
  }
  @scala.inline
  implicit class DiscoveryOptionsOps[Self <: DiscoveryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
    @scala.inline
    def withBroadcast(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBroadcast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcast")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableScreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withHelloInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helloInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelloInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helloInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withHelloLogsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helloLogsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelloLogsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helloLogsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreProcess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreProcess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreProcess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreProcess")(js.undefined)
        ret
    }
    @scala.inline
    def withLog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withMonitor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitor")(js.undefined)
        ret
    }
    @scala.inline
    def withMulticast(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multicast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMulticast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multicast")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusLogsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusLogsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusLogsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusLogsEnabled")(js.undefined)
        ret
    }
  }
  
}


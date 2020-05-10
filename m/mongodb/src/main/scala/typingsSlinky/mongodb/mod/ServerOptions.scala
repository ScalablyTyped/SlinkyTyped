package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerOptions extends SSLOptions {
  /**
    * @default false
    */
  var domainsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Specify a file sync write concern
    * @default false
    */
  var fsync: js.UndefOr[Boolean] = js.native
  /**
    * The High availability period for replicaset inquiry
    * @default 10000
    */
  var haInterval: js.UndefOr[scala.Double] = js.native
  /**
    * Enable command monitoring for this client
    * @default false
    */
  var monitorCommands: js.UndefOr[Boolean] = js.native
  /**
    * @default true
    */
  var monitoring: js.UndefOr[Boolean] = js.native
  /**
    * Will wait # milliseconds between retries
    * @default 1000
    */
  var reconnectInterval: js.UndefOr[scala.Double] = js.native
  /**
    * If you're connected to a single server or mongos proxy (as opposed to a replica set),
    * the MongoDB driver will try to reconnect every reconnectInterval milliseconds for reconnectTries
    * times, and give up afterward. When the driver gives up, the mongoose connection emits a
    * reconnectFailed event.
    * @default 30
    */
  var reconnectTries: js.UndefOr[scala.Double] = js.native
  /**
    * Socket Options
    */
  var socketOptions: js.UndefOr[SocketOptions] = js.native
}

object ServerOptions {
  @scala.inline
  def apply(): ServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptions]
  }
  @scala.inline
  implicit class ServerOptionsOps[Self <: ServerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fsync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fsync")(js.undefined)
        ret
    }
    @scala.inline
    def withHaInterval(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("haInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHaInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("haInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withMonitorCommands(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitorCommands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitorCommands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitorCommands")(js.undefined)
        ret
    }
    @scala.inline
    def withMonitoring(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitoring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitoring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitoring")(js.undefined)
        ret
    }
    @scala.inline
    def withReconnectInterval(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconnectInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withReconnectTries(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectTries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconnectTries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectTries")(js.undefined)
        ret
    }
    @scala.inline
    def withSocketOptions(value: SocketOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocketOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketOptions")(js.undefined)
        ret
    }
  }
  
}


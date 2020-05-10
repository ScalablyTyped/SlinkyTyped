package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplSetOptions
  extends SSLOptions
     with HighAvailabilityOptions {
  var connectWithNoPrimary: js.UndefOr[Boolean] = js.native
  /**
    * The max staleness to secondary reads (values under 10 seconds cannot be guaranteed);
    */
  var maxStalenessSeconds: js.UndefOr[scala.Double] = js.native
  /**
    * The name of the replicaset to connect to.
    */
  var replicaSet: js.UndefOr[String] = js.native
  /**
    * Default: 15 ; Range of servers to pick when using NEAREST (lowest ping ms + the latency fence, ex: range of 1 to (1 + 15) ms)
    */
  var secondaryAcceptableLatencyMS: js.UndefOr[scala.Double] = js.native
  var socketOptions: js.UndefOr[SocketOptions] = js.native
}

object ReplSetOptions {
  @scala.inline
  def apply(): ReplSetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplSetOptions]
  }
  @scala.inline
  implicit class ReplSetOptionsOps[Self <: ReplSetOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectWithNoPrimary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectWithNoPrimary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectWithNoPrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectWithNoPrimary")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxStalenessSeconds(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxStalenessSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxStalenessSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxStalenessSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicaSet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicaSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicaSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicaSet")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryAcceptableLatencyMS(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryAcceptableLatencyMS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryAcceptableLatencyMS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryAcceptableLatencyMS")(js.undefined)
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


package typingsSlinky.ioredis.mod

import typingsSlinky.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterOptions extends js.Object {
  var clusterRetryStrategy: js.UndefOr[
    js.Function2[/* times */ Double, /* reason */ js.UndefOr[js.Error], Double | Null]
  ] = js.native
  var dnsLookup: js.UndefOr[DNSLookupFunction] = js.native
  var enableOfflineQueue: js.UndefOr[Boolean] = js.native
  var enableReadyCheck: js.UndefOr[Boolean] = js.native
  var lazyConnect: js.UndefOr[Boolean] = js.native
  var maxRedirections: js.UndefOr[Double] = js.native
  var natMap: js.UndefOr[NatMap] = js.native
  var redisOptions: js.UndefOr[RedisOptions] = js.native
  var retryDelayOnClusterDown: js.UndefOr[Double] = js.native
  var retryDelayOnFailover: js.UndefOr[Double] = js.native
  var retryDelayOnTryAgain: js.UndefOr[Double] = js.native
  var scaleReads: js.UndefOr[String] = js.native
  var slotsRefreshInterval: js.UndefOr[Double] = js.native
  var slotsRefreshTimeout: js.UndefOr[Double] = js.native
}

object ClusterOptions {
  @scala.inline
  def apply(): ClusterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterOptions]
  }
  @scala.inline
  implicit class ClusterOptionsOps[Self <: ClusterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterRetryStrategy(value: (/* times */ Double, /* reason */ js.UndefOr[js.Error]) => Double | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterRetryStrategy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutClusterRetryStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterRetryStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withDnsLookup(
      value: (/* hostname */ String, /* callback */ js.Function3[/* err */ ErrnoException, /* address */ String, /* family */ Double, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsLookup")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDnsLookup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsLookup")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableOfflineQueue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableOfflineQueue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableOfflineQueue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableOfflineQueue")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableReadyCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableReadyCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableReadyCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableReadyCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withLazyConnect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyConnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazyConnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyConnect")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRedirections(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRedirections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRedirections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRedirections")(js.undefined)
        ret
    }
    @scala.inline
    def withNatMap(value: NatMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("natMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNatMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("natMap")(js.undefined)
        ret
    }
    @scala.inline
    def withRedisOptions(value: RedisOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redisOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedisOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redisOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryDelayOnClusterDown(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryDelayOnClusterDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryDelayOnClusterDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryDelayOnClusterDown")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryDelayOnFailover(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryDelayOnFailover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryDelayOnFailover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryDelayOnFailover")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryDelayOnTryAgain(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryDelayOnTryAgain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryDelayOnTryAgain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryDelayOnTryAgain")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleReads(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleReads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleReads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleReads")(js.undefined)
        ret
    }
    @scala.inline
    def withSlotsRefreshInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotsRefreshInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlotsRefreshInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotsRefreshInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withSlotsRefreshTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotsRefreshTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlotsRefreshTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotsRefreshTimeout")(js.undefined)
        ret
    }
  }
  
}


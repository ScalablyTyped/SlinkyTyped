package typingsSlinky.cassandraDriver

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCoreConnectionsPerHost extends js.Object {
  var coreConnectionsPerHost: js.UndefOr[NumberDictionary[Double]] = js.native
  var heartBeatInterval: js.UndefOr[Double] = js.native
  var maxRequestsPerConnection: js.UndefOr[Double] = js.native
  var warmup: js.UndefOr[Boolean] = js.native
}

object AnonCoreConnectionsPerHost {
  @scala.inline
  def apply(): AnonCoreConnectionsPerHost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCoreConnectionsPerHost]
  }
  @scala.inline
  implicit class AnonCoreConnectionsPerHostOps[Self <: AnonCoreConnectionsPerHost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoreConnectionsPerHost(value: NumberDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coreConnectionsPerHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoreConnectionsPerHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coreConnectionsPerHost")(js.undefined)
        ret
    }
    @scala.inline
    def withHeartBeatInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartBeatInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeartBeatInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartBeatInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRequestsPerConnection(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRequestsPerConnection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRequestsPerConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRequestsPerConnection")(js.undefined)
        ret
    }
    @scala.inline
    def withWarmup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warmup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarmup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warmup")(js.undefined)
        ret
    }
  }
  
}


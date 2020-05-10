package typingsSlinky.cassandraDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCoalescingThreshold extends js.Object {
  var coalescingThreshold: js.UndefOr[Double] = js.native
  var connectTimeout: js.UndefOr[Double] = js.native
  var defunctReadTimeoutThreshold: js.UndefOr[Double] = js.native
  var keepAlive: js.UndefOr[Boolean] = js.native
  var keepAliveDelay: js.UndefOr[Double] = js.native
  var readTimeout: js.UndefOr[Double] = js.native
  var tcpNoDelay: js.UndefOr[Boolean] = js.native
}

object AnonCoalescingThreshold {
  @scala.inline
  def apply(): AnonCoalescingThreshold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCoalescingThreshold]
  }
  @scala.inline
  implicit class AnonCoalescingThresholdOps[Self <: AnonCoalescingThreshold] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoalescingThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coalescingThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoalescingThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coalescingThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withDefunctReadTimeoutThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defunctReadTimeoutThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefunctReadTimeoutThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defunctReadTimeoutThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepAlive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAlive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepAlive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAlive")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepAliveDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAliveDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepAliveDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAliveDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withReadTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTcpNoDelay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcpNoDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTcpNoDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcpNoDelay")(js.undefined)
        ret
    }
  }
  
}


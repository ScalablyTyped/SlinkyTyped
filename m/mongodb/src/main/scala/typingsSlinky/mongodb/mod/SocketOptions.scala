package typingsSlinky.mongodb.mod

import typingsSlinky.mongodb.mongodbNumbers.`4`
import typingsSlinky.mongodb.mongodbNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocketOptions extends js.Object {
  /**
    * Reconnect on error. default:false
    */
  var autoReconnect: js.UndefOr[Boolean] = js.native
  /**
    * TCP Connection timeout setting. default 0
    */
  var connectTimeoutMS: js.UndefOr[scala.Double] = js.native
  /**
    * Version of IP stack. Can be 4, 6 or null. default: null.
    *
    * If null, will attempt to connect with IPv6, and will fall back to IPv4 on failure
    * refer to http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html
    */
  var family: js.UndefOr[`4` | `6` | Null] = js.native
  /**
    * TCP KeepAlive enabled on the socket. default:true
    */
  var keepAlive: js.UndefOr[Boolean] = js.native
  /**
    * TCP KeepAlive initial delay before sending first keep-alive packet when idle. default:300000
    */
  var keepAliveInitialDelay: js.UndefOr[scala.Double] = js.native
  /**
    * TCP Socket NoDelay option. default:true
    */
  var noDelay: js.UndefOr[Boolean] = js.native
  /**
    * TCP Socket timeout setting. default 0
    */
  var socketTimeoutMS: js.UndefOr[scala.Double] = js.native
}

object SocketOptions {
  @scala.inline
  def apply(): SocketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocketOptions]
  }
  @scala.inline
  implicit class SocketOptionsOps[Self <: SocketOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoReconnect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoReconnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoReconnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoReconnect")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectTimeoutMS(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectTimeoutMS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectTimeoutMS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectTimeoutMS")(js.undefined)
        ret
    }
    @scala.inline
    def withFamily(value: `4` | `6`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(js.undefined)
        ret
    }
    @scala.inline
    def withFamilyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(null)
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
    def withKeepAliveInitialDelay(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAliveInitialDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepAliveInitialDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAliveInitialDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withNoDelay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withSocketTimeoutMS(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketTimeoutMS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocketTimeoutMS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketTimeoutMS")(js.undefined)
        ret
    }
  }
  
}


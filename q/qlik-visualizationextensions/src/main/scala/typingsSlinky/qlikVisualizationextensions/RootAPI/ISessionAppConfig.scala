package typingsSlinky.qlikVisualizationextensions.RootAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISessionAppConfig extends js.Object {
  /**
    * Optional Qlik host.
    */
  var host: js.UndefOr[String] = js.native
  /**
    * Optional. Unique identity for the session. If omitted, the session will be shared.
    */
  var identity: String = js.native
  /**
    * Optional. Use SSL.
    */
  var isSecure: Boolean = js.native
  /**
    * Optional. Open app without loading data.
    */
  var openWithoutData: Boolean = js.native
  /**
    * Port number.
    */
  var port: String | Double = js.native
  /**
    * Optional. Qlik virtual proxy. "/" if no proxy.
    */
  var prefix: String = js.native
}

object ISessionAppConfig {
  @scala.inline
  def apply(
    identity: String,
    isSecure: Boolean,
    openWithoutData: Boolean,
    port: String | Double,
    prefix: String
  ): ISessionAppConfig = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], isSecure = isSecure.asInstanceOf[js.Any], openWithoutData = openWithoutData.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISessionAppConfig]
  }
  @scala.inline
  implicit class ISessionAppConfigOps[Self <: ISessionAppConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSecure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenWithoutData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openWithoutData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
  }
  
}


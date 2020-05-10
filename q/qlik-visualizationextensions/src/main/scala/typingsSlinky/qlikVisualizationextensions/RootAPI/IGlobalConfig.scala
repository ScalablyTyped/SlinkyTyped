package typingsSlinky.qlikVisualizationextensions.RootAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGlobalConfig extends js.Object {
  /**
    * Qlik Sense host
    */
  var host: String = js.native
  /**
    * Unique identity for the session. If omitted, the session will be shared.
    */
  var identity: String = js.native
  /**
    * Use SSL
    */
  var isSecure: Boolean = js.native
  /**
    * Port number
    */
  var port: String = js.native
  /**
    * Qlik Sense virtual proxy. / if no virtual proxy
    */
  var prefix: String = js.native
}

object IGlobalConfig {
  @scala.inline
  def apply(host: String, identity: String, isSecure: Boolean, port: String, prefix: String): IGlobalConfig = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], isSecure = isSecure.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGlobalConfig]
  }
  @scala.inline
  implicit class IGlobalConfigOps[Self <: IGlobalConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withPort(value: String): Self = {
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
  }
  
}


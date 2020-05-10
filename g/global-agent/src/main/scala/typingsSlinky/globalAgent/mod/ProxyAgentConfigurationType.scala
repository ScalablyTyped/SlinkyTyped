package typingsSlinky.globalAgent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyAgentConfigurationType extends js.Object {
  val HTTPS_PROXY: String | Null = js.native
  val HTTP_PROXY: String | Null = js.native
  val NO_PROXY: String | Null = js.native
}

object ProxyAgentConfigurationType {
  @scala.inline
  def apply(): ProxyAgentConfigurationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyAgentConfigurationType]
  }
  @scala.inline
  implicit class ProxyAgentConfigurationTypeOps[Self <: ProxyAgentConfigurationType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHTTPS_PROXY(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTTPS_PROXY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHTTPS_PROXYNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTTPS_PROXY")(null)
        ret
    }
    @scala.inline
    def withHTTP_PROXY(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTTP_PROXY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHTTP_PROXYNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTTP_PROXY")(null)
        ret
    }
    @scala.inline
    def withNO_PROXY(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NO_PROXY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNO_PROXYNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NO_PROXY")(null)
        ret
    }
  }
  
}


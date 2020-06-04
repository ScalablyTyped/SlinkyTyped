package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /**
    * The URL associated with the PAC file.
    */
  var pacScript: String
  /**
    * Rules indicating which URLs should bypass the proxy settings.
    */
  var proxyBypassRules: String
  /**
    * Rules indicating which proxies to use.
    */
  var proxyRules: String
}

object Config {
  @scala.inline
  def apply(pacScript: String, proxyBypassRules: String, proxyRules: String): Config = {
    val __obj = js.Dynamic.literal(pacScript = pacScript.asInstanceOf[js.Any], proxyBypassRules = proxyBypassRules.asInstanceOf[js.Any], proxyRules = proxyRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPacScript(value: String): Self = this.set("pacScript", value.asInstanceOf[js.Any])
    @scala.inline
    def setProxyBypassRules(value: String): Self = this.set("proxyBypassRules", value.asInstanceOf[js.Any])
    @scala.inline
    def setProxyRules(value: String): Self = this.set("proxyRules", value.asInstanceOf[js.Any])
  }
  
}


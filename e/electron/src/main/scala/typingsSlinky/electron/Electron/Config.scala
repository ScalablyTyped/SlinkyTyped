package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  /**
    * The URL associated with the PAC file.
    */
  var pacScript: String = js.native
  /**
    * Rules indicating which URLs should bypass the proxy settings.
    */
  var proxyBypassRules: String = js.native
  /**
    * Rules indicating which proxies to use.
    */
  var proxyRules: String = js.native
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
    def withPacScript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pacScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProxyBypassRules(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyBypassRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProxyRules(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyRules")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


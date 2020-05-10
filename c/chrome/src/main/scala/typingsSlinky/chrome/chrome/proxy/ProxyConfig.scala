package typingsSlinky.chrome.chrome.proxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyConfig extends js.Object {
  /**
    * 'direct' = Never use a proxy
    * 'auto_detect' = Auto detect proxy settings
    * 'pac_script' = Use specified PAC script
    * 'fixed_servers' = Manually specify proxy servers
    * 'system' = Use system proxy settings
    */
  var mode: String = js.native
  /** Optional. The proxy auto-config (PAC) script for this configuration. Use this for 'pac_script' mode. */
  var pacScript: js.UndefOr[PacScript] = js.native
  /** Optional. The proxy rules describing this configuration. Use this for 'fixed_servers' mode. */
  var rules: js.UndefOr[ProxyRules] = js.native
}

object ProxyConfig {
  @scala.inline
  def apply(mode: String): ProxyConfig = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyConfig]
  }
  @scala.inline
  implicit class ProxyConfigOps[Self <: ProxyConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPacScript(value: PacScript): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pacScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPacScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pacScript")(js.undefined)
        ret
    }
    @scala.inline
    def withRules(value: ProxyRules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(js.undefined)
        ret
    }
  }
  
}


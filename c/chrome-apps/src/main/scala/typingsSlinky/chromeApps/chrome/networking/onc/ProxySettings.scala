package typingsSlinky.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxySettings[M, S, SL] extends js.Object {
  /** Domains and hosts for which manual proxy settings are excluded. */
  var ExcludeDomains: js.UndefOr[SL] = js.native
  /** Manual proxy settings - used only for *Manual* proxy settings. */
  var Manual: js.UndefOr[ManualProxySettings[M, ProxyLocation | ManagedProxyLocation]] = js.native
  /** URL for proxy auto-configuration file. */
  var PAC: js.UndefOr[S] = js.native
  /** The type of proxy settings. */
  var Type: ProxySettingsType | ManagedType[ProxySettingsType] = js.native
}

object ProxySettings {
  @scala.inline
  def apply[M, S, SL](Type: ProxySettingsType | ManagedType[ProxySettingsType]): ProxySettings[M, S, SL] = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxySettings[M, S, SL]]
  }
  @scala.inline
  implicit class ProxySettingsOps[Self[m, s, sl] <: ProxySettings[m, s, sl], M, S, SL] (val x: Self[M, S, SL]) extends AnyVal {
    @scala.inline
    def duplicate: Self[M, S, SL] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[M, S, SL]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[M, S, SL]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[M, S, SL]) with Other]
    @scala.inline
    def withType(value: ProxySettingsType | ManagedType[ProxySettingsType]): Self[M, S, SL] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcludeDomains(value: SL): Self[M, S, SL] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcludeDomains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeDomains: Self[M, S, SL] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcludeDomains")(js.undefined)
        ret
    }
    @scala.inline
    def withManual(value: ManualProxySettings[M, ProxyLocation | ManagedProxyLocation]): Self[M, S, SL] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Manual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManual: Self[M, S, SL] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Manual")(js.undefined)
        ret
    }
    @scala.inline
    def withPAC(value: S): Self[M, S, SL] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PAC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPAC: Self[M, S, SL] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PAC")(js.undefined)
        ret
    }
  }
  
}


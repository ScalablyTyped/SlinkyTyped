package typingsSlinky.angularCommon.upgradeUpgradeMod

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationUpgradeConfig extends js.Object {
  /**
    * Configures the base href when used in client-side rendered applications
    */
  var appBaseHref: js.UndefOr[String] = js.native
  /**
    * Configures the hash prefix used in the URL when using the `HashLocationStrategy`
    */
  var hashPrefix: js.UndefOr[String] = js.native
  /**
    * Configures the base href when used in server-side rendered applications
    */
  var serverBaseHref: js.UndefOr[String] = js.native
  /**
    * Configures the URL codec for encoding and decoding URLs. Default is the `AngularJSCodec`
    */
  var urlCodec: js.UndefOr[Instantiable0[UrlCodec]] = js.native
  /**
    * Configures whether the location upgrade module should use the `HashLocationStrategy`
    * or the `PathLocationStrategy`
    */
  var useHash: js.UndefOr[Boolean] = js.native
}

object LocationUpgradeConfig {
  @scala.inline
  def apply(): LocationUpgradeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationUpgradeConfig]
  }
  @scala.inline
  implicit class LocationUpgradeConfigOps[Self <: LocationUpgradeConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppBaseHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appBaseHref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppBaseHref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appBaseHref")(js.undefined)
        ret
    }
    @scala.inline
    def withHashPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withServerBaseHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverBaseHref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerBaseHref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverBaseHref")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlCodec(value: Instantiable0[UrlCodec]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlCodec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlCodec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlCodec")(js.undefined)
        ret
    }
    @scala.inline
    def withUseHash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHash")(js.undefined)
        ret
    }
  }
  
}


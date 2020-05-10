package typingsSlinky.openfin.wireMod

import typingsSlinky.openfin.AnonAlias
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseConfig extends js.Object {
  var address: js.UndefOr[String] = js.native
  var appAssets: js.UndefOr[js.Array[AnonAlias]] = js.native
  var assetsUrl: js.UndefOr[String] = js.native
  var client: js.UndefOr[js.Any] = js.native
  var customItems: js.UndefOr[js.Array[_]] = js.native
  var devToolsPort: js.UndefOr[Double] = js.native
  var installerUI: js.UndefOr[Boolean] = js.native
  var licenseKey: js.UndefOr[String] = js.native
  var lrsUrl: js.UndefOr[String] = js.native
  var manifestUrl: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var nonPersistent: js.UndefOr[Boolean] = js.native
  var runtime: js.UndefOr[RuntimeConfig] = js.native
  var runtimeClient: js.UndefOr[Boolean] = js.native
  var services: js.UndefOr[js.Array[ServiceConfig]] = js.native
  var startupApp: js.UndefOr[js.Any] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var uuid: js.UndefOr[String] = js.native
}

object BaseConfig {
  @scala.inline
  def apply(): BaseConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseConfig]
  }
  @scala.inline
  implicit class BaseConfigOps[Self <: BaseConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
    @scala.inline
    def withAppAssets(value: js.Array[AnonAlias]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appAssets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppAssets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appAssets")(js.undefined)
        ret
    }
    @scala.inline
    def withAssetsUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetsUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssetsUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetsUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withClient(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomItems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customItems")(js.undefined)
        ret
    }
    @scala.inline
    def withDevToolsPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devToolsPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevToolsPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devToolsPort")(js.undefined)
        ret
    }
    @scala.inline
    def withInstallerUI(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installerUI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstallerUI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installerUI")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenseKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseKey")(js.undefined)
        ret
    }
    @scala.inline
    def withLrsUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lrsUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLrsUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lrsUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withManifestUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifestUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManifestUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifestUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNonPersistent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonPersistent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonPersistent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonPersistent")(js.undefined)
        ret
    }
    @scala.inline
    def withRuntime(value: RuntimeConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuntime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtime")(js.undefined)
        ret
    }
    @scala.inline
    def withRuntimeClient(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuntimeClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeClient")(js.undefined)
        ret
    }
    @scala.inline
    def withServices(value: js.Array[ServiceConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(js.undefined)
        ret
    }
    @scala.inline
    def withStartupApp(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startupApp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartupApp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startupApp")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(js.undefined)
        ret
    }
  }
  
}


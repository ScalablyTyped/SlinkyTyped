package typingsSlinky.appBuilderLib.squirrelWindowsOptionsMod

import typingsSlinky.appBuilderLib.coreMod.TargetSpecificOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SquirrelWindowsOptions extends TargetSpecificOptions {
  /**
    * A URL to an ICO file to use as the application icon (displayed in Control Panel > Programs and Features). Defaults to the Electron icon.
    *
    * Please note — [local icon file url is not accepted](https://github.com/atom/grunt-electron-installer/issues/73), must be https/http.
    *
    * If you don't plan to build windows installer, you can omit it.
    * If your project repository is public on GitHub, it will be `https://github.com/${u}/${p}/blob/master/build/icon.ico?raw=true` by default.
    */
  val iconUrl: js.UndefOr[String | Null] = js.native
  /**
    * The path to a .gif file to display during install. `build/install-spinner.gif` will be used if exists (it is a recommended way to set)
    * (otherwise [default](https://github.com/electron/windows-installer/blob/master/resources/install-spinner.gif)).
    */
  val loadingGif: js.UndefOr[String | Null] = js.native
  /**
    * Whether to create an MSI installer. Defaults to `false` (MSI is not created).
    */
  val msi: js.UndefOr[Boolean] = js.native
  /**
    * https://github.com/electron-userland/electron-builder/issues/1743
    * @private
    */
  val name: js.UndefOr[String] = js.native
  /**
    * A URL to your existing updates. Or `true` to automatically set to your GitHub repository. If given, these will be downloaded to create delta updates.
    */
  val remoteReleases: js.UndefOr[String | Boolean | Null] = js.native
  /**
    * Authentication token for remote updates
    */
  val remoteToken: js.UndefOr[String | Null] = js.native
  /**
    * Use `appId` to identify package instead of `name`.
    */
  val useAppIdAsId: js.UndefOr[Boolean] = js.native
}

object SquirrelWindowsOptions {
  @scala.inline
  def apply(): SquirrelWindowsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SquirrelWindowsOptions]
  }
  @scala.inline
  implicit class SquirrelWindowsOptionsOps[Self <: SquirrelWindowsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIconUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withIconUrlNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(null)
        ret
    }
    @scala.inline
    def withLoadingGif(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingGif")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingGif: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingGif")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingGifNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingGif")(null)
        ret
    }
    @scala.inline
    def withMsi(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msi")(js.undefined)
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
    def withRemoteReleases(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteReleases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteReleases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteReleases")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteReleasesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteReleases")(null)
        ret
    }
    @scala.inline
    def withRemoteToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteToken")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteTokenNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteToken")(null)
        ret
    }
    @scala.inline
    def withUseAppIdAsId(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAppIdAsId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseAppIdAsId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAppIdAsId")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.appBuilderLib.appXOptionsMod

import typingsSlinky.appBuilderLib.coreMod.TargetSpecificOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppXOptions extends TargetSpecificOptions {
  /**
    * Whether to add auto launch extension. Defaults to `true` if [electron-winstore-auto-launch](https://github.com/felixrieseberg/electron-winstore-auto-launch) in the dependencies.
    */
  val addAutoLaunchExtension: js.UndefOr[Boolean] = js.native
  /**
    * The application id. Defaults to `identityName`. Can’t start with numbers.
    */
  val applicationId: js.UndefOr[String] = js.native
  /**
    * The background color of the app tile. See [Visual Elements](https://msdn.microsoft.com/en-us/library/windows/apps/br211471.aspx).
    * @default #464646
    */
  val backgroundColor: js.UndefOr[String | Null] = js.native
  /**
    * A friendly name that can be displayed to users. Corresponds to [Properties.DisplayName](https://msdn.microsoft.com/en-us/library/windows/apps/br211432.aspx).
    * Defaults to the application product name.
    */
  val displayName: js.UndefOr[String | Null] = js.native
  /**
    * @private
    * @default false
    */
  val electronUpdaterAware: js.UndefOr[Boolean] = js.native
  /**
    * The name. Corresponds to [Identity.Name](https://msdn.microsoft.com/en-us/library/windows/apps/br211441.aspx). Defaults to the [application name](/configuration/configuration#Metadata-name).
    */
  val identityName: js.UndefOr[String | Null] = js.native
  /**
    * The list of [supported languages](https://docs.microsoft.com/en-us/windows/uwp/globalizing/manage-language-and-region#specify-the-supported-languages-in-the-apps-manifest) that will be listed in the Windows Store.
    * The first entry (index 0) will be the default language.
    * Defaults to en-US if omitted.
    */
  val languages: js.UndefOr[js.Array[String] | String | Null] = js.native
  /** @private */
  val makeappxArgs: js.UndefOr[js.Array[String] | Null] = js.native
  /**
    * The Windows Store publisher. Not used if AppX is build for testing. See [AppX Package Code Signing](#appx-package-code-signing) below.
    */
  val publisher: js.UndefOr[String | Null] = js.native
  /**
    * A friendly name for the publisher that can be displayed to users. Corresponds to [Properties.PublisherDisplayName](https://msdn.microsoft.com/en-us/library/windows/apps/br211460.aspx).
    * Defaults to company name from the application metadata.
    */
  val publisherDisplayName: js.UndefOr[String | Null] = js.native
  /**
    * Whether to set build number. See https://github.com/electron-userland/electron-builder/issues/3875
    * @default false
    */
  val setBuildNumber: js.UndefOr[Boolean] = js.native
  /**
    * Whether to overlay the app's name on top of tile images on the Start screen. Defaults to `false`. (https://docs.microsoft.com/en-us/uwp/schemas/appxpackage/uapmanifestschema/element-uap-shownameontiles) in the dependencies.
    * @default false
    */
  val showNameOnTiles: js.UndefOr[Boolean] = js.native
}

object AppXOptions {
  @scala.inline
  def apply(): AppXOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppXOptions]
  }
  @scala.inline
  implicit class AppXOptionsOps[Self <: AppXOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddAutoLaunchExtension(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAutoLaunchExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddAutoLaunchExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAutoLaunchExtension")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationId")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(null)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(null)
        ret
    }
    @scala.inline
    def withElectronUpdaterAware(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electronUpdaterAware")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElectronUpdaterAware: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electronUpdaterAware")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentityName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identityName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentityName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identityName")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentityNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identityName")(null)
        ret
    }
    @scala.inline
    def withLanguages(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguagesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(null)
        ret
    }
    @scala.inline
    def withMakeappxArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("makeappxArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMakeappxArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("makeappxArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withMakeappxArgsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("makeappxArgs")(null)
        ret
    }
    @scala.inline
    def withPublisher(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublisher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisher")(js.undefined)
        ret
    }
    @scala.inline
    def withPublisherNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisher")(null)
        ret
    }
    @scala.inline
    def withPublisherDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublisherDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherDisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withPublisherDisplayNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherDisplayName")(null)
        ret
    }
    @scala.inline
    def withSetBuildNumber(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBuildNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetBuildNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBuildNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withShowNameOnTiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNameOnTiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNameOnTiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNameOnTiles")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.chromeApps.chrome.management

import typingsSlinky.chromeApps.anon.ADMIN
import typingsSlinky.chromeApps.anon.OPENASPINNEDTAB
import typingsSlinky.chromeApps.anon.PERMISSIONSINCREASE
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chrome.runtime.Permission
import typingsSlinky.chromeApps.chromeAppsBooleans.`true`
import typingsSlinky.chromeApps.chromeAppsStrings.DEVELOPMENT
import typingsSlinky.chromeApps.chromeAppsStrings.NORMAL
import typingsSlinky.chromeApps.chromeAppsStrings.OPEN_AS_PINNED_TAB
import typingsSlinky.chromeApps.chromeAppsStrings.OPEN_AS_REGULAR_TAB
import typingsSlinky.chromeApps.chromeAppsStrings.OPEN_AS_WINDOW
import typingsSlinky.chromeApps.chromeAppsStrings.OPEN_FULL_SCREEN
import typingsSlinky.chromeApps.chromeAppsStrings.OTHER
import typingsSlinky.chromeApps.chromeAppsStrings.PERMISSIONS_INCREASE
import typingsSlinky.chromeApps.chromeAppsStrings.SIDELOAD
import typingsSlinky.chromeApps.chromeAppsStrings.UNKNOWN
import typingsSlinky.chromeApps.chromeAppsStrings.admin_
import typingsSlinky.chromeApps.chromeAppsStrings.development_
import typingsSlinky.chromeApps.chromeAppsStrings.normal_
import typingsSlinky.chromeApps.chromeAppsStrings.other_
import typingsSlinky.chromeApps.chromeAppsStrings.packaged_app
import typingsSlinky.chromeApps.chromeAppsStrings.permissions_increase_
import typingsSlinky.chromeApps.chromeAppsStrings.sideload_
import typingsSlinky.chromeApps.chromeAppsStrings.unknown__
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information about an installed extension, app, or theme. */
@js.native
trait ExtensionInfo extends js.Object {
  /**
    * The launch url.
    */
  var appLaunchUrl: js.UndefOr[String] = js.native
  /**
    * The currently available launch types.
    * @since Chrome 37.
    */
  var availableLaunchTypes: js.UndefOr[
    js.Array[
      ToStringLiteral[
        OPENASPINNEDTAB, 
        /* keyof chrome-apps.anon.OPENASPINNEDTAB */ OPEN_AS_REGULAR_TAB | OPEN_AS_PINNED_TAB | OPEN_AS_WINDOW | OPEN_FULL_SCREEN, 
        Exclude[
          /* keyof chrome-apps.anon.OPENASPINNEDTAB */ OPEN_AS_REGULAR_TAB | OPEN_AS_PINNED_TAB | OPEN_AS_WINDOW | OPEN_FULL_SCREEN, 
          OPEN_AS_REGULAR_TAB | OPEN_AS_PINNED_TAB | OPEN_AS_WINDOW | OPEN_FULL_SCREEN
        ]
      ]
    ]
  ] = js.native
  /**
    * The description of this app.
    */
  var description: String = js.native
  /**
    * A reason the item is disabled.
    * @since Chrome 17.
    * @see enum ExtensionDisabledReason
    */
  var disabledReason: js.UndefOr[
    ToStringLiteral[
      PERMISSIONSINCREASE, 
      /* keyof chrome-apps.anon.PERMISSIONSINCREASE */ UNKNOWN | PERMISSIONS_INCREASE, 
      Exclude[
        /* keyof chrome-apps.anon.PERMISSIONSINCREASE */ UNKNOWN | PERMISSIONS_INCREASE, 
        unknown__ | permissions_increase_
      ]
    ]
  ] = js.native
  /** Whether it is currently enabled or disabled. */
  var enabled: Boolean = js.native
  /**
    * The URL of the homepage of this app.
    * @since Chrome 11.
    */
  var homepageUrl: js.UndefOr[String] = js.native
  /**
    * Returns a list of host based permissions.
    * Permissions regarding url access.
    */
  var hostPermissions: js.Array[String] = js.native
  /**
    * A list of icon information.
    * Note that this just reflects what was declared in the manifest,
    * and the actual image at that url may be larger or smaller than what was declared,
    * so you might consider using explicit width and height attributes on img tags
    * referencing these images. See the manifest documentation on icons for more details.
    */
  var icons: js.UndefOr[js.Array[IconInfo]] = js.native
  /** The extension's unique identifier. */
  var id: String = js.native
  /**
    * How the app was installed.
    * @since Chrome 22.
    */
  var installType: ToStringLiteral[
    ADMIN, 
    /* keyof chrome-apps.anon.ADMIN */ typingsSlinky.chromeApps.chromeAppsStrings.ADMIN | DEVELOPMENT | NORMAL | SIDELOAD | OTHER, 
    Exclude[
      /* keyof chrome-apps.anon.ADMIN */ typingsSlinky.chromeApps.chromeAppsStrings.ADMIN | DEVELOPMENT | NORMAL | SIDELOAD | OTHER, 
      other_ | normal_ | development_ | admin_ | sideload_
    ]
  ] = js.native
  /**
    * True if this is an app, which it will be till this is removed.
    * @deprecated since Chrome 33. Please use management.ExtensionInfo.type.
    */
  var isApp: js.UndefOr[`true`] = js.native
  /**
    * The app launch type.
    * @since Chrome 37.
    */
  var launchType: js.UndefOr[
    ToStringLiteral[
      OPENASPINNEDTAB, 
      /* keyof chrome-apps.anon.OPENASPINNEDTAB */ OPEN_AS_REGULAR_TAB | OPEN_AS_PINNED_TAB | OPEN_AS_WINDOW | OPEN_FULL_SCREEN, 
      Exclude[
        /* keyof chrome-apps.anon.OPENASPINNEDTAB */ OPEN_AS_REGULAR_TAB | OPEN_AS_PINNED_TAB | OPEN_AS_WINDOW | OPEN_FULL_SCREEN, 
        OPEN_AS_REGULAR_TAB | OPEN_AS_PINNED_TAB | OPEN_AS_WINDOW | OPEN_FULL_SCREEN
      ]
    ]
  ] = js.native
  /**
    * Whether this app can be disabled or uninstalled by the user.
    */
  var mayDisable: Boolean = js.native
  /** The name of this app. */
  var name: String = js.native
  /**
    * Whether the app declares that it supports offline.
    * @since Chrome 15.
    */
  var offlineEnabled: Boolean = js.native
  /**
    * Returns a list of API based permissions.
    */
  var permissions: js.Array[Permission] = js.native
  /**
    * A short version of the name of this app.
    * @since Chrome 31.
    */
  var shortName: String = js.native
  /**
    * The type of this app.
    * @since Chrome 23.
    */
  var `type`: packaged_app = js.native
  /**
    * The update URL of this app.
    * @since Chrome 16.
    */
  var updateUrl: js.UndefOr[String] = js.native
  /** The version of this app. */
  var version: String = js.native
  /** This app's version name */
  var versionName: String = js.native
}

object ExtensionInfo {
  @scala.inline
  def apply(
    description: String,
    enabled: Boolean,
    hostPermissions: js.Array[String],
    id: String,
    installType: ToStringLiteral[
      ADMIN, 
      /* keyof chrome-apps.anon.ADMIN */ typingsSlinky.chromeApps.chromeAppsStrings.ADMIN | DEVELOPMENT | NORMAL | SIDELOAD | OTHER, 
      Exclude[
        /* keyof chrome-apps.anon.ADMIN */ typingsSlinky.chromeApps.chromeAppsStrings.ADMIN | DEVELOPMENT | NORMAL | SIDELOAD | OTHER, 
        other_ | normal_ | development_ | admin_ | sideload_
      ]
    ],
    mayDisable: Boolean,
    name: String,
    offlineEnabled: Boolean,
    permissions: js.Array[Permission],
    shortName: String,
    `type`: packaged_app,
    version: String,
    versionName: String
  ): ExtensionInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], hostPermissions = hostPermissions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], installType = installType.asInstanceOf[js.Any], mayDisable = mayDisable.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offlineEnabled = offlineEnabled.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], shortName = shortName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], versionName = versionName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionInfo]
  }
  @scala.inline
  implicit class ExtensionInfoOps[Self <: ExtensionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostPermissions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstallType(
      value: ToStringLiteral[
          ADMIN, 
          /* keyof chrome-apps.anon.ADMIN */ typingsSlinky.chromeApps.chromeAppsStrings.ADMIN | DEVELOPMENT | NORMAL | SIDELOAD | OTHER, 
          Exclude[
            /* keyof chrome-apps.anon.ADMIN */ typingsSlinky.chromeApps.chromeAppsStrings.ADMIN | DEVELOPMENT | NORMAL | SIDELOAD | OTHER, 
            other_ | normal_ | development_ | admin_ | sideload_
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMayDisable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mayDisable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfflineEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offlineEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermissions(value: js.Array[Permission]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: packaged_app): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppLaunchUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appLaunchUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppLaunchUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appLaunchUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailableLaunchTypes(
      value: js.Array[
          ToStringLiteral[
            OPENASPINNEDTAB, 
            /* keyof chrome-apps.anon.OPENASPINNEDTAB */ OPEN_AS_REGULAR_TAB | OPEN_AS_PINNED_TAB | OPEN_AS_WINDOW | OPEN_FULL_SCREEN, 
            Exclude[
              /* keyof chrome-apps.anon.OPENASPINNEDTAB */ OPEN_AS_REGULAR_TAB | OPEN_AS_PINNED_TAB | OPEN_AS_WINDOW | OPEN_FULL_SCREEN, 
              OPEN_AS_REGULAR_TAB | OPEN_AS_PINNED_TAB | OPEN_AS_WINDOW | OPEN_FULL_SCREEN
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableLaunchTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailableLaunchTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableLaunchTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledReason(
      value: ToStringLiteral[
          PERMISSIONSINCREASE, 
          /* keyof chrome-apps.anon.PERMISSIONSINCREASE */ UNKNOWN | PERMISSIONS_INCREASE, 
          Exclude[
            /* keyof chrome-apps.anon.PERMISSIONSINCREASE */ UNKNOWN | PERMISSIONS_INCREASE, 
            unknown__ | permissions_increase_
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledReason")(js.undefined)
        ret
    }
    @scala.inline
    def withHomepageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homepageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomepageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homepageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withIcons(value: js.Array[IconInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(js.undefined)
        ret
    }
    @scala.inline
    def withIsApp(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isApp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsApp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isApp")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchType(
      value: ToStringLiteral[
          OPENASPINNEDTAB, 
          /* keyof chrome-apps.anon.OPENASPINNEDTAB */ OPEN_AS_REGULAR_TAB | OPEN_AS_PINNED_TAB | OPEN_AS_WINDOW | OPEN_FULL_SCREEN, 
          Exclude[
            /* keyof chrome-apps.anon.OPENASPINNEDTAB */ OPEN_AS_REGULAR_TAB | OPEN_AS_PINNED_TAB | OPEN_AS_WINDOW | OPEN_FULL_SCREEN, 
            OPEN_AS_REGULAR_TAB | OPEN_AS_PINNED_TAB | OPEN_AS_WINDOW | OPEN_FULL_SCREEN
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchType")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateUrl")(js.undefined)
        ret
    }
  }
  
}


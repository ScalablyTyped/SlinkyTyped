package typingsSlinky.chromeApps.chrome.runtime

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.chromeApps.anon.Accepttlschannelid
import typingsSlinky.chromeApps.anon.Actions
import typingsSlinky.chromeApps.anon.Background
import typingsSlinky.chromeApps.anon.Clientid
import typingsSlinky.chromeApps.anon.Configurable
import typingsSlinky.chromeApps.anon.Contentsecuritypolicy
import typingsSlinky.chromeApps.anon.Defaulticon
import typingsSlinky.chromeApps.anon.Email
import typingsSlinky.chromeApps.anon.Extensions
import typingsSlinky.chromeApps.anon.FiltersArray
import typingsSlinky.chromeApps.anon.Global
import typingsSlinky.chromeApps.anon.Id
import typingsSlinky.chromeApps.anon.Lowenergy
import typingsSlinky.chromeApps.anon.Managedschema
import typingsSlinky.chromeApps.anon.Matches
import typingsSlinky.chromeApps.anon.Mimetype
import typingsSlinky.chromeApps.anon.NEWNOTE
import typingsSlinky.chromeApps.anon.Naclarch
import typingsSlinky.chromeApps.anon.Partitions
import typingsSlinky.chromeApps.anon.Tcp
import typingsSlinky.chromeApps.anon.`3D`
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chromeAppsNumbers.`2`
import typingsSlinky.chromeApps.chromeAppsStrings.NEW_NOTE
import typingsSlinky.chromeApps.chromeAppsStrings.new_note_
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartialManifest extends js.Object {
  //////////////
  // OPTIONAL //
  //////////////
  /**
    * @requires(CrOS) **Will only work on Chrome OS.**
    * @description
    * The action_handlers manifest property declares which user actions or intents the
    * application supports; these can serve as alternate launch points for your application.
    * This list contains one or more of the ActionType values specified
    * in the ActionType entry of app.runtime.onLaunched.
    * @example
    * 'action_handlers': ['new_note']
    */
  var action_handlers: js.UndefOr[js.Array[ToStringLiteral[NEWNOTE, NEW_NOTE, Exclude[NEW_NOTE, new_note_]]]] = js.native
  //////////////
  // REQUIRED //
  //////////////
  /**
    * Used by packaged apps to specify the app's background scripts.
    * Also used by hosted apps to specify the URLs that the app uses.
    * @required
    */
  var app: Background = js.native
  /**
    * App author information
    * @see[Not implemented anywhere in code]{@link https://github.com/chromium/chromium/blob/master/chrome/browser/chromeos/extensions/device_local_account_management_policy_provider.cc#L46}
    */
  var author: js.UndefOr[Email | js.Any] = js.native
  /**
    * Allows inspection of page contents, not enabled on stable anyways except for whitelist.
    * @see[Docs]{@link https://github.com/chromium/chromium/blob/master/extensions/common/manifest_handlers/automation.cc}
    */
  var automation: js.UndefOr[AutomationOptions | Boolean] = js.native
  /**
    * Note: The 'bluetooth' manifest permission is used by the
    * chrome.bluetooth, chrome.bluetoothSocket and
    * chrome.bluetoothLowEnergy APIs.
    * @requires Platforms: Chrome OS, Windows and Mac
    */
  var bluetooth: js.UndefOr[Lowenergy] = js.native
  /**
    * Use the commands API to add keyboard shortcuts that trigger actions in your app.
    * E.g. an action to open the browser action or send a command to the app.
    */
  var commands: js.UndefOr[StringDictionary[Global]] = js.native
  /**
    * An implementation detail (actually written by Chrome, not the app author).
    */
  val current_locale: js.UndefOr[String] = js.native
  /////////////////
  // RECOMMENDED //
  /////////////////
  /**
    * Specifies the subdirectory of _locales that contains the default strings for this app.
    * This field is required in apps that have a _locales directory; it must be absent in
    * apps that have no _locales directory. For details, see Internationalization:
    * @see[Internationalization]{@see https://developer.chrome.com/extensions/i18n}
    */
  var default_locale: js.UndefOr[String] = js.native
  /**
    * A plain text string (no HTML or other formatting; no more than 132 characters)
    * that describes the extension. The description should be suitable for both the
    * browser's extension management UI and the Chrome Web Store. You can specify
    * locale-specific strings for this field; see Internationalization for details.
    * @see[Internationalization]{@see https://developer.chrome.com/extensions/i18n}
    */
  var description: js.UndefOr[String] = js.native
  /** Restricted to whitelist */
  var display_in_launcher: js.UndefOr[Boolean] = js.native
  /** Restricted to whitelist */
  var display_in_new_tab_page: js.UndefOr[Boolean] = js.native
  /**
    * The *event_rules* manifest property provides a mechanism to add rules that
    * intercept, block, or modify web requests in-flight using **declarativeWebRequest**
    * or take actions depending on the content of a page, without requiring permission
    * to read the page's content using **declarativeContent**.
    * @see[event_rules docs]{@link https://developer.chrome.com/extensions/manifest/event_rules}
    */
  var event_rules: js.UndefOr[js.Array[Actions]] = js.native
  /**
    * Declares which extensions, apps, and web pages can connect
    * to your extension via runtime.connect and runtime.sendMessage.
    */
  var externally_connectable: Accepttlschannelid = js.native
  /**
    * @requires Permissions: 'fileBrowserHandle'
    * @requires Location': 'component'
    * You can specify locale-specific strings for the value of 'default_title'
    */
  var file_browser_handlers: js.UndefOr[js.Array[Defaulticon]] = js.native
  /**
    * Triggers a launch of the app when one of these files are handled.
    */
  var file_handlers: js.UndefOr[StringDictionary[Extensions]] = js.native
  /**
    * Files app uses above information in order to render related UI elements approprietly.
    */
  var file_system_provider_capabilities: js.UndefOr[Configurable] = js.native
  /**
    * One or more icons that represent the extension, app, or theme.
    * You should always provide a 128x128 icon; it's used during
    * installation and by the Chrome Web Store. Extensions should
    * also provide a 48x48 icon, which is used in the extensions
    * management page (chrome://extensions). You can also specify
    * a 16x16 icon to be used as the favicon for an extension's pages.
    *
    * Icons should generally be in PNG format, because PNG has the best support for transparency.
    * They can, however, be in any format supported by WebKit, including BMP, GIF, ICO, and JPEG.
    *
    * You may provide icons of any other size you wish, and Chrome will attempt to use the best size
    * where appropriate. For example, Windows often requires 32-pixel icons, and if the app includes
    * a 32-pixel icon, Chrome will choose that instead of shrinking a 48-pixel icon down. However,
    * you should ensure that all of your icons are square, or unexpected behavior may result.
    *
    * @example
    * 'icons': { '16': 'icon16.png',
    *            '48': 'icon48.png',
    *            '128': 'icon128.png' },
    */
  var icons: js.UndefOr[ManifestIcons] = js.native
  /**
    * Import resources from another extension / app.
    * @see[Shared modules]{@link https://developer.chrome.com/apps/shared_modules}
    */
  var `import`: js.UndefOr[js.Array[Id]] = js.native
  /** This value can be used to control the unique ID of an app when it is loaded during development. */
  var key: js.UndefOr[String] = js.native
  /**
    * One integer specifying the version of the manifest file format your package requires.
    * As of Chrome 18, developers should specify 2 (without quotes).
    * @see[Manifest Version Info]{@link https://developer.chrome.com/apps/manifest/manifest_version}
    * @required
    */
  var manifest_version: `2` = js.native
  /**
    * The minimum version of Chrome that your app, if any.
    * @example
    * 'minimum_chrome_version': '33.0.1715.0'
    */
  var minimum_chrome_version: js.UndefOr[String] = js.native
  /** One or more mappings from MIME types to the Native Client module that handles each type. */
  var nacl_modules: js.UndefOr[js.Array[Mimetype]] = js.native
  /**
    * The *name* (maximum of 45 characters) is the primary identifier
    * of the app and is a required field.
    * It is displayed in the following locations:
    *  - Install dialog
    *  - Extension management UI
    *  - Chrome Web Store
    *
    * You can specify locale-specific strings, see Internationalization docs:
    * @see[Internationalization]{@see https://developer.chrome.com/extensions/i18n}
    * @required
    * @requires string - Maximum 45 characters!
    */
  var name: String = js.native
  /**
    * Use the Chrome Identity API to authenticate users:
    * the getAuthToken for users logged into their Google Account
    * and the launchWebAuthFlow for users logged into a non-Google account.
    */
  var oauth2: js.UndefOr[Clientid] = js.native
  /**
    * Whether the app is expected to work offline.
    * When Chrome detects that it is offline, apps with this field set to true will be highlighted on the New Tab page.
    */
  var offline_enabled: js.UndefOr[Boolean] = js.native
  /**
    * Use the chrome.permissions API to request declared optional permissions
    * at run time rather than install time, so users understand why the
    * permissions are needed and grant only those that are necessary.
    */
  var optional_permissions: js.UndefOr[js.Array[js.Array[UrlMatches] | OptionalPermission | String]] = js.native
  /**
    * Permissions help to limit damage if your app is compromised by malware.
    * Some permissions are also displayed to users before installation,
    * as detailed in Permission Warnings.
    */
  var permissions: js.UndefOr[js.Array[Permission | String]] = js.native
  /**
    * Native Client
    * @see[NDK Docs]{@link https://github.com/crosswalk-project/chromium-crosswalk/blob/af36cc3ce3f5fcb8033f16236725718f8012abfe/native_client_sdk/src/doc/devguide/distributing.rst}
    * @see[Chromium Source]{@link https://github.com/crosswalk-project/chromium-crosswalk/blob/af36cc3ce3f5fcb8033f16236725718f8012abfe/native_client_sdk/src/tools/fix_manifest.py}
    */
  var platforms: js.UndefOr[js.Array[Naclarch]] = js.native
  /**
    * Technologies required by the app. Hosting sites such
    * as the Chrome Web Store may use this list to dissuade
    * users from installing appss that will not
    * work on their computer. Supported requirements currently
    * include '3D' and 'plugins'; additional requirements checks
    * may be added in the future.
    */
  var requirements: js.UndefOr[`3D`] = js.native
  /**
    * @deprecated
    * Warning: Starting in version 57, Chrome will no longer allow external web content
    * (including embedded frames and scripts) inside sandboxed pages.
    * Please use a webview instead.
    */
  var sandbox: js.UndefOr[Contentsecuritypolicy] = js.native
  /**
    * The short_name (maximum of 12 characters recommended) is
    * a short version of the app's name. It is an optional field
    * and if not specified, the name will be used, though it will
    * likely be truncated. The short name is typically used where
    * there is insufficient space to display the full name, such as:
    * - App launcher
    * - New Tab page
    *
    * You can specify locale-specific strings, see Internationalization docs:
    * @see[Internationalization]{@see https://developer.chrome.com/extensions/i18n}
    */
  var short_name: js.UndefOr[String] = js.native
  /** Doc missing. Declared as a feature, but unused. */
  var signature: js.UndefOr[js.Any] = js.native
  /**
    * The sockets manifest property declares which permissions are available
    * for the sockets.udp, sockets.tcp and sockets.tcpServer APIs.
    */
  var sockets: js.UndefOr[Tcp] = js.native
  /**
    * Unlike the local and sync storage areas,
    * the managed storage area requires its structure
    * to be declared as JSON Schema and is strictly validated by Chrome.
    * This schema must be stored in a file indicated by the 'managed_schema'
    * property of the 'storage' manifest key and declares the enterprise
    * policies supported by the app. Policies are analogous to options
    * but are configured by a system administrator instead of the user,
    * allowing the app to be preconfigured for all users of an organization.
    *
    * After declaring the policies they can be read from the storage.managed API.
    * It's up to the app to enforce the policies configured by the administrator.
    */
  var storage: js.UndefOr[Managedschema] = js.native
  // system_indicator?: any; // Deprecated / removed: https://bugs.chromium.org/p/chromium/issues/detail?id=142450
  /**
    * If you publish using the Chrome Developer Dashboard, ignore this field.
    * If you host your own app: URL to an update manifest XML file.
    * **⚠ Warning**
    * As of M33, Windows stable / beta channel users can only
    * download apps hosted in the Chrome Web Store
    * @requires(not Windows)
    * (@see[Protecting Windows users from malicious extensions]{@link http://blog.chromium.org/2013/11/protecting-windows-users-from-malicious.html}).
    * @see[Documentation]{@link https://developer.chrome.com/apps/autoupdate}
    */
  var update_url: js.UndefOr[String] = js.native
  /**
    * Used by packaged apps to specify URL patterns the app wants to intercept and handle.
    * An app can define multiple URL handlers under this manifest entry,
    * each having an identifier, a URL pattern, and a title.
    * Here's an example of how to specify url_handlers:
    * @example
    * 'view_foobar_presentation': {
    *   'matches': [
    *     'https://www.foobar.com/presentation/view/ *'
    *   ],
    *   'title': 'View FooBar presentation'
    * }
    * @see[Documentation]{@link https://developer.chrome.com/apps/manifest/url_handlers}
    *
    */
  var url_handlers: js.UndefOr[StringDictionary[Matches]] = js.native
  /** The usbPrinters manifest property declares which USB printers are supported by an app using the printerProvider API. */
  var usb_printers: js.UndefOr[FiltersArray] = js.native
  /**
    * One to four dot-separated integers identifying the version of this app.
    * A couple of rules apply to the integers: they must be between 0 and 65535, inclusive,
    * and non-zero integers can't start with 0. For example, 99999 and 032 are both invalid.
    * A missing integer is equal to zero. For example, 1.1.9.9999 is newer than 1.1.
    * @see[Manifest- Version Docs]{@link https://developer.chrome.com/apps/manifest/version}
    * @required
    */
  var version: String = js.native
  /**
    * version_name can be set to a descriptive version string and will be used for display purposes if present.
    * If no version_name is present, the version field will be used for display purposes as well.
    * @example
    * 'version_name': '0.8 beta'
    * 'version_name': 'build rc3'
    * 'version_name': 'Gold Edition'
    */
  var version_name: js.UndefOr[String] = js.native
  /**
    * By default, webviews are prevented from loading any resources packaged with the app.
    * However, webview partitions may be granted access to these resources via a webview.partitions
    * section in the app manifest. Partitions may be granted access to a set of files by
    * matching partition name patterns with file name patterns. Both sorts of patterns may
    * contain the * wildcard.
    * @see[Accessing packaged resources]{@link https://developer.chrome.com/apps/tags/webview#local_resources}
    */
  var webview: js.UndefOr[Partitions] = js.native
}

object PartialManifest {
  @scala.inline
  def apply(
    app: Background,
    externally_connectable: Accepttlschannelid,
    manifest_version: `2`,
    name: String,
    version: String
  ): PartialManifest = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], externally_connectable = externally_connectable.asInstanceOf[js.Any], manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialManifest]
  }
  @scala.inline
  implicit class PartialManifestOps[Self <: PartialManifest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp(value: Background): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternally_connectable(value: Accepttlschannelid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externally_connectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManifest_version(value: `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifest_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAction_handlers(value: js.Array[ToStringLiteral[NEWNOTE, NEW_NOTE, Exclude[NEW_NOTE, new_note_]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action_handlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction_handlers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action_handlers")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthor(value: Email | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(js.undefined)
        ret
    }
    @scala.inline
    def withAutomation(value: AutomationOptions | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automation")(js.undefined)
        ret
    }
    @scala.inline
    def withBluetooth(value: Lowenergy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bluetooth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBluetooth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bluetooth")(js.undefined)
        ret
    }
    @scala.inline
    def withCommands(value: StringDictionary[Global]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrent_locale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current_locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrent_locale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current_locale")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault_locale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault_locale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_locale")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay_in_launcher(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_in_launcher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay_in_launcher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_in_launcher")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay_in_new_tab_page(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_in_new_tab_page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay_in_new_tab_page: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_in_new_tab_page")(js.undefined)
        ret
    }
    @scala.inline
    def withEvent_rules(value: js.Array[Actions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent_rules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_rules")(js.undefined)
        ret
    }
    @scala.inline
    def withFile_browser_handlers(value: js.Array[Defaulticon]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_browser_handlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile_browser_handlers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_browser_handlers")(js.undefined)
        ret
    }
    @scala.inline
    def withFile_handlers(value: StringDictionary[Extensions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_handlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile_handlers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_handlers")(js.undefined)
        ret
    }
    @scala.inline
    def withFile_system_provider_capabilities(value: Configurable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_system_provider_capabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile_system_provider_capabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_system_provider_capabilities")(js.undefined)
        ret
    }
    @scala.inline
    def withIcons(value: ManifestIcons): Self = {
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
    def withImport(value: js.Array[Id]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("import")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("import")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimum_chrome_version(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum_chrome_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimum_chrome_version: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum_chrome_version")(js.undefined)
        ret
    }
    @scala.inline
    def withNacl_modules(value: js.Array[Mimetype]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nacl_modules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNacl_modules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nacl_modules")(js.undefined)
        ret
    }
    @scala.inline
    def withOauth2(value: Clientid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOauth2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth2")(js.undefined)
        ret
    }
    @scala.inline
    def withOffline_enabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offline_enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffline_enabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offline_enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withOptional_permissions(value: js.Array[js.Array[UrlMatches] | OptionalPermission | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional_permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptional_permissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional_permissions")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissions(value: js.Array[Permission | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatforms(value: js.Array[Naclarch]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platforms")(js.undefined)
        ret
    }
    @scala.inline
    def withRequirements(value: `3D`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requirements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequirements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requirements")(js.undefined)
        ret
    }
    @scala.inline
    def withSandbox(value: Contentsecuritypolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sandbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSandbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sandbox")(js.undefined)
        ret
    }
    @scala.inline
    def withShort_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShort_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short_name")(js.undefined)
        ret
    }
    @scala.inline
    def withSignature(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(js.undefined)
        ret
    }
    @scala.inline
    def withSockets(value: Tcp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sockets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSockets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sockets")(js.undefined)
        ret
    }
    @scala.inline
    def withStorage(value: Managedschema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdate_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update_url")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl_handlers(value: StringDictionary[Matches]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url_handlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl_handlers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url_handlers")(js.undefined)
        ret
    }
    @scala.inline
    def withUsb_printers(value: FiltersArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usb_printers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsb_printers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usb_printers")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version_name")(js.undefined)
        ret
    }
    @scala.inline
    def withWebview(value: Partitions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webview")(js.undefined)
        ret
    }
  }
  
}


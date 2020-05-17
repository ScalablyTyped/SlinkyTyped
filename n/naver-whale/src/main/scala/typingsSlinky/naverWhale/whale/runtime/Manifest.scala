package typingsSlinky.naverWhale.whale.runtime

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.chrome.anon.Acceptstlschannelid
import typingsSlinky.chrome.anon.Actions
import typingsSlinky.chrome.anon.Allframes
import typingsSlinky.chrome.anon.Bookmarks
import typingsSlinky.chrome.anon.Bookmarksui
import typingsSlinky.chrome.anon.Chromestyle
import typingsSlinky.chrome.anon.Clientid
import typingsSlinky.chrome.anon.Configurable
import typingsSlinky.chrome.anon.Contentsecuritypolicy
import typingsSlinky.chrome.anon.Defaulttitle
import typingsSlinky.chrome.anon.Description
import typingsSlinky.chrome.anon.Dictionaryformat
import typingsSlinky.chrome.anon.Homepage
import typingsSlinky.chrome.anon.Id
import typingsSlinky.chrome.anon.Keyword
import typingsSlinky.chrome.anon.Language
import typingsSlinky.chrome.anon.Managedschema
import typingsSlinky.chrome.anon.Matches
import typingsSlinky.chrome.anon.Mimetype
import typingsSlinky.chrome.anon.Naclarch
import typingsSlinky.chrome.anon.Page
import typingsSlinky.chrome.anon.Path
import typingsSlinky.chrome.anon.Voices
import typingsSlinky.chrome.anon.Whitelist
import typingsSlinky.chrome.anon.`3D`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Manifest
  extends /* key */ StringDictionary[js.Any] {
  // Optional
  var author: js.UndefOr[js.Any] = js.native
  var automation: js.UndefOr[js.Any] = js.native
  var background: js.UndefOr[Page] = js.native
  var background_page: js.UndefOr[String] = js.native
  // Pick one (or none)
  var browser_action: js.UndefOr[typingsSlinky.chrome.chrome.runtime.ManifestAction] = js.native
  var chrome_settings_overrides: js.UndefOr[Homepage] = js.native
  var chrome_ui_overrides: js.UndefOr[Bookmarksui] = js.native
  var chrome_url_overrides: js.UndefOr[Bookmarks] = js.native
  var commands: js.UndefOr[StringDictionary[Description]] = js.native
  var content_capabilities: js.UndefOr[Matches] = js.native
  var content_scripts: js.UndefOr[js.Array[Allframes]] = js.native
  var content_security_policy: js.UndefOr[String] = js.native
  var converted_from_user_script: js.UndefOr[Boolean] = js.native
  var copresence: js.UndefOr[js.Any] = js.native
  var current_locale: js.UndefOr[String] = js.native
  // Recommended
  var default_locale: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var devtools_page: js.UndefOr[String] = js.native
  var event_rules: js.UndefOr[js.Array[Actions]] = js.native
  var export: js.UndefOr[Whitelist] = js.native
  var externally_connectable: js.UndefOr[Acceptstlschannelid] = js.native
  var file_browser_handlers: js.UndefOr[js.Array[Defaulttitle]] = js.native
  var file_system_provider_capabilities: js.UndefOr[Configurable] = js.native
  var homepage_url: js.UndefOr[String] = js.native
  var icons: js.UndefOr[typingsSlinky.chrome.chrome.runtime.ManifestIcons] = js.native
  var `import`: js.UndefOr[js.Array[Id]] = js.native
  var incognito: js.UndefOr[String] = js.native
  var input_components: js.UndefOr[js.Array[Language]] = js.native
  var key: js.UndefOr[String] = js.native
  // Required
  var manifest_version: Double = js.native
  var minimum_chrome_version: js.UndefOr[String] = js.native
  var nacl_modules: js.UndefOr[js.Array[Mimetype]] = js.native
  var name: String = js.native
  var oauth2: js.UndefOr[Clientid] = js.native
  var offline_enabled: js.UndefOr[Boolean] = js.native
  var omnibox: js.UndefOr[Keyword] = js.native
  var optional_permissions: js.UndefOr[js.Array[String]] = js.native
  var options_page: js.UndefOr[String] = js.native
  var options_ui: js.UndefOr[Chromestyle] = js.native
  var page_action: js.UndefOr[typingsSlinky.chrome.chrome.runtime.ManifestAction] = js.native
  var permissions: js.UndefOr[js.Array[String]] = js.native
  var platforms: js.UndefOr[js.Array[Naclarch]] = js.native
  var plugins: js.UndefOr[js.Array[Path]] = js.native
  var requirements: js.UndefOr[`3D`] = js.native
  var sandbox: js.UndefOr[Contentsecuritypolicy] = js.native
  var short_name: js.UndefOr[String] = js.native
  var signature: js.UndefOr[js.Any] = js.native
  var spellcheck: js.UndefOr[Dictionaryformat] = js.native
  var storage: js.UndefOr[Managedschema] = js.native
  var system_indicator: js.UndefOr[js.Any] = js.native
  var tts_engine: js.UndefOr[Voices] = js.native
  var update_url: js.UndefOr[String] = js.native
  var version: String = js.native
  var version_name: js.UndefOr[String] = js.native
  var web_accessible_resources: js.UndefOr[js.Array[String]] = js.native
}

object Manifest {
  @scala.inline
  def apply(manifest_version: Double, name: String, version: String): Manifest = {
    val __obj = js.Dynamic.literal(manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manifest]
  }
  @scala.inline
  implicit class ManifestOps[Self <: Manifest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManifest_version(value: Double): Self = {
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
    def withAuthor(value: js.Any): Self = {
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
    def withAutomation(value: js.Any): Self = {
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
    def withBackground(value: Page): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withBackground_page(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background_page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground_page: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background_page")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowser_action(value: typingsSlinky.chrome.chrome.runtime.ManifestAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser_action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowser_action: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser_action")(js.undefined)
        ret
    }
    @scala.inline
    def withChrome_settings_overrides(value: Homepage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome_settings_overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChrome_settings_overrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome_settings_overrides")(js.undefined)
        ret
    }
    @scala.inline
    def withChrome_ui_overrides(value: Bookmarksui): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome_ui_overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChrome_ui_overrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome_ui_overrides")(js.undefined)
        ret
    }
    @scala.inline
    def withChrome_url_overrides(value: Bookmarks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome_url_overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChrome_url_overrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome_url_overrides")(js.undefined)
        ret
    }
    @scala.inline
    def withCommands(value: StringDictionary[Description]): Self = {
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
    def withContent_capabilities(value: Matches): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_capabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent_capabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_capabilities")(js.undefined)
        ret
    }
    @scala.inline
    def withContent_scripts(value: js.Array[Allframes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_scripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent_scripts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_scripts")(js.undefined)
        ret
    }
    @scala.inline
    def withContent_security_policy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_security_policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent_security_policy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_security_policy")(js.undefined)
        ret
    }
    @scala.inline
    def withConverted_from_user_script(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("converted_from_user_script")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConverted_from_user_script: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("converted_from_user_script")(js.undefined)
        ret
    }
    @scala.inline
    def withCopresence(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copresence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopresence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copresence")(js.undefined)
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
    def withDevtools_page(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devtools_page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevtools_page: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devtools_page")(js.undefined)
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
    def withExport(value: Whitelist): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("export")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("export")(js.undefined)
        ret
    }
    @scala.inline
    def withExternally_connectable(value: Acceptstlschannelid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externally_connectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternally_connectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externally_connectable")(js.undefined)
        ret
    }
    @scala.inline
    def withFile_browser_handlers(value: js.Array[Defaulttitle]): Self = {
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
    def withHomepage_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homepage_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomepage_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homepage_url")(js.undefined)
        ret
    }
    @scala.inline
    def withIcons(value: typingsSlinky.chrome.chrome.runtime.ManifestIcons): Self = {
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
    def withIncognito(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incognito")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncognito: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incognito")(js.undefined)
        ret
    }
    @scala.inline
    def withInput_components(value: js.Array[Language]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input_components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput_components: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input_components")(js.undefined)
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
    def withOmnibox(value: Keyword): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omnibox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOmnibox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omnibox")(js.undefined)
        ret
    }
    @scala.inline
    def withOptional_permissions(value: js.Array[String]): Self = {
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
    def withOptions_page(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options_page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions_page: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options_page")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions_ui(value: Chromestyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options_ui")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions_ui: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options_ui")(js.undefined)
        ret
    }
    @scala.inline
    def withPage_action(value: typingsSlinky.chrome.chrome.runtime.ManifestAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage_action: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_action")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissions(value: js.Array[String]): Self = {
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
    def withPlugins(value: js.Array[Path]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
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
    def withSpellcheck(value: Dictionaryformat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellcheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpellcheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellcheck")(js.undefined)
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
    def withSystem_indicator(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system_indicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystem_indicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system_indicator")(js.undefined)
        ret
    }
    @scala.inline
    def withTts_engine(value: Voices): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tts_engine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTts_engine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tts_engine")(js.undefined)
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
    def withWeb_accessible_resources(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("web_accessible_resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeb_accessible_resources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("web_accessible_resources")(js.undefined)
        ret
    }
  }
  
}


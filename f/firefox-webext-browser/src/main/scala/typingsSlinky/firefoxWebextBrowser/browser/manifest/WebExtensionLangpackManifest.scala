package typingsSlinky.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.firefoxWebextBrowser.anon.Basepath
import typingsSlinky.firefoxWebextBrowser.anon.Chromeresources
import typingsSlinky.firefoxWebextBrowser.anon.Edge
import typingsSlinky.firefoxWebextBrowser.anon.Gecko
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a WebExtension language pack manifest.json file */
@js.native
trait WebExtensionLangpackManifest extends js.Object {
  var applications: js.UndefOr[Gecko] = js.native
  var author: js.UndefOr[String] = js.native
  var browser_specific_settings: js.UndefOr[Edge] = js.native
  var description: js.UndefOr[String] = js.native
  var homepage_url: js.UndefOr[String] = js.native
  var langpack_id: String = js.native
  var languages: StringDictionary[Chromeresources] = js.native
  var manifest_version: Double = js.native
  var name: String = js.native
  var short_name: js.UndefOr[String] = js.native
  var sources: js.UndefOr[StringDictionary[Basepath]] = js.native
  var version: String = js.native
}

object WebExtensionLangpackManifest {
  @scala.inline
  def apply(
    langpack_id: String,
    languages: StringDictionary[Chromeresources],
    manifest_version: Double,
    name: String,
    version: String
  ): WebExtensionLangpackManifest = {
    val __obj = js.Dynamic.literal(langpack_id = langpack_id.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionLangpackManifest]
  }
  @scala.inline
  implicit class WebExtensionLangpackManifestOps[Self <: WebExtensionLangpackManifest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLangpack_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("langpack_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguages(value: StringDictionary[Chromeresources]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withApplications(value: Gecko): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applications")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthor(value: String): Self = {
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
    def withBrowser_specific_settings(value: Edge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser_specific_settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowser_specific_settings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser_specific_settings")(js.undefined)
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
    def withSources(value: StringDictionary[Basepath]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(js.undefined)
        ret
    }
  }
  
}


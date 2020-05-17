package typingsSlinky.firefoxWebextBrowser.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.firefoxWebextBrowser.browser.manifest.ExtensionURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chromeresources extends js.Object {
  var chrome_resources: StringDictionary[ExtensionURL | StringDictionary[ExtensionURL]] = js.native
  var version: String = js.native
}

object Chromeresources {
  @scala.inline
  def apply(chrome_resources: StringDictionary[ExtensionURL | StringDictionary[ExtensionURL]], version: String): Chromeresources = {
    val __obj = js.Dynamic.literal(chrome_resources = chrome_resources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chromeresources]
  }
  @scala.inline
  implicit class ChromeresourcesOps[Self <: Chromeresources] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChrome_resources(value: StringDictionary[ExtensionURL | StringDictionary[ExtensionURL]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome_resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


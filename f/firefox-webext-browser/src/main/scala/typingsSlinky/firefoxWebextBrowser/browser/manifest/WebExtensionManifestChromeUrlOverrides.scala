package typingsSlinky.firefoxWebextBrowser.browser.manifest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebExtensionManifestChromeUrlOverrides extends js.Object {
  
  /** @deprecated Unsupported on Firefox at this time. */
  var bookmarks: js.UndefOr[ExtensionURL] = js.native
  
  /** @deprecated Unsupported on Firefox at this time. */
  var history: js.UndefOr[ExtensionURL] = js.native
  
  var newtab: js.UndefOr[ExtensionURL] = js.native
}
object WebExtensionManifestChromeUrlOverrides {
  
  @scala.inline
  def apply(): WebExtensionManifestChromeUrlOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebExtensionManifestChromeUrlOverrides]
  }
  
  @scala.inline
  implicit class WebExtensionManifestChromeUrlOverridesOps[Self <: WebExtensionManifestChromeUrlOverrides] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBookmarks(value: ExtensionURL): Self = this.set("bookmarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBookmarks: Self = this.set("bookmarks", js.undefined)
    
    @scala.inline
    def setHistory(value: ExtensionURL): Self = this.set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
    
    @scala.inline
    def setNewtab(value: ExtensionURL): Self = this.set("newtab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewtab: Self = this.set("newtab", js.undefined)
  }
}

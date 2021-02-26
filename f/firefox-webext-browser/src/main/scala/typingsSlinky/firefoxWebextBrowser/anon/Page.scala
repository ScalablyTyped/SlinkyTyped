package typingsSlinky.firefoxWebextBrowser.anon

import typingsSlinky.firefoxWebextBrowser.browser.manifest.ExtensionURL
import typingsSlinky.firefoxWebextBrowser.browser.manifest.PersistentBackgroundProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Page extends StObject {
  
  var page: ExtensionURL = js.native
  
  var persistent: js.UndefOr[PersistentBackgroundProperty] = js.native
}
object Page {
  
  @scala.inline
  def apply(page: ExtensionURL): Page = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
  
  @scala.inline
  implicit class PageMutableBuilder[Self <: Page] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPage(value: ExtensionURL): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistent(value: PersistentBackgroundProperty): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
  }
}

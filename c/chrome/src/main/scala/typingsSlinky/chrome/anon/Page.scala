package typingsSlinky.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Page extends StObject {
  
  var page: js.UndefOr[String] = js.native
  
  var persistent: js.UndefOr[Boolean] = js.native
  
  var scripts: js.UndefOr[js.Array[String]] = js.native
}
object Page {
  
  @scala.inline
  def apply(): Page = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Page]
  }
  
  @scala.inline
  implicit class PageMutableBuilder[Self <: Page] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    
    @scala.inline
    def setScripts(value: js.Array[String]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
    
    @scala.inline
    def setScriptsVarargs(value: String*): Self = StObject.set(x, "scripts", js.Array(value :_*))
  }
}

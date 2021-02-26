package typingsSlinky.chromeApps.WebView

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The type of injection item: code or a set of files. */
@js.native
trait InjectionItems extends StObject {
  
  /** JavaScript code or CSS to be injected into matching pages. */
  var code: js.UndefOr[String] = js.native
  
  /**
    * The list of JavaScript or CSS files to be injected into matching pages.
    * These are injected in the order they appear in this array.
    */
  var files: js.UndefOr[js.Array[_]] = js.native
}
object InjectionItems {
  
  @scala.inline
  def apply(): InjectionItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InjectionItems]
  }
  
  @scala.inline
  implicit class InjectionItemsMutableBuilder[Self <: InjectionItems] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setFiles(value: js.Array[_]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: js.Any*): Self = StObject.set(x, "files", js.Array(value :_*))
  }
}

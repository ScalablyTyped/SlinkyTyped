package typingsSlinky.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Page extends StObject {
  
  /** The Markdown content of the page. You can use (== include {path} ==) to include content from a Markdown file. */
  var content: js.UndefOr[String] = js.native
  
  /**
    * The name of the page. It will be used as an identity of the page to generate URI of the page, text of the link to this page in navigation, etc. The full page name (start from the
    * root page name to this page concatenated with `.`) can be used as reference to the page in your documentation. For example: pages: - name: Tutorial content: (== include tutorial.md
    * ==) subpages: - name: Java content: (== include tutorial_java.md ==) You can reference `Java` page using Markdown reference link syntax: `Java`.
    */
  var name: js.UndefOr[String] = js.native
  
  /** Subpages of this page. The order of subpages specified here will be honored in the generated docset. */
  var subpages: js.UndefOr[js.Array[Page]] = js.native
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
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSubpages(value: js.Array[Page]): Self = StObject.set(x, "subpages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubpagesUndefined: Self = StObject.set(x, "subpages", js.undefined)
    
    @scala.inline
    def setSubpagesVarargs(value: Page*): Self = StObject.set(x, "subpages", js.Array(value :_*))
  }
}

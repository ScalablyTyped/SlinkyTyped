package typingsSlinky.firefoxWebextBrowser.browser.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object describing filters to apply to webRequest events. */
@js.native
trait RequestFilter extends js.Object {
  
  /** If provided, requests that do not match the incognito state will be filtered out. */
  var incognito: js.UndefOr[Boolean] = js.native
  
  var tabId: js.UndefOr[Double] = js.native
  
  /** A list of request types. Requests that cannot match any of the types will be filtered out. */
  var types: js.UndefOr[js.Array[ResourceType]] = js.native
  
  /** A list of URLs or URL patterns. Requests that cannot match any of the URLs will be filtered out. */
  var urls: js.Array[String] = js.native
  
  var windowId: js.UndefOr[Double] = js.native
}
object RequestFilter {
  
  @scala.inline
  def apply(urls: js.Array[String]): RequestFilter = {
    val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestFilter]
  }
  
  @scala.inline
  implicit class RequestFilterOps[Self <: RequestFilter] (val x: Self) extends AnyVal {
    
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
    def setUrlsVarargs(value: String*): Self = this.set("urls", js.Array(value :_*))
    
    @scala.inline
    def setUrls(value: js.Array[String]): Self = this.set("urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncognito(value: Boolean): Self = this.set("incognito", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncognito: Self = this.set("incognito", js.undefined)
    
    @scala.inline
    def setTabId(value: Double): Self = this.set("tabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabId: Self = this.set("tabId", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: ResourceType*): Self = this.set("types", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: js.Array[ResourceType]): Self = this.set("types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
    
    @scala.inline
    def setWindowId(value: Double): Self = this.set("windowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowId: Self = this.set("windowId", js.undefined)
  }
}

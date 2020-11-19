package typingsSlinky.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirstPartyDomain extends js.Object {
  
  /**
    * The first-party domain associated with the cookie. This attribute is required if First-Party Isolation is
    * enabled.
    */
  var firstPartyDomain: js.UndefOr[String] = js.native
  
  /** The name of the cookie to remove. */
  var name: String = js.native
  
  /**
    * The ID of the cookie store to look in for the cookie. If unspecified, the cookie is looked for by default in
    * the current execution context's cookie store.
    */
  var storeId: js.UndefOr[String] = js.native
  
  /**
    * The URL associated with the cookie. If host permissions for this URL are not specified in the manifest file,
    * the API call will fail.
    */
  var url: String = js.native
}
object FirstPartyDomain {
  
  @scala.inline
  def apply(name: String, url: String): FirstPartyDomain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstPartyDomain]
  }
  
  @scala.inline
  implicit class FirstPartyDomainOps[Self <: FirstPartyDomain] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstPartyDomain(value: String): Self = this.set("firstPartyDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstPartyDomain: Self = this.set("firstPartyDomain", js.undefined)
    
    @scala.inline
    def setStoreId(value: String): Self = this.set("storeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreId: Self = this.set("storeId", js.undefined)
  }
}

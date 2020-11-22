package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SiteCollection extends js.Object {
  
  // The geographic region code for where this site collection resides. Read-only.
  var dataLocationCode: js.UndefOr[NullableOption[String]] = js.native
  
  // The hostname for the site collection. Read-only.
  var hostname: js.UndefOr[NullableOption[String]] = js.native
  
  // If present, indicates that this is a root site collection in SharePoint. Read-only.
  var root: js.UndefOr[NullableOption[Root]] = js.native
}
object SiteCollection {
  
  @scala.inline
  def apply(): SiteCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiteCollection]
  }
  
  @scala.inline
  implicit class SiteCollectionOps[Self <: SiteCollection] (val x: Self) extends AnyVal {
    
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
    def setDataLocationCode(value: NullableOption[String]): Self = this.set("dataLocationCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataLocationCode: Self = this.set("dataLocationCode", js.undefined)
    
    @scala.inline
    def setDataLocationCodeNull: Self = this.set("dataLocationCode", null)
    
    @scala.inline
    def setHostname(value: NullableOption[String]): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    
    @scala.inline
    def setHostnameNull: Self = this.set("hostname", null)
    
    @scala.inline
    def setRoot(value: NullableOption[Root]): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootNull: Self = this.set("root", null)
  }
}

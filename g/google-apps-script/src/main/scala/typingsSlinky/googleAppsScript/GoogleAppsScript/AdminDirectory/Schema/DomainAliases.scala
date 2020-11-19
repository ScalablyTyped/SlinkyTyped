package typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainAliases extends js.Object {
  
  var domainAliases: js.UndefOr[js.Array[DomainAlias]] = js.native
  
  var etag: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
}
object DomainAliases {
  
  @scala.inline
  def apply(): DomainAliases = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainAliases]
  }
  
  @scala.inline
  implicit class DomainAliasesOps[Self <: DomainAliases] (val x: Self) extends AnyVal {
    
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
    def setDomainAliasesVarargs(value: DomainAlias*): Self = this.set("domainAliases", js.Array(value :_*))
    
    @scala.inline
    def setDomainAliases(value: js.Array[DomainAlias]): Self = this.set("domainAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainAliases: Self = this.set("domainAliases", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}

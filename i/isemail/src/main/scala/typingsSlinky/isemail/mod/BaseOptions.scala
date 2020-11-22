package typingsSlinky.isemail.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseOptions extends js.Object {
  
  var allowUnicode: js.UndefOr[Boolean] = js.native
  
  var minDomainAtoms: js.UndefOr[Double] = js.native
  
  var tldBlacklist: js.UndefOr[TLDList] = js.native
  
  var tldWhitelist: js.UndefOr[TLDList] = js.native
}
object BaseOptions {
  
  @scala.inline
  def apply(): BaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseOptions]
  }
  
  @scala.inline
  implicit class BaseOptionsOps[Self <: BaseOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowUnicode(value: Boolean): Self = this.set("allowUnicode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowUnicode: Self = this.set("allowUnicode", js.undefined)
    
    @scala.inline
    def setMinDomainAtoms(value: Double): Self = this.set("minDomainAtoms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDomainAtoms: Self = this.set("minDomainAtoms", js.undefined)
    
    @scala.inline
    def setTldBlacklistVarargs(value: String*): Self = this.set("tldBlacklist", js.Array(value :_*))
    
    @scala.inline
    def setTldBlacklist(value: TLDList): Self = this.set("tldBlacklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTldBlacklist: Self = this.set("tldBlacklist", js.undefined)
    
    @scala.inline
    def setTldWhitelistVarargs(value: String*): Self = this.set("tldWhitelist", js.Array(value :_*))
    
    @scala.inline
    def setTldWhitelist(value: TLDList): Self = this.set("tldWhitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTldWhitelist: Self = this.set("tldWhitelist", js.undefined)
  }
}

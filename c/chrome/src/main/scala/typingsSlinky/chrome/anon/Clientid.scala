package typingsSlinky.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Clientid extends js.Object {
  
  var client_id: String = js.native
  
  var scopes: js.UndefOr[js.Array[String]] = js.native
}
object Clientid {
  
  @scala.inline
  def apply(client_id: String): Clientid = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clientid]
  }
  
  @scala.inline
  implicit class ClientidOps[Self <: Clientid] (val x: Self) extends AnyVal {
    
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
    def setClient_id(value: String): Self = this.set("client_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopesVarargs(value: String*): Self = this.set("scopes", js.Array(value :_*))
    
    @scala.inline
    def setScopes(value: js.Array[String]): Self = this.set("scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopes: Self = this.set("scopes", js.undefined)
  }
}

package typingsSlinky.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TiersListResponse extends js.Object {
  
  /** List of tiers. */
  var items: js.UndefOr[js.Array[Tier]] = js.native
  
  /** This is always sql#tiersList. */
  var kind: js.UndefOr[String] = js.native
}
object TiersListResponse {
  
  @scala.inline
  def apply(): TiersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TiersListResponse]
  }
  
  @scala.inline
  implicit class TiersListResponseOps[Self <: TiersListResponse] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: Tier*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[Tier]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}

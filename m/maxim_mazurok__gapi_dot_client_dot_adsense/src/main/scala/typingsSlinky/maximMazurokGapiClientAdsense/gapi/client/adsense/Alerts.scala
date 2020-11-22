package typingsSlinky.maximMazurokGapiClientAdsense.gapi.client.adsense

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alerts extends js.Object {
  
  /** The alerts returned in this list response. */
  var items: js.UndefOr[js.Array[Alert]] = js.native
  
  /** Kind of list this is, in this case adsense#alerts. */
  var kind: js.UndefOr[String] = js.native
}
object Alerts {
  
  @scala.inline
  def apply(): Alerts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alerts]
  }
  
  @scala.inline
  implicit class AlertsOps[Self <: Alerts] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: Alert*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[Alert]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}

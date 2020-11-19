package typingsSlinky.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientCertificates extends js.Object {
  
  /**
    * The current page of elements from this collection.
    */
  var items: js.UndefOr[ListOfClientCertificate] = js.native
  
  var position: js.UndefOr[String] = js.native
}
object ClientCertificates {
  
  @scala.inline
  def apply(): ClientCertificates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientCertificates]
  }
  
  @scala.inline
  implicit class ClientCertificatesOps[Self <: ClientCertificates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setItemsVarargs(value: ClientCertificate*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: ListOfClientCertificate): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
}

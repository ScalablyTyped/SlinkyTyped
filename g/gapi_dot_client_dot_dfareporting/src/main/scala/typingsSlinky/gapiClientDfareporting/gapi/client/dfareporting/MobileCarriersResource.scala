package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDfareporting.anon.Fields
import typingsSlinky.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MobileCarriersResource extends js.Object {
  
  /** Gets one mobile carrier by ID. */
  def get(request: Fields): Request[MobileCarrier] = js.native
  
  /** Retrieves a list of mobile carriers. */
  def list(request: Key): Request[MobileCarriersListResponse] = js.native
}
object MobileCarriersResource {
  
  @scala.inline
  def apply(get: Fields => Request[MobileCarrier], list: Key => Request[MobileCarriersListResponse]): MobileCarriersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[MobileCarriersResource]
  }
  
  @scala.inline
  implicit class MobileCarriersResourceOps[Self <: MobileCarriersResource] (val x: Self) extends AnyVal {
    
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
    def setGet(value: Fields => Request[MobileCarrier]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setList(value: Key => Request[MobileCarriersListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
}

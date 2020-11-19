package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDfareporting.anon.Id
import typingsSlinky.gapiClientDfareporting.anon.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrdersResource extends js.Object {
  
  /** Gets one order by ID. */
  def get(request: Id): Request[Order] = js.native
  
  /** Retrieves a list of orders, possibly filtered. This method supports paging. */
  def list(request: ProjectId): Request[OrdersListResponse] = js.native
}
object OrdersResource {
  
  @scala.inline
  def apply(get: Id => Request[Order], list: ProjectId => Request[OrdersListResponse]): OrdersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[OrdersResource]
  }
  
  @scala.inline
  implicit class OrdersResourceOps[Self <: OrdersResource] (val x: Self) extends AnyVal {
    
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
    def setGet(value: Id => Request[Order]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setList(value: ProjectId => Request[OrdersListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
}

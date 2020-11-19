package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDfareporting.anon.DirectorySiteIds
import typingsSlinky.gapiClientDfareporting.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectorySiteContactsResource extends js.Object {
  
  /** Gets one directory site contact by ID. */
  def get(request: Fields): Request[DirectorySiteContact] = js.native
  
  /** Retrieves a list of directory site contacts, possibly filtered. This method supports paging. */
  def list(request: DirectorySiteIds): Request[DirectorySiteContactsListResponse] = js.native
}
object DirectorySiteContactsResource {
  
  @scala.inline
  def apply(
    get: Fields => Request[DirectorySiteContact],
    list: DirectorySiteIds => Request[DirectorySiteContactsListResponse]
  ): DirectorySiteContactsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[DirectorySiteContactsResource]
  }
  
  @scala.inline
  implicit class DirectorySiteContactsResourceOps[Self <: DirectorySiteContactsResource] (val x: Self) extends AnyVal {
    
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
    def setGet(value: Fields => Request[DirectorySiteContact]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setList(value: DirectorySiteIds => Request[DirectorySiteContactsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
}

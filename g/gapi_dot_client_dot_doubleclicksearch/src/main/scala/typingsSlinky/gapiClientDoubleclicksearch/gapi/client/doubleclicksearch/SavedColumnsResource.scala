package typingsSlinky.gapiClientDoubleclicksearch.gapi.client.doubleclicksearch

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDoubleclicksearch.anon.AgencyId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavedColumnsResource extends js.Object {
  
  /** Retrieve the list of saved columns for a specified advertiser. */
  def list(request: AgencyId): Request[SavedColumnList] = js.native
}
object SavedColumnsResource {
  
  @scala.inline
  def apply(list: AgencyId => Request[SavedColumnList]): SavedColumnsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[SavedColumnsResource]
  }
  
  @scala.inline
  implicit class SavedColumnsResourceOps[Self <: SavedColumnsResource] (val x: Self) extends AnyVal {
    
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
    def setList(value: AgencyId => Request[SavedColumnList]): Self = this.set("list", js.Any.fromFunction1(value))
  }
}

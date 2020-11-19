package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAndroidenterprise.anon.GroupLicenseId
import typingsSlinky.gapiClientAndroidenterprise.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrouplicensesResource extends js.Object {
  
  /** Retrieves details of an enterprise's group license for a product. */
  def get(request: GroupLicenseId): Request[GroupLicense] = js.native
  
  /** Retrieves IDs of all products for which the enterprise has a group license. */
  def list(request: Key): Request[GroupLicensesListResponse] = js.native
}
object GrouplicensesResource {
  
  @scala.inline
  def apply(get: GroupLicenseId => Request[GroupLicense], list: Key => Request[GroupLicensesListResponse]): GrouplicensesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[GrouplicensesResource]
  }
  
  @scala.inline
  implicit class GrouplicensesResourceOps[Self <: GrouplicensesResource] (val x: Self) extends AnyVal {
    
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
    def setGet(value: GroupLicenseId => Request[GroupLicense]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setList(value: Key => Request[GroupLicensesListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
}

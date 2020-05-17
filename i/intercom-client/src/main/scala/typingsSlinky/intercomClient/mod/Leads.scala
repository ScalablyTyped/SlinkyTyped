package typingsSlinky.intercomClient.mod

import typingsSlinky.intercomClient.anon.Contact
import typingsSlinky.intercomClient.anon.PartialLead
import typingsSlinky.intercomClient.anon.Tagid
import typingsSlinky.intercomClient.leadMod.Lead
import typingsSlinky.intercomClient.leadMod.LeadIdentifier
import typingsSlinky.intercomClient.leadMod.List
import typingsSlinky.intercomClient.userMod.UserIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intercom-client", "Leads")
@js.native
class Leads () extends js.Object {
  def convert(params: Contact): js.Promise[ApiResponse[Lead]] = js.native
  def convert(params: Contact, cb: callback[ApiResponse[Lead]]): Unit = js.native
  def create(lead: PartialLead): js.Promise[ApiResponse[Lead]] = js.native
  def create(lead: PartialLead, cb: callback[ApiResponse[Lead]]): Unit = js.native
  def delete(id: String): js.Promise[ApiResponse[Lead]] = js.native
  def delete(id: String, cb: callback[ApiResponse[Lead]]): Unit = js.native
  def find(identifier: LeadIdentifier): js.Promise[ApiResponse[Lead]] = js.native
  def find(identifier: LeadIdentifier, cb: callback[ApiResponse[Lead]]): Unit = js.native
  def list(): js.Promise[ApiResponse[List]] = js.native
  def list(cb: callback[ApiResponse[List]]): Unit = js.native
  def listBy(params: Tagid): js.Promise[ApiResponse[List]] = js.native
  def listBy(params: Tagid, cb: callback[ApiResponse[List]]): Unit = js.native
  def update(lead: UserIdentifier with PartialLead): js.Promise[ApiResponse[Lead]] = js.native
  def update(lead: UserIdentifier with PartialLead, cb: callback[ApiResponse[Lead]]): Unit = js.native
}


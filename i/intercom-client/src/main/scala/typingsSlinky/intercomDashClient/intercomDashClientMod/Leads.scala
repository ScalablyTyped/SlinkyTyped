package typingsSlinky.intercomDashClient.intercomDashClientMod

import typingsSlinky.intercomDashClient.Anon_Contact
import typingsSlinky.intercomDashClient.Anon_EmailSegmentid
import typingsSlinky.intercomDashClient.leadMod.Lead
import typingsSlinky.intercomDashClient.leadMod.LeadIdentifier
import typingsSlinky.intercomDashClient.leadMod.List
import typingsSlinky.intercomDashClient.userMod.UserIdentifier
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intercom-client", "Leads")
@js.native
class Leads () extends js.Object {
  def convert(params: Anon_Contact): js.Promise[ApiResponse[Lead]] = js.native
  def convert(params: Anon_Contact, cb: callback[ApiResponse[Lead]]): Unit = js.native
  def create(lead: Partial[Lead]): js.Promise[ApiResponse[Lead]] = js.native
  def create(lead: Partial[Lead], cb: callback[ApiResponse[Lead]]): Unit = js.native
  def delete(id: String): js.Promise[ApiResponse[Lead]] = js.native
  def delete(id: String, cb: callback[ApiResponse[Lead]]): Unit = js.native
  def find(identifier: LeadIdentifier): js.Promise[ApiResponse[Lead]] = js.native
  def find(identifier: LeadIdentifier, cb: callback[ApiResponse[Lead]]): Unit = js.native
  def list(): js.Promise[ApiResponse[List]] = js.native
  def list(cb: callback[ApiResponse[List]]): Unit = js.native
  def listBy(params: Anon_EmailSegmentid): js.Promise[ApiResponse[List]] = js.native
  def listBy(params: Anon_EmailSegmentid, cb: callback[ApiResponse[List]]): Unit = js.native
  def update(lead: UserIdentifier with Partial[Lead]): js.Promise[ApiResponse[Lead]] = js.native
  def update(lead: UserIdentifier with Partial[Lead], cb: callback[ApiResponse[Lead]]): Unit = js.native
}


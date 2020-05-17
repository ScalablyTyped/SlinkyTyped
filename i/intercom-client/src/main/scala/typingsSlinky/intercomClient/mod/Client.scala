package typingsSlinky.intercomClient.mod

import typingsSlinky.intercomClient.anon.AppApiKey
import typingsSlinky.intercomClient.anon.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intercom-client", "Client")
@js.native
class Client protected () extends js.Object {
  def this(auth: AppApiKey) = this()
  def this(auth: Token) = this()
  def this(username: String, password: String) = this()
  var companies: Companies = js.native
  var contacts: Leads = js.native
  var events: Events = js.native
  var leads: Leads = js.native
  var messages: Messages = js.native
  var tags: Tags = js.native
  var users: Users = js.native
  var visitors: Visitors = js.native
}


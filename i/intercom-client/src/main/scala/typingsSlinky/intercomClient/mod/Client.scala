package typingsSlinky.intercomClient.mod

import typingsSlinky.intercomClient.anon.AppApiKey
import typingsSlinky.intercomClient.anon.Token
import typingsSlinky.request.mod.CoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  /**
    * client library also supports passing in `request` options
    * Note that certain request options (such as `json`, and certain `headers` names cannot be overridden).
    */
  def useRequestOpts(): this.type = js.native
  def useRequestOpts(options: CoreOptions): this.type = js.native
  
  var users: Users = js.native
  
  var visitors: Visitors = js.native
}

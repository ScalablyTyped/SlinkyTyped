package typingsSlinky.postmark.mod

import typingsSlinky.postmark.modelsMod.ClientOptions.Configuration
import typingsSlinky.postmark.serverClientMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark", "Client")
@js.native
class Client protected () extends default {
  /**
    * Create a client.
    *
    * @param serverToken - The token for the server that you wish to interact with.
    * @param configOptions - Options to customize the behavior of the this client.
    */
  def this(serverToken: String) = this()
  def this(serverToken: String, configOptions: Configuration) = this()
}

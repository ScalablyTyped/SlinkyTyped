package typingsSlinky.postmark.mod

import typingsSlinky.postmark.accountClientMod.default
import typingsSlinky.postmark.modelsMod.ClientOptions.Configuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark", "AccountClient")
@js.native
class AccountClient protected () extends default {
  /**
    * Create a new AccountClient
    * @param accountToken The account token that should be used with requests.
    * @param configOptions Various options to customize client behavior.
    */
  def this(accountToken: String) = this()
  def this(accountToken: String, configOptions: Configuration) = this()
}

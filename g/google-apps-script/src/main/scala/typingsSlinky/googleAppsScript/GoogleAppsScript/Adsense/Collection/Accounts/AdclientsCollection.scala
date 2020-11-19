package typingsSlinky.googleAppsScript.GoogleAppsScript.Adsense.Collection.Accounts

import typingsSlinky.googleAppsScript.GoogleAppsScript.Adsense.Schema.AdClients
import typingsSlinky.googleAppsScript.GoogleAppsScript.Adsense.Schema.AdCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdclientsCollection extends js.Object {
  
  // Get Auto ad code for a given ad client.
  def getAdCode(accountId: String, adClientId: String): AdCode = js.native
  
  // List all ad clients in the specified account.
  def list(accountId: String): AdClients = js.native
  // List all ad clients in the specified account.
  def list(accountId: String, optionalArgs: js.Object): AdClients = js.native
}

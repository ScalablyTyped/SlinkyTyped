package typingsSlinky.azdata.mod

import typingsSlinky.vscode.Thenable
import typingsSlinky.vscode.mod.Disposable
import typingsSlinky.vscode.mod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azdata", "accounts")
@js.native
object accounts extends js.Object {
  
  def accountUpdated(updatedAccount: Account): Unit = js.native
  
  def beginAutoOAuthDeviceCode(providerId: String, title: String, message: String, userCode: String, uri: String): Thenable[Unit] = js.native
  
  def endAutoOAuthDeviceCode(): Unit = js.native
  
  def getAllAccounts(): Thenable[js.Array[Account]] = js.native
  
  def getSecurityToken(account: Account): Thenable[js.Object] = js.native
  def getSecurityToken(account: Account, resource: AzureResource): Thenable[js.Object] = js.native
  
  val onDidChangeAccounts: Event[DidChangeAccountsParams] = js.native
  
  def registerAccountProvider(providerMetadata: AccountProviderMetadata, provider: AccountProvider): Disposable = js.native
}

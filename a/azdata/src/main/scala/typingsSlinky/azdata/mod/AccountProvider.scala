package typingsSlinky.azdata.mod

import typingsSlinky.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountProvider extends js.Object {
  /**
  		 * Called from the account management service when the user has cancelled an auto OAuth
  		 * authorization process. Implementations should use this to cancel any polling process
  		 * and call the end OAuth method.
  		 */
  def autoOAuthCancelled(): Thenable[Unit] = js.native
  /**
  		 * Clears sensitive information for an account. To be called when account is removed
  		 * @param accountKey - Key that uniquely identifies the account to clear
  		 */
  def clear(accountKey: AccountKey): Thenable[Unit] = js.native
  /**
  		 * Generates a security token for the provided account
  		 * @param account The account to generate a security token for
  		 * @param resource The resource to get the token for
  		 * @return Promise to return a security token object
  		 */
  def getSecurityToken(account: Account, resource: AzureResource): Thenable[js.Object] = js.native
  /**
  		 * Initializes the account provider with the accounts restored from the memento,
  		 * @param storedAccounts Accounts restored from the memento
  		 * @return Account objects after being rehydrated (if necessary)
  		 */
  def initialize(storedAccounts: js.Array[Account]): Thenable[js.Array[Account]] = js.native
  /**
  		 * Prompts the user to enter account information.
  		 * Returns an error if the user canceled the operation.
  		 */
  def prompt(): Thenable[Account | PromptFailedResult] = js.native
  /**
  		 * Refreshes a stale account.
  		 * Returns an error if the user canceled the operation.
  		 * Otherwise, returns a new updated account instance.
  		 * @param account - An account.
  		 */
  def refresh(account: Account): Thenable[Account | PromptFailedResult] = js.native
}

object AccountProvider {
  @scala.inline
  def apply(
    autoOAuthCancelled: () => Thenable[Unit],
    clear: AccountKey => Thenable[Unit],
    getSecurityToken: (Account, AzureResource) => Thenable[js.Object],
    initialize: js.Array[Account] => Thenable[js.Array[Account]],
    prompt: () => Thenable[Account | PromptFailedResult],
    refresh: Account => Thenable[Account | PromptFailedResult]
  ): AccountProvider = {
    val __obj = js.Dynamic.literal(autoOAuthCancelled = js.Any.fromFunction0(autoOAuthCancelled), clear = js.Any.fromFunction1(clear), getSecurityToken = js.Any.fromFunction2(getSecurityToken), initialize = js.Any.fromFunction1(initialize), prompt = js.Any.fromFunction0(prompt), refresh = js.Any.fromFunction1(refresh))
    __obj.asInstanceOf[AccountProvider]
  }
  @scala.inline
  implicit class AccountProviderOps[Self <: AccountProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoOAuthCancelled(value: () => Thenable[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoOAuthCancelled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClear(value: AccountKey => Thenable[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSecurityToken(value: (Account, AzureResource) => Thenable[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSecurityToken")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInitialize(value: js.Array[Account] => Thenable[js.Array[Account]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPrompt(value: () => Thenable[Account | PromptFailedResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRefresh(value: Account => Thenable[Account | PromptFailedResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


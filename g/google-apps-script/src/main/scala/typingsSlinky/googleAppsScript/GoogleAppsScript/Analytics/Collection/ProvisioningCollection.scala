package typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.AccountTicket
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.AccountTreeRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.AccountTreeResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisioningCollection extends js.Object {
  // Creates an account ticket.
  def createAccountTicket(resource: AccountTicket): AccountTicket = js.native
  // Provision account.
  def createAccountTree(resource: AccountTreeRequest): AccountTreeResponse = js.native
}

object ProvisioningCollection {
  @scala.inline
  def apply(
    createAccountTicket: AccountTicket => AccountTicket,
    createAccountTree: AccountTreeRequest => AccountTreeResponse
  ): ProvisioningCollection = {
    val __obj = js.Dynamic.literal(createAccountTicket = js.Any.fromFunction1(createAccountTicket), createAccountTree = js.Any.fromFunction1(createAccountTree))
    __obj.asInstanceOf[ProvisioningCollection]
  }
  @scala.inline
  implicit class ProvisioningCollectionOps[Self <: ProvisioningCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateAccountTicket(value: AccountTicket => AccountTicket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createAccountTicket")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateAccountTree(value: AccountTreeRequest => AccountTreeResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createAccountTree")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


package typingsSlinky.reactPlaidLink.mod

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactPlaidLink.AnonAccounts
import typingsSlinky.reactPlaidLink.AnonDisplaymessage
import typingsSlinky.reactPlaidLink.AnonEmailAddress
import typingsSlinky.reactPlaidLink.AnonErrorcode
import typingsSlinky.reactPlaidLink.AnonInstitution
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.ERROR
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.EXIT
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.HANDOFF
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.OPEN
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.OPEN_MY_PLAID
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.SEARCH_INSTITUTION
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.SELECT_INSTITUTION
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.SUBMIT_CREDENTIALS
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.SUBMIT_MFA
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.TRANSITION_VIEW
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.assets
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.auth
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.connect
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.development
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.identity
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.income
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.info
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.investments
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.liabilities
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.payment_initiation
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.production
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.sandbox
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.tartan
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.transactions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaidLinkProps extends js.Object {
  // ApiVersion flag to use new version of Plaid API
  var apiVersion: js.UndefOr[String] = js.native
  // Button Class names as a String
  var className: js.UndefOr[String] = js.native
  // Displayed once a user has successfully linked their account
  var clientName: String = js.native
  // The Plaid API environment on which to create user accounts.
  // For development and testing, use tartan. For production, use production
  var env: tartan | sandbox | development | production = js.native
  // Open link to a specific institution, for a more custom solution
  var institution: js.UndefOr[String] = js.native
  // A function that is called during a user's flow in Link.
  // See
  var onEvent: js.UndefOr[
    js.Function2[
      /* eventName */ ERROR | EXIT | HANDOFF | OPEN | OPEN_MY_PLAID | SEARCH_INSTITUTION | SELECT_INSTITUTION | SUBMIT_CREDENTIALS | SUBMIT_MFA | TRANSITION_VIEW, 
      /* metadata */ AnonErrorcode, 
      Unit
    ]
  ] = js.native
  // A function that is called when a user has specifically exited Link flow
  var onExit: js.UndefOr[
    js.Function2[/* error */ AnonDisplaymessage | Null, /* metadata */ AnonInstitution, Unit]
  ] = js.native
  // A function that is called when the Link module has finished loading.
  // Calls to plaidLinkHandler.open() prior to the onLoad callback will be
  // delayed until the module is fully loaded.
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.native
  // The Plaid products you wish to use, an array containing some of connect,
  // auth, identity, income, transactions, assets, liabilities
  var product: js.Array[
    connect | info | auth | identity | income | transactions | assets | liabilities | investments | payment_initiation
  ] = js.native
  // The public_key associated with your account; available from
  // the Plaid dashboard (https://dashboard.plaid.com)
  var publicKey: String = js.native
  // Set to true to launch Link with the 'Select Account' pane enabled.
  // Allows users to select an individual account once they've authenticated
  var selectAccount: js.UndefOr[Boolean] = js.native
  // Button Styles as an Object
  var style: js.UndefOr[CSSProperties] = js.native
  // Specify an existing user's public token to launch Link in update mode.
  // This will cause Link to open directly to the authentication step for
  // that user's institution.
  var token: js.UndefOr[String] = js.native
  // Specify a user object to enable all Auth features. Reach out to your
  // account manager or integrations@plaid.com to get enabled. See the Auth
  // [https://plaid.com/docs#auth] docs for integration details.
  var user: js.UndefOr[AnonEmailAddress] = js.native
  // Specify a webhook to associate with a user.
  var webhook: js.UndefOr[String] = js.native
  // A function that is called when a user has successfully onboarded their
  // account. The function should expect two arguments, the public_key and a
  // metadata object
  def onSuccess(publicToken: String, metadata: AnonAccounts): Unit = js.native
}

object PlaidLinkProps {
  @scala.inline
  def apply(
    clientName: String,
    env: tartan | sandbox | development | production,
    onSuccess: (String, AnonAccounts) => Unit,
    product: js.Array[
      connect | info | auth | identity | income | transactions | assets | liabilities | investments | payment_initiation
    ],
    publicKey: String
  ): PlaidLinkProps = {
    val __obj = js.Dynamic.literal(clientName = clientName.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], onSuccess = js.Any.fromFunction2(onSuccess), product = product.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaidLinkProps]
  }
  @scala.inline
  implicit class PlaidLinkPropsOps[Self <: PlaidLinkProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnv(value: tartan | sandbox | development | production): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnSuccess(value: (String, AnonAccounts) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withProduct(
      value: js.Array[
          connect | info | auth | identity | income | transactions | assets | liabilities | investments | payment_initiation
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApiVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withInstitution(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("institution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstitution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("institution")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEvent(
      value: (/* eventName */ ERROR | EXIT | HANDOFF | OPEN | OPEN_MY_PLAID | SEARCH_INSTITUTION | SELECT_INSTITUTION | SUBMIT_CREDENTIALS | SUBMIT_MFA | TRANSITION_VIEW, /* metadata */ AnonErrorcode) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEvent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExit(value: (/* error */ AnonDisplaymessage | Null, /* metadata */ AnonInstitution) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoad(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectAccount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAccount")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: AnonEmailAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
    @scala.inline
    def withWebhook(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebhook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhook")(js.undefined)
        ret
    }
  }
  
}


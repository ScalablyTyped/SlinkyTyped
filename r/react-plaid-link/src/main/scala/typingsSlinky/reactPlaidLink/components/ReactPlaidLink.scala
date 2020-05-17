package typingsSlinky.reactPlaidLink.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactPlaidLink.anon.Accounts
import typingsSlinky.reactPlaidLink.anon.Displaymessage
import typingsSlinky.reactPlaidLink.anon.EmailAddress
import typingsSlinky.reactPlaidLink.anon.Errorcode
import typingsSlinky.reactPlaidLink.anon.Institution
import typingsSlinky.reactPlaidLink.mod.PlaidLinkProps
import typingsSlinky.reactPlaidLink.mod.default
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

object ReactPlaidLink {
  @JSImport("react-plaid-link", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def apiVersion(value: String): this.type = set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def institution(value: String): this.type = set("institution", value.asInstanceOf[js.Any])
    @scala.inline
    def onEvent(
      value: (/* eventName */ ERROR | EXIT | HANDOFF | OPEN | OPEN_MY_PLAID | SEARCH_INSTITUTION | SELECT_INSTITUTION | SUBMIT_CREDENTIALS | SUBMIT_MFA | TRANSITION_VIEW, /* metadata */ Errorcode) => Unit
    ): this.type = set("onEvent", js.Any.fromFunction2(value))
    @scala.inline
    def onExit(value: (/* error */ Displaymessage | Null, /* metadata */ Institution) => Unit): this.type = set("onExit", js.Any.fromFunction2(value))
    @scala.inline
    def onLoad(value: () => Unit): this.type = set("onLoad", js.Any.fromFunction0(value))
    @scala.inline
    def selectAccount(value: Boolean): this.type = set("selectAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def token(value: String): this.type = set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def user(value: EmailAddress): this.type = set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def webhook(value: String): this.type = set("webhook", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PlaidLinkProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    clientName: String,
    env: tartan | sandbox | development | production,
    onSuccess: (String, Accounts) => Unit,
    product: js.Array[
      connect | info | auth | identity | income | transactions | assets | liabilities | investments | payment_initiation
    ],
    publicKey: String
  ): Builder = {
    val __props = js.Dynamic.literal(clientName = clientName.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], onSuccess = js.Any.fromFunction2(onSuccess), product = product.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PlaidLinkProps]))
  }
}


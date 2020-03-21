package typingsSlinky.reactPlaidLink.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactPlaidLink.AnonAccounts
import typingsSlinky.reactPlaidLink.AnonDisplaymessage
import typingsSlinky.reactPlaidLink.AnonEmailAddress
import typingsSlinky.reactPlaidLink.AnonErrorcode
import typingsSlinky.reactPlaidLink.AnonInstitution
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

object ReactPlaidLink
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-plaid-link", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, style */
  def apply(
    clientName: String,
    env: tartan | sandbox | development | production,
    onSuccess: (String, AnonAccounts) => Unit,
    product: js.Array[
      connect | info | auth | identity | income | transactions | assets | liabilities | investments | payment_initiation
    ],
    publicKey: String,
    apiVersion: String = null,
    institution: String = null,
    onEvent: (/* eventName */ ERROR | EXIT | HANDOFF | OPEN | OPEN_MY_PLAID | SEARCH_INSTITUTION | SELECT_INSTITUTION | SUBMIT_CREDENTIALS | SUBMIT_MFA | TRANSITION_VIEW, /* metadata */ AnonErrorcode) => Unit = null,
    onExit: (/* error */ AnonDisplaymessage | Null, /* metadata */ AnonInstitution) => Unit = null,
    onLoad: () => Unit = null,
    selectAccount: js.UndefOr[Boolean] = js.undefined,
    token: String = null,
    user: AnonEmailAddress = null,
    webhook: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(clientName = clientName.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], onSuccess = js.Any.fromFunction2(onSuccess), product = product.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (institution != null) __obj.updateDynamic("institution")(institution.asInstanceOf[js.Any])
    if (onEvent != null) __obj.updateDynamic("onEvent")(js.Any.fromFunction2(onEvent))
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction2(onExit))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction0(onLoad))
    if (!js.isUndefined(selectAccount)) __obj.updateDynamic("selectAccount")(selectAccount.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (webhook != null) __obj.updateDynamic("webhook")(webhook.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PlaidLinkProps
}


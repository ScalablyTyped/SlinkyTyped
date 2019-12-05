package typingsSlinky.reactDashPlaidDashLink.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashPlaidDashLink.Anon_APIERROR
import typingsSlinky.reactDashPlaidDashLink.Anon_APIERRORASSETREPORTERROR
import typingsSlinky.reactDashPlaidDashLink.Anon_Accounts
import typingsSlinky.reactDashPlaidDashLink.Anon_Choosedevice
import typingsSlinky.reactDashPlaidDashLink.Anon_EmailAddress
import typingsSlinky.reactDashPlaidDashLink.reactDashPlaidDashLinkMod.PlaidLinkProps
import typingsSlinky.reactDashPlaidDashLink.reactDashPlaidDashLinkMod.default
import typingsSlinky.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.ERROR
import typingsSlinky.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.EXIT
import typingsSlinky.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.HANDOFF
import typingsSlinky.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.OPEN
import typingsSlinky.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.OPEN_MY_PLAID
import typingsSlinky.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.SEARCH_INSTITUTION
import typingsSlinky.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.SELECT_INSTITUTION
import typingsSlinky.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.SUBMIT_CREDENTIALS
import typingsSlinky.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.SUBMIT_MFA
import typingsSlinky.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.TRANSITION_VIEW
import typingsSlinky.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.assets
import typingsSlinky.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.auth
import typingsSlinky.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.connect
import typingsSlinky.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.development
import typingsSlinky.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.holdings
import typingsSlinky.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.identity
import typingsSlinky.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.income
import typingsSlinky.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.info
import typingsSlinky.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.liabilities
import typingsSlinky.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.production
import typingsSlinky.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.sandbox
import typingsSlinky.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.tartan
import typingsSlinky.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.transactions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashPlaidDashLink
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-plaid-link", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    clientName: String,
    env: tartan | sandbox | development | production,
    onSuccess: (String, Anon_Accounts) => Unit,
    product: js.Array[
      connect | info | auth | identity | income | transactions | assets | holdings | liabilities
    ],
    publicKey: String,
    apiVersion: String = null,
    institution: String = null,
    onEvent: (/* eventName */ ERROR | EXIT | HANDOFF | OPEN | OPEN_MY_PLAID | SEARCH_INSTITUTION | SELECT_INSTITUTION | SUBMIT_CREDENTIALS | SUBMIT_MFA | TRANSITION_VIEW, /* metadata */ Anon_APIERRORASSETREPORTERROR) => Unit = null,
    onExit: (/* error */ Anon_APIERROR | Null, /* metadata */ Anon_Choosedevice) => Unit = null,
    onLoad: () => Unit = null,
    selectAccount: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    token: String = null,
    user: Anon_EmailAddress = null,
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
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (webhook != null) __obj.updateDynamic("webhook")(webhook.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PlaidLinkProps
}


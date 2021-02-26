package typingsSlinky.reactPlaidLink

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import typingsSlinky.reactPlaidLink.anon.Accounts
import typingsSlinky.reactPlaidLink.anon.Displaymessage
import typingsSlinky.reactPlaidLink.anon.EmailAddress
import typingsSlinky.reactPlaidLink.anon.Errorcode
import typingsSlinky.reactPlaidLink.anon.Institution
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-plaid-link", JSImport.Default)
  @js.native
  class default ()
    extends Component[PlaidLinkProps, js.Object, js.Any]
  
  type PlaidLink = ReactComponentClass[PlaidLinkProps]
  
  @js.native
  trait PlaidLinkProps extends StObject {
    
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
          /* metadata */ Errorcode, 
          Unit
        ]
      ] = js.native
    
    // A function that is called when a user has specifically exited Link flow
    var onExit: js.UndefOr[
        js.Function2[/* error */ Displaymessage | Null, /* metadata */ Institution, Unit]
      ] = js.native
    
    // A function that is called when the Link module has finished loading.
    // Calls to plaidLinkHandler.open() prior to the onLoad callback will be
    // delayed until the module is fully loaded.
    var onLoad: js.UndefOr[js.Function0[Unit]] = js.native
    
    // A function that is called when a user has successfully onboarded their
    // account. The function should expect two arguments, the public_key and a
    // metadata object
    def onSuccess(publicToken: String, metadata: Accounts): Unit = js.native
    
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
    var user: js.UndefOr[EmailAddress] = js.native
    
    // Specify a webhook to associate with a user.
    var webhook: js.UndefOr[String] = js.native
  }
  object PlaidLinkProps {
    
    @scala.inline
    def apply(
      clientName: String,
      env: tartan | sandbox | development | production,
      onSuccess: (String, Accounts) => Unit,
      product: js.Array[
          connect | info | auth | identity | income | transactions | assets | liabilities | investments | payment_initiation
        ],
      publicKey: String
    ): PlaidLinkProps = {
      val __obj = js.Dynamic.literal(clientName = clientName.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], onSuccess = js.Any.fromFunction2(onSuccess), product = product.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlaidLinkProps]
    }
    
    @scala.inline
    implicit class PlaidLinkPropsMutableBuilder[Self <: PlaidLinkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClientName(value: String): Self = StObject.set(x, "clientName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnv(value: tartan | sandbox | development | production): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstitution(value: String): Self = StObject.set(x, "institution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstitutionUndefined: Self = StObject.set(x, "institution", js.undefined)
      
      @scala.inline
      def setOnEvent(
        value: (/* eventName */ ERROR | EXIT | HANDOFF | OPEN | OPEN_MY_PLAID | SEARCH_INSTITUTION | SELECT_INSTITUTION | SUBMIT_CREDENTIALS | SUBMIT_MFA | TRANSITION_VIEW, /* metadata */ Errorcode) => Unit
      ): Self = StObject.set(x, "onEvent", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnEventUndefined: Self = StObject.set(x, "onEvent", js.undefined)
      
      @scala.inline
      def setOnExit(value: (/* error */ Displaymessage | Null, /* metadata */ Institution) => Unit): Self = StObject.set(x, "onExit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      @scala.inline
      def setOnLoad(value: () => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnSuccess(value: (String, Accounts) => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction2(value))
      
      @scala.inline
      def setProduct(
        value: js.Array[
              connect | info | auth | identity | income | transactions | assets | liabilities | investments | payment_initiation
            ]
      ): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductVarargs(
        value: (connect | info | auth | identity | income | transactions | assets | liabilities | investments | payment_initiation)*
      ): Self = StObject.set(x, "product", js.Array(value :_*))
      
      @scala.inline
      def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectAccount(value: Boolean): Self = StObject.set(x, "selectAccount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectAccountUndefined: Self = StObject.set(x, "selectAccount", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      @scala.inline
      def setUser(value: EmailAddress): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
      
      @scala.inline
      def setWebhook(value: String): Self = StObject.set(x, "webhook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebhookUndefined: Self = StObject.set(x, "webhook", js.undefined)
    }
  }
}

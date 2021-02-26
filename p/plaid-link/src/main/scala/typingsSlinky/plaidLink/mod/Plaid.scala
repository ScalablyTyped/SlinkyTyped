package typingsSlinky.plaidLink.mod

import typingsSlinky.plaidLink.anon.Institutionid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Plaid {
  
  @js.native
  trait Account extends StObject {
    
    var id: String = js.native
    
    var mask: String = js.native
    
    var name: String = js.native
    
    var subtype: String = js.native
    
    var `type`: String = js.native
    
    var verification_status: VerificationStatus = js.native
  }
  object Account {
    
    @scala.inline
    def apply(
      id: String,
      mask: String,
      name: String,
      subtype: String,
      `type`: String,
      verification_status: VerificationStatus
    ): Account = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any], verification_status = verification_status.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Account]
    }
    
    @scala.inline
    implicit class AccountMutableBuilder[Self <: Account] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerification_status(value: VerificationStatus): Self = StObject.set(x, "verification_status", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.plaidLink.plaidLinkStrings.US
    - typingsSlinky.plaidLink.plaidLinkStrings.CA
    - typingsSlinky.plaidLink.plaidLinkStrings.GB
  */
  trait Country extends StObject
  object Country {
    
    @scala.inline
    def CA: typingsSlinky.plaidLink.plaidLinkStrings.CA = "CA".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.CA]
    
    @scala.inline
    def GB: typingsSlinky.plaidLink.plaidLinkStrings.GB = "GB".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.GB]
    
    @scala.inline
    def US: typingsSlinky.plaidLink.plaidLinkStrings.US = "US".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.US]
  }
  
  @js.native
  trait CreateConfig extends StObject {
    
    var clientName: String = js.native
    
    var countryCodes: js.UndefOr[js.Array[Country]] = js.native
    
    var env: Environment = js.native
    
    var isWebView: js.UndefOr[Boolean] = js.native
    
    var key: String = js.native
    
    var language: js.UndefOr[Language] = js.native
    
    var linkCustomizationName: js.UndefOr[String] = js.native
    
    var oauthNonce: js.UndefOr[String] = js.native
    
    var oauthRedirectUri: js.UndefOr[String] = js.native
    
    var oauthStateId: js.UndefOr[String] = js.native
    
    var onEvent: js.UndefOr[OnEvent] = js.native
    
    var onExit: js.UndefOr[OnExit] = js.native
    
    var onLoad: js.UndefOr[OnLoad] = js.native
    
    def onSuccess(public_token: String, metadata: OnSuccessMetaData): Unit = js.native
    @JSName("onSuccess")
    var onSuccess_Original: OnSuccess = js.native
    
    var product: js.Array[Product] = js.native
    
    var token: js.UndefOr[String] = js.native
    
    var userEmailAddress: js.UndefOr[String] = js.native
    
    var userLegalName: js.UndefOr[String] = js.native
    
    var webhook: js.UndefOr[String] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.plaidLink.plaidLinkStrings.development
    - typingsSlinky.plaidLink.plaidLinkStrings.sandbox
    - typingsSlinky.plaidLink.plaidLinkStrings.production
  */
  trait Environment extends StObject
  object Environment {
    
    @scala.inline
    def development: typingsSlinky.plaidLink.plaidLinkStrings.development = "development".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.development]
    
    @scala.inline
    def production: typingsSlinky.plaidLink.plaidLinkStrings.production = "production".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.production]
    
    @scala.inline
    def sandbox: typingsSlinky.plaidLink.plaidLinkStrings.sandbox = "sandbox".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.sandbox]
  }
  
  @js.native
  trait Error extends StObject {
    
    var display_message: String = js.native
    
    var error_code: String = js.native
    
    var error_message: String = js.native
    
    var error_type: String = js.native
  }
  object Error {
    
    @scala.inline
    def apply(display_message: String, error_code: String, error_message: String, error_type: String): Error = {
      val __obj = js.Dynamic.literal(display_message = display_message.asInstanceOf[js.Any], error_code = error_code.asInstanceOf[js.Any], error_message = error_message.asInstanceOf[js.Any], error_type = error_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplay_message(value: String): Self = StObject.set(x, "display_message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError_code(value: String): Self = StObject.set(x, "error_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError_message(value: String): Self = StObject.set(x, "error_message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError_type(value: String): Self = StObject.set(x, "error_type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.plaidLink.plaidLinkStrings.ERROR
    - typingsSlinky.plaidLink.plaidLinkStrings.EXIT
    - typingsSlinky.plaidLink.plaidLinkStrings.HANDOFF
    - typingsSlinky.plaidLink.plaidLinkStrings.OPEN
    - typingsSlinky.plaidLink.plaidLinkStrings.OPEN_MY_PLAID
    - typingsSlinky.plaidLink.plaidLinkStrings.SEARCH_INSTITUTION
    - typingsSlinky.plaidLink.plaidLinkStrings.SELECT_INSTITUTION
    - typingsSlinky.plaidLink.plaidLinkStrings.SUBMIT_CREDENTIALS
    - typingsSlinky.plaidLink.plaidLinkStrings.SUBMIT_MFA
    - typingsSlinky.plaidLink.plaidLinkStrings.TRANSITION_VIEW
  */
  trait EventName extends StObject
  object EventName {
    
    @scala.inline
    def ERROR: typingsSlinky.plaidLink.plaidLinkStrings.ERROR = "ERROR".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.ERROR]
    
    @scala.inline
    def EXIT: typingsSlinky.plaidLink.plaidLinkStrings.EXIT = "EXIT".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.EXIT]
    
    @scala.inline
    def HANDOFF: typingsSlinky.plaidLink.plaidLinkStrings.HANDOFF = "HANDOFF".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.HANDOFF]
    
    @scala.inline
    def OPEN: typingsSlinky.plaidLink.plaidLinkStrings.OPEN = "OPEN".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.OPEN]
    
    @scala.inline
    def OPEN_MY_PLAID: typingsSlinky.plaidLink.plaidLinkStrings.OPEN_MY_PLAID = "OPEN_MY_PLAID".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.OPEN_MY_PLAID]
    
    @scala.inline
    def SEARCH_INSTITUTION: typingsSlinky.plaidLink.plaidLinkStrings.SEARCH_INSTITUTION = "SEARCH_INSTITUTION".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.SEARCH_INSTITUTION]
    
    @scala.inline
    def SELECT_INSTITUTION: typingsSlinky.plaidLink.plaidLinkStrings.SELECT_INSTITUTION = "SELECT_INSTITUTION".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.SELECT_INSTITUTION]
    
    @scala.inline
    def SUBMIT_CREDENTIALS: typingsSlinky.plaidLink.plaidLinkStrings.SUBMIT_CREDENTIALS = "SUBMIT_CREDENTIALS".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.SUBMIT_CREDENTIALS]
    
    @scala.inline
    def SUBMIT_MFA: typingsSlinky.plaidLink.plaidLinkStrings.SUBMIT_MFA = "SUBMIT_MFA".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.SUBMIT_MFA]
    
    @scala.inline
    def TRANSITION_VIEW: typingsSlinky.plaidLink.plaidLinkStrings.TRANSITION_VIEW = "TRANSITION_VIEW".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.TRANSITION_VIEW]
  }
  
  @js.native
  trait ExitOptions extends StObject {
    
    var force: Boolean = js.native
  }
  object ExitOptions {
    
    @scala.inline
    def apply(force: Boolean): ExitOptions = {
      val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExitOptions]
    }
    
    @scala.inline
    implicit class ExitOptionsMutableBuilder[Self <: ExitOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.plaidLink.plaidLinkStrings.requires_questions
    - typingsSlinky.plaidLink.plaidLinkStrings.requires_selections
    - typingsSlinky.plaidLink.plaidLinkStrings.requires_code
    - typingsSlinky.plaidLink.plaidLinkStrings.choose_device
    - typingsSlinky.plaidLink.plaidLinkStrings.requires_credentials
    - typingsSlinky.plaidLink.plaidLinkStrings.institution_not_found
  */
  trait ExitStatus extends StObject
  object ExitStatus {
    
    @scala.inline
    def choose_device: typingsSlinky.plaidLink.plaidLinkStrings.choose_device = "choose_device".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.choose_device]
    
    @scala.inline
    def institution_not_found: typingsSlinky.plaidLink.plaidLinkStrings.institution_not_found = "institution_not_found".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.institution_not_found]
    
    @scala.inline
    def requires_code: typingsSlinky.plaidLink.plaidLinkStrings.requires_code = "requires_code".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.requires_code]
    
    @scala.inline
    def requires_credentials: typingsSlinky.plaidLink.plaidLinkStrings.requires_credentials = "requires_credentials".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.requires_credentials]
    
    @scala.inline
    def requires_questions: typingsSlinky.plaidLink.plaidLinkStrings.requires_questions = "requires_questions".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.requires_questions]
    
    @scala.inline
    def requires_selections: typingsSlinky.plaidLink.plaidLinkStrings.requires_selections = "requires_selections".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.requires_selections]
  }
  
  @js.native
  trait Institution extends StObject {
    
    var auth: Boolean = js.native
    
    var institution_id: String = js.native
    
    var name: String = js.native
    
    var transactions: Boolean = js.native
  }
  object Institution {
    
    @scala.inline
    def apply(auth: Boolean, institution_id: String, name: String, transactions: Boolean): Institution = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], institution_id = institution_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Institution]
    }
    
    @scala.inline
    implicit class InstitutionMutableBuilder[Self <: Institution] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: Boolean): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstitution_id(value: String): Self = StObject.set(x, "institution_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactions(value: Boolean): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.plaidLink.plaidLinkStrings.en
    - typingsSlinky.plaidLink.plaidLinkStrings.fr
    - typingsSlinky.plaidLink.plaidLinkStrings.es
  */
  trait Language extends StObject
  object Language {
    
    @scala.inline
    def en: typingsSlinky.plaidLink.plaidLinkStrings.en = "en".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.en]
    
    @scala.inline
    def es: typingsSlinky.plaidLink.plaidLinkStrings.es = "es".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.es]
    
    @scala.inline
    def fr: typingsSlinky.plaidLink.plaidLinkStrings.fr = "fr".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.fr]
  }
  
  @js.native
  trait LinkHandler extends StObject {
    
    def destroy(): Unit = js.native
    
    def exit(): Unit = js.native
    def exit(options: ExitOptions): Unit = js.native
    
    var institutions: js.Array[Institution] = js.native
    
    def open(): Unit = js.native
  }
  
  type OnEvent = js.Function2[/* eventName */ EventName, /* metadata */ OnEventMetaData, Unit]
  
  @js.native
  trait OnEventMetaData extends StObject {
    
    var error_code: String = js.native
    
    var error_message: String = js.native
    
    var error_type: String = js.native
    
    var exit_status: ExitStatus = js.native
    
    var institution_id: String = js.native
    
    var institution_name: String = js.native
    
    var institution_search_query: String = js.native
    
    var link_session_id: String = js.native
    
    var mfa_type: String = js.native
    
    var request_id: String = js.native
    
    var timestamp: String = js.native
    
    var view_name: ViewName = js.native
  }
  object OnEventMetaData {
    
    @scala.inline
    def apply(
      error_code: String,
      error_message: String,
      error_type: String,
      exit_status: ExitStatus,
      institution_id: String,
      institution_name: String,
      institution_search_query: String,
      link_session_id: String,
      mfa_type: String,
      request_id: String,
      timestamp: String,
      view_name: ViewName
    ): OnEventMetaData = {
      val __obj = js.Dynamic.literal(error_code = error_code.asInstanceOf[js.Any], error_message = error_message.asInstanceOf[js.Any], error_type = error_type.asInstanceOf[js.Any], exit_status = exit_status.asInstanceOf[js.Any], institution_id = institution_id.asInstanceOf[js.Any], institution_name = institution_name.asInstanceOf[js.Any], institution_search_query = institution_search_query.asInstanceOf[js.Any], link_session_id = link_session_id.asInstanceOf[js.Any], mfa_type = mfa_type.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], view_name = view_name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnEventMetaData]
    }
    
    @scala.inline
    implicit class OnEventMetaDataMutableBuilder[Self <: OnEventMetaData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError_code(value: String): Self = StObject.set(x, "error_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError_message(value: String): Self = StObject.set(x, "error_message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError_type(value: String): Self = StObject.set(x, "error_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExit_status(value: ExitStatus): Self = StObject.set(x, "exit_status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstitution_id(value: String): Self = StObject.set(x, "institution_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstitution_name(value: String): Self = StObject.set(x, "institution_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstitution_search_query(value: String): Self = StObject.set(x, "institution_search_query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink_session_id(value: String): Self = StObject.set(x, "link_session_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMfa_type(value: String): Self = StObject.set(x, "mfa_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest_id(value: String): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setView_name(value: ViewName): Self = StObject.set(x, "view_name", value.asInstanceOf[js.Any])
    }
  }
  
  type OnExit = js.Function2[/* error */ Error | Null, /* metadata */ OnExitMetaData, Unit]
  
  @js.native
  trait OnExitMetaData extends StObject {
    
    var institution: Institution = js.native
    
    var link_session_id: String = js.native
    
    var request_id: String = js.native
    
    var status: ExitStatus = js.native
  }
  object OnExitMetaData {
    
    @scala.inline
    def apply(institution: Institution, link_session_id: String, request_id: String, status: ExitStatus): OnExitMetaData = {
      val __obj = js.Dynamic.literal(institution = institution.asInstanceOf[js.Any], link_session_id = link_session_id.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnExitMetaData]
    }
    
    @scala.inline
    implicit class OnExitMetaDataMutableBuilder[Self <: OnExitMetaData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstitution(value: Institution): Self = StObject.set(x, "institution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink_session_id(value: String): Self = StObject.set(x, "link_session_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest_id(value: String): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: ExitStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  type OnLoad = js.Function0[Unit]
  
  type OnSuccess = js.Function2[/* public_token */ String, /* metadata */ OnSuccessMetaData, Unit]
  
  @js.native
  trait OnSuccessMetaData extends StObject {
    
    var accounts: js.Array[Account] = js.native
    
    var institution: Institutionid = js.native
    
    var link_session_id: String = js.native
  }
  object OnSuccessMetaData {
    
    @scala.inline
    def apply(accounts: js.Array[Account], institution: Institutionid, link_session_id: String): OnSuccessMetaData = {
      val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], institution = institution.asInstanceOf[js.Any], link_session_id = link_session_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnSuccessMetaData]
    }
    
    @scala.inline
    implicit class OnSuccessMetaDataMutableBuilder[Self <: OnSuccessMetaData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccounts(value: js.Array[Account]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountsVarargs(value: Account*): Self = StObject.set(x, "accounts", js.Array(value :_*))
      
      @scala.inline
      def setInstitution(value: Institutionid): Self = StObject.set(x, "institution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink_session_id(value: String): Self = StObject.set(x, "link_session_id", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.plaidLink.plaidLinkStrings.transactions
    - typingsSlinky.plaidLink.plaidLinkStrings.auth
    - typingsSlinky.plaidLink.plaidLinkStrings.identity
    - typingsSlinky.plaidLink.plaidLinkStrings.income
    - typingsSlinky.plaidLink.plaidLinkStrings.assets
    - typingsSlinky.plaidLink.plaidLinkStrings.investments
    - typingsSlinky.plaidLink.plaidLinkStrings.liabilities
  */
  trait Product extends StObject
  object Product {
    
    @scala.inline
    def assets: typingsSlinky.plaidLink.plaidLinkStrings.assets = "assets".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.assets]
    
    @scala.inline
    def auth: typingsSlinky.plaidLink.plaidLinkStrings.auth = "auth".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.auth]
    
    @scala.inline
    def identity: typingsSlinky.plaidLink.plaidLinkStrings.identity = "identity".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.identity]
    
    @scala.inline
    def income: typingsSlinky.plaidLink.plaidLinkStrings.income = "income".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.income]
    
    @scala.inline
    def investments: typingsSlinky.plaidLink.plaidLinkStrings.investments = "investments".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.investments]
    
    @scala.inline
    def liabilities: typingsSlinky.plaidLink.plaidLinkStrings.liabilities = "liabilities".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.liabilities]
    
    @scala.inline
    def transactions: typingsSlinky.plaidLink.plaidLinkStrings.transactions = "transactions".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.transactions]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.plaidLink.plaidLinkStrings.pending_automatic_verification
    - typingsSlinky.plaidLink.plaidLinkStrings.pending_manual_verification
    - typingsSlinky.plaidLink.plaidLinkStrings.manually_verified
  */
  trait VerificationStatus extends StObject
  object VerificationStatus {
    
    @scala.inline
    def manually_verified: typingsSlinky.plaidLink.plaidLinkStrings.manually_verified = "manually_verified".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.manually_verified]
    
    @scala.inline
    def pending_automatic_verification: typingsSlinky.plaidLink.plaidLinkStrings.pending_automatic_verification = "pending_automatic_verification".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.pending_automatic_verification]
    
    @scala.inline
    def pending_manual_verification: typingsSlinky.plaidLink.plaidLinkStrings.pending_manual_verification = "pending_manual_verification".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.pending_manual_verification]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.plaidLink.plaidLinkStrings.CONNECTED
    - typingsSlinky.plaidLink.plaidLinkStrings.CREDENTIAL
    - typingsSlinky.plaidLink.plaidLinkStrings.ERROR
    - typingsSlinky.plaidLink.plaidLinkStrings.EXIT
    - typingsSlinky.plaidLink.plaidLinkStrings.LOADING
    - typingsSlinky.plaidLink.plaidLinkStrings.MFA
    - typingsSlinky.plaidLink.plaidLinkStrings.NUMBERS
    - typingsSlinky.plaidLink.plaidLinkStrings.RECAPTCHA
    - typingsSlinky.plaidLink.plaidLinkStrings.SELECT_ACCOUNT
    - typingsSlinky.plaidLink.plaidLinkStrings.SELECT_INSTITUTION
  */
  trait ViewName extends StObject
  object ViewName {
    
    @scala.inline
    def CONNECTED: typingsSlinky.plaidLink.plaidLinkStrings.CONNECTED = "CONNECTED".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.CONNECTED]
    
    @scala.inline
    def CREDENTIAL: typingsSlinky.plaidLink.plaidLinkStrings.CREDENTIAL = "CREDENTIAL".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.CREDENTIAL]
    
    @scala.inline
    def ERROR: typingsSlinky.plaidLink.plaidLinkStrings.ERROR = "ERROR".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.ERROR]
    
    @scala.inline
    def EXIT: typingsSlinky.plaidLink.plaidLinkStrings.EXIT = "EXIT".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.EXIT]
    
    @scala.inline
    def LOADING: typingsSlinky.plaidLink.plaidLinkStrings.LOADING = "LOADING".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.LOADING]
    
    @scala.inline
    def MFA: typingsSlinky.plaidLink.plaidLinkStrings.MFA = "MFA".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.MFA]
    
    @scala.inline
    def NUMBERS: typingsSlinky.plaidLink.plaidLinkStrings.NUMBERS = "NUMBERS".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.NUMBERS]
    
    @scala.inline
    def RECAPTCHA: typingsSlinky.plaidLink.plaidLinkStrings.RECAPTCHA = "RECAPTCHA".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.RECAPTCHA]
    
    @scala.inline
    def SELECT_ACCOUNT: typingsSlinky.plaidLink.plaidLinkStrings.SELECT_ACCOUNT = "SELECT_ACCOUNT".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.SELECT_ACCOUNT]
    
    @scala.inline
    def SELECT_INSTITUTION: typingsSlinky.plaidLink.plaidLinkStrings.SELECT_INSTITUTION = "SELECT_INSTITUTION".asInstanceOf[typingsSlinky.plaidLink.plaidLinkStrings.SELECT_INSTITUTION]
  }
}

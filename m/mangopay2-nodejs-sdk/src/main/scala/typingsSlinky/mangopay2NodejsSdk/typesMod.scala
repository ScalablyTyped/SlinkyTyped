package typingsSlinky.mangopay2NodejsSdk

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.mangopay2NodejsSdk.anon.Type
import typingsSlinky.std.Exclude
import typingsSlinky.std.Partial
import typingsSlinky.std.Pick
import typingsSlinky.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.authentication_oauth
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.responses_get
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.events_all
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_create
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_all
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_get
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_save
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cardregistration_create
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cardregistration_get
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cardregistration_save
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorization_create
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorization_get
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorization_save
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorizations_get_for_user
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.card_get
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cards_get_by_fingerprint
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.card_save
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.card_get_preauthorizations
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_card-web_create`
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_card-direct_create`
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_preauthorized-direct_create`
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_bankwire-direct_create`
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_directdebit-web_create`
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_directdebit-direct_create`
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_paypal-web_create`
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payins_get
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payins_createrefunds
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payouts_bankwire_create
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payouts_get
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_repudiation
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_transfer
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_payin
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_payout
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transfers_create
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transfers_get
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transfers_createrefunds
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createnaturals
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createlegals
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_iban
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_gb
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_us
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_ca
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_other
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_all
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allwallets
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allbankaccount
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allcards
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_alltransactions
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allkycdocuments
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_get
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getnaturals
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getlegals
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getbankaccount
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_deactivate_bankaccount
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_savenaturals
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_savelegals
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getemoney
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_create
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_alltransactions
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_get
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_save
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_create
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_get
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_save
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_page_create
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_all
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_get_alt
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_create_consult
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_save_tag
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_save_contest_funds
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.dispute_save_close
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get_transactions
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_all
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get_for_wallet
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get_for_user
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_create
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_page_create
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_save
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_get
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_get_for_dispute
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_all
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_create_consult
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_repudiation_get
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_repudiation_create_settlement
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_repudiation_get_settlement
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_pending_settlement
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_transaction_create
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_wallet_create
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_get
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_all
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`mandates_directdebit-web_create`
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_get
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_cancel
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_all
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_get_for_user
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_get_for_bank_account
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.clients_get
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.clients_update
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.clients_upload_logo
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_all
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_get
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_by_fundsType
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_transactions
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_iban_create
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_get
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_update
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_all
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_declaration_create
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_declaration_update
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_declaration_get
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transactions_get_for_mandate
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transactions_get_for_card
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transactions_get_for_bank_account
  */
  trait ApiMethod extends StObject
  object ApiMethod {
    
    @scala.inline
    def authentication_oauth: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.authentication_oauth = "authentication_oauth".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.authentication_oauth]
    
    @scala.inline
    def banking_aliases_all: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_all = "banking_aliases_all".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_all]
    
    @scala.inline
    def banking_aliases_get: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_get = "banking_aliases_get".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_get]
    
    @scala.inline
    def banking_aliases_iban_create: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_iban_create = "banking_aliases_iban_create".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_iban_create]
    
    @scala.inline
    def banking_aliases_update: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_update = "banking_aliases_update".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_update]
    
    @scala.inline
    def card_get: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.card_get = "card_get".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.card_get]
    
    @scala.inline
    def card_get_preauthorizations: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.card_get_preauthorizations = "card_get_preauthorizations".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.card_get_preauthorizations]
    
    @scala.inline
    def card_save: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.card_save = "card_save".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.card_save]
    
    @scala.inline
    def cardregistration_create: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cardregistration_create = "cardregistration_create".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cardregistration_create]
    
    @scala.inline
    def cardregistration_get: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cardregistration_get = "cardregistration_get".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cardregistration_get]
    
    @scala.inline
    def cardregistration_save: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cardregistration_save = "cardregistration_save".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cardregistration_save]
    
    @scala.inline
    def cards_get_by_fingerprint: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cards_get_by_fingerprint = "cards_get_by_fingerprint".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cards_get_by_fingerprint]
    
    @scala.inline
    def client_wallets_all: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_all = "client_wallets_all".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_all]
    
    @scala.inline
    def client_wallets_by_fundsType: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_by_fundsType = "client_wallets_by_fundsType".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_by_fundsType]
    
    @scala.inline
    def client_wallets_get: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_get = "client_wallets_get".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_get]
    
    @scala.inline
    def client_wallets_transactions: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_transactions = "client_wallets_transactions".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_transactions]
    
    @scala.inline
    def clients_get: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.clients_get = "clients_get".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.clients_get]
    
    @scala.inline
    def clients_update: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.clients_update = "clients_update".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.clients_update]
    
    @scala.inline
    def clients_upload_logo: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.clients_upload_logo = "clients_upload_logo".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.clients_upload_logo]
    
    @scala.inline
    def dispute_save_close: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.dispute_save_close = "dispute_save_close".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.dispute_save_close]
    
    @scala.inline
    def disputes_all: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_all = "disputes_all".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_all]
    
    @scala.inline
    def disputes_document_all: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_all = "disputes_document_all".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_all]
    
    @scala.inline
    def disputes_document_create: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_create = "disputes_document_create".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_create]
    
    @scala.inline
    def disputes_document_create_consult: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_create_consult = "disputes_document_create_consult".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_create_consult]
    
    @scala.inline
    def disputes_document_get: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_get = "disputes_document_get".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_get]
    
    @scala.inline
    def disputes_document_get_for_dispute: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_get_for_dispute = "disputes_document_get_for_dispute".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_get_for_dispute]
    
    @scala.inline
    def disputes_document_page_create: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_page_create = "disputes_document_page_create".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_page_create]
    
    @scala.inline
    def disputes_document_save: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_save = "disputes_document_save".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_save]
    
    @scala.inline
    def disputes_get: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get = "disputes_get".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get]
    
    @scala.inline
    def disputes_get_for_user: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get_for_user = "disputes_get_for_user".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get_for_user]
    
    @scala.inline
    def disputes_get_for_wallet: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get_for_wallet = "disputes_get_for_wallet".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get_for_wallet]
    
    @scala.inline
    def disputes_get_transactions: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get_transactions = "disputes_get_transactions".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get_transactions]
    
    @scala.inline
    def disputes_pending_settlement: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_pending_settlement = "disputes_pending_settlement".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_pending_settlement]
    
    @scala.inline
    def disputes_repudiation_create_settlement: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_repudiation_create_settlement = "disputes_repudiation_create_settlement".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_repudiation_create_settlement]
    
    @scala.inline
    def disputes_repudiation_get: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_repudiation_get = "disputes_repudiation_get".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_repudiation_get]
    
    @scala.inline
    def disputes_repudiation_get_settlement: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_repudiation_get_settlement = "disputes_repudiation_get_settlement".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_repudiation_get_settlement]
    
    @scala.inline
    def disputes_save_contest_funds: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_save_contest_funds = "disputes_save_contest_funds".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_save_contest_funds]
    
    @scala.inline
    def disputes_save_tag: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_save_tag = "disputes_save_tag".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_save_tag]
    
    @scala.inline
    def events_all: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.events_all = "events_all".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.events_all]
    
    @scala.inline
    def hooks_all: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_all = "hooks_all".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_all]
    
    @scala.inline
    def hooks_create: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_create = "hooks_create".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_create]
    
    @scala.inline
    def hooks_get: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_get = "hooks_get".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_get]
    
    @scala.inline
    def hooks_save: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_save = "hooks_save".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_save]
    
    @scala.inline
    def kyc_documents_all: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_all = "kyc_documents_all".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_all]
    
    @scala.inline
    def kyc_documents_create: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_create = "kyc_documents_create".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_create]
    
    @scala.inline
    def kyc_documents_create_consult: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_create_consult = "kyc_documents_create_consult".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_create_consult]
    
    @scala.inline
    def kyc_documents_get: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_get = "kyc_documents_get".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_get]
    
    @scala.inline
    def kyc_documents_get_alt: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_get_alt = "kyc_documents_get_alt".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_get_alt]
    
    @scala.inline
    def kyc_documents_save: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_save = "kyc_documents_save".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_save]
    
    @scala.inline
    def kyc_page_create: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_page_create = "kyc_page_create".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_page_create]
    
    @scala.inline
    def mandates_all: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_all = "mandates_all".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_all]
    
    @scala.inline
    def mandates_cancel: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_cancel = "mandates_cancel".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_cancel]
    
    @scala.inline
    def `mandates_directdebit-web_create`: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`mandates_directdebit-web_create` = "mandates_directdebit-web_create".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`mandates_directdebit-web_create`]
    
    @scala.inline
    def mandates_get: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_get = "mandates_get".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_get]
    
    @scala.inline
    def mandates_get_for_bank_account: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_get_for_bank_account = "mandates_get_for_bank_account".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_get_for_bank_account]
    
    @scala.inline
    def mandates_get_for_user: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_get_for_user = "mandates_get_for_user".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_get_for_user]
    
    @scala.inline
    def `payins_bankwire-direct_create`: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_bankwire-direct_create` = "payins_bankwire-direct_create".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_bankwire-direct_create`]
    
    @scala.inline
    def `payins_card-direct_create`: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_card-direct_create` = "payins_card-direct_create".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_card-direct_create`]
    
    @scala.inline
    def `payins_card-web_create`: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_card-web_create` = "payins_card-web_create".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_card-web_create`]
    
    @scala.inline
    def payins_createrefunds: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payins_createrefunds = "payins_createrefunds".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payins_createrefunds]
    
    @scala.inline
    def `payins_directdebit-direct_create`: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_directdebit-direct_create` = "payins_directdebit-direct_create".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_directdebit-direct_create`]
    
    @scala.inline
    def `payins_directdebit-web_create`: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_directdebit-web_create` = "payins_directdebit-web_create".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_directdebit-web_create`]
    
    @scala.inline
    def payins_get: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payins_get = "payins_get".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payins_get]
    
    @scala.inline
    def `payins_paypal-web_create`: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_paypal-web_create` = "payins_paypal-web_create".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_paypal-web_create`]
    
    @scala.inline
    def `payins_preauthorized-direct_create`: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_preauthorized-direct_create` = "payins_preauthorized-direct_create".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_preauthorized-direct_create`]
    
    @scala.inline
    def payouts_bankwire_create: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payouts_bankwire_create = "payouts_bankwire_create".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payouts_bankwire_create]
    
    @scala.inline
    def payouts_get: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payouts_get = "payouts_get".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payouts_get]
    
    @scala.inline
    def preauthorization_create: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorization_create = "preauthorization_create".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorization_create]
    
    @scala.inline
    def preauthorization_get: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorization_get = "preauthorization_get".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorization_get]
    
    @scala.inline
    def preauthorization_save: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorization_save = "preauthorization_save".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorization_save]
    
    @scala.inline
    def preauthorizations_get_for_user: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorizations_get_for_user = "preauthorizations_get_for_user".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorizations_get_for_user]
    
    @scala.inline
    def refunds_get: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get = "refunds_get".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get]
    
    @scala.inline
    def refunds_get_for_payin: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_payin = "refunds_get_for_payin".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_payin]
    
    @scala.inline
    def refunds_get_for_payout: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_payout = "refunds_get_for_payout".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_payout]
    
    @scala.inline
    def refunds_get_for_repudiation: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_repudiation = "refunds_get_for_repudiation".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_repudiation]
    
    @scala.inline
    def refunds_get_for_transfer: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_transfer = "refunds_get_for_transfer".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_transfer]
    
    @scala.inline
    def reports_all: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_all = "reports_all".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_all]
    
    @scala.inline
    def reports_get: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_get = "reports_get".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_get]
    
    @scala.inline
    def reports_transaction_create: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_transaction_create = "reports_transaction_create".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_transaction_create]
    
    @scala.inline
    def reports_wallet_create: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_wallet_create = "reports_wallet_create".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_wallet_create]
    
    @scala.inline
    def responses_get: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.responses_get = "responses_get".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.responses_get]
    
    @scala.inline
    def transactions_get_for_bank_account: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transactions_get_for_bank_account = "transactions_get_for_bank_account".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transactions_get_for_bank_account]
    
    @scala.inline
    def transactions_get_for_card: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transactions_get_for_card = "transactions_get_for_card".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transactions_get_for_card]
    
    @scala.inline
    def transactions_get_for_mandate: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transactions_get_for_mandate = "transactions_get_for_mandate".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transactions_get_for_mandate]
    
    @scala.inline
    def transfers_create: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transfers_create = "transfers_create".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transfers_create]
    
    @scala.inline
    def transfers_createrefunds: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transfers_createrefunds = "transfers_createrefunds".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transfers_createrefunds]
    
    @scala.inline
    def transfers_get: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transfers_get = "transfers_get".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transfers_get]
    
    @scala.inline
    def ubo_declaration_create: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_declaration_create = "ubo_declaration_create".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_declaration_create]
    
    @scala.inline
    def ubo_declaration_get: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_declaration_get = "ubo_declaration_get".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_declaration_get]
    
    @scala.inline
    def ubo_declaration_update: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_declaration_update = "ubo_declaration_update".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_declaration_update]
    
    @scala.inline
    def users_all: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_all = "users_all".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_all]
    
    @scala.inline
    def users_allbankaccount: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allbankaccount = "users_allbankaccount".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allbankaccount]
    
    @scala.inline
    def users_allcards: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allcards = "users_allcards".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allcards]
    
    @scala.inline
    def users_allkycdocuments: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allkycdocuments = "users_allkycdocuments".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allkycdocuments]
    
    @scala.inline
    def users_alltransactions: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_alltransactions = "users_alltransactions".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_alltransactions]
    
    @scala.inline
    def users_allwallets: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allwallets = "users_allwallets".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allwallets]
    
    @scala.inline
    def users_createbankaccounts_ca: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_ca = "users_createbankaccounts_ca".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_ca]
    
    @scala.inline
    def users_createbankaccounts_gb: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_gb = "users_createbankaccounts_gb".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_gb]
    
    @scala.inline
    def users_createbankaccounts_iban: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_iban = "users_createbankaccounts_iban".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_iban]
    
    @scala.inline
    def users_createbankaccounts_other: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_other = "users_createbankaccounts_other".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_other]
    
    @scala.inline
    def users_createbankaccounts_us: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_us = "users_createbankaccounts_us".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_us]
    
    @scala.inline
    def users_createlegals: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createlegals = "users_createlegals".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createlegals]
    
    @scala.inline
    def users_createnaturals: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createnaturals = "users_createnaturals".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createnaturals]
    
    @scala.inline
    def users_deactivate_bankaccount: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_deactivate_bankaccount = "users_deactivate_bankaccount".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_deactivate_bankaccount]
    
    @scala.inline
    def users_get: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_get = "users_get".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_get]
    
    @scala.inline
    def users_getbankaccount: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getbankaccount = "users_getbankaccount".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getbankaccount]
    
    @scala.inline
    def users_getemoney: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getemoney = "users_getemoney".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getemoney]
    
    @scala.inline
    def users_getlegals: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getlegals = "users_getlegals".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getlegals]
    
    @scala.inline
    def users_getnaturals: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getnaturals = "users_getnaturals".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getnaturals]
    
    @scala.inline
    def users_savelegals: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_savelegals = "users_savelegals".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_savelegals]
    
    @scala.inline
    def users_savenaturals: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_savenaturals = "users_savenaturals".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_savenaturals]
    
    @scala.inline
    def wallets_alltransactions: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_alltransactions = "wallets_alltransactions".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_alltransactions]
    
    @scala.inline
    def wallets_create: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_create = "wallets_create".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_create]
    
    @scala.inline
    def wallets_get: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_get = "wallets_get".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_get]
    
    @scala.inline
    def wallets_save: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_save = "wallets_save".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_save]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AE
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AF
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AG
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AI
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AL
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AM
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AO
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AQ
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AR
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AS
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AT
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AU
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AW
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AX
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AZ
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BA
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BB
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BE
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BF
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BG
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BH
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BI
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BJ
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BL
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BM
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BN
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BO
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BQ
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BR
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BS
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BT
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BV
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BW
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BY
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BZ
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CC
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CF
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CG
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CH
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CI
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CK
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CL
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CM
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CN
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CO
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CR
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CU
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CV
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CW
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CX
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CY
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CZ
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DE
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DJ
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DK
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DM
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DO
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DZ
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EC
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EE
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EG
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EH
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ER
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ES
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ET
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FI
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FJ
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FK
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FM
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FO
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FR
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GA
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GE
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GF
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GG
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GH
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GI
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GL
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GM
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GN
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GP
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GQ
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GR
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GS
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GT
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GU
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GW
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GY
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HK
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HM
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HN
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HR
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HT
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HU
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ID
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IE
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IL
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IM
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IN
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IO
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IQ
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IR
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IS
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IT
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JE
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JM
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JO
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JP
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KE
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KG
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KH
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KI
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KM
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KN
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KP
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KR
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KW
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KY
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KZ
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LA
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LB
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LC
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LI
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LK
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LR
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LS
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LT
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LU
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LV
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LY
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MA
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MC
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ME
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MF
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MG
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MH
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MK
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ML
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MM
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MN
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MO
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MP
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MQ
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MR
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MS
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MT
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MU
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MV
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MW
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MX
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MY
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MZ
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NA
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NC
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NE
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NF
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NG
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NI
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NL
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NO
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NP
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NR
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NU
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NZ
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OM
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PA
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PE
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PF
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PG
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PH
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PK
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PL
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PM
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PN
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PR
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PS
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PT
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PW
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PY
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.QA
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RE
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RO
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RS
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RU
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RW
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SA
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SB
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SC
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SE
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SG
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SH
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SI
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SJ
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SK
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SL
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SM
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SN
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SO
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SR
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SS
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ST
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SV
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SX
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SY
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SZ
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TC
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TF
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TG
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TH
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TJ
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TK
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TL
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TM
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TN
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TO
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TR
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TT
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TV
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TW
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TZ
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UA
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UG
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UM
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UY
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UZ
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VA
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VC
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VE
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VG
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VI
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VN
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VU
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WF
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WS
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.YE
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.YT
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZA
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZM
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZW
  */
  trait CountryISO extends StObject
  object CountryISO {
    
    @scala.inline
    def AD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AD = "AD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AD]
    
    @scala.inline
    def AE: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AE = "AE".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AE]
    
    @scala.inline
    def AF: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AF = "AF".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AF]
    
    @scala.inline
    def AG: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AG = "AG".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AG]
    
    @scala.inline
    def AI: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AI = "AI".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AI]
    
    @scala.inline
    def AL: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AL = "AL".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AL]
    
    @scala.inline
    def AM: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AM = "AM".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AM]
    
    @scala.inline
    def AO: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AO = "AO".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AO]
    
    @scala.inline
    def AQ: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AQ = "AQ".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AQ]
    
    @scala.inline
    def AR: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AR = "AR".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AR]
    
    @scala.inline
    def AS: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AS = "AS".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AS]
    
    @scala.inline
    def AT: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AT = "AT".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AT]
    
    @scala.inline
    def AU: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AU = "AU".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AU]
    
    @scala.inline
    def AW: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AW = "AW".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AW]
    
    @scala.inline
    def AX: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AX = "AX".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AX]
    
    @scala.inline
    def AZ: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AZ = "AZ".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AZ]
    
    @scala.inline
    def BA: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BA = "BA".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BA]
    
    @scala.inline
    def BB: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BB = "BB".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BB]
    
    @scala.inline
    def BD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BD = "BD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BD]
    
    @scala.inline
    def BE: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BE = "BE".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BE]
    
    @scala.inline
    def BF: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BF = "BF".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BF]
    
    @scala.inline
    def BG: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BG = "BG".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BG]
    
    @scala.inline
    def BH: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BH = "BH".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BH]
    
    @scala.inline
    def BI: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BI = "BI".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BI]
    
    @scala.inline
    def BJ: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BJ = "BJ".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BJ]
    
    @scala.inline
    def BL: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BL = "BL".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BL]
    
    @scala.inline
    def BM: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BM = "BM".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BM]
    
    @scala.inline
    def BN: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BN = "BN".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BN]
    
    @scala.inline
    def BO: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BO = "BO".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BO]
    
    @scala.inline
    def BQ: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BQ = "BQ".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BQ]
    
    @scala.inline
    def BR: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BR = "BR".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BR]
    
    @scala.inline
    def BS: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BS = "BS".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BS]
    
    @scala.inline
    def BT: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BT = "BT".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BT]
    
    @scala.inline
    def BV: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BV = "BV".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BV]
    
    @scala.inline
    def BW: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BW = "BW".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BW]
    
    @scala.inline
    def BY: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BY = "BY".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BY]
    
    @scala.inline
    def BZ: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BZ = "BZ".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BZ]
    
    @scala.inline
    def CA: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA = "CA".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA]
    
    @scala.inline
    def CC: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CC = "CC".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CC]
    
    @scala.inline
    def CD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CD = "CD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CD]
    
    @scala.inline
    def CF: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CF = "CF".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CF]
    
    @scala.inline
    def CG: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CG = "CG".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CG]
    
    @scala.inline
    def CH: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CH = "CH".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CH]
    
    @scala.inline
    def CI: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CI = "CI".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CI]
    
    @scala.inline
    def CK: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CK = "CK".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CK]
    
    @scala.inline
    def CL: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CL = "CL".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CL]
    
    @scala.inline
    def CM: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CM = "CM".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CM]
    
    @scala.inline
    def CN: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CN = "CN".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CN]
    
    @scala.inline
    def CO: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CO = "CO".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CO]
    
    @scala.inline
    def CR: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CR = "CR".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CR]
    
    @scala.inline
    def CU: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CU = "CU".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CU]
    
    @scala.inline
    def CV: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CV = "CV".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CV]
    
    @scala.inline
    def CW: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CW = "CW".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CW]
    
    @scala.inline
    def CX: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CX = "CX".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CX]
    
    @scala.inline
    def CY: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CY = "CY".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CY]
    
    @scala.inline
    def CZ: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CZ = "CZ".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CZ]
    
    @scala.inline
    def DE: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DE = "DE".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DE]
    
    @scala.inline
    def DJ: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DJ = "DJ".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DJ]
    
    @scala.inline
    def DK: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DK = "DK".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DK]
    
    @scala.inline
    def DM: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DM = "DM".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DM]
    
    @scala.inline
    def DO: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DO = "DO".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DO]
    
    @scala.inline
    def DZ: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DZ = "DZ".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DZ]
    
    @scala.inline
    def EC: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EC = "EC".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EC]
    
    @scala.inline
    def EE: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EE = "EE".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EE]
    
    @scala.inline
    def EG: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EG = "EG".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EG]
    
    @scala.inline
    def EH: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EH = "EH".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EH]
    
    @scala.inline
    def ER: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ER = "ER".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ER]
    
    @scala.inline
    def ES: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ES = "ES".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ES]
    
    @scala.inline
    def ET: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ET = "ET".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ET]
    
    @scala.inline
    def FI: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FI = "FI".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FI]
    
    @scala.inline
    def FJ: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FJ = "FJ".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FJ]
    
    @scala.inline
    def FK: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FK = "FK".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FK]
    
    @scala.inline
    def FM: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FM = "FM".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FM]
    
    @scala.inline
    def FO: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FO = "FO".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FO]
    
    @scala.inline
    def FR: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FR = "FR".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FR]
    
    @scala.inline
    def GA: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GA = "GA".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GA]
    
    @scala.inline
    def GB: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB = "GB".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB]
    
    @scala.inline
    def GD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GD = "GD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GD]
    
    @scala.inline
    def GE: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GE = "GE".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GE]
    
    @scala.inline
    def GF: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GF = "GF".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GF]
    
    @scala.inline
    def GG: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GG = "GG".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GG]
    
    @scala.inline
    def GH: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GH = "GH".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GH]
    
    @scala.inline
    def GI: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GI = "GI".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GI]
    
    @scala.inline
    def GL: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GL = "GL".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GL]
    
    @scala.inline
    def GM: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GM = "GM".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GM]
    
    @scala.inline
    def GN: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GN = "GN".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GN]
    
    @scala.inline
    def GP: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GP = "GP".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GP]
    
    @scala.inline
    def GQ: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GQ = "GQ".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GQ]
    
    @scala.inline
    def GR: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GR = "GR".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GR]
    
    @scala.inline
    def GS: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GS = "GS".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GS]
    
    @scala.inline
    def GT: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GT = "GT".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GT]
    
    @scala.inline
    def GU: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GU = "GU".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GU]
    
    @scala.inline
    def GW: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GW = "GW".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GW]
    
    @scala.inline
    def GY: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GY = "GY".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GY]
    
    @scala.inline
    def HK: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HK = "HK".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HK]
    
    @scala.inline
    def HM: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HM = "HM".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HM]
    
    @scala.inline
    def HN: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HN = "HN".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HN]
    
    @scala.inline
    def HR: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HR = "HR".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HR]
    
    @scala.inline
    def HT: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HT = "HT".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HT]
    
    @scala.inline
    def HU: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HU = "HU".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HU]
    
    @scala.inline
    def ID: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ID = "ID".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ID]
    
    @scala.inline
    def IE: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IE = "IE".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IE]
    
    @scala.inline
    def IL: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IL = "IL".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IL]
    
    @scala.inline
    def IM: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IM = "IM".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IM]
    
    @scala.inline
    def IN: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IN = "IN".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IN]
    
    @scala.inline
    def IO: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IO = "IO".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IO]
    
    @scala.inline
    def IQ: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IQ = "IQ".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IQ]
    
    @scala.inline
    def IR: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IR = "IR".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IR]
    
    @scala.inline
    def IS: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IS = "IS".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IS]
    
    @scala.inline
    def IT: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IT = "IT".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IT]
    
    @scala.inline
    def JE: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JE = "JE".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JE]
    
    @scala.inline
    def JM: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JM = "JM".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JM]
    
    @scala.inline
    def JO: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JO = "JO".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JO]
    
    @scala.inline
    def JP: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JP = "JP".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JP]
    
    @scala.inline
    def KE: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KE = "KE".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KE]
    
    @scala.inline
    def KG: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KG = "KG".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KG]
    
    @scala.inline
    def KH: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KH = "KH".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KH]
    
    @scala.inline
    def KI: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KI = "KI".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KI]
    
    @scala.inline
    def KM: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KM = "KM".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KM]
    
    @scala.inline
    def KN: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KN = "KN".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KN]
    
    @scala.inline
    def KP: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KP = "KP".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KP]
    
    @scala.inline
    def KR: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KR = "KR".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KR]
    
    @scala.inline
    def KW: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KW = "KW".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KW]
    
    @scala.inline
    def KY: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KY = "KY".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KY]
    
    @scala.inline
    def KZ: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KZ = "KZ".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KZ]
    
    @scala.inline
    def LA: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LA = "LA".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LA]
    
    @scala.inline
    def LB: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LB = "LB".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LB]
    
    @scala.inline
    def LC: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LC = "LC".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LC]
    
    @scala.inline
    def LI: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LI = "LI".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LI]
    
    @scala.inline
    def LK: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LK = "LK".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LK]
    
    @scala.inline
    def LR: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LR = "LR".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LR]
    
    @scala.inline
    def LS: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LS = "LS".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LS]
    
    @scala.inline
    def LT: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LT = "LT".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LT]
    
    @scala.inline
    def LU: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LU = "LU".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LU]
    
    @scala.inline
    def LV: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LV = "LV".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LV]
    
    @scala.inline
    def LY: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LY = "LY".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LY]
    
    @scala.inline
    def MA: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MA = "MA".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MA]
    
    @scala.inline
    def MC: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MC = "MC".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MC]
    
    @scala.inline
    def MD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MD = "MD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MD]
    
    @scala.inline
    def ME: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ME = "ME".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ME]
    
    @scala.inline
    def MF: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MF = "MF".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MF]
    
    @scala.inline
    def MG: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MG = "MG".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MG]
    
    @scala.inline
    def MH: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MH = "MH".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MH]
    
    @scala.inline
    def MK: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MK = "MK".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MK]
    
    @scala.inline
    def ML: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ML = "ML".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ML]
    
    @scala.inline
    def MM: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MM = "MM".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MM]
    
    @scala.inline
    def MN: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MN = "MN".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MN]
    
    @scala.inline
    def MO: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MO = "MO".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MO]
    
    @scala.inline
    def MP: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MP = "MP".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MP]
    
    @scala.inline
    def MQ: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MQ = "MQ".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MQ]
    
    @scala.inline
    def MR: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MR = "MR".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MR]
    
    @scala.inline
    def MS: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MS = "MS".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MS]
    
    @scala.inline
    def MT: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MT = "MT".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MT]
    
    @scala.inline
    def MU: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MU = "MU".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MU]
    
    @scala.inline
    def MV: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MV = "MV".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MV]
    
    @scala.inline
    def MW: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MW = "MW".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MW]
    
    @scala.inline
    def MX: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MX = "MX".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MX]
    
    @scala.inline
    def MY: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MY = "MY".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MY]
    
    @scala.inline
    def MZ: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MZ = "MZ".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MZ]
    
    @scala.inline
    def NA: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NA = "NA".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NA]
    
    @scala.inline
    def NC: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NC = "NC".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NC]
    
    @scala.inline
    def NE: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NE = "NE".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NE]
    
    @scala.inline
    def NF: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NF = "NF".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NF]
    
    @scala.inline
    def NG: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NG = "NG".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NG]
    
    @scala.inline
    def NI: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NI = "NI".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NI]
    
    @scala.inline
    def NL: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NL = "NL".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NL]
    
    @scala.inline
    def NO: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NO = "NO".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NO]
    
    @scala.inline
    def NP: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NP = "NP".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NP]
    
    @scala.inline
    def NR: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NR = "NR".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NR]
    
    @scala.inline
    def NU: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NU = "NU".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NU]
    
    @scala.inline
    def NZ: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NZ = "NZ".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NZ]
    
    @scala.inline
    def OM: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OM = "OM".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OM]
    
    @scala.inline
    def PA: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PA = "PA".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PA]
    
    @scala.inline
    def PE: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PE = "PE".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PE]
    
    @scala.inline
    def PF: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PF = "PF".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PF]
    
    @scala.inline
    def PG: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PG = "PG".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PG]
    
    @scala.inline
    def PH: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PH = "PH".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PH]
    
    @scala.inline
    def PK: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PK = "PK".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PK]
    
    @scala.inline
    def PL: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PL = "PL".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PL]
    
    @scala.inline
    def PM: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PM = "PM".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PM]
    
    @scala.inline
    def PN: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PN = "PN".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PN]
    
    @scala.inline
    def PR: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PR = "PR".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PR]
    
    @scala.inline
    def PS: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PS = "PS".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PS]
    
    @scala.inline
    def PT: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PT = "PT".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PT]
    
    @scala.inline
    def PW: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PW = "PW".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PW]
    
    @scala.inline
    def PY: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PY = "PY".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PY]
    
    @scala.inline
    def QA: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.QA = "QA".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.QA]
    
    @scala.inline
    def RE: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RE = "RE".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RE]
    
    @scala.inline
    def RO: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RO = "RO".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RO]
    
    @scala.inline
    def RS: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RS = "RS".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RS]
    
    @scala.inline
    def RU: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RU = "RU".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RU]
    
    @scala.inline
    def RW: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RW = "RW".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RW]
    
    @scala.inline
    def SA: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SA = "SA".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SA]
    
    @scala.inline
    def SB: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SB = "SB".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SB]
    
    @scala.inline
    def SC: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SC = "SC".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SC]
    
    @scala.inline
    def SD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SD = "SD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SD]
    
    @scala.inline
    def SE: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SE = "SE".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SE]
    
    @scala.inline
    def SG: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SG = "SG".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SG]
    
    @scala.inline
    def SH: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SH = "SH".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SH]
    
    @scala.inline
    def SI: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SI = "SI".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SI]
    
    @scala.inline
    def SJ: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SJ = "SJ".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SJ]
    
    @scala.inline
    def SK: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SK = "SK".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SK]
    
    @scala.inline
    def SL: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SL = "SL".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SL]
    
    @scala.inline
    def SM: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SM = "SM".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SM]
    
    @scala.inline
    def SN: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SN = "SN".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SN]
    
    @scala.inline
    def SO: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SO = "SO".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SO]
    
    @scala.inline
    def SR: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SR = "SR".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SR]
    
    @scala.inline
    def SS: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SS = "SS".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SS]
    
    @scala.inline
    def ST: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ST = "ST".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ST]
    
    @scala.inline
    def SV: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SV = "SV".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SV]
    
    @scala.inline
    def SX: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SX = "SX".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SX]
    
    @scala.inline
    def SY: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SY = "SY".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SY]
    
    @scala.inline
    def SZ: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SZ = "SZ".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SZ]
    
    @scala.inline
    def TC: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TC = "TC".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TC]
    
    @scala.inline
    def TD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TD = "TD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TD]
    
    @scala.inline
    def TF: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TF = "TF".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TF]
    
    @scala.inline
    def TG: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TG = "TG".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TG]
    
    @scala.inline
    def TH: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TH = "TH".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TH]
    
    @scala.inline
    def TJ: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TJ = "TJ".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TJ]
    
    @scala.inline
    def TK: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TK = "TK".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TK]
    
    @scala.inline
    def TL: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TL = "TL".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TL]
    
    @scala.inline
    def TM: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TM = "TM".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TM]
    
    @scala.inline
    def TN: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TN = "TN".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TN]
    
    @scala.inline
    def TO: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TO = "TO".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TO]
    
    @scala.inline
    def TR: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TR = "TR".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TR]
    
    @scala.inline
    def TT: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TT = "TT".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TT]
    
    @scala.inline
    def TV: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TV = "TV".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TV]
    
    @scala.inline
    def TW: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TW = "TW".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TW]
    
    @scala.inline
    def TZ: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TZ = "TZ".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TZ]
    
    @scala.inline
    def UA: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UA = "UA".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UA]
    
    @scala.inline
    def UG: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UG = "UG".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UG]
    
    @scala.inline
    def UM: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UM = "UM".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UM]
    
    @scala.inline
    def US: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US = "US".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US]
    
    @scala.inline
    def UY: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UY = "UY".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UY]
    
    @scala.inline
    def UZ: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UZ = "UZ".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UZ]
    
    @scala.inline
    def VA: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VA = "VA".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VA]
    
    @scala.inline
    def VC: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VC = "VC".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VC]
    
    @scala.inline
    def VE: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VE = "VE".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VE]
    
    @scala.inline
    def VG: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VG = "VG".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VG]
    
    @scala.inline
    def VI: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VI = "VI".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VI]
    
    @scala.inline
    def VN: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VN = "VN".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VN]
    
    @scala.inline
    def VU: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VU = "VU".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VU]
    
    @scala.inline
    def WF: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WF = "WF".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WF]
    
    @scala.inline
    def WS: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WS = "WS".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WS]
    
    @scala.inline
    def YE: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.YE = "YE".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.YE]
    
    @scala.inline
    def YT: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.YT = "YT".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.YT]
    
    @scala.inline
    def ZA: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZA = "ZA".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZA]
    
    @scala.inline
    def ZM: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZM = "ZM".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZM]
    
    @scala.inline
    def ZW: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZW = "ZW".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZW]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AED
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AFN
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ALL
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AMD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ANG
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AOA
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ARS
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AUD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AWG
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AZN
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BAM
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BBD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BDT
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BGN
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BHD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BIF
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BMD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BND
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BOB
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BRL
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BSD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BTN
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BWP
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BYN
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BZD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CAD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CDF
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CHF
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CLP
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CNY
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.COP
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CRC
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CUC
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CUP
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CVE
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CZK
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DJF
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DKK
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOP
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DZD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EGP
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ERN
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ETB
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EUR
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FJD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FKP
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GBP
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GEL
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GGP
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GHS
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GIP
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GMD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GNF
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GTQ
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GYD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HKD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HNL
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HRK
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HTG
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HUF
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IDR
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ILS
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IMP
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INR
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IQD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IRR
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ISK
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JEP
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JMD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JOD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JPY
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KES
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KGS
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KHR
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KMF
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KPW
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KRW
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KWD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KZT
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LAK
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LBP
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LKR
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LRD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LSL
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LYD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MAD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MDL
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MGA
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MKD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MMK
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MNT
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MOP
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MRU
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MUR
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MVR
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MWK
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MXN
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MYR
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MZN
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NAD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NGN
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NIO
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NOK
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NPR
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NZD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OMR
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAB
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PEN
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PGK
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PHP
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PKR
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PLN
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PYG
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.QAR
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RON
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RSD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RUB
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RWF
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SAR
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SBD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SCR
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SDG
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SEK
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SGD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SHP
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SLL
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SOS
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SPL
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SRD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.STN
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SVC
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SYP
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SZL
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.THB
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TJS
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TMT
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TND
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TOP
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRY
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TTD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TVD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TWD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TZS
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UAH
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UGX
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UYU
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UZS
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VEF
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VND
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VUV
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WST
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XAF
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XCD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XDR
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XOF
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XPF
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.YER
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZAR
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZMW
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZWD
  */
  trait CurrencyISO extends StObject
  object CurrencyISO {
    
    @scala.inline
    def AED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AED = "AED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AED]
    
    @scala.inline
    def AFN: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AFN = "AFN".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AFN]
    
    @scala.inline
    def ALL: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ALL = "ALL".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ALL]
    
    @scala.inline
    def AMD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AMD = "AMD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AMD]
    
    @scala.inline
    def ANG: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ANG = "ANG".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ANG]
    
    @scala.inline
    def AOA: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AOA = "AOA".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AOA]
    
    @scala.inline
    def ARS: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ARS = "ARS".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ARS]
    
    @scala.inline
    def AUD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AUD = "AUD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AUD]
    
    @scala.inline
    def AWG: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AWG = "AWG".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AWG]
    
    @scala.inline
    def AZN: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AZN = "AZN".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AZN]
    
    @scala.inline
    def BAM: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BAM = "BAM".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BAM]
    
    @scala.inline
    def BBD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BBD = "BBD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BBD]
    
    @scala.inline
    def BDT: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BDT = "BDT".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BDT]
    
    @scala.inline
    def BGN: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BGN = "BGN".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BGN]
    
    @scala.inline
    def BHD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BHD = "BHD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BHD]
    
    @scala.inline
    def BIF: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BIF = "BIF".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BIF]
    
    @scala.inline
    def BMD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BMD = "BMD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BMD]
    
    @scala.inline
    def BND: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BND = "BND".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BND]
    
    @scala.inline
    def BOB: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BOB = "BOB".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BOB]
    
    @scala.inline
    def BRL: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BRL = "BRL".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BRL]
    
    @scala.inline
    def BSD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BSD = "BSD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BSD]
    
    @scala.inline
    def BTN: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BTN = "BTN".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BTN]
    
    @scala.inline
    def BWP: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BWP = "BWP".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BWP]
    
    @scala.inline
    def BYN: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BYN = "BYN".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BYN]
    
    @scala.inline
    def BZD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BZD = "BZD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BZD]
    
    @scala.inline
    def CAD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CAD = "CAD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CAD]
    
    @scala.inline
    def CDF: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CDF = "CDF".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CDF]
    
    @scala.inline
    def CHF: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CHF = "CHF".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CHF]
    
    @scala.inline
    def CLP: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CLP = "CLP".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CLP]
    
    @scala.inline
    def CNY: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CNY = "CNY".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CNY]
    
    @scala.inline
    def COP: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.COP = "COP".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.COP]
    
    @scala.inline
    def CRC: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CRC = "CRC".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CRC]
    
    @scala.inline
    def CUC: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CUC = "CUC".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CUC]
    
    @scala.inline
    def CUP: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CUP = "CUP".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CUP]
    
    @scala.inline
    def CVE: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CVE = "CVE".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CVE]
    
    @scala.inline
    def CZK: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CZK = "CZK".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CZK]
    
    @scala.inline
    def DJF: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DJF = "DJF".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DJF]
    
    @scala.inline
    def DKK: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DKK = "DKK".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DKK]
    
    @scala.inline
    def DOP: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOP = "DOP".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOP]
    
    @scala.inline
    def DZD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DZD = "DZD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DZD]
    
    @scala.inline
    def EGP: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EGP = "EGP".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EGP]
    
    @scala.inline
    def ERN: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ERN = "ERN".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ERN]
    
    @scala.inline
    def ETB: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ETB = "ETB".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ETB]
    
    @scala.inline
    def EUR: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EUR = "EUR".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EUR]
    
    @scala.inline
    def FJD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FJD = "FJD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FJD]
    
    @scala.inline
    def FKP: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FKP = "FKP".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FKP]
    
    @scala.inline
    def GBP: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GBP = "GBP".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GBP]
    
    @scala.inline
    def GEL: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GEL = "GEL".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GEL]
    
    @scala.inline
    def GGP: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GGP = "GGP".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GGP]
    
    @scala.inline
    def GHS: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GHS = "GHS".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GHS]
    
    @scala.inline
    def GIP: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GIP = "GIP".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GIP]
    
    @scala.inline
    def GMD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GMD = "GMD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GMD]
    
    @scala.inline
    def GNF: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GNF = "GNF".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GNF]
    
    @scala.inline
    def GTQ: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GTQ = "GTQ".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GTQ]
    
    @scala.inline
    def GYD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GYD = "GYD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GYD]
    
    @scala.inline
    def HKD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HKD = "HKD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HKD]
    
    @scala.inline
    def HNL: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HNL = "HNL".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HNL]
    
    @scala.inline
    def HRK: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HRK = "HRK".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HRK]
    
    @scala.inline
    def HTG: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HTG = "HTG".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HTG]
    
    @scala.inline
    def HUF: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HUF = "HUF".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HUF]
    
    @scala.inline
    def IDR: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IDR = "IDR".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IDR]
    
    @scala.inline
    def ILS: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ILS = "ILS".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ILS]
    
    @scala.inline
    def IMP: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IMP = "IMP".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IMP]
    
    @scala.inline
    def INR: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INR = "INR".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INR]
    
    @scala.inline
    def IQD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IQD = "IQD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IQD]
    
    @scala.inline
    def IRR: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IRR = "IRR".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IRR]
    
    @scala.inline
    def ISK: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ISK = "ISK".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ISK]
    
    @scala.inline
    def JEP: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JEP = "JEP".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JEP]
    
    @scala.inline
    def JMD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JMD = "JMD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JMD]
    
    @scala.inline
    def JOD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JOD = "JOD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JOD]
    
    @scala.inline
    def JPY: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JPY = "JPY".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JPY]
    
    @scala.inline
    def KES: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KES = "KES".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KES]
    
    @scala.inline
    def KGS: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KGS = "KGS".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KGS]
    
    @scala.inline
    def KHR: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KHR = "KHR".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KHR]
    
    @scala.inline
    def KMF: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KMF = "KMF".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KMF]
    
    @scala.inline
    def KPW: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KPW = "KPW".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KPW]
    
    @scala.inline
    def KRW: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KRW = "KRW".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KRW]
    
    @scala.inline
    def KWD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KWD = "KWD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KWD]
    
    @scala.inline
    def KYD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYD = "KYD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYD]
    
    @scala.inline
    def KZT: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KZT = "KZT".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KZT]
    
    @scala.inline
    def LAK: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LAK = "LAK".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LAK]
    
    @scala.inline
    def LBP: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LBP = "LBP".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LBP]
    
    @scala.inline
    def LKR: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LKR = "LKR".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LKR]
    
    @scala.inline
    def LRD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LRD = "LRD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LRD]
    
    @scala.inline
    def LSL: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LSL = "LSL".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LSL]
    
    @scala.inline
    def LYD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LYD = "LYD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LYD]
    
    @scala.inline
    def MAD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MAD = "MAD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MAD]
    
    @scala.inline
    def MDL: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MDL = "MDL".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MDL]
    
    @scala.inline
    def MGA: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MGA = "MGA".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MGA]
    
    @scala.inline
    def MKD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MKD = "MKD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MKD]
    
    @scala.inline
    def MMK: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MMK = "MMK".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MMK]
    
    @scala.inline
    def MNT: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MNT = "MNT".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MNT]
    
    @scala.inline
    def MOP: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MOP = "MOP".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MOP]
    
    @scala.inline
    def MRU: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MRU = "MRU".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MRU]
    
    @scala.inline
    def MUR: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MUR = "MUR".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MUR]
    
    @scala.inline
    def MVR: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MVR = "MVR".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MVR]
    
    @scala.inline
    def MWK: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MWK = "MWK".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MWK]
    
    @scala.inline
    def MXN: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MXN = "MXN".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MXN]
    
    @scala.inline
    def MYR: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MYR = "MYR".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MYR]
    
    @scala.inline
    def MZN: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MZN = "MZN".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MZN]
    
    @scala.inline
    def NAD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NAD = "NAD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NAD]
    
    @scala.inline
    def NGN: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NGN = "NGN".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NGN]
    
    @scala.inline
    def NIO: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NIO = "NIO".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NIO]
    
    @scala.inline
    def NOK: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NOK = "NOK".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NOK]
    
    @scala.inline
    def NPR: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NPR = "NPR".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NPR]
    
    @scala.inline
    def NZD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NZD = "NZD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NZD]
    
    @scala.inline
    def OMR: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OMR = "OMR".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OMR]
    
    @scala.inline
    def PAB: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAB = "PAB".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAB]
    
    @scala.inline
    def PEN: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PEN = "PEN".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PEN]
    
    @scala.inline
    def PGK: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PGK = "PGK".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PGK]
    
    @scala.inline
    def PHP: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PHP = "PHP".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PHP]
    
    @scala.inline
    def PKR: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PKR = "PKR".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PKR]
    
    @scala.inline
    def PLN: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PLN = "PLN".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PLN]
    
    @scala.inline
    def PYG: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PYG = "PYG".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PYG]
    
    @scala.inline
    def QAR: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.QAR = "QAR".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.QAR]
    
    @scala.inline
    def RON: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RON = "RON".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RON]
    
    @scala.inline
    def RSD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RSD = "RSD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RSD]
    
    @scala.inline
    def RUB: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RUB = "RUB".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RUB]
    
    @scala.inline
    def RWF: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RWF = "RWF".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RWF]
    
    @scala.inline
    def SAR: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SAR = "SAR".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SAR]
    
    @scala.inline
    def SBD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SBD = "SBD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SBD]
    
    @scala.inline
    def SCR: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SCR = "SCR".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SCR]
    
    @scala.inline
    def SDG: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SDG = "SDG".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SDG]
    
    @scala.inline
    def SEK: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SEK = "SEK".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SEK]
    
    @scala.inline
    def SGD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SGD = "SGD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SGD]
    
    @scala.inline
    def SHP: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SHP = "SHP".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SHP]
    
    @scala.inline
    def SLL: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SLL = "SLL".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SLL]
    
    @scala.inline
    def SOS: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SOS = "SOS".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SOS]
    
    @scala.inline
    def SPL: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SPL = "SPL".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SPL]
    
    @scala.inline
    def SRD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SRD = "SRD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SRD]
    
    @scala.inline
    def STN: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.STN = "STN".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.STN]
    
    @scala.inline
    def SVC: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SVC = "SVC".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SVC]
    
    @scala.inline
    def SYP: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SYP = "SYP".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SYP]
    
    @scala.inline
    def SZL: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SZL = "SZL".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SZL]
    
    @scala.inline
    def THB: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.THB = "THB".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.THB]
    
    @scala.inline
    def TJS: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TJS = "TJS".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TJS]
    
    @scala.inline
    def TMT: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TMT = "TMT".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TMT]
    
    @scala.inline
    def TND: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TND = "TND".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TND]
    
    @scala.inline
    def TOP: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TOP = "TOP".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TOP]
    
    @scala.inline
    def TRY: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRY = "TRY".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRY]
    
    @scala.inline
    def TTD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TTD = "TTD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TTD]
    
    @scala.inline
    def TVD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TVD = "TVD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TVD]
    
    @scala.inline
    def TWD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TWD = "TWD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TWD]
    
    @scala.inline
    def TZS: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TZS = "TZS".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TZS]
    
    @scala.inline
    def UAH: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UAH = "UAH".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UAH]
    
    @scala.inline
    def UGX: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UGX = "UGX".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UGX]
    
    @scala.inline
    def USD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USD = "USD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USD]
    
    @scala.inline
    def UYU: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UYU = "UYU".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UYU]
    
    @scala.inline
    def UZS: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UZS = "UZS".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UZS]
    
    @scala.inline
    def VEF: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VEF = "VEF".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VEF]
    
    @scala.inline
    def VND: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VND = "VND".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VND]
    
    @scala.inline
    def VUV: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VUV = "VUV".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VUV]
    
    @scala.inline
    def WST: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WST = "WST".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WST]
    
    @scala.inline
    def XAF: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XAF = "XAF".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XAF]
    
    @scala.inline
    def XCD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XCD = "XCD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XCD]
    
    @scala.inline
    def XDR: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XDR = "XDR".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XDR]
    
    @scala.inline
    def XOF: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XOF = "XOF".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XOF]
    
    @scala.inline
    def XPF: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XPF = "XPF".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XPF]
    
    @scala.inline
    def YER: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.YER = "YER".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.YER]
    
    @scala.inline
    def ZAR: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZAR = "ZAR".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZAR]
    
    @scala.inline
    def ZMW: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZMW = "ZMW".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZMW]
    
    @scala.inline
    def ZWD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZWD = "ZWD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZWD]
  }
  
  type DeepPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.DeepPartial<T[P]> * / object}
    */ typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeepPartial with TopLevel[js.Any]
  
  type MakeKeysNullable[T1, T2 /* <: /* keyof T1 */ String */] = (Omit[T1, T2]) with typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MakeKeysNullable with TopLevel[T1]
  
  type MakeKeysOptional[T1, T2 /* <: /* keyof T1 */ String */] = (Omit[T1, T2]) with (Partial[Pick[T1, T2]])
  
  type MakeKeysRequired[T1, T2 /* <: /* keyof T1 */ String */] = (Omit[T1, T2]) with (Required[Pick[T1, T2]])
  
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  type OmitType[T /* <: Type */] = Omit[T, typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Type]
  
  type PickPartial[T, Par /* <: /* keyof T */ String */] = Pick[Partial[T], Par]
  
  type PickPartialRequired[T, Par /* <: /* keyof T */ String */, Req /* <: /* keyof T */ String */] = (Pick[Partial[T], Par]) with (Pick[Required[T], Req])
  
  type ValueOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}

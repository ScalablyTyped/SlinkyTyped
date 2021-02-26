package typingsSlinky.coinbase

import typingsSlinky.coinbase.mod.AccountType
import typingsSlinky.coinbase.mod.BuyStatus
import typingsSlinky.coinbase.mod.DepositStatus
import typingsSlinky.coinbase.mod.PaymentMethodType
import typingsSlinky.coinbase.mod.ResourceType
import typingsSlinky.coinbase.mod.SellStatus
import typingsSlinky.coinbase.mod.TransactionStatus
import typingsSlinky.coinbase.mod.TransactionType
import typingsSlinky.coinbase.mod.WithdrawalStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coinbaseStrings {
  
  @js.native
  sealed trait account extends ResourceType
  @scala.inline
  def account: account = "account".asInstanceOf[account]
  
  @js.native
  sealed trait ach_bank_account extends PaymentMethodType
  @scala.inline
  def ach_bank_account: ach_bank_account = "ach_bank_account".asInstanceOf[ach_bank_account]
  
  @js.native
  sealed trait address extends ResourceType
  @scala.inline
  def address: address = "address".asInstanceOf[address]
  
  @js.native
  sealed trait bank_wire extends PaymentMethodType
  @scala.inline
  def bank_wire: bank_wire = "bank_wire".asInstanceOf[bank_wire]
  
  @js.native
  sealed trait buy
    extends ResourceType
       with TransactionType
  @scala.inline
  def buy: buy = "buy".asInstanceOf[buy]
  
  @js.native
  sealed trait canceled
    extends BuyStatus
       with DepositStatus
       with SellStatus
       with TransactionStatus
       with WithdrawalStatus
  @scala.inline
  def canceled: canceled = "canceled".asInstanceOf[canceled]
  
  @js.native
  sealed trait completed
    extends BuyStatus
       with DepositStatus
       with SellStatus
       with TransactionStatus
       with WithdrawalStatus
  @scala.inline
  def completed: completed = "completed".asInstanceOf[completed]
  
  @js.native
  sealed trait created
    extends BuyStatus
       with DepositStatus
       with SellStatus
       with WithdrawalStatus
  @scala.inline
  def created: created = "created".asInstanceOf[created]
  
  @js.native
  sealed trait credit_card extends PaymentMethodType
  @scala.inline
  def credit_card: credit_card = "credit_card".asInstanceOf[credit_card]
  
  @js.native
  sealed trait deposit extends ResourceType
  @scala.inline
  def deposit: deposit = "deposit".asInstanceOf[deposit]
  
  @js.native
  sealed trait eft_bank_account extends PaymentMethodType
  @scala.inline
  def eft_bank_account: eft_bank_account = "eft_bank_account".asInstanceOf[eft_bank_account]
  
  @js.native
  sealed trait exchange_deposit extends TransactionType
  @scala.inline
  def exchange_deposit: exchange_deposit = "exchange_deposit".asInstanceOf[exchange_deposit]
  
  @js.native
  sealed trait exchange_withdrawal extends TransactionType
  @scala.inline
  def exchange_withdrawal: exchange_withdrawal = "exchange_withdrawal".asInstanceOf[exchange_withdrawal]
  
  @js.native
  sealed trait expired extends TransactionStatus
  @scala.inline
  def expired: expired = "expired".asInstanceOf[expired]
  
  @js.native
  sealed trait failed extends TransactionStatus
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait fiat extends AccountType
  @scala.inline
  def fiat: fiat = "fiat".asInstanceOf[fiat]
  
  @js.native
  sealed trait fiat_account extends PaymentMethodType
  @scala.inline
  def fiat_account: fiat_account = "fiat_account".asInstanceOf[fiat_account]
  
  @js.native
  sealed trait fiat_deposit extends TransactionType
  @scala.inline
  def fiat_deposit: fiat_deposit = "fiat_deposit".asInstanceOf[fiat_deposit]
  
  @js.native
  sealed trait fiat_withdrawal extends TransactionType
  @scala.inline
  def fiat_withdrawal: fiat_withdrawal = "fiat_withdrawal".asInstanceOf[fiat_withdrawal]
  
  @js.native
  sealed trait ideal_bank_account extends PaymentMethodType
  @scala.inline
  def ideal_bank_account: ideal_bank_account = "ideal_bank_account".asInstanceOf[ideal_bank_account]
  
  @js.native
  sealed trait interac extends PaymentMethodType
  @scala.inline
  def interac: interac = "interac".asInstanceOf[interac]
  
  @js.native
  sealed trait multisig extends AccountType
  @scala.inline
  def multisig: multisig = "multisig".asInstanceOf[multisig]
  
  @js.native
  sealed trait multisig_vault extends AccountType
  @scala.inline
  def multisig_vault: multisig_vault = "multisig_vault".asInstanceOf[multisig_vault]
  
  @js.native
  sealed trait payment_method extends ResourceType
  @scala.inline
  def payment_method: payment_method = "payment_method".asInstanceOf[payment_method]
  
  @js.native
  sealed trait pending extends TransactionStatus
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait request extends TransactionType
  @scala.inline
  def request: request = "request".asInstanceOf[request]
  
  @js.native
  sealed trait secure3d_card extends PaymentMethodType
  @scala.inline
  def secure3d_card: secure3d_card = "secure3d_card".asInstanceOf[secure3d_card]
  
  @js.native
  sealed trait sell
    extends ResourceType
       with TransactionType
  @scala.inline
  def sell: sell = "sell".asInstanceOf[sell]
  
  @js.native
  sealed trait send extends TransactionType
  @scala.inline
  def send: send = "send".asInstanceOf[send]
  
  @js.native
  sealed trait sepa_bank_account extends PaymentMethodType
  @scala.inline
  def sepa_bank_account: sepa_bank_account = "sepa_bank_account".asInstanceOf[sepa_bank_account]
  
  @js.native
  sealed trait transaction extends ResourceType
  @scala.inline
  def transaction: transaction = "transaction".asInstanceOf[transaction]
  
  @js.native
  sealed trait transfer extends TransactionType
  @scala.inline
  def transfer: transfer = "transfer".asInstanceOf[transfer]
  
  @js.native
  sealed trait user extends ResourceType
  @scala.inline
  def user: user = "user".asInstanceOf[user]
  
  @js.native
  sealed trait vault extends AccountType
  @scala.inline
  def vault: vault = "vault".asInstanceOf[vault]
  
  @js.native
  sealed trait vault_withdrawal extends TransactionType
  @scala.inline
  def vault_withdrawal: vault_withdrawal = "vault_withdrawal".asInstanceOf[vault_withdrawal]
  
  @js.native
  sealed trait waiting_for_clearing extends TransactionStatus
  @scala.inline
  def waiting_for_clearing: waiting_for_clearing = "waiting_for_clearing".asInstanceOf[waiting_for_clearing]
  
  @js.native
  sealed trait waiting_for_signature extends TransactionStatus
  @scala.inline
  def waiting_for_signature: waiting_for_signature = "waiting_for_signature".asInstanceOf[waiting_for_signature]
  
  @js.native
  sealed trait wallet extends AccountType
  @scala.inline
  def wallet: wallet = "wallet".asInstanceOf[wallet]
  
  @js.native
  sealed trait withdrawal extends ResourceType
  @scala.inline
  def withdrawal: withdrawal = "withdrawal".asInstanceOf[withdrawal]
}

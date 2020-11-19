package typingsSlinky.coinbase.mod

import typingsSlinky.coinbase.coinbaseStrings.deposit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("coinbase", "Withdrawal")
@js.native
class Withdrawal () extends Resource {
  
  /**
    * Amount
    */
  var amount: MoneyHash = js.native
  
  /**
    * Completes a withdrawal that is created in commit: false state.
    * Scope: wallet:withdrawals:create
    */
  def commit(cb: js.Function2[/* error */ js.Error | Null, /* result */ this.type, Unit]): Unit = js.native
  
  /**
    * Has this withdrawal been committed?
    */
  var committed: Boolean = js.native
  
  /**
    * ISO timestamp (sometimes needs additional permissions)
    */
  var created_at: js.UndefOr[String] = js.native
  
  /**
    * Fee associated to this withdrawal
    */
  var fee: MoneyHash = js.native
  
  /**
    * Resource ID
    */
  var id: String = js.native
  
  /**
    * Associated payment method (e.g. a bank)
    */
  var payment_method: ResourceRef = js.native
  
  /**
    * When a withdrawal isn’t executed instantly, it will receive a payout date for the time it will be executed. ISO timestamp
    */
  var payout_at: js.UndefOr[String] = js.native
  
  @JSName("resource")
  var resource_Withdrawal: deposit = js.native
  
  /**
    * REST endpoint
    */
  var resource_path: String = js.native
  
  /**
    * Status of the deposit. Currently available values: created, completed, canceled
    */
  var status: WithdrawalStatus = js.native
  
  /**
    * Amount without fees
    */
  var subtotal: MoneyHash = js.native
  
  /**
    * Associated transaction (e.g. a bank, fiat account)
    */
  var transaction: ResourceRef = js.native
  
  /**
    * ISO timestamp (sometimes needs additional permissions)
    */
  var updated_at: js.UndefOr[String] = js.native
}

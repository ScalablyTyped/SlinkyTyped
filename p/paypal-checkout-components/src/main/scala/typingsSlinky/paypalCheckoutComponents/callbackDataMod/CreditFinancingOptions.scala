package typingsSlinky.paypalCheckoutComponents.callbackDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreditFinancingOptions extends StObject {
  
  /**
    * Indicates whether the cart amount is editable after payer's acceptance on PayPal side.
    */
  var cartAmountImmutable: Boolean = js.native
  
  /**
    * This is the estimated amount per month that the customer will need to pay including fees and interest.
    */
  var monthlyPayment: CurrencyAmount = js.native
  
  /**
    * Status of whether the customer ultimately was approved for and chose to make the payment using the approved installment credit.
    */
  var payerAcceptance: Boolean = js.native
  
  /**
    * Length of financing terms in months.
    */
  var term: Double = js.native
  
  /**
    * This is the estimated total payment amount including interest and fees the user will pay during the lifetime of the loan.
    */
  var totalCost: CurrencyAmount = js.native
  
  /**
    * Estimated interest or fees amount the payer will have to pay during the lifetime of the loan.
    */
  var totalInterest: CurrencyAmount = js.native
}
object CreditFinancingOptions {
  
  @scala.inline
  def apply(
    cartAmountImmutable: Boolean,
    monthlyPayment: CurrencyAmount,
    payerAcceptance: Boolean,
    term: Double,
    totalCost: CurrencyAmount,
    totalInterest: CurrencyAmount
  ): CreditFinancingOptions = {
    val __obj = js.Dynamic.literal(cartAmountImmutable = cartAmountImmutable.asInstanceOf[js.Any], monthlyPayment = monthlyPayment.asInstanceOf[js.Any], payerAcceptance = payerAcceptance.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any], totalCost = totalCost.asInstanceOf[js.Any], totalInterest = totalInterest.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreditFinancingOptions]
  }
  
  @scala.inline
  implicit class CreditFinancingOptionsMutableBuilder[Self <: CreditFinancingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCartAmountImmutable(value: Boolean): Self = StObject.set(x, "cartAmountImmutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthlyPayment(value: CurrencyAmount): Self = StObject.set(x, "monthlyPayment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayerAcceptance(value: Boolean): Self = StObject.set(x, "payerAcceptance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerm(value: Double): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCost(value: CurrencyAmount): Self = StObject.set(x, "totalCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalInterest(value: CurrencyAmount): Self = StObject.set(x, "totalInterest", value.asInstanceOf[js.Any])
  }
}

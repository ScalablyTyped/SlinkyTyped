package typingsSlinky.reactNativeSquareInAppPayments.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Card extends StObject {
  
  /** The brand (for example, VISA) of the card. */
  var brand: Brand = js.native
  
  /** The expiration month of the card. Ranges between 1 and 12, with 1 corresponding to January and 12 to December. */
  var expirationMonth: Double = js.native
  
  /** The four-digit expiration year of the card. */
  var expirationYear: Double = js.native
  
  /** The last 4 digits of this card's number. */
  var lastFourDigits: String = js.native
  
  /** The billing postal code associated with the card. */
  var postalCode: String | Null = js.native
  
  /** The prepaid type of the credit card (for example, a Prepaid Gift Card). Note: This property is experimental and will always return UNKNOWN */
  var prepaidType: CardPrepaidType = js.native
  
  /** The type of card (for example, Credit or Debit). Note: This property is experimental and will always return UNKNOWN */
  var `type`: CardType = js.native
}
object Card {
  
  @scala.inline
  def apply(
    brand: Brand,
    expirationMonth: Double,
    expirationYear: Double,
    lastFourDigits: String,
    prepaidType: CardPrepaidType,
    `type`: CardType
  ): Card = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], expirationMonth = expirationMonth.asInstanceOf[js.Any], expirationYear = expirationYear.asInstanceOf[js.Any], lastFourDigits = lastFourDigits.asInstanceOf[js.Any], prepaidType = prepaidType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Card]
  }
  
  @scala.inline
  implicit class CardMutableBuilder[Self <: Card] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrand(value: Brand): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationMonth(value: Double): Self = StObject.set(x, "expirationMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationYear(value: Double): Self = StObject.set(x, "expirationYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastFourDigits(value: String): Self = StObject.set(x, "lastFourDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodeNull: Self = StObject.set(x, "postalCode", null)
    
    @scala.inline
    def setPrepaidType(value: CardPrepaidType): Self = StObject.set(x, "prepaidType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CardType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.cardValidator

import typingsSlinky.cardValidator.anon.TypeofcreditCardType
import typingsSlinky.cardValidator.expirationDateMod.ExpirationDateVerification
import typingsSlinky.cardValidator.expirationMonthMod.ExpirationMonthVerification
import typingsSlinky.cardValidator.expirationYearMod.ExpirationYearVerification
import typingsSlinky.cardValidator.postalCodeMod.PostalCodeOptions
import typingsSlinky.cardValidator.typesMod.Verification
import typingsSlinky.creditCardType.typesMod.CreditCardType
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("card-validator", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def creditCardType(cardNumber: String): js.Array[CreditCardType] = js.native
  @JSName("creditCardType")
  var creditCardType_Original: (js.Function1[/* cardNumber */ String, js.Array[CreditCardType]]) with TypeofcreditCardType = js.native
  
  def cvv(value: String): Verification = js.native
  def cvv(value: String, maxLength: js.Array[Double]): Verification = js.native
  def cvv(value: String, maxLength: Double): Verification = js.native
  def cvv(value: js.Any): Verification = js.native
  def cvv(value: js.Any, maxLength: js.Array[Double]): Verification = js.native
  def cvv(value: js.Any, maxLength: Double): Verification = js.native
  @JSName("cvv")
  var cvv_Original: js.Function2[
    /* value */ String | js.Any, 
    /* maxLength */ js.UndefOr[Double | js.Array[Double]], 
    Verification
  ] = js.native
  
  def expirationDate(value: String): ExpirationDateVerification = js.native
  def expirationDate(value: String, maxElapsedYear: Double): ExpirationDateVerification = js.native
  def expirationDate(value: js.Any): ExpirationDateVerification = js.native
  def expirationDate(value: js.Any, maxElapsedYear: Double): ExpirationDateVerification = js.native
  def expirationDate(value: Record[String, String | Double]): ExpirationDateVerification = js.native
  def expirationDate(value: Record[String, String | Double], maxElapsedYear: Double): ExpirationDateVerification = js.native
  @JSName("expirationDate")
  var expirationDate_Original: js.Function2[
    /* value */ String | (Record[String, String | Double]) | js.Any, 
    /* maxElapsedYear */ js.UndefOr[Double], 
    ExpirationDateVerification
  ] = js.native
  
  def expirationMonth(value: String): ExpirationMonthVerification = js.native
  def expirationMonth(value: js.Any): ExpirationMonthVerification = js.native
  @JSName("expirationMonth")
  var expirationMonth_Original: js.Function1[/* value */ String | js.Any, ExpirationMonthVerification] = js.native
  
  def expirationYear(value: String): ExpirationYearVerification = js.native
  def expirationYear(value: String, maxElapsedYear: Double): ExpirationYearVerification = js.native
  def expirationYear(value: js.Any): ExpirationYearVerification = js.native
  def expirationYear(value: js.Any, maxElapsedYear: Double): ExpirationYearVerification = js.native
  @JSName("expirationYear")
  var expirationYear_Original: js.Function2[
    /* value */ String | js.Any, 
    /* maxElapsedYear */ js.UndefOr[Double], 
    ExpirationYearVerification
  ] = js.native
  
  var number: Double = js.native
  
  def postalCode(value: String): Verification = js.native
  def postalCode(value: String, options: PostalCodeOptions): Verification = js.native
  def postalCode(value: js.Any): Verification = js.native
  def postalCode(value: js.Any, options: PostalCodeOptions): Verification = js.native
  @JSName("postalCode")
  var postalCode_Original: js.Function2[
    /* value */ String | js.Any, 
    /* options */ js.UndefOr[PostalCodeOptions], 
    Verification
  ] = js.native
}

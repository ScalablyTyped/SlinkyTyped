package typingsSlinky.moneyMath

import typingsSlinky.moneyMath.moneyMathNumbers.`0`
import typingsSlinky.moneyMath.moneyMathStrings.CHF
import typingsSlinky.moneyMath.moneyMathStrings.CNY
import typingsSlinky.moneyMath.moneyMathStrings.EUR
import typingsSlinky.moneyMath.moneyMathStrings.GBP
import typingsSlinky.moneyMath.moneyMathStrings.JPY
import typingsSlinky.moneyMath.moneyMathStrings.LTL
import typingsSlinky.moneyMath.moneyMathStrings.PLN
import typingsSlinky.moneyMath.moneyMathStrings.SEK
import typingsSlinky.moneyMath.moneyMathStrings.SKK
import typingsSlinky.moneyMath.moneyMathStrings.UAH
import typingsSlinky.moneyMath.moneyMathStrings.USD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("money-math", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def add(a: String, b: String): String = js.native
  
  def cmp(a: String, b: String): `0` | Double = js.native
  
  def div(a: String, b: String): String = js.native
  
  def floatToAmount(value: Double): String = js.native
  
  def format(currency: String, value: String): String = js.native
  @JSName("format")
  def format_CHF(currency: CHF, value: String): String = js.native
  @JSName("format")
  def format_CNY(currency: CNY, value: String): String = js.native
  @JSName("format")
  def format_EUR(currency: EUR, value: String): String = js.native
  @JSName("format")
  def format_GBP(currency: GBP, value: String): String = js.native
  @JSName("format")
  def format_JPY(currency: JPY, value: String): String = js.native
  @JSName("format")
  def format_LTL(currency: LTL, value: String): String = js.native
  @JSName("format")
  def format_PLN(currency: PLN, value: String): String = js.native
  @JSName("format")
  def format_SEK(currency: SEK, value: String): String = js.native
  @JSName("format")
  def format_SKK(currency: SKK, value: String): String = js.native
  @JSName("format")
  def format_UAH(currency: UAH, value: String): String = js.native
  @JSName("format")
  def format_USD(currency: USD, value: String): String = js.native
  
  def isEqual(a: String, b: String): Boolean = js.native
  
  def isNegative(value: String): Boolean = js.native
  
  def isPositive(value: String): Boolean = js.native
  
  def isZero(value: String): Boolean = js.native
  
  def mul(a: String, b: String): String = js.native
  
  def percent(a: String, b: String): String = js.native
  
  def roundTo5Cents(value: String): String = js.native
  
  def roundUpTo5Cents(value: String): String = js.native
  
  def subtract(a: String, b: String): String = js.native
}

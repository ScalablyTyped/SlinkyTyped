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
import scala.scalajs.js.annotation._

@JSImport("money-math", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def add(a: String, b: String): String = js.native
  def cmp(a: String, b: String): `0` | Double = js.native
  def div(a: String, b: String): String = js.native
  def floatToAmount(value: Double): String = js.native
  def format(currency: CHF | CNY | EUR | GBP | JPY | LTL | PLN | SEK | SKK | UAH | USD | String, value: String): String = js.native
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


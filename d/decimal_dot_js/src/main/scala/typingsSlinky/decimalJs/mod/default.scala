package typingsSlinky.decimalJs.mod

import typingsSlinky.decimalJs.decimalJsNumbers.`0`
import typingsSlinky.decimalJs.decimalJsNumbers.`1`
import typingsSlinky.decimalJs.decimalJsNumbers.`2`
import typingsSlinky.decimalJs.decimalJsNumbers.`3`
import typingsSlinky.decimalJs.decimalJsNumbers.`4`
import typingsSlinky.decimalJs.decimalJsNumbers.`5`
import typingsSlinky.decimalJs.decimalJsNumbers.`6`
import typingsSlinky.decimalJs.decimalJsNumbers.`7`
import typingsSlinky.decimalJs.decimalJsNumbers.`8`
import typingsSlinky.decimalJs.decimalJsNumbers.`9`
import typingsSlinky.decimalJs.mod.Decimal.Config
import typingsSlinky.decimalJs.mod.Decimal.Constructor
import typingsSlinky.decimalJs.mod.Decimal.Modulo
import typingsSlinky.decimalJs.mod.Decimal.Rounding
import typingsSlinky.decimalJs.mod.Decimal.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decimal.js", JSImport.Default)
@js.native
class default protected () extends Decimal {
  def this(n: Value) = this()
}

/* static members */
@JSImport("decimal.js", JSImport.Default)
@js.native
object default extends js.Object {
  val Decimal: js.UndefOr[Constructor] = js.native
  val EUCLID: `9` = js.native
  val ROUND_CEIL: `2` = js.native
  val ROUND_DOWN: `1` = js.native
  val ROUND_FLOOR: `3` = js.native
  val ROUND_HALF_CEIL: `7` = js.native
  val ROUND_HALF_DOWN: `5` = js.native
  val ROUND_HALF_EVEN: `6` = js.native
  val ROUND_HALF_FLOOR: `8` = js.native
  val ROUND_HALF_UP: `4` = js.native
  val ROUND_UP: `0` = js.native
  val crypto: Boolean = js.native
  val default: js.UndefOr[Constructor] = js.native
  val maxE: Double = js.native
  val minE: Double = js.native
  val modulo: Modulo = js.native
  val precision: Double = js.native
  val rounding: Rounding = js.native
  val toExpNeg: Double = js.native
  val toExpPos: Double = js.native
  def abs(n: Value): typingsSlinky.decimalJs.mod.Decimal = js.native
  def acos(n: Value): typingsSlinky.decimalJs.mod.Decimal = js.native
  def acosh(n: Value): typingsSlinky.decimalJs.mod.Decimal = js.native
  def add(x: Value, y: Value): typingsSlinky.decimalJs.mod.Decimal = js.native
  def asin(n: Value): typingsSlinky.decimalJs.mod.Decimal = js.native
  def asinh(n: Value): typingsSlinky.decimalJs.mod.Decimal = js.native
  def atan(n: Value): typingsSlinky.decimalJs.mod.Decimal = js.native
  def atan2(y: Value, x: Value): typingsSlinky.decimalJs.mod.Decimal = js.native
  def atanh(n: Value): typingsSlinky.decimalJs.mod.Decimal = js.native
  def cbrt(n: Value): typingsSlinky.decimalJs.mod.Decimal = js.native
  def ceil(n: Value): typingsSlinky.decimalJs.mod.Decimal = js.native
  def clone(`object`: Config): Constructor = js.native
  def config(`object`: Config): Constructor = js.native
  def cos(n: Value): typingsSlinky.decimalJs.mod.Decimal = js.native
  def cosh(n: Value): typingsSlinky.decimalJs.mod.Decimal = js.native
  def div(x: Value, y: Value): typingsSlinky.decimalJs.mod.Decimal = js.native
  def exp(n: Value): typingsSlinky.decimalJs.mod.Decimal = js.native
  def floor(n: Value): typingsSlinky.decimalJs.mod.Decimal = js.native
  def hypot(n: Value*): typingsSlinky.decimalJs.mod.Decimal = js.native
  def isDecimal(`object`: js.Any): Boolean = js.native
  def ln(n: Value): typingsSlinky.decimalJs.mod.Decimal = js.native
  def log(n: Value): typingsSlinky.decimalJs.mod.Decimal = js.native
  def log(n: Value, base: Value): typingsSlinky.decimalJs.mod.Decimal = js.native
  def log10(n: Value): typingsSlinky.decimalJs.mod.Decimal = js.native
  def log2(n: Value): typingsSlinky.decimalJs.mod.Decimal = js.native
  def max(n: Value*): typingsSlinky.decimalJs.mod.Decimal = js.native
  def min(n: Value*): typingsSlinky.decimalJs.mod.Decimal = js.native
  def mod(x: Value, y: Value): typingsSlinky.decimalJs.mod.Decimal = js.native
  def mul(x: Value, y: Value): typingsSlinky.decimalJs.mod.Decimal = js.native
  def noConflict(): Constructor = js.native
     // Browser only
  def pow(base: Value, exponent: Value): typingsSlinky.decimalJs.mod.Decimal = js.native
  def random(): typingsSlinky.decimalJs.mod.Decimal = js.native
  def random(significantDigits: Double): typingsSlinky.decimalJs.mod.Decimal = js.native
  def round(n: Value): typingsSlinky.decimalJs.mod.Decimal = js.native
  def set(`object`: Config): Constructor = js.native
  def sign(n: Value): typingsSlinky.decimalJs.mod.Decimal = js.native
  def sin(n: Value): typingsSlinky.decimalJs.mod.Decimal = js.native
  def sinh(n: Value): typingsSlinky.decimalJs.mod.Decimal = js.native
  def sqrt(n: Value): typingsSlinky.decimalJs.mod.Decimal = js.native
  def sub(x: Value, y: Value): typingsSlinky.decimalJs.mod.Decimal = js.native
  def tan(n: Value): typingsSlinky.decimalJs.mod.Decimal = js.native
  def tanh(n: Value): typingsSlinky.decimalJs.mod.Decimal = js.native
  def trunc(n: Value): typingsSlinky.decimalJs.mod.Decimal = js.native
}


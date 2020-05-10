package typingsSlinky.oracleOraclejet.ojvalidationNumberMod

import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Validator
import typingsSlinky.oracleOraclejet.ojvalidationNumberMod.NumberRangeValidator.ValidatorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojvalidation-number", "NumberRangeValidator")
@js.native
class NumberRangeValidator_ () extends Validator[String | Double] {
  def this(options: ValidatorOptions) = this()
  @JSName("getHint")
  def getHint_MNumberRangeValidator_(): String | Null = js.native
  def validate(value: String): Unit = js.native
  def validate(value: Double): Unit = js.native
}


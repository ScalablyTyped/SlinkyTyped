package typingsSlinky.oracleOraclejet.ojvalidationBaseMod

import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.RegExpValidator.ValidatorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@oracle/oraclejet/ojvalidation-base", "RegExpValidator")
@js.native
class RegExpValidator_ () extends Validator[String | Double] {
  def this(options: ValidatorOptions) = this()
  
  @JSName("getHint")
  def getHint_MRegExpValidator_(): String | Null = js.native
  
  def validate(value: String): Unit = js.native
  def validate(value: Double): Unit = js.native
}

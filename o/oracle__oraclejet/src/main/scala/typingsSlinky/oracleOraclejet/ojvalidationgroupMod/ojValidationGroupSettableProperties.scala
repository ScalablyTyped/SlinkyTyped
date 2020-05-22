package typingsSlinky.oracleOraclejet.ojvalidationgroupMod

import typingsSlinky.oracleOraclejet.mod.JetSettableProperties
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pending
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojValidationGroupSettableProperties extends JetSettableProperties {
  val valid: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
}

object ojValidationGroupSettableProperties {
  @scala.inline
  def apply(valid: valid | pending | invalidHidden | invalidShown): ojValidationGroupSettableProperties = {
    val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojValidationGroupSettableProperties]
  }
}


package typingsSlinky.atOracleOraclejet.ojvalidationgroupMod

import typingsSlinky.atOracleOraclejet.atOracleOraclejetMod.JetSettableProperties
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.invalidHidden
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.invalidShown
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.pending
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojValidationGroupSettableProperties extends JetSettableProperties {
  val valid: typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
}

object ojValidationGroupSettableProperties {
  @scala.inline
  def apply(valid: valid | pending | invalidHidden | invalidShown): ojValidationGroupSettableProperties = {
    val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ojValidationGroupSettableProperties]
  }
}


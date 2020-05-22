package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.`inline`
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.notewindow
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.placeholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConverterHint extends js.Object {
  var converterHint: (js.Array[placeholder | notewindow | none]) | placeholder | notewindow | none
  var helpInstruction: (js.Array[notewindow | none]) | notewindow | none
  var messages: (js.Array[`inline` | notewindow | none]) | `inline` | notewindow | none
  var validatorHint: (js.Array[notewindow | none]) | notewindow | none
}

object ConverterHint {
  @scala.inline
  def apply(
    converterHint: (js.Array[placeholder | notewindow | none]) | placeholder | notewindow | none,
    helpInstruction: (js.Array[notewindow | none]) | notewindow | none,
    messages: (js.Array[`inline` | notewindow | none]) | `inline` | notewindow | none,
    validatorHint: (js.Array[notewindow | none]) | notewindow | none
  ): ConverterHint = {
    val __obj = js.Dynamic.literal(converterHint = converterHint.asInstanceOf[js.Any], helpInstruction = helpInstruction.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], validatorHint = validatorHint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConverterHint]
  }
}


package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.`inline`
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.notewindow
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.placeholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConverterHint extends js.Object {
  var converterHint: (js.Array[placeholder | notewindow | none]) | placeholder | notewindow | none = js.native
  var helpInstruction: (js.Array[notewindow | none]) | notewindow | none = js.native
  var messages: (js.Array[`inline` | notewindow | none]) | `inline` | notewindow | none = js.native
  var validatorHint: (js.Array[notewindow | none]) | notewindow | none = js.native
}

object AnonConverterHint {
  @scala.inline
  def apply(
    converterHint: (js.Array[placeholder | notewindow | none]) | placeholder | notewindow | none,
    helpInstruction: (js.Array[notewindow | none]) | notewindow | none,
    messages: (js.Array[`inline` | notewindow | none]) | `inline` | notewindow | none,
    validatorHint: (js.Array[notewindow | none]) | notewindow | none
  ): AnonConverterHint = {
    val __obj = js.Dynamic.literal(converterHint = converterHint.asInstanceOf[js.Any], helpInstruction = helpInstruction.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], validatorHint = validatorHint.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConverterHint]
  }
  @scala.inline
  implicit class AnonConverterHintOps[Self <: AnonConverterHint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConverterHint(value: (js.Array[placeholder | notewindow | none]) | placeholder | notewindow | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("converterHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelpInstruction(value: (js.Array[notewindow | none]) | notewindow | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpInstruction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessages(value: (js.Array[`inline` | notewindow | none]) | `inline` | notewindow | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidatorHint(value: (js.Array[notewindow | none]) | notewindow | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validatorHint")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


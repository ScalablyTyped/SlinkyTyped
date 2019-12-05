package typingsSlinky.flatpickr.distTypesInstanceMod

import typingsSlinky.flatpickr.distUtilsFormattingMod.Formats
import typingsSlinky.flatpickr.distUtilsFormattingMod.RevFormat
import typingsSlinky.flatpickr.distUtilsFormattingMod.TokenRegex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formatting extends js.Object {
  var formats: Formats
  var revFormat: RevFormat
  var tokenRegex: TokenRegex
}

object Formatting {
  @scala.inline
  def apply(formats: Formats, revFormat: RevFormat, tokenRegex: TokenRegex): Formatting = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any], revFormat = revFormat.asInstanceOf[js.Any], tokenRegex = tokenRegex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Formatting]
  }
}


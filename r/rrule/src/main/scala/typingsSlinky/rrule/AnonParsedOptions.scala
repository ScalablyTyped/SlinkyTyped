package typingsSlinky.rrule

import typingsSlinky.rrule.typesMod.ParsedOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonParsedOptions extends js.Object {
  var parsedOptions: ParsedOptions = js.native
}

object AnonParsedOptions {
  @scala.inline
  def apply(parsedOptions: ParsedOptions): AnonParsedOptions = {
    val __obj = js.Dynamic.literal(parsedOptions = parsedOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParsedOptions]
  }
  @scala.inline
  implicit class AnonParsedOptionsOps[Self <: AnonParsedOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParsedOptions(value: ParsedOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsedOptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


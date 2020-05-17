package typingsSlinky.rrule.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedOptions extends js.Object {
  var parsedOptions: typingsSlinky.rrule.typesMod.ParsedOptions = js.native
}

object ParsedOptions {
  @scala.inline
  def apply(parsedOptions: typingsSlinky.rrule.typesMod.ParsedOptions): ParsedOptions = {
    val __obj = js.Dynamic.literal(parsedOptions = parsedOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedOptions]
  }
  @scala.inline
  implicit class ParsedOptionsOps[Self <: ParsedOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParsedOptions(value: typingsSlinky.rrule.typesMod.ParsedOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsedOptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


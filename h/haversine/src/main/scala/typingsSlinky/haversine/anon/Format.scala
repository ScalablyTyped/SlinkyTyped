package typingsSlinky.haversine.anon

import typingsSlinky.haversine.haversineStrings.`[latCommalon]`
import typingsSlinky.haversine.haversineStrings.`[lonCommalat]`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Format extends js.Object {
  var format: `[latCommalon]` | `[lonCommalat]` = js.native
}

object Format {
  @scala.inline
  def apply(format: `[latCommalon]` | `[lonCommalat]`): Format = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
  @scala.inline
  implicit class FormatOps[Self <: Format] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: `[latCommalon]` | `[lonCommalat]`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


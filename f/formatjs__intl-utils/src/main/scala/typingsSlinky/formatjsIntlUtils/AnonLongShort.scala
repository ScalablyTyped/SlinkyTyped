package typingsSlinky.formatjsIntlUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLongShort extends js.Object {
  var long: RecordDecimalFormatNumLDM = js.native
  var short: RecordDecimalFormatNumLDM = js.native
}

object AnonLongShort {
  @scala.inline
  def apply(long: RecordDecimalFormatNumLDM, short: RecordDecimalFormatNumLDM): AnonLongShort = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLongShort]
  }
  @scala.inline
  implicit class AnonLongShortOps[Self <: AnonLongShort] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLong(value: RecordDecimalFormatNumLDM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("long")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShort(value: RecordDecimalFormatNumLDM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.formatjsIntlUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCompactLong extends js.Object {
  var compactLong: js.UndefOr[RecordDecimalFormatNumLDM] = js.native
  var compactShort: js.UndefOr[RecordDecimalFormatNumLDM] = js.native
}

object AnonCompactLong {
  @scala.inline
  def apply(): AnonCompactLong = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCompactLong]
  }
  @scala.inline
  implicit class AnonCompactLongOps[Self <: AnonCompactLong] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompactLong(value: RecordDecimalFormatNumLDM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactLong")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompactLong: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactLong")(js.undefined)
        ret
    }
    @scala.inline
    def withCompactShort(value: RecordDecimalFormatNumLDM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactShort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompactShort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactShort")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.formatjsIntlUtils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LongShort extends js.Object {
  var long: RecordDecimalFormatNumLDM = js.native
  var short: RecordDecimalFormatNumLDM = js.native
}

object LongShort {
  @scala.inline
  def apply(long: RecordDecimalFormatNumLDM, short: RecordDecimalFormatNumLDM): LongShort = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongShort]
  }
  @scala.inline
  implicit class LongShortOps[Self <: LongShort] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLong(value: RecordDecimalFormatNumLDM): Self = this.set("long", value.asInstanceOf[js.Any])
    @scala.inline
    def setShort(value: RecordDecimalFormatNumLDM): Self = this.set("short", value.asInstanceOf[js.Any])
  }
  
}


package typingsSlinky.gapiClientPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFormattedString extends js.Object {
  /** The formatted address for display. */
  var formatted: js.UndefOr[String] = js.native
}

object AnonFormattedString {
  @scala.inline
  def apply(): AnonFormattedString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonFormattedString]
  }
  @scala.inline
  implicit class AnonFormattedStringOps[Self <: AnonFormattedString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormatted(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatted")(js.undefined)
        ret
    }
  }
  
}


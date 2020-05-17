package typingsSlinky.cordovaPluginGlobalization.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatLength extends js.Object {
  var formatLength: js.UndefOr[String] = js.native
   // "short" | "medium" | "long" | "full"
  var selector: js.UndefOr[String] = js.native
}

object FormatLength {
  @scala.inline
  def apply(): FormatLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatLength]
  }
  @scala.inline
  implicit class FormatLengthOps[Self <: FormatLength] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormatLength(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatLength")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
  }
  
}


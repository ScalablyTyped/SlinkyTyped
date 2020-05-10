package typingsSlinky.carbonType

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFontFamilyString extends js.Object {
  var fontFamily: String = js.native
}

object AnonFontFamilyString {
  @scala.inline
  def apply(fontFamily: String): AnonFontFamilyString = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFontFamilyString]
  }
  @scala.inline
  implicit class AnonFontFamilyStringOps[Self <: AnonFontFamilyString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.carbonType.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontSize extends js.Object {
  var fontSize: String = js.native
}

object FontSize {
  @scala.inline
  def apply(fontSize: String): FontSize = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSize]
  }
  @scala.inline
  implicit class FontSizeOps[Self <: FontSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFontSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


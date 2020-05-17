package typingsSlinky.baiduApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WidthString extends js.Object {
  var width: String = js.native
}

object WidthString {
  @scala.inline
  def apply(width: String): WidthString = {
    val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidthString]
  }
  @scala.inline
  implicit class WidthStringOps[Self <: WidthString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


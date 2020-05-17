package typingsSlinky.normalizeJss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontSizeMargin extends js.Object {
  var fontSize: String = js.native
  var margin: js.Array[js.Array[String]] = js.native
}

object FontSizeMargin {
  @scala.inline
  def apply(fontSize: String, margin: js.Array[js.Array[String]]): FontSizeMargin = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSizeMargin]
  }
  @scala.inline
  implicit class FontSizeMarginOps[Self <: FontSizeMargin] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withMargin(value: js.Array[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.grammarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Range extends js.Object {
  var range: typingsSlinky.grammarkdown.coreMod.Range = js.native
  var text: String = js.native
}

object Range {
  @scala.inline
  def apply(range: typingsSlinky.grammarkdown.coreMod.Range, text: String): Range = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
  @scala.inline
  implicit class RangeOps[Self <: Range] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRange(value: typingsSlinky.grammarkdown.coreMod.Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.marked.anon

import typingsSlinky.marked.markedStrings.center
import typingsSlinky.marked.markedStrings.left
import typingsSlinky.marked.markedStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Align extends js.Object {
  var align: center | left | right | Null = js.native
  var header: Boolean = js.native
}

object Align {
  @scala.inline
  def apply(header: Boolean): Align = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[Align]
  }
  @scala.inline
  implicit class AlignOps[Self <: Align] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlign(value: center | left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlignNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(null)
        ret
    }
  }
  
}


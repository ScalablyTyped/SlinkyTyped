package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.anon.Col
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageRange extends js.Object {
  var br: Col | Anchor = js.native
  var tl: Col | Anchor = js.native
}

object ImageRange {
  @scala.inline
  def apply(br: Col | Anchor, tl: Col | Anchor): ImageRange = {
    val __obj = js.Dynamic.literal(br = br.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageRange]
  }
  @scala.inline
  implicit class ImageRangeOps[Self <: ImageRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBr(value: Col | Anchor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("br")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTl(value: Col | Anchor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


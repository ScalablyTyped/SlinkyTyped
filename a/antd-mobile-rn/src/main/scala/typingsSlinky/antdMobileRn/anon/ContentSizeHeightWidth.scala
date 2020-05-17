package typingsSlinky.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentSizeHeightWidth extends js.Object {
  var contentSize: HeightWidth = js.native
}

object ContentSizeHeightWidth {
  @scala.inline
  def apply(contentSize: HeightWidth): ContentSizeHeightWidth = {
    val __obj = js.Dynamic.literal(contentSize = contentSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentSizeHeightWidth]
  }
  @scala.inline
  implicit class ContentSizeHeightWidthOps[Self <: ContentSizeHeightWidth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentSize(value: HeightWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


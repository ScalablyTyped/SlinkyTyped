package typingsSlinky.reactNativeTextInputMask.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentSizeHeight extends js.Object {
  var contentSize: Height = js.native
}

object ContentSizeHeight {
  @scala.inline
  def apply(contentSize: Height): ContentSizeHeight = {
    val __obj = js.Dynamic.literal(contentSize = contentSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentSizeHeight]
  }
  @scala.inline
  implicit class ContentSizeHeightOps[Self <: ContentSizeHeight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentSize(value: Height): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoxModel extends js.Object {
  // for your own consumption
  var border: Spacing = js.native
  // content + padding + border
  var borderBox: Rect = js.native
  // content
  var contentBox: Rect = js.native
  var margin: Spacing = js.native
  // content + padding + border + margin
  var marginBox: Rect = js.native
  var padding: Spacing = js.native
  // content + padding
  var paddingBox: Rect = js.native
}

object BoxModel {
  @scala.inline
  def apply(
    border: Spacing,
    borderBox: Rect,
    contentBox: Rect,
    margin: Spacing,
    marginBox: Rect,
    padding: Spacing,
    paddingBox: Rect
  ): BoxModel = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any], borderBox = borderBox.asInstanceOf[js.Any], contentBox = contentBox.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], marginBox = marginBox.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], paddingBox = paddingBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxModel]
  }
  @scala.inline
  implicit class BoxModelOps[Self <: BoxModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorder(value: Spacing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderBox(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentBox(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMargin(value: Spacing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarginBox(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPadding(value: Spacing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaddingBox(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingBox")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


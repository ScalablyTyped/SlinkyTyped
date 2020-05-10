package typingsSlinky.hammerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CssProps extends js.Object {
  var contentZooming: String = js.native
  var tapHighlightColor: String = js.native
  var touchCallout: String = js.native
  var touchSelect: String = js.native
  var userDrag: String = js.native
  var userSelect: String = js.native
}

object CssProps {
  @scala.inline
  def apply(
    contentZooming: String,
    tapHighlightColor: String,
    touchCallout: String,
    touchSelect: String,
    userDrag: String,
    userSelect: String
  ): CssProps = {
    val __obj = js.Dynamic.literal(contentZooming = contentZooming.asInstanceOf[js.Any], tapHighlightColor = tapHighlightColor.asInstanceOf[js.Any], touchCallout = touchCallout.asInstanceOf[js.Any], touchSelect = touchSelect.asInstanceOf[js.Any], userDrag = userDrag.asInstanceOf[js.Any], userSelect = userSelect.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssProps]
  }
  @scala.inline
  implicit class CssPropsOps[Self <: CssProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentZooming(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentZooming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTapHighlightColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tapHighlightColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchCallout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchCallout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchSelect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserDrag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserSelect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userSelect")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


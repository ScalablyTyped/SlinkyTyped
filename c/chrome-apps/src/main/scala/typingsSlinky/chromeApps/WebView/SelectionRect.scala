package typingsSlinky.chromeApps.WebView

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a rectangle in screen coordinates.
  * The containment semantics are array-like; that is, the coordinate (left, top) is considered to be contained by the rectangle,
  * but the coordinate (left + width, top) is not.
  **/
@js.native
trait SelectionRect extends js.Object {
  /** Height of the rectangle. */
  var height: integer = js.native
  /** Distance from the left edge of the screen to the left edge of the rectangle. */
  var left: integer = js.native
  /** Distance from the top edge of the screen to the top edge of the rectangle. */
  var top: integer = js.native
  /** Width of the rectangle. */
  var width: integer = js.native
}

object SelectionRect {
  @scala.inline
  def apply(height: integer, left: integer, top: integer, width: integer): SelectionRect = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionRect]
  }
  @scala.inline
  implicit class SelectionRectOps[Self <: SelectionRect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTop(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


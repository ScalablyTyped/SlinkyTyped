package typingsSlinky.chrome.chrome.system.display

import typingsSlinky.chrome.chromeStrings.bottom
import typingsSlinky.chrome.chromeStrings.left
import typingsSlinky.chrome.chromeStrings.right
import typingsSlinky.chrome.chromeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisplayLayout extends js.Object {
  /** The unique identifier of the display. */
  var id: String = js.native
  /** The offset of the display along the connected edge. 0 indicates that the topmost or leftmost corners are aligned. */
  var offset: Double = js.native
  /** The unique identifier of the parent display. Empty if this is the root. */
  var parentId: String = js.native
  /**
    * The layout position of this display relative to the parent.
    * This will be ignored for the root.
    * @see enum
    */
  var position: top | right | bottom | left = js.native
}

object DisplayLayout {
  @scala.inline
  def apply(id: String, offset: Double, parentId: String, position: top | right | bottom | left): DisplayLayout = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayLayout]
  }
  @scala.inline
  implicit class DisplayLayoutOps[Self <: DisplayLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: top | right | bottom | left): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


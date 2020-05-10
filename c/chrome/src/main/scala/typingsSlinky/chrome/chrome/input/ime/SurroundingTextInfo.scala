package typingsSlinky.chrome.chrome.input.ime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SurroundingTextInfo extends js.Object {
  /** The beginning position of the selection. This value indicates caret position if is no selection. */
  var anchor: Double = js.native
  /** The ending position of the selection. This value indicates caret position if there is no selection. */
  var focus: Double = js.native
  /** The text around cursor. */
  var text: String = js.native
}

object SurroundingTextInfo {
  @scala.inline
  def apply(anchor: Double, focus: Double, text: String): SurroundingTextInfo = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurroundingTextInfo]
  }
  @scala.inline
  implicit class SurroundingTextInfoOps[Self <: SurroundingTextInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
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


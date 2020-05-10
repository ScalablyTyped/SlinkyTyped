package typingsSlinky.reactModal.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes overlay and content element references passed to onAfterOpen function */
@js.native
trait OnAfterOpenCallbackOptions extends js.Object {
  /** content element reference */
  var contentEl: HTMLDivElement = js.native
  /** overlay element reference */
  var overlayEl: Element = js.native
}

object OnAfterOpenCallbackOptions {
  @scala.inline
  def apply(contentEl: HTMLDivElement, overlayEl: Element): OnAfterOpenCallbackOptions = {
    val __obj = js.Dynamic.literal(contentEl = contentEl.asInstanceOf[js.Any], overlayEl = overlayEl.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnAfterOpenCallbackOptions]
  }
  @scala.inline
  implicit class OnAfterOpenCallbackOptionsOps[Self <: OnAfterOpenCallbackOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentEl(value: HTMLDivElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverlayEl(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayEl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.blueprintjsCore.resizeSensorMod

import org.scalajs.dom.raw.Element
import typingsSlinky.std.DOMRectReadOnly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResizeEntry extends js.Object {
  /** Measured dimensions of the target. */
  var contentRect: DOMRectReadOnly = js.native
  /** The resized element. */
  var target: Element = js.native
}

object IResizeEntry {
  @scala.inline
  def apply(contentRect: DOMRectReadOnly, target: Element): IResizeEntry = {
    val __obj = js.Dynamic.literal(contentRect = contentRect.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResizeEntry]
  }
  @scala.inline
  implicit class IResizeEntryOps[Self <: IResizeEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentRect(value: DOMRectReadOnly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.resizeObserverBrowser

import org.scalajs.dom.raw.Element
import typingsSlinky.std.DOMRectReadOnly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizeObserverEntry extends js.Object {
  val borderBoxSize: ResizeObserverSize = js.native
  val contentBoxSize: ResizeObserverSize = js.native
  val contentRect: DOMRectReadOnly = js.native
  val target: Element = js.native
}

object ResizeObserverEntry {
  @scala.inline
  def apply(
    borderBoxSize: ResizeObserverSize,
    contentBoxSize: ResizeObserverSize,
    contentRect: DOMRectReadOnly,
    target: Element
  ): ResizeObserverEntry = {
    val __obj = js.Dynamic.literal(borderBoxSize = borderBoxSize.asInstanceOf[js.Any], contentBoxSize = contentBoxSize.asInstanceOf[js.Any], contentRect = contentRect.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeObserverEntry]
  }
  @scala.inline
  implicit class ResizeObserverEntryOps[Self <: ResizeObserverEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderBoxSize(value: ResizeObserverSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBoxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentBoxSize(value: ResizeObserverSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentBoxSize")(value.asInstanceOf[js.Any])
        ret
    }
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


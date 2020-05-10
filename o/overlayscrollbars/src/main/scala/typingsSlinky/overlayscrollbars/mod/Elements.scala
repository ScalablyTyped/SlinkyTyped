package typingsSlinky.overlayscrollbars.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.overlayscrollbars.AnonHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Elements extends js.Object {
  var content: HTMLElement = js.native
  var host: HTMLElement = js.native
  var padding: HTMLElement = js.native
  var scrollbarCorner: HTMLElement = js.native
  var scrollbarHorizontal: AnonHandle = js.native
  var scrollbarVertical: AnonHandle = js.native
  var target: HTMLElement = js.native
  var viewport: HTMLElement = js.native
}

object Elements {
  @scala.inline
  def apply(
    content: HTMLElement,
    host: HTMLElement,
    padding: HTMLElement,
    scrollbarCorner: HTMLElement,
    scrollbarHorizontal: AnonHandle,
    scrollbarVertical: AnonHandle,
    target: HTMLElement,
    viewport: HTMLElement
  ): Elements = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], scrollbarCorner = scrollbarCorner.asInstanceOf[js.Any], scrollbarHorizontal = scrollbarHorizontal.asInstanceOf[js.Any], scrollbarVertical = scrollbarVertical.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Elements]
  }
  @scala.inline
  implicit class ElementsOps[Self <: Elements] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHost(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPadding(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollbarCorner(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarCorner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollbarHorizontal(value: AnonHandle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarHorizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollbarVertical(value: AnonHandle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarVertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewport(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewport")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


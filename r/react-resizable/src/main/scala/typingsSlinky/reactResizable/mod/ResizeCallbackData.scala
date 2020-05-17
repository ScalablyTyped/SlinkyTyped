package typingsSlinky.reactResizable.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.reactResizable.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizeCallbackData extends js.Object {
  var handle: ResizeHandle = js.native
  var node: HTMLElement = js.native
  var size: Height = js.native
}

object ResizeCallbackData {
  @scala.inline
  def apply(handle: ResizeHandle, node: HTMLElement, size: Height): ResizeCallbackData = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeCallbackData]
  }
  @scala.inline
  implicit class ResizeCallbackDataOps[Self <: ResizeCallbackData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandle(value: ResizeHandle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Height): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


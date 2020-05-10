package typingsSlinky.resizeObserverBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizeObserverSize extends js.Object {
  var blockSize: Double = js.native
  var inlineSize: Double = js.native
}

object ResizeObserverSize {
  @scala.inline
  def apply(blockSize: Double, inlineSize: Double): ResizeObserverSize = {
    val __obj = js.Dynamic.literal(blockSize = blockSize.asInstanceOf[js.Any], inlineSize = inlineSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeObserverSize]
  }
  @scala.inline
  implicit class ResizeObserverSizeOps[Self <: ResizeObserverSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInlineSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


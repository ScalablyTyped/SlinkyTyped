package typingsSlinky.reactStickyBox.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StickyBoxInstance extends js.Object {
  var latestScrollY: Double = js.native
  var mode: StickyBoxMode = js.native
  var naturalTop: Double = js.native
  var node: HTMLElement = js.native
  var nodeHeight: Double = js.native
  var offset: Double = js.native
  var parentHeight: Double = js.native
  var scrollPane: HTMLElement | Window_ = js.native
  var viewportHeight: Double = js.native
}

object StickyBoxInstance {
  @scala.inline
  def apply(
    latestScrollY: Double,
    mode: StickyBoxMode,
    naturalTop: Double,
    node: HTMLElement,
    nodeHeight: Double,
    offset: Double,
    parentHeight: Double,
    scrollPane: HTMLElement | Window_,
    viewportHeight: Double
  ): StickyBoxInstance = {
    val __obj = js.Dynamic.literal(latestScrollY = latestScrollY.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], naturalTop = naturalTop.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], nodeHeight = nodeHeight.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], parentHeight = parentHeight.asInstanceOf[js.Any], scrollPane = scrollPane.asInstanceOf[js.Any], viewportHeight = viewportHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[StickyBoxInstance]
  }
  @scala.inline
  implicit class StickyBoxInstanceOps[Self <: StickyBoxInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLatestScrollY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestScrollY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: StickyBoxMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNaturalTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("naturalTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollPaneHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollPane(value: HTMLElement | Window_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewportHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportHeight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


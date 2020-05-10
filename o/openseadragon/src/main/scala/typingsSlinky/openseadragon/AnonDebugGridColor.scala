package typingsSlinky.openseadragon

import org.scalajs.dom.raw.Element
import typingsSlinky.openseadragon.mod.Viewer
import typingsSlinky.openseadragon.mod.Viewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDebugGridColor extends js.Object {
  var debugGridColor: js.UndefOr[String] = js.native
  var element: Element = js.native
  var viewer: Viewer = js.native
  var viewport: Viewport = js.native
}

object AnonDebugGridColor {
  @scala.inline
  def apply(element: Element, viewer: Viewer, viewport: Viewport): AnonDebugGridColor = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], viewer = viewer.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDebugGridColor]
  }
  @scala.inline
  implicit class AnonDebugGridColorOps[Self <: AnonDebugGridColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewer(value: Viewer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewport(value: Viewport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebugGridColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugGridColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugGridColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugGridColor")(js.undefined)
        ret
    }
  }
  
}


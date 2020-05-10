package typingsSlinky.ivViewer.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullScreenElements extends Elements {
  var fullScreen: Element | Null = js.native
}

object FullScreenElements {
  @scala.inline
  def apply(): FullScreenElements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullScreenElements]
  }
  @scala.inline
  implicit class FullScreenElementsOps[Self <: FullScreenElements] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFullScreen(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullScreenNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullScreen")(null)
        ret
    }
  }
  
}


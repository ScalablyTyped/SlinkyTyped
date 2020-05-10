package typingsSlinky.reactMapGl.mod

import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGOverlayProps extends BaseControlProps {
  var style: js.UndefOr[CSSProperties] = js.native
  def redraw(opts: SVGRedrawOptions): Unit = js.native
}

object SVGOverlayProps {
  @scala.inline
  def apply(redraw: SVGRedrawOptions => Unit): SVGOverlayProps = {
    val __obj = js.Dynamic.literal(redraw = js.Any.fromFunction1(redraw))
    __obj.asInstanceOf[SVGOverlayProps]
  }
  @scala.inline
  implicit class SVGOverlayPropsOps[Self <: SVGOverlayProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRedraw(value: SVGRedrawOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redraw")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}


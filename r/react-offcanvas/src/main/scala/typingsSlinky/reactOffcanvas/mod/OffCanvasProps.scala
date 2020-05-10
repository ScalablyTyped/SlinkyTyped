package typingsSlinky.reactOffcanvas.mod

import slinky.core.TagMod
import typingsSlinky.reactOffcanvas.reactOffcanvasStrings.left
import typingsSlinky.reactOffcanvas.reactOffcanvasStrings.overlay
import typingsSlinky.reactOffcanvas.reactOffcanvasStrings.parallax
import typingsSlinky.reactOffcanvas.reactOffcanvasStrings.push
import typingsSlinky.reactOffcanvas.reactOffcanvasStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OffCanvasProps extends js.Object {
  var children: TagMod[Any] = js.native
  var effect: js.UndefOr[push | overlay | parallax] = js.native
  var isMenuOpened: js.UndefOr[Boolean] = js.native
  var position: js.UndefOr[left | right] = js.native
  var transitionDuration: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object OffCanvasProps {
  @scala.inline
  def apply(): OffCanvasProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OffCanvasProps]
  }
  @scala.inline
  implicit class OffCanvasPropsOps[Self <: OffCanvasProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withEffect(value: push | overlay | parallax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMenuOpened(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMenuOpened")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMenuOpened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMenuOpened")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}


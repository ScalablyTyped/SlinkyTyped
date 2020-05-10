package typingsSlinky.materialUi.renderToLayerMod

import typingsSlinky.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderToLayerProps extends Props[RenderToLayer] {
  var componentClickAway: js.UndefOr[js.Function] = js.native
  var open: Boolean = js.native
  var render: js.Function = js.native
  var useLayerForClickAway: js.UndefOr[Boolean] = js.native
}

object RenderToLayerProps {
  @scala.inline
  def apply(open: Boolean, render: js.Function): RenderToLayerProps = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderToLayerProps]
  }
  @scala.inline
  implicit class RenderToLayerPropsOps[Self <: RenderToLayerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRender(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentClickAway(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentClickAway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentClickAway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentClickAway")(js.undefined)
        ret
    }
    @scala.inline
    def withUseLayerForClickAway(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLayerForClickAway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseLayerForClickAway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLayerForClickAway")(js.undefined)
        ret
    }
  }
  
}


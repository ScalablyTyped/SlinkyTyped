package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Render extends js.Object {
  var render: ParamsContext = js.native
  var renderRaw: HeadersContenttype = js.native
}

object Render {
  @scala.inline
  def apply(render: ParamsContext, renderRaw: HeadersContenttype): Render = {
    val __obj = js.Dynamic.literal(render = render.asInstanceOf[js.Any], renderRaw = renderRaw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Render]
  }
  @scala.inline
  implicit class RenderOps[Self <: Render] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRender(value: ParamsContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderRaw(value: HeadersContenttype): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderRaw")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


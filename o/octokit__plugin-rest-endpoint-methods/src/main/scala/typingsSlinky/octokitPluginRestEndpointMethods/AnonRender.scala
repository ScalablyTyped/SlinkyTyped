package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRender extends js.Object {
  var render: AnonParamsAnonContext = js.native
  var renderRaw: AnonHeadersAnonContenttype = js.native
}

object AnonRender {
  @scala.inline
  def apply(render: AnonParamsAnonContext, renderRaw: AnonHeadersAnonContenttype): AnonRender = {
    val __obj = js.Dynamic.literal(render = render.asInstanceOf[js.Any], renderRaw = renderRaw.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRender]
  }
  @scala.inline
  implicit class AnonRenderOps[Self <: AnonRender] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRender(value: AnonParamsAnonContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderRaw(value: AnonHeadersAnonContenttype): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderRaw")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


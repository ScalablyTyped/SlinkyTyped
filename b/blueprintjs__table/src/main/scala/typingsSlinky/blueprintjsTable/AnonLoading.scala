package typingsSlinky.blueprintjsTable

import typingsSlinky.blueprintjsTable.renderModeMod.RenderMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLoading extends js.Object {
  var loading: Boolean = js.native
  var renderMode: RenderMode = js.native
}

object AnonLoading {
  @scala.inline
  def apply(loading: Boolean, renderMode: RenderMode): AnonLoading = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any], renderMode = renderMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLoading]
  }
  @scala.inline
  implicit class AnonLoadingOps[Self <: AnonLoading] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderMode(value: RenderMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.blueprintjsTable

import typingsSlinky.blueprintjsTable.renderModeMod.RenderMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRenderMode extends js.Object {
  var renderMode: RenderMode = js.native
}

object AnonRenderMode {
  @scala.inline
  def apply(renderMode: RenderMode): AnonRenderMode = {
    val __obj = js.Dynamic.literal(renderMode = renderMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRenderMode]
  }
  @scala.inline
  implicit class AnonRenderModeOps[Self <: AnonRenderMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRenderMode(value: RenderMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


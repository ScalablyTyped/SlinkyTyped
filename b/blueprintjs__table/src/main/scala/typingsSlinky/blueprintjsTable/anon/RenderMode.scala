package typingsSlinky.blueprintjsTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderMode extends js.Object {
  var renderMode: typingsSlinky.blueprintjsTable.renderModeMod.RenderMode = js.native
}

object RenderMode {
  @scala.inline
  def apply(renderMode: typingsSlinky.blueprintjsTable.renderModeMod.RenderMode): RenderMode = {
    val __obj = js.Dynamic.literal(renderMode = renderMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderMode]
  }
  @scala.inline
  implicit class RenderModeOps[Self <: RenderMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRenderMode(value: typingsSlinky.blueprintjsTable.renderModeMod.RenderMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


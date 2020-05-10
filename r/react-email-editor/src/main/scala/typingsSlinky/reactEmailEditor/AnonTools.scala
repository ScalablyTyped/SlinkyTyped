package typingsSlinky.reactEmailEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTools extends js.Object {
  val tools: js.UndefOr[AnonDock] = js.native
}

object AnonTools {
  @scala.inline
  def apply(): AnonTools = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonTools]
  }
  @scala.inline
  implicit class AnonToolsOps[Self <: AnonTools] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTools(value: AnonDock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tools")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.activexOutlook

import typingsSlinky.activexOutlook.Outlook.Inspector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInspector extends js.Object {
  val Inspector: typingsSlinky.activexOutlook.Outlook.Inspector = js.native
}

object AnonInspector {
  @scala.inline
  def apply(Inspector: Inspector): AnonInspector = {
    val __obj = js.Dynamic.literal(Inspector = Inspector.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInspector]
  }
  @scala.inline
  implicit class AnonInspectorOps[Self <: AnonInspector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInspector(value: Inspector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Inspector")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


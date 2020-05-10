package typingsSlinky.leafletPm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerGroup extends js.Object {
  var pm: typingsSlinky.leafletPm.mod.PM.Edit.LayerGroup = js.native
}

object LayerGroup {
  @scala.inline
  def apply(pm: typingsSlinky.leafletPm.mod.PM.Edit.LayerGroup): LayerGroup = {
    val __obj = js.Dynamic.literal(pm = pm.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerGroup]
  }
  @scala.inline
  implicit class LayerGroupOps[Self <: LayerGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPm(value: typingsSlinky.leafletPm.mod.PM.Edit.LayerGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pm")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


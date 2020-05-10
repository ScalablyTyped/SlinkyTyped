package typingsSlinky.jsforce.salesforceObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutInfo extends js.Object {
  var layouts: js.Array[js.Object] = js.native
  var recordTypeMappings: js.Array[js.Object] = js.native
}

object LayoutInfo {
  @scala.inline
  def apply(layouts: js.Array[js.Object], recordTypeMappings: js.Array[js.Object]): LayoutInfo = {
    val __obj = js.Dynamic.literal(layouts = layouts.asInstanceOf[js.Any], recordTypeMappings = recordTypeMappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutInfo]
  }
  @scala.inline
  implicit class LayoutInfoOps[Self <: LayoutInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayouts(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layouts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordTypeMappings(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordTypeMappings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


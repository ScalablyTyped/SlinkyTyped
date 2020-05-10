package typingsSlinky.jsforce.salesforceObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompactLayoutInfo extends js.Object {
  var compactLayouts: js.Array[js.Object] = js.native
  var defaultCompactLayoutId: String = js.native
  var recordTypeCompactLayoutMappings: js.Array[js.Object] = js.native
}

object CompactLayoutInfo {
  @scala.inline
  def apply(
    compactLayouts: js.Array[js.Object],
    defaultCompactLayoutId: String,
    recordTypeCompactLayoutMappings: js.Array[js.Object]
  ): CompactLayoutInfo = {
    val __obj = js.Dynamic.literal(compactLayouts = compactLayouts.asInstanceOf[js.Any], defaultCompactLayoutId = defaultCompactLayoutId.asInstanceOf[js.Any], recordTypeCompactLayoutMappings = recordTypeCompactLayoutMappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompactLayoutInfo]
  }
  @scala.inline
  implicit class CompactLayoutInfoOps[Self <: CompactLayoutInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompactLayouts(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactLayouts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultCompactLayoutId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCompactLayoutId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordTypeCompactLayoutMappings(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordTypeCompactLayoutMappings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelKey extends js.Object {
  var labelKey: String = js.native
  var valueKey: String = js.native
}

object LabelKey {
  @scala.inline
  def apply(labelKey: String, valueKey: String): LabelKey = {
    val __obj = js.Dynamic.literal(labelKey = labelKey.asInstanceOf[js.Any], valueKey = valueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelKey]
  }
  @scala.inline
  implicit class LabelKeyOps[Self <: LabelKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


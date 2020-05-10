package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLabelKey extends js.Object {
  var labelKey: String = js.native
  var valueKey: String = js.native
}

object AnonLabelKey {
  @scala.inline
  def apply(labelKey: String, valueKey: String): AnonLabelKey = {
    val __obj = js.Dynamic.literal(labelKey = labelKey.asInstanceOf[js.Any], valueKey = valueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabelKey]
  }
  @scala.inline
  implicit class AnonLabelKeyOps[Self <: AnonLabelKey] (val x: Self) extends AnyVal {
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


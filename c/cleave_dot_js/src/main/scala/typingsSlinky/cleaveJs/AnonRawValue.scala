package typingsSlinky.cleaveJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRawValue extends js.Object {
  var rawValue: String = js.native
}

object AnonRawValue {
  @scala.inline
  def apply(rawValue: String): AnonRawValue = {
    val __obj = js.Dynamic.literal(rawValue = rawValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRawValue]
  }
  @scala.inline
  implicit class AnonRawValueOps[Self <: AnonRawValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRawValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


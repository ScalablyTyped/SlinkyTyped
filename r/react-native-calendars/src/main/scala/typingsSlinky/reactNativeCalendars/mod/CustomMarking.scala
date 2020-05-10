package typingsSlinky.reactNativeCalendars.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomMarking extends Marking {
  var customStyles: MarkedDateCustomStyles = js.native
}

object CustomMarking {
  @scala.inline
  def apply(customStyles: MarkedDateCustomStyles): CustomMarking = {
    val __obj = js.Dynamic.literal(customStyles = customStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomMarking]
  }
  @scala.inline
  implicit class CustomMarkingOps[Self <: CustomMarking] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomStyles(value: MarkedDateCustomStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customStyles")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


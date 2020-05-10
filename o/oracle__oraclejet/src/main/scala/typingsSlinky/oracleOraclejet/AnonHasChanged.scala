package typingsSlinky.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHasChanged extends js.Object {
  var hasChanged: Boolean = js.native
}

object AnonHasChanged {
  @scala.inline
  def apply(hasChanged: Boolean): AnonHasChanged = {
    val __obj = js.Dynamic.literal(hasChanged = hasChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHasChanged]
  }
  @scala.inline
  implicit class AnonHasChangedOps[Self <: AnonHasChanged] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasChanged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasChanged")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


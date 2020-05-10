package typingsSlinky.activexShdocvw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDwUniqueID extends js.Object {
  val dwUniqueID: Double = js.native
}

object AnonDwUniqueID {
  @scala.inline
  def apply(dwUniqueID: Double): AnonDwUniqueID = {
    val __obj = js.Dynamic.literal(dwUniqueID = dwUniqueID.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDwUniqueID]
  }
  @scala.inline
  implicit class AnonDwUniqueIDOps[Self <: AnonDwUniqueID] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDwUniqueID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dwUniqueID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.jupyterlabServices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDisplayid extends js.Object {
  var display_id: js.UndefOr[String] = js.native
}

object AnonDisplayid {
  @scala.inline
  def apply(): AnonDisplayid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDisplayid]
  }
  @scala.inline
  implicit class AnonDisplayidOps[Self <: AnonDisplayid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplay_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_id")(js.undefined)
        ret
    }
  }
  
}


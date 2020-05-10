package typingsSlinky.activexAccess.AccWizObjects

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WIZ_FILETIME extends js.Object {
  val dwHighDateTime: Double = js.native
  val dwLowDateTime: Double = js.native
}

object WIZ_FILETIME {
  @scala.inline
  def apply(dwHighDateTime: Double, dwLowDateTime: Double): WIZ_FILETIME = {
    val __obj = js.Dynamic.literal(dwHighDateTime = dwHighDateTime.asInstanceOf[js.Any], dwLowDateTime = dwLowDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[WIZ_FILETIME]
  }
  @scala.inline
  implicit class WIZ_FILETIMEOps[Self <: WIZ_FILETIME] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDwHighDateTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dwHighDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDwLowDateTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dwLowDateTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


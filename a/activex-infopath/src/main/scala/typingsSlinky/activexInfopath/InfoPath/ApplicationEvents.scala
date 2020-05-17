package typingsSlinky.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationEvents extends js.Object {
  @JSName("InfoPath.ApplicationEvents_typekey")
  var InfoPathDotApplicationEvents_typekey: ApplicationEvents = js.native
}

object ApplicationEvents {
  @scala.inline
  def apply(InfoPathDotApplicationEvents_typekey: ApplicationEvents): ApplicationEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("InfoPath.ApplicationEvents_typekey")(InfoPathDotApplicationEvents_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationEvents]
  }
  @scala.inline
  implicit class ApplicationEventsOps[Self <: ApplicationEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfoPathDotApplicationEvents_typekey(value: ApplicationEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoPath.ApplicationEvents_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


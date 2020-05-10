package typingsSlinky.jqueryElang

import typingsSlinky.jquery.JQueryDeferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IELangSearchEvents extends js.Object {
  var select: JQueryDeferred[_] = js.native
}

object IELangSearchEvents {
  @scala.inline
  def apply(select: JQueryDeferred[_]): IELangSearchEvents = {
    val __obj = js.Dynamic.literal(select = select.asInstanceOf[js.Any])
    __obj.asInstanceOf[IELangSearchEvents]
  }
  @scala.inline
  implicit class IELangSearchEventsOps[Self <: IELangSearchEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelect(value: JQueryDeferred[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


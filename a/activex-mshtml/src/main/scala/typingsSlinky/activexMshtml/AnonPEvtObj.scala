package typingsSlinky.activexMshtml

import typingsSlinky.activexMshtml.MSHTML.IHTMLEventObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPEvtObj extends js.Object {
  val pEvtObj: IHTMLEventObj = js.native
}

object AnonPEvtObj {
  @scala.inline
  def apply(pEvtObj: IHTMLEventObj): AnonPEvtObj = {
    val __obj = js.Dynamic.literal(pEvtObj = pEvtObj.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPEvtObj]
  }
  @scala.inline
  implicit class AnonPEvtObjOps[Self <: AnonPEvtObj] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPEvtObj(value: IHTMLEventObj): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pEvtObj")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


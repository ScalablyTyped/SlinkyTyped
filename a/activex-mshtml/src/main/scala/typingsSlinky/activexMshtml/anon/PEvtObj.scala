package typingsSlinky.activexMshtml.anon

import typingsSlinky.activexMshtml.MSHTML.IHTMLEventObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PEvtObj extends js.Object {
  val pEvtObj: IHTMLEventObj = js.native
}

object PEvtObj {
  @scala.inline
  def apply(pEvtObj: IHTMLEventObj): PEvtObj = {
    val __obj = js.Dynamic.literal(pEvtObj = pEvtObj.asInstanceOf[js.Any])
    __obj.asInstanceOf[PEvtObj]
  }
  @scala.inline
  implicit class PEvtObjOps[Self <: PEvtObj] (val x: Self) extends AnyVal {
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


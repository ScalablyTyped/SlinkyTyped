package typingsSlinky.activexExcel

import typingsSlinky.activexStdole.stdole.GUID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPpvObj extends js.Object {
  var ppvObj: js.UndefOr[scala.Nothing] = js.native
  val riid: GUID = js.native
}

object AnonPpvObj {
  @scala.inline
  def apply(riid: GUID): AnonPpvObj = {
    val __obj = js.Dynamic.literal(riid = riid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPpvObj]
  }
  @scala.inline
  implicit class AnonPpvObjOps[Self <: AnonPpvObj] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRiid(value: GUID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("riid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPpvObj(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ppvObj")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPpvObj: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ppvObj")(js.undefined)
        ret
    }
  }
  
}


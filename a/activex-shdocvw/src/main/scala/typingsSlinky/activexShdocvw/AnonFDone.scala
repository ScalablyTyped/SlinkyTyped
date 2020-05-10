package typingsSlinky.activexShdocvw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFDone extends js.Object {
  val fDone: js.Any = js.native
  val nPage: js.Any = js.native
  val pDisp: js.Any = js.native
}

object AnonFDone {
  @scala.inline
  def apply(fDone: js.Any, nPage: js.Any, pDisp: js.Any): AnonFDone = {
    val __obj = js.Dynamic.literal(fDone = fDone.asInstanceOf[js.Any], nPage = nPage.asInstanceOf[js.Any], pDisp = pDisp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFDone]
  }
  @scala.inline
  implicit class AnonFDoneOps[Self <: AnonFDone] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFDone(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fDone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNPage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPDisp(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pDisp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


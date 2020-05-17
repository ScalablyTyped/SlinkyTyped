package typingsSlinky.activexAccess.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDisp extends js.Object {
  val URL: js.Any = js.native
  val pDisp: js.Any = js.native
}

object PDisp {
  @scala.inline
  def apply(URL: js.Any, pDisp: js.Any): PDisp = {
    val __obj = js.Dynamic.literal(URL = URL.asInstanceOf[js.Any], pDisp = pDisp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDisp]
  }
  @scala.inline
  implicit class PDispOps[Self <: PDisp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withURL(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URL")(value.asInstanceOf[js.Any])
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


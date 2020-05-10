package typingsSlinky.activexShdocvw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBstrUrl extends js.Object {
  var Cancel: Boolean = js.native
  val bstrUrl: String = js.native
  val bstrUrlContext: String = js.native
  val dwFlags: Double = js.native
  var ppDisp: js.Any = js.native
}

object AnonBstrUrl {
  @scala.inline
  def apply(Cancel: Boolean, bstrUrl: String, bstrUrlContext: String, dwFlags: Double, ppDisp: js.Any): AnonBstrUrl = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], bstrUrl = bstrUrl.asInstanceOf[js.Any], bstrUrlContext = bstrUrlContext.asInstanceOf[js.Any], dwFlags = dwFlags.asInstanceOf[js.Any], ppDisp = ppDisp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBstrUrl]
  }
  @scala.inline
  implicit class AnonBstrUrlOps[Self <: AnonBstrUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBstrUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bstrUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBstrUrlContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bstrUrlContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDwFlags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dwFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPpDisp(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ppDisp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


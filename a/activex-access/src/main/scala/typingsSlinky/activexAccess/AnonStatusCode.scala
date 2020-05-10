package typingsSlinky.activexAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStatusCode extends js.Object {
  var Cancel: Boolean = js.native
  val StatusCode: js.Any = js.native
  val TargetFrameName: String | Null = js.native
  val URL: String = js.native
  val pDisp: js.Any = js.native
}

object AnonStatusCode {
  @scala.inline
  def apply(Cancel: Boolean, StatusCode: js.Any, URL: String, pDisp: js.Any): AnonStatusCode = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], StatusCode = StatusCode.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], pDisp = pDisp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStatusCode]
  }
  @scala.inline
  implicit class AnonStatusCodeOps[Self <: AnonStatusCode] (val x: Self) extends AnyVal {
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
    def withStatusCode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withURL(value: String): Self = {
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
    @scala.inline
    def withTargetFrameName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetFrameName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetFrameNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetFrameName")(null)
        ret
    }
  }
  
}


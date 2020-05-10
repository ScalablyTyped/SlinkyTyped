package typingsSlinky.jqueryFileupload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuerySupport extends js.Object {
  var fileInput: js.UndefOr[Boolean] = js.native
}

object JQuerySupport {
  @scala.inline
  def apply(): JQuerySupport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQuerySupport]
  }
  @scala.inline
  implicit class JQuerySupportOps[Self <: JQuerySupport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileInput")(js.undefined)
        ret
    }
  }
  
}


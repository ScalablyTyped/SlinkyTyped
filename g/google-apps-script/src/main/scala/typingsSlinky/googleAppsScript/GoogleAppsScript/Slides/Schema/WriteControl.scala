package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteControl extends js.Object {
  var requiredRevisionId: js.UndefOr[String] = js.native
}

object WriteControl {
  @scala.inline
  def apply(): WriteControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteControl]
  }
  @scala.inline
  implicit class WriteControlOps[Self <: WriteControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequiredRevisionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredRevisionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiredRevisionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredRevisionId")(js.undefined)
        ret
    }
  }
  
}


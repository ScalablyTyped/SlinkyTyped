package typingsSlinky.azureSb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Code extends js.Object {
  var Code: String = js.native
  var Detail: String = js.native
}

object Code {
  @scala.inline
  def apply(Code: String, Detail: String): Code = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Detail = Detail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  @scala.inline
  implicit class CodeOps[Self <: Code] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Detail")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


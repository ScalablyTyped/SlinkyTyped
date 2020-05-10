package typingsSlinky.mailgunJs.mod.validation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseResponse extends js.Object {
  var parsed: js.Array[String] = js.native
  var unparseable: js.Array[String] = js.native
}

object ParseResponse {
  @scala.inline
  def apply(parsed: js.Array[String], unparseable: js.Array[String]): ParseResponse = {
    val __obj = js.Dynamic.literal(parsed = parsed.asInstanceOf[js.Any], unparseable = unparseable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseResponse]
  }
  @scala.inline
  implicit class ParseResponseOps[Self <: ParseResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParsed(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnparseable(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unparseable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


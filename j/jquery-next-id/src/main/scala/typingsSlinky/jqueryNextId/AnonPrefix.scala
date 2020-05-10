package typingsSlinky.jqueryNextId

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPrefix extends js.Object {
  var prefix: String = js.native
  var separator: String = js.native
}

object AnonPrefix {
  @scala.inline
  def apply(prefix: String, separator: String): AnonPrefix = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrefix]
  }
  @scala.inline
  implicit class AnonPrefixOps[Self <: AnonPrefix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.calidation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlacklistValidatorConfig
  extends SimpleValidatorConfig
     with BlacklistValidator {
  var blacklist: js.Array[String] = js.native
}

object BlacklistValidatorConfig {
  @scala.inline
  def apply(blacklist: js.Array[String], message: String): BlacklistValidatorConfig = {
    val __obj = js.Dynamic.literal(blacklist = blacklist.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlacklistValidatorConfig]
  }
  @scala.inline
  implicit class BlacklistValidatorConfigOps[Self <: BlacklistValidatorConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlacklist(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blacklist")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


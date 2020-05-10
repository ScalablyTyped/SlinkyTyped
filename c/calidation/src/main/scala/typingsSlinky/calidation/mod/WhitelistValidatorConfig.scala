package typingsSlinky.calidation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhitelistValidatorConfig extends SimpleValidatorConfig {
  var whitelist: js.Array[String] = js.native
}

object WhitelistValidatorConfig {
  @scala.inline
  def apply(message: String, whitelist: js.Array[String]): WhitelistValidatorConfig = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], whitelist = whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhitelistValidatorConfig]
  }
  @scala.inline
  implicit class WhitelistValidatorConfigOps[Self <: WhitelistValidatorConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWhitelist(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelist")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.grammarkdown.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawArgument extends js.Object {
  var formattedKey: String = js.native
  var option: KnownOption = js.native
  var rawKey: String = js.native
  var value: js.Any = js.native
}

object RawArgument {
  @scala.inline
  def apply(formattedKey: String, option: KnownOption, rawKey: String, value: js.Any): RawArgument = {
    val __obj = js.Dynamic.literal(formattedKey = formattedKey.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], rawKey = rawKey.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawArgument]
  }
  @scala.inline
  implicit class RawArgumentOps[Self <: RawArgument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormattedKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOption(value: KnownOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("option")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


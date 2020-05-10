package typingsSlinky.ini.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncodeOptions extends js.Object {
  var section: String = js.native
  var whitespace: Boolean = js.native
}

object EncodeOptions {
  @scala.inline
  def apply(section: String, whitespace: Boolean): EncodeOptions = {
    val __obj = js.Dynamic.literal(section = section.asInstanceOf[js.Any], whitespace = whitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodeOptions]
  }
  @scala.inline
  implicit class EncodeOptionsOps[Self <: EncodeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("section")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhitespace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitespace")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


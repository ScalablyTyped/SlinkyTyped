package typingsSlinky.phin.mod

import typingsSlinky.phin.phinStrings.json
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IJSONResponseOptions extends IOptionsBase {
  var parse: json = js.native
}

object IJSONResponseOptions {
  @scala.inline
  def apply(parse: json, url: String): IJSONResponseOptions = {
    val __obj = js.Dynamic.literal(parse = parse.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IJSONResponseOptions]
  }
  @scala.inline
  implicit class IJSONResponseOptionsOps[Self <: IJSONResponseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParse(value: json): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


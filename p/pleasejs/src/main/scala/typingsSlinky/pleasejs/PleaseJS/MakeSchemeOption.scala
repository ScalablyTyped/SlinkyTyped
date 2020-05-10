package typingsSlinky.pleasejs.PleaseJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MakeSchemeOption extends js.Object {
  var format: String = js.native
  var scheme_type: String = js.native
}

object MakeSchemeOption {
  @scala.inline
  def apply(format: String, scheme_type: String): MakeSchemeOption = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], scheme_type = scheme_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeSchemeOption]
  }
  @scala.inline
  implicit class MakeSchemeOptionOps[Self <: MakeSchemeOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheme_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme_type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


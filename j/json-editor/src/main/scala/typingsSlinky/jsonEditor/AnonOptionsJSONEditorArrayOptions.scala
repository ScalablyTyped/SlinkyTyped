package typingsSlinky.jsonEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOptionsJSONEditorArrayOptions extends js.Object {
  var options: JSONEditorArrayOptions = js.native
}

object AnonOptionsJSONEditorArrayOptions {
  @scala.inline
  def apply(options: JSONEditorArrayOptions): AnonOptionsJSONEditorArrayOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOptionsJSONEditorArrayOptions]
  }
  @scala.inline
  implicit class AnonOptionsJSONEditorArrayOptionsOps[Self <: AnonOptionsJSONEditorArrayOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: JSONEditorArrayOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.eslint

import typingsSlinky.eslint.mod.Rule.SuggestionDescriptorMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDesc extends SuggestionDescriptorMessage {
  var desc: String = js.native
}

object AnonDesc {
  @scala.inline
  def apply(desc: String): AnonDesc = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDesc]
  }
  @scala.inline
  implicit class AnonDescOps[Self <: AnonDesc] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desc")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


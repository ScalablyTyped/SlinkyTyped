package typingsSlinky.cliBox

import typingsSlinky.cliBox.cliBoxBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStringify extends js.Object {
  var stringify: `true` = js.native
}

object AnonStringify {
  @scala.inline
  def apply(stringify: `true`): AnonStringify = {
    val __obj = js.Dynamic.literal(stringify = stringify.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStringify]
  }
  @scala.inline
  implicit class AnonStringifyOps[Self <: AnonStringify] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStringify(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringify")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


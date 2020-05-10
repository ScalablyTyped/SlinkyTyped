package typingsSlinky.blueprintjsCore

import typingsSlinky.blueprintjsCore.blueprintjsCoreBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHasEverOpened extends js.Object {
  var hasEverOpened: `true` = js.native
}

object AnonHasEverOpened {
  @scala.inline
  def apply(hasEverOpened: `true`): AnonHasEverOpened = {
    val __obj = js.Dynamic.literal(hasEverOpened = hasEverOpened.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHasEverOpened]
  }
  @scala.inline
  implicit class AnonHasEverOpenedOps[Self <: AnonHasEverOpened] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasEverOpened(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasEverOpened")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


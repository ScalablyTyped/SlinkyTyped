package typingsSlinky.libsodiumWrappers

import typingsSlinky.libsodiumWrappers.mod.StateAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHeader extends js.Object {
  var header: js.typedarray.Uint8Array = js.native
  var state: StateAddress = js.native
}

object AnonHeader {
  @scala.inline
  def apply(header: js.typedarray.Uint8Array, state: StateAddress): AnonHeader = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeader]
  }
  @scala.inline
  implicit class AnonHeaderOps[Self <: AnonHeader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeader(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: StateAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


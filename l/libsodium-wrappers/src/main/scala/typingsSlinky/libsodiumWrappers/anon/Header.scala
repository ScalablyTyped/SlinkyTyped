package typingsSlinky.libsodiumWrappers.anon

import typingsSlinky.libsodiumWrappers.mod.StateAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends js.Object {
  var header: js.typedarray.Uint8Array
  var state: StateAddress
}

object Header {
  @scala.inline
  def apply(header: js.typedarray.Uint8Array, state: StateAddress): Header = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
}


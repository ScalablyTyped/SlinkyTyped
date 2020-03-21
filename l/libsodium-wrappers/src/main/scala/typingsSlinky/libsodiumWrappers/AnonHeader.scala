package typingsSlinky.libsodiumWrappers

import typingsSlinky.libsodiumWrappers.mod.StateAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeader extends js.Object {
  var header: scala.scalajs.js.typedarray.Uint8Array
  var state: StateAddress
}

object AnonHeader {
  @scala.inline
  def apply(header: scala.scalajs.js.typedarray.Uint8Array, state: StateAddress): AnonHeader = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHeader]
  }
}


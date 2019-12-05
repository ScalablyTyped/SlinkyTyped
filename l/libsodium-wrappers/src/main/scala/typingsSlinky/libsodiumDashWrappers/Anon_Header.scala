package typingsSlinky.libsodiumDashWrappers

import typingsSlinky.libsodiumDashWrappers.libsodiumDashWrappersMod.StateAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Header extends js.Object {
  var header: scala.scalajs.js.typedarray.Uint8Array
  var state: StateAddress
}

object Anon_Header {
  @scala.inline
  def apply(header: scala.scalajs.js.typedarray.Uint8Array, state: StateAddress): Anon_Header = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Header]
  }
}


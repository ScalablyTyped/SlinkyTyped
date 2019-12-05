package typingsSlinky.libsodiumDashWrappers.libsodiumDashWrappersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageTag extends js.Object {
  var message: scala.scalajs.js.typedarray.Uint8Array
  var tag: Double
}

object MessageTag {
  @scala.inline
  def apply(message: scala.scalajs.js.typedarray.Uint8Array, tag: Double): MessageTag = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageTag]
  }
}


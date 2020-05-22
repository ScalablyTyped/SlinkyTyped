package typingsSlinky.node.tlsMod

import typingsSlinky.node.NodeJS.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PSKCallbackNegotation extends js.Object {
  var identitty: String
  var psk: js.typedarray.DataView | TypedArray
}

object PSKCallbackNegotation {
  @scala.inline
  def apply(identitty: String, psk: js.typedarray.DataView | TypedArray): PSKCallbackNegotation = {
    val __obj = js.Dynamic.literal(identitty = identitty.asInstanceOf[js.Any], psk = psk.asInstanceOf[js.Any])
    __obj.asInstanceOf[PSKCallbackNegotation]
  }
}


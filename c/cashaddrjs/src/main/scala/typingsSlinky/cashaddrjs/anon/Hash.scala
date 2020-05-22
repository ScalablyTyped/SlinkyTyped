package typingsSlinky.cashaddrjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hash extends js.Object {
  var hash: js.typedarray.Uint8Array
  var prefix: String
  var `type`: String
}

object Hash {
  @scala.inline
  def apply(hash: js.typedarray.Uint8Array, prefix: String, `type`: String): Hash = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hash]
  }
}


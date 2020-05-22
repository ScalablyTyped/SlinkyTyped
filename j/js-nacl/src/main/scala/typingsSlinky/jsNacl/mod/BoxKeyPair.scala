package typingsSlinky.jsNacl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxKeyPair extends js.Object {
  var boxPk: js.typedarray.Uint8Array
  var boxSk: js.typedarray.Uint8Array
}

object BoxKeyPair {
  @scala.inline
  def apply(boxPk: js.typedarray.Uint8Array, boxSk: js.typedarray.Uint8Array): BoxKeyPair = {
    val __obj = js.Dynamic.literal(boxPk = boxPk.asInstanceOf[js.Any], boxSk = boxSk.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxKeyPair]
  }
}


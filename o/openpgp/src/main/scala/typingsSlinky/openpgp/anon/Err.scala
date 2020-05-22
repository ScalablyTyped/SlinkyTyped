package typingsSlinky.openpgp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Err extends js.Object {
  var err: js.Array[js.Error] | Null
  var keys: js.Array[typingsSlinky.openpgp.mod.key.Key]
}

object Err {
  @scala.inline
  def apply(keys: js.Array[typingsSlinky.openpgp.mod.key.Key], err: js.Array[js.Error] = null): Err = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any], err = err.asInstanceOf[js.Any])
    __obj.asInstanceOf[Err]
  }
}


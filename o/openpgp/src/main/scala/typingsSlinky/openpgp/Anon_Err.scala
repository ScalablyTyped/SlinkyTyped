package typingsSlinky.openpgp

import typingsSlinky.openpgp.openpgpMod.key.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Err extends js.Object {
  var err: js.Array[js.Error] | Null
  var keys: js.Array[Key]
}

object Anon_Err {
  @scala.inline
  def apply(keys: js.Array[Key], err: js.Array[js.Error] = null): Anon_Err = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    if (err != null) __obj.updateDynamic("err")(err.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Err]
  }
}


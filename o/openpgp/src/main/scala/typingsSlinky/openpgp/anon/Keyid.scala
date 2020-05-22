package typingsSlinky.openpgp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Keyid extends js.Object {
  var keyid: typingsSlinky.openpgp.mod.`type`.keyid.Keyid
  var valid: Boolean
}

object Keyid {
  @scala.inline
  def apply(keyid: typingsSlinky.openpgp.mod.`type`.keyid.Keyid, valid: Boolean): Keyid = {
    val __obj = js.Dynamic.literal(keyid = keyid.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keyid]
  }
}


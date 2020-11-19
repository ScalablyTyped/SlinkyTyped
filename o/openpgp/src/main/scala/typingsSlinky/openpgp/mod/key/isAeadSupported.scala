package typingsSlinky.openpgp.mod.key

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openpgp", "key.isAeadSupported")
@js.native
object isAeadSupported extends js.Object {
  
  /**
    * Returns whether aead is supported by all keys in the set
    * @param keys Set of keys
    * @param date (optional) use the given date for verification instead of the current time
    * @param userIds (optional) user IDs
    * @returns
    */
  def apply(keys: js.Array[_], date: js.Date, userIds: js.Array[_]): js.Promise[Boolean] = js.native
}

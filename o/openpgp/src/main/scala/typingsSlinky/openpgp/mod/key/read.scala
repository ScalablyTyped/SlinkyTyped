package typingsSlinky.openpgp.mod.key

import typingsSlinky.openpgp.anon.Err
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "key.read")
@js.native
object read extends js.Object {
  /**
    * Reads an unarmored OpenPGP key list and returns one or multiple key objects
    * @param data to be parsed
    * @returns result object with key and error arrays
    */
  def apply(data: js.typedarray.Uint8Array): js.Promise[Err] = js.native
}


package typingsSlinky.pkijs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/common", "getRandomValues")
@js.native
object getRandomValues extends js.Object {
  /**
    * Initialize input Uint8Array by random values (with help from current "crypto engine")
    *
    * @param {ArrayBufferView} view
    * @returns {ArrayBufferView}
    */
  def apply(view: js.typedarray.ArrayBufferView): js.typedarray.ArrayBufferView = js.native
}


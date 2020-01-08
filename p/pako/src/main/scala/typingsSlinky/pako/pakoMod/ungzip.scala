package typingsSlinky.pako.pakoMod

import typingsSlinky.pako.Anon_String
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pako", "ungzip")
@js.native
object ungzip extends js.Object {
  def apply(data: Data): scala.scalajs.js.typedarray.Uint8Array = js.native
  /**
    * Just shortcut to inflate, because it autodetects format by header.content. Done for convenience.
    */
  def apply(data: Data, options: InflateFunctionOptions with Anon_String): String = js.native
}


package typingsSlinky.pako.pakoMod

import typingsSlinky.pako.Anon_String
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pako", "gzip")
@js.native
object gzip extends js.Object {
  def apply(data: Data): scala.scalajs.js.typedarray.Uint8Array = js.native
  /**
    * The same as deflate, but create gzip wrapper instead of deflate one.
    */
  def apply(data: Data, options: DeflateFunctionOptions with Anon_String): String = js.native
}


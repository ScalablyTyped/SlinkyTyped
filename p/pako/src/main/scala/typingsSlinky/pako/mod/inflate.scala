package typingsSlinky.pako.mod

import typingsSlinky.pako.anon.InflateFunctionOptionstos
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pako", "inflate")
@js.native
object inflate extends js.Object {
  
  def apply(data: Data): js.typedarray.Uint8Array = js.native
  /**
    * Decompress data with inflate/ungzip and options. Autodetect format via wrapper header
    * by default. That's why we don't provide separate ungzip method.
    */
  def apply(data: Data, options: InflateFunctionOptionstos): String = js.native
  def apply(data: Data, options: InflateFunctionOptions): js.typedarray.Uint8Array = js.native
}

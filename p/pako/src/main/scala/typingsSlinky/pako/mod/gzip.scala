package typingsSlinky.pako.mod

import typingsSlinky.pako.anon.DeflateFunctionOptionstos
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pako", "gzip")
@js.native
object gzip extends js.Object {
  
  def apply(data: Data): js.typedarray.Uint8Array = js.native
  /**
    * The same as deflate, but create gzip wrapper instead of deflate one.
    */
  def apply(data: Data, options: DeflateFunctionOptionstos): String = js.native
  def apply(data: Data, options: DeflateFunctionOptions): js.typedarray.Uint8Array = js.native
}

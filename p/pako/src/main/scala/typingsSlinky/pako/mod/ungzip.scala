package typingsSlinky.pako.mod

import typingsSlinky.pako.anon.InflateFunctionOptionstos
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pako", "ungzip")
@js.native
object ungzip extends js.Object {
  
  def apply(data: Data): js.typedarray.Uint8Array = js.native
  /**
    * Just shortcut to inflate, because it autodetects format by header.content. Done for convenience.
    */
  def apply(data: Data, options: InflateFunctionOptionstos): String = js.native
  def apply(data: Data, options: InflateFunctionOptions): js.typedarray.Uint8Array = js.native
}

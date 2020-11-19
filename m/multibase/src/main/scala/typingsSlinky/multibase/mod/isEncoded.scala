package typingsSlinky.multibase.mod

import typingsSlinky.multibase.multibaseBooleans.`false`
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("multibase", "isEncoded")
@js.native
object isEncoded extends js.Object {
  
  def apply(bufOrString: String): name | `false` = js.native
  /**
    * Is the given data multibase encoded?
    *
    * @param bufOrString The data to be checked.
    */
  def apply(bufOrString: Buffer): name | `false` = js.native
}

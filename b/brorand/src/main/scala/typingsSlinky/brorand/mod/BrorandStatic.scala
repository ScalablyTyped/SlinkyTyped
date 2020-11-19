package typingsSlinky.brorand.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrorandStatic extends js.Object {
  
  def apply(len: Double): Buffer | js.typedarray.Uint8Array = js.native
  
  var Rand: RandStatic = js.native
}

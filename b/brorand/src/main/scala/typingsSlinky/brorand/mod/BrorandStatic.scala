package typingsSlinky.brorand.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrorandStatic extends js.Object {
  var Rand: RandStatic = js.native
  def apply(len: Double): Buffer | js.typedarray.Uint8Array = js.native
}


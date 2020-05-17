package typingsSlinky.nodeVagrant.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-vagrant", "boxUpdate")
@js.native
object boxUpdate extends js.Object {
  def apply(box: String): ProgressEmitter = js.native
  def apply(box: String, provider: String): ProgressEmitter = js.native
  def apply(box: String, provider: String, cb: Callback): ProgressEmitter = js.native
  def apply(box: String, provider: Null, cb: Callback): ProgressEmitter = js.native
}


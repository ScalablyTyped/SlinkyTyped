package typingsSlinky.pythonStruct.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("python-struct", "unpack")
@js.native
object unpack extends js.Object {
  def apply(format: String, data: Buffer): js.Array[DataType] = js.native
  def apply(format: String, data: Buffer, checkBounds: Boolean): js.Array[DataType] = js.native
}


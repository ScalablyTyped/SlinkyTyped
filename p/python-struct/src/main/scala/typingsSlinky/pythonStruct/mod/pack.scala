package typingsSlinky.pythonStruct.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("python-struct", "pack")
@js.native
object pack extends js.Object {
  def apply(format: String, data: DataType*): Buffer = js.native
  def apply(format: String, data: js.Array[DataType]): Buffer = js.native
}


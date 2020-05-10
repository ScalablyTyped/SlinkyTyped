package typingsSlinky.rax

import typingsSlinky.propTypes.mod.InferType
import typingsSlinky.propTypes.mod.Requireable
import typingsSlinky.propTypes.mod.Validator
import typingsSlinky.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn0 extends js.Object {
  def apply[T /* <: Validator[_] */](types: js.Array[T]): Requireable[NonNullable[InferType[T]]] = js.native
}


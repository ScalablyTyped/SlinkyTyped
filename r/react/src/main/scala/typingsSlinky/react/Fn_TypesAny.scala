package typingsSlinky.react

import typingsSlinky.propDashTypes.propDashTypesMod.InferType
import typingsSlinky.propDashTypes.propDashTypesMod.Requireable
import typingsSlinky.propDashTypes.propDashTypesMod.Validator
import typingsSlinky.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_TypesAny extends js.Object {
  def apply[T /* <: Validator[_] */](types: js.Array[T]): Requireable[NonNullable[InferType[T]]] = js.native
}


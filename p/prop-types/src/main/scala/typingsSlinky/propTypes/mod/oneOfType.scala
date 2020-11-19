package typingsSlinky.propTypes.mod

import typingsSlinky.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prop-types", "oneOfType")
@js.native
object oneOfType extends js.Object {
  
  def apply[T /* <: Validator[_] */](types: js.Array[T]): Requireable[NonNullable[InferType[T]]] = js.native
}

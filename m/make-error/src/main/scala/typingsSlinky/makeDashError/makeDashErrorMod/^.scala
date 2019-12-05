package typingsSlinky.makeDashError.makeDashErrorMod

import typingsSlinky.makeDashError.Anon_Args
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("make-error", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(name: String): Constructor[BaseError] = js.native
  /**
    * Set the constructor prototype to `BaseError`.
    */
  def apply[T /* <: js.Error */](super_ : Anon_Args[T]): Constructor[T with BaseError] = js.native
  /**
    * Create a specialized error instance.
    */
  def apply[T /* <: js.Error */, K](name: String, super_ : K): K with SpecializedConstructor[T] = js.native
  def apply[T /* <: js.Error */, K](name: js.Function, super_ : K): K with SpecializedConstructor[T] = js.native
}


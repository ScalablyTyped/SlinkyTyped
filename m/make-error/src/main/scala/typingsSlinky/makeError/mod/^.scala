package typingsSlinky.makeError.mod

import typingsSlinky.makeError.anon.Instantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("make-error", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(name: String): Constructor[BaseError] = js.native
  /**
    * Set the constructor prototype to `BaseError`.
    */
  def apply[T /* <: js.Error */](super_ : Instantiable[T]): Constructor[T with BaseError] = js.native
  /**
    * Create a specialized error instance.
    */
  def apply[T /* <: js.Error */, K](name: String, super_ : K): K with SpecializedConstructor[T] = js.native
  def apply[T /* <: js.Error */, K](name: js.Function, super_ : K): K with SpecializedConstructor[T] = js.native
}

package typingsSlinky.aureliaDependencyInjection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-dependency-injection", "singleton")
@js.native
object singleton extends js.Object {
  
  def apply(): js.Any = js.native
  def apply(registerInChild: Boolean): js.Any = js.native
  def apply[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: js.UndefOr[PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]], registerInChild: Boolean): js.Any = js.native
  def apply[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]): js.Any = js.native
}

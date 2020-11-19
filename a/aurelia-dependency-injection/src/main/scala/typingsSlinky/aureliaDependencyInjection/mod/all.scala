package typingsSlinky.aureliaDependencyInjection.mod

import typingsSlinky.aureliaDependencyInjection.anon.Inject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-dependency-injection", "all")
@js.native
object all extends js.Object {
  
  def apply[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](keyValue: js.Any): js.Function3[
    /* target */ (DependencyCtor[TBase, TImpl, TArgs]) with (Inject[TArgs, TBase]), 
    /* _key */ js.Any, 
    /* index */ Double, 
    Unit
  ] = js.native
}

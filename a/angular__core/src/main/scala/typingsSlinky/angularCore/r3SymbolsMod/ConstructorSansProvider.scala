package typingsSlinky.angularCore.r3SymbolsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configures the `Injector` to return an instance of a token.
  *
  * @see ["Dependency Injection Guide"](guide/dependency-injection).
  *
  * @usageNotes
  *
  * ```ts
  * @Injectable(SomeModule, {deps: []})
  * class MyService {}
  * ```
  *
  * @publicApi
  */
@js.native
trait ConstructorSansProvider extends StObject {
  
  /**
    * A list of `token`s to be resolved by the injector.
    */
  var deps: js.UndefOr[js.Array[_]] = js.native
}
object ConstructorSansProvider {
  
  @scala.inline
  def apply(): ConstructorSansProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstructorSansProvider]
  }
  
  @scala.inline
  implicit class ConstructorSansProviderMutableBuilder[Self <: ConstructorSansProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeps(value: js.Array[_]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepsUndefined: Self = StObject.set(x, "deps", js.undefined)
    
    @scala.inline
    def setDepsVarargs(value: js.Any*): Self = StObject.set(x, "deps", js.Array(value :_*))
  }
}

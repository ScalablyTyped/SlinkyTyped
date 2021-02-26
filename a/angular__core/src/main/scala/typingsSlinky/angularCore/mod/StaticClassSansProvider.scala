package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaticClassSansProvider extends InjectableProvider {
  
  /**
    * A list of `token`s to be resolved by the injector. The list of values is then
    * used as arguments to the `useClass` constructor.
    */
  var deps: js.Array[_] = js.native
  
  /**
    * An optional class to instantiate for the `token`. By default, the `provide`
    * class is instantiated.
    */
  var useClass: typingsSlinky.angularCore.mod.Type[_] = js.native
}
object StaticClassSansProvider {
  
  @scala.inline
  def apply(deps: js.Array[_], useClass: typingsSlinky.angularCore.mod.Type[_]): StaticClassSansProvider = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], useClass = useClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticClassSansProvider]
  }
  
  @scala.inline
  implicit class StaticClassSansProviderMutableBuilder[Self <: StaticClassSansProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeps(value: js.Array[_]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepsVarargs(value: js.Any*): Self = StObject.set(x, "deps", js.Array(value :_*))
    
    @scala.inline
    def setUseClass(value: typingsSlinky.angularCore.mod.Type[_]): Self = StObject.set(x, "useClass", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.angularCore.mod.ValueSansProvider
  - typingsSlinky.angularCore.mod.ExistingSansProvider
  - typingsSlinky.angularCore.mod.StaticClassSansProvider
  - typingsSlinky.angularCore.mod.ConstructorSansProvider
  - typingsSlinky.angularCore.mod.FactorySansProvider
  - typingsSlinky.angularCore.mod.ClassSansProvider
*/
trait InjectableProvider extends js.Object
object InjectableProvider {
  
  @scala.inline
  def ClassSansProvider(useClass: Type[_]): InjectableProvider = {
    val __obj = js.Dynamic.literal(useClass = useClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectableProvider]
  }
  
  @scala.inline
  def ConstructorSansProvider(): InjectableProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InjectableProvider]
  }
  
  @scala.inline
  def ExistingSansProvider(useExisting: js.Any): InjectableProvider = {
    val __obj = js.Dynamic.literal(useExisting = useExisting.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectableProvider]
  }
  
  @scala.inline
  def FactorySansProvider(useFactory: js.Function): InjectableProvider = {
    val __obj = js.Dynamic.literal(useFactory = useFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectableProvider]
  }
  
  @scala.inline
  def ValueSansProvider(useValue: js.Any): InjectableProvider = {
    val __obj = js.Dynamic.literal(useValue = useValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectableProvider]
  }
  
  @scala.inline
  def StaticClassSansProvider(deps: js.Array[_], useClass: Type[_]): InjectableProvider = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], useClass = useClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectableProvider]
  }
}

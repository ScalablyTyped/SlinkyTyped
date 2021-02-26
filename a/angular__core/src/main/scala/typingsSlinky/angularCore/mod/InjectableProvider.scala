package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.StObject
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
trait InjectableProvider extends StObject
object InjectableProvider {
  
  @scala.inline
  def ClassSansProvider(useClass: typingsSlinky.angularCore.mod.Type[_]): typingsSlinky.angularCore.mod.ClassSansProvider = {
    val __obj = js.Dynamic.literal(useClass = useClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.angularCore.mod.ClassSansProvider]
  }
  
  @scala.inline
  def ConstructorSansProvider(): typingsSlinky.angularCore.mod.ConstructorSansProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsSlinky.angularCore.mod.ConstructorSansProvider]
  }
  
  @scala.inline
  def ExistingSansProvider(useExisting: js.Any): typingsSlinky.angularCore.mod.ExistingSansProvider = {
    val __obj = js.Dynamic.literal(useExisting = useExisting.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.angularCore.mod.ExistingSansProvider]
  }
  
  @scala.inline
  def FactorySansProvider(useFactory: js.Function): typingsSlinky.angularCore.mod.FactorySansProvider = {
    val __obj = js.Dynamic.literal(useFactory = useFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.angularCore.mod.FactorySansProvider]
  }
  
  @scala.inline
  def StaticClassSansProvider(deps: js.Array[_], useClass: typingsSlinky.angularCore.mod.Type[_]): typingsSlinky.angularCore.mod.StaticClassSansProvider = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], useClass = useClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.angularCore.mod.StaticClassSansProvider]
  }
  
  @scala.inline
  def ValueSansProvider(useValue: js.Any): typingsSlinky.angularCore.mod.ValueSansProvider = {
    val __obj = js.Dynamic.literal(useValue = useValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.angularCore.mod.ValueSansProvider]
  }
}

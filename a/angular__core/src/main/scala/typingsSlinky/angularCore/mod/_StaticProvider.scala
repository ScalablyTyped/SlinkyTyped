package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _StaticProvider extends StObject
object _StaticProvider {
  
  @scala.inline
  def ConstructorProvider(provide: typingsSlinky.angularCore.mod.Type[_]): typingsSlinky.angularCore.mod.ConstructorProvider = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.angularCore.mod.ConstructorProvider]
  }
  
  @scala.inline
  def ExistingProvider(provide: js.Any, useExisting: js.Any): typingsSlinky.angularCore.mod.ExistingProvider = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], useExisting = useExisting.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.angularCore.mod.ExistingProvider]
  }
  
  @scala.inline
  def FactoryProvider(provide: js.Any, useFactory: js.Function): typingsSlinky.angularCore.mod.FactoryProvider = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], useFactory = useFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.angularCore.mod.FactoryProvider]
  }
  
  @scala.inline
  def StaticClassProvider(deps: js.Array[_], provide: js.Any, useClass: typingsSlinky.angularCore.mod.Type[_]): typingsSlinky.angularCore.mod.StaticClassProvider = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], provide = provide.asInstanceOf[js.Any], useClass = useClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.angularCore.mod.StaticClassProvider]
  }
  
  @scala.inline
  def ValueProvider(provide: js.Any, useValue: js.Any): typingsSlinky.angularCore.mod.ValueProvider = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], useValue = useValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.angularCore.mod.ValueProvider]
  }
}

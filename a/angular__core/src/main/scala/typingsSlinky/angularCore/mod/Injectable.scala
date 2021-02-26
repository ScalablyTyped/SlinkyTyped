package typingsSlinky.angularCore.mod

import typingsSlinky.angularCore.angularCoreStrings.any
import typingsSlinky.angularCore.angularCoreStrings.platform
import typingsSlinky.angularCore.angularCoreStrings.root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Injectable extends StObject {
  
  /**
    * Determines which injectors will provide the injectable,
    * by either associating it with an `@NgModule` or other `InjectorType`,
    * or by specifying that this injectable should be provided in one of the following injectors:
    * - 'root' : The application-level injector in most apps.
    * - 'platform' : A special singleton platform injector shared by all
    * applications on the page.
    * - 'any' : Provides a unique instance in each lazy loaded module while all eagerly loaded
    * modules share one instance.
    *
    */
  var providedIn: js.UndefOr[typingsSlinky.angularCore.mod.Type[_] | root | platform | any | Null] = js.native
}
object Injectable {
  
  @JSImport("@angular/core", "Injectable")
  @js.native
  val ^ : InjectableDecorator = js.native
  
  @scala.inline
  implicit class InjectableMutableBuilder[Self <: Injectable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvidedIn(value: typingsSlinky.angularCore.mod.Type[_] | root | platform | any): Self = StObject.set(x, "providedIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidedInNull: Self = StObject.set(x, "providedIn", null)
    
    @scala.inline
    def setProvidedInUndefined: Self = StObject.set(x, "providedIn", js.undefined)
  }
}

package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.angularCore.angularCoreStrings.any
import typingsSlinky.angularCore.angularCoreStrings.platform
import typingsSlinky.angularCore.angularCoreStrings.root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Injectable extends js.Object {
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
  var providedIn: js.UndefOr[Type[_] | root | platform | any | Null] = js.native
}

@JSImport("@angular/core", "Injectable")
@js.native
object Injectable extends TopLevel[InjectableDecorator]


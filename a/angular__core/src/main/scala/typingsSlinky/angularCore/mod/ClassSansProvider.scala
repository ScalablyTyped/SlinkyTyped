package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassSansProvider extends InjectableProvider {
  
  /**
    * Class to instantiate for the `token`.
    */
  var useClass: typingsSlinky.angularCore.mod.Type[_] = js.native
}
object ClassSansProvider {
  
  @scala.inline
  def apply(useClass: typingsSlinky.angularCore.mod.Type[_]): ClassSansProvider = {
    val __obj = js.Dynamic.literal(useClass = useClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassSansProvider]
  }
  
  @scala.inline
  implicit class ClassSansProviderMutableBuilder[Self <: ClassSansProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUseClass(value: typingsSlinky.angularCore.mod.Type[_]): Self = StObject.set(x, "useClass", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "ModuleWithComponentFactories")
@js.native
class ModuleWithComponentFactories[T] protected () extends StObject {
  def this(ngModuleFactory: NgModuleFactory[T], componentFactories: js.Array[ComponentFactory[_]]) = this()
  
  var componentFactories: js.Array[ComponentFactory[_]] = js.native
  
  var ngModuleFactory: NgModuleFactory[T] = js.native
}

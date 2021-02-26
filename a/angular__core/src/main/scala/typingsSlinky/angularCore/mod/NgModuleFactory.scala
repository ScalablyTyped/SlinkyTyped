package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "NgModuleFactory")
@js.native
abstract class NgModuleFactory[T] () extends StObject {
  
  def create(): NgModuleRef[T] = js.native
  def create(parentInjector: Injector): NgModuleRef[T] = js.native
  
  def moduleType: typingsSlinky.angularCore.mod.Type[T] = js.native
}

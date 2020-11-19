package typingsSlinky.angularCore.r3SymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @publicApi
  */
@js.native
trait NgModuleFactory2[T] extends js.Object {
  
  def create(): NgModuleRef[T] = js.native
  def create(parentInjector: Injector): NgModuleRef[T] = js.native
  
  def moduleType: Type[T] = js.native
}

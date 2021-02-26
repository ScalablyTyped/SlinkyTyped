package typingsSlinky.angular.mod

import typingsSlinky.angular.mod.global.Function
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IControllerProvider extends IServiceProvider {
  
  def register(name: String, controllerConstructor: Function): Unit = js.native
  def register(name: String, dependencyAnnotatedConstructor: js.Array[_]): Unit = js.native
}

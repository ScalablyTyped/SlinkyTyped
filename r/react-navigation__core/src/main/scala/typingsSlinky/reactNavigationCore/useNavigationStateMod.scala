package typingsSlinky.reactNavigationCore

import typingsSlinky.reactNavigationRouters.typesMod.NavigationState
import typingsSlinky.reactNavigationRouters.typesMod.ParamListBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-navigation/core/lib/typescript/src/useNavigationState", JSImport.Namespace)
@js.native
object useNavigationStateMod extends js.Object {
  
  def default[T](selector: Selector[T]): T = js.native
  
  type Selector[T] = js.Function1[/* state */ NavigationState[ParamListBase], T]
}

package typingsSlinky.reactNavigationCore

import typingsSlinky.reactNavigationRouters.typesMod.NavigationState
import typingsSlinky.reactNavigationRouters.typesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useNavigationStateMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useNavigationState", JSImport.Default)
  @js.native
  def default[T](selector: Selector[T]): T = js.native
  
  type Selector[T] = js.Function1[/* state */ NavigationState[ParamListBase], T]
}

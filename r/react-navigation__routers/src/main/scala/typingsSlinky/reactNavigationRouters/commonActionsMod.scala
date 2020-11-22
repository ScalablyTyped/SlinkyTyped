package typingsSlinky.reactNavigationRouters

import typingsSlinky.reactNavigationRouters.anon.KeyParams
import typingsSlinky.reactNavigationRouters.anon.Name
import typingsSlinky.reactNavigationRouters.typesMod.NavigationState
import typingsSlinky.reactNavigationRouters.typesMod.ParamListBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-navigation/routers/lib/typescript/src/CommonActions", JSImport.Namespace)
@js.native
object commonActionsMod extends js.Object {
  
  def goBack(): Action = js.native
  
  def navigate(name: String): Action = js.native
  def navigate(name: String, params: js.Object): Action = js.native
  def navigate(route: KeyParams): Action = js.native
  def navigate(route: Name): Action = js.native
  
  def reset(): Action = js.native
  def reset(state: ResetState): Action = js.native
  
  def setParams(params: js.Object): Action = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNavigationRouters.anon.Source
    - typingsSlinky.reactNavigationRouters.anon.Payload
    - typingsSlinky.reactNavigationRouters.anon.Target
    - typingsSlinky.reactNavigationRouters.anon.Type
  */
  trait Action extends js.Object
  
  trait _ResetState extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNavigationRouters.anon.PartialStateNavigationSta
    - typingsSlinky.reactNavigationRouters.typesMod.NavigationState[typingsSlinky.reactNavigationRouters.typesMod.ParamListBase]
    - typingsSlinky.reactNavigationRouters.anon.OmitNavigationStateParamL
  */
  type ResetState = _ResetState | NavigationState[ParamListBase]
}

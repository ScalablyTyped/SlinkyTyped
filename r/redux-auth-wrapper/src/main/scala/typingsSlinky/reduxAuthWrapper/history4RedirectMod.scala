package typingsSlinky.reduxAuthWrapper

import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationState
import typingsSlinky.redux.mod.Action
import typingsSlinky.reduxAuthWrapper.mod.AuthWrapperDecorator
import typingsSlinky.reduxAuthWrapper.mod.StateSelector
import typingsSlinky.reduxAuthWrapper.redirectMod.ConnectedRouterRedirectConfig
import typingsSlinky.reduxAuthWrapper.redirectMod.InjectedAuthReduxProps
import typingsSlinky.reduxAuthWrapper.redirectMod.InjectedAuthRouterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object history4RedirectMod {
  
  @JSImport("redux-auth-wrapper/history4/redirect", "connectedReduxRedirect")
  @js.native
  def connectedReduxRedirect[OwnProps, State](config: ConnectedReduxRedirectConfig[OwnProps, State]): AuthWrapperDecorator[OwnProps with InjectedAuthReduxProps] = js.native
  
  @JSImport("redux-auth-wrapper/history4/redirect", "connectedRouterRedirect")
  @js.native
  def connectedRouterRedirect[OwnProps, State](config: ConnectedRouterRedirectConfig[OwnProps, State]): AuthWrapperDecorator[
    OwnProps with (InjectedAuthRouterProps[js.Function1[/* repeated */ _, Action[_]]])
  ] = js.native
  
  @js.native
  trait ConnectedReduxRedirectConfig[OwnProps, State] extends ConnectedRouterRedirectConfig[OwnProps, State] {
    
    @JSName("redirectAction")
    def redirectAction_MConnectedReduxRedirectConfig(location: Location[LocationState]): Action[_] = js.native
  }
  object ConnectedReduxRedirectConfig {
    
    @scala.inline
    def apply[OwnProps, State](
      authenticatedSelector: (State, OwnProps) => Boolean,
      redirectAction: Location[LocationState] => Action[_],
      redirectPath: String | (StateSelector[State, OwnProps, String])
    ): ConnectedReduxRedirectConfig[OwnProps, State] = {
      val __obj = js.Dynamic.literal(authenticatedSelector = js.Any.fromFunction2(authenticatedSelector), redirectAction = js.Any.fromFunction1(redirectAction), redirectPath = redirectPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectedReduxRedirectConfig[OwnProps, State]]
    }
    
    @scala.inline
    implicit class ConnectedReduxRedirectConfigMutableBuilder[Self <: ConnectedReduxRedirectConfig[_, _], OwnProps, State] (val x: Self with (ConnectedReduxRedirectConfig[OwnProps, State])) extends AnyVal {
      
      @scala.inline
      def setRedirectAction(value: Location[LocationState] => Action[_]): Self = StObject.set(x, "redirectAction", js.Any.fromFunction1(value))
    }
  }
}

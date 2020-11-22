package typingsSlinky.reactAuthKit

import slinky.core.ReactComponentClass
import typingsSlinky.reactAuthKit.anon.AuthHeader
import typingsSlinky.reactAuthKit.privateRouteMod.PrivateRouteProps
import typingsSlinky.reactAuthKit.typesMod.AuthProviderProps
import typingsSlinky.reactAuthKit.typesMod.signInFunctionParams
import typingsSlinky.reactAuthKit.withAuthHeaderMod.withAuthHeaderProps
import typingsSlinky.reactAuthKit.withAuthUserMod.withAuthProps
import typingsSlinky.reactAuthKit.withSignInMod.withSignInProps
import typingsSlinky.reactAuthKit.withSignOutMod.withSignOutProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-auth-kit", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * AuthProvider - The Authentication Context Provider
    *
    * @param children
    * @param authStorageName
    * @param authStorageType
    * @param authTimeStorageName
    * @param cookieDomain
    * @param cookieSecure
    * @param stateStorageName
    */
  val AuthProvider: ReactComponentClass[AuthProviderProps] = js.native
  
  /**
    * Private Route for Components
    *
    * @remarks
    * This Component is based on {@link https://reactrouter.com/web/api/Route | reactrouter.Route}.
    * So you need to install react-route-dom before use it
    *
    * @param props
    */
  val PrivateRoute: ReactComponentClass[PrivateRouteProps] = js.native
  
  def useAuth(): AuthHeader = js.native
  
  def useAuthHeader(): js.Function0[String] = js.native
  
  def useAuthUser(): js.Function0[js.Object | Null] = js.native
  
  def useIsAuthenticated(): js.Function0[Boolean] = js.native
  
  /**
    * Authentication SignIn Hook
    *
    * @returns - Sign In function
    */
  def useSignIn(): js.Function1[/* signInConfig */ signInFunctionParams, Boolean] = js.native
  
  def useSignOut(): js.Function0[Boolean] = js.native
  
  def withAuthHeader[P /* <: withAuthHeaderProps */](Component: ReactComponentClass[P]): ReactComponentClass[P] = js.native
  
  def withAuthUser[P /* <: withAuthProps */](Component: ReactComponentClass[P]): ReactComponentClass[P] = js.native
  
  def withIsAuthenticated[P /* <: typingsSlinky.reactAuthKit.withIsAuthenticatedMod.withAuthHeaderProps */](Component: ReactComponentClass[P]): ReactComponentClass[P] = js.native
  
  def withSignIn[P /* <: withSignInProps */](Component: ReactComponentClass[P]): ReactComponentClass[P] = js.native
  
  def withSignOut[P /* <: withSignOutProps */](Component: ReactComponentClass[P]): ReactComponentClass[P] = js.native
}

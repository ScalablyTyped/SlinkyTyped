package typingsSlinky.reactAuthKit

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.react.mod.Context
import typingsSlinky.reactAuthKit.typesMod.AuthContextInterface
import typingsSlinky.reactAuthKit.typesMod.AuthProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-auth-kit/AuthProvider", JSImport.Namespace)
@js.native
object authProviderMod extends js.Object {
  
  val AuthContext: Context[AuthContextInterface] = js.native
  
  val AuthContextConsumer: ReactComponentClass[ConsumerProps[AuthContextInterface]] = js.native
  
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
  val default: ReactComponentClass[AuthProviderProps] = js.native
}

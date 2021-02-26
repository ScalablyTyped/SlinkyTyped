package typingsSlinky.reactAuthKit

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.react.mod.Context
import typingsSlinky.reactAuthKit.typesMod.AuthContextInterface
import typingsSlinky.reactAuthKit.typesMod.AuthProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authProviderMod extends Shortcut {
  
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
  @JSImport("react-auth-kit/AuthProvider", JSImport.Default)
  @js.native
  val default: ReactComponentClass[AuthProviderProps] = js.native
  
  @JSImport("react-auth-kit/AuthProvider", "AuthContext")
  @js.native
  val AuthContext: Context[AuthContextInterface] = js.native
  
  @JSImport("react-auth-kit/AuthProvider", "AuthContextConsumer")
  @js.native
  val AuthContextConsumer: ReactComponentClass[ConsumerProps[AuthContextInterface]] = js.native
  
  type _To = ReactComponentClass[AuthProviderProps]
  
  /* This means you don't have to write `default`, but can instead just say `authProviderMod.foo` */
  override def _to: ReactComponentClass[AuthProviderProps] = default
}

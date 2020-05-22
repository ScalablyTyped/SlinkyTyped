package typingsSlinky.keycloakJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CompatPromise[TPromiseType /* <: typingsSlinky.keycloakJs.mod.PromiseType */, TSuccess, TError] = (typingsSlinky.keycloakJs.mod.KeycloakPromise[TSuccess, TError]) | js.Promise[TSuccess]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.keycloakJs.keycloakJsStrings.cordova
    - typingsSlinky.keycloakJs.keycloakJsStrings.`cordova-native`
    - typingsSlinky.keycloakJs.keycloakJsStrings.default
    - js.Any
  */
  type KeycloakAdapterName = typingsSlinky.keycloakJs.mod._KeycloakAdapterName | js.Any
  type KeycloakPkceMethod = typingsSlinky.keycloakJs.keycloakJsStrings.S256
  type KeycloakPromiseCallback[T] = js.Function1[/* result */ T, scala.Unit]
  type KeycloakPromiseType = typingsSlinky.keycloakJs.keycloakJsStrings.native
  type KeycloakResourceAccess = org.scalablytyped.runtime.StringDictionary[typingsSlinky.keycloakJs.mod.KeycloakRoles]
  // export interface KeycloakUserInfo {}
  /**
  	 * Conditional CompatPromise type in order to support
  	 * both legacy promises and native promises as return types.
  	 */
  type PromiseType = js.UndefOr[typingsSlinky.keycloakJs.mod.KeycloakPromiseType]
}

package typingsSlinky.keycloakJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type KeycloakPkceMethod = typingsSlinky.keycloakJs.keycloakJsStrings.S256
  
  type KeycloakPromiseCallback[T] = js.Function1[/* result */ T, scala.Unit]
  
  type KeycloakResourceAccess = org.scalablytyped.runtime.StringDictionary[typingsSlinky.keycloakJs.mod.KeycloakRoles]
}

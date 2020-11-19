package typingsSlinky.antDesignPro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object authorizedRouteMod {
  
  type AuthorizedRoute = slinky.core.ReactComponentClass[typingsSlinky.antDesignPro.authorizedRouteMod.IAuthorizedRouteProps]
  
  type authority = java.lang.String | js.Array[java.lang.String] | typingsSlinky.antDesignPro.authorizedRouteMod.authorityFN | js.Promise[js.Any]
  
  type authorityFN = js.Function1[/* currentAuthority */ js.UndefOr[java.lang.String], scala.Boolean]
}

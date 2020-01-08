package typingsSlinky.antDashDesignDashPro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libAuthorizedAuthorizedRouteMod {
  import slinky.core.ReactComponentClass

  type AuthorizedRoute = ReactComponentClass[IAuthorizedRouteProps]
  type authority = String | js.Array[String] | authorityFN | js.Promise[js.Any]
  type authorityFN = js.Function1[/* currentAuthority */ js.UndefOr[String], Boolean]
}

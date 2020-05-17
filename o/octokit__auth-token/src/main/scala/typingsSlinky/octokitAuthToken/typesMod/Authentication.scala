package typingsSlinky.octokitAuthToken.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.octokitAuthToken.typesMod.OAuthTokenAuthentication
  - typingsSlinky.octokitAuthToken.typesMod.InstallationTokenAuthentication
  - typingsSlinky.octokitAuthToken.typesMod.AppAuthentication
*/
trait Authentication extends js.Object

object Authentication {
  @scala.inline
  implicit def apply(value: AppAuthentication): Authentication = value.asInstanceOf[Authentication]
  @scala.inline
  implicit def apply(value: InstallationTokenAuthentication): Authentication = value.asInstanceOf[Authentication]
  @scala.inline
  implicit def apply(value: OAuthTokenAuthentication): Authentication = value.asInstanceOf[Authentication]
}


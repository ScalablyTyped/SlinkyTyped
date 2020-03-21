package typingsSlinky.angularJwt.mod.jwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IJwtHelper extends js.Object {
  def decodeToken(token: String): JwtToken = js.native
  def getTokenExpirationDate(token: js.Any): js.Date = js.native
  def isTokenExpired(token: js.Any): Boolean = js.native
  def isTokenExpired(token: js.Any, offsetSeconds: Double): Boolean = js.native
}


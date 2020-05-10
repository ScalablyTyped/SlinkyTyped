package typingsSlinky.cassandraDriver.authMod.auth

import typingsSlinky.cassandraDriver.AnonAuthorizationId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver/lib/auth", "auth.DseGssapiAuthProvider")
@js.native
class DseGssapiAuthProvider () extends AuthProvider {
  def this(gssOptions: AnonAuthorizationId) = this()
}


package typingsSlinky.cassandraDriver.mod

import typingsSlinky.cassandraDriver.anon.AuthorizationId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object auth {
  
  @JSImport("cassandra-driver", "auth.DseGssapiAuthProvider")
  @js.native
  class DseGssapiAuthProvider ()
    extends typingsSlinky.cassandraDriver.authMod.auth.DseGssapiAuthProvider {
    def this(gssOptions: AuthorizationId) = this()
  }
  
  @JSImport("cassandra-driver", "auth.DsePlainTextAuthProvider")
  @js.native
  class DsePlainTextAuthProvider protected ()
    extends typingsSlinky.cassandraDriver.authMod.auth.DsePlainTextAuthProvider {
    def this(username: String, password: String) = this()
    def this(username: String, password: String, authorizationId: String) = this()
  }
  
  @JSImport("cassandra-driver", "auth.PlainTextAuthProvider")
  @js.native
  class PlainTextAuthProvider protected ()
    extends typingsSlinky.cassandraDriver.authMod.auth.PlainTextAuthProvider {
    def this(username: String, password: String) = this()
  }
}

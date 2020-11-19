package typingsSlinky.pulsarClient.mod

import typingsSlinky.pulsarClient.anon.CertificatePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pulsar-client", "AuthenticationTls")
@js.native
class AuthenticationTls protected () extends js.Object {
  def this(authTlsOpts: CertificatePath) = this()
  
  var certificatePath: String = js.native
  
  var privateKeyPath: String = js.native
}

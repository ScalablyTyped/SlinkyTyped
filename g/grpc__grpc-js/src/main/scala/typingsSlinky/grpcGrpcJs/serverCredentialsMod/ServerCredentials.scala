package typingsSlinky.grpcGrpcJs.serverCredentialsMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.http2Mod.SecureServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@grpc/grpc-js/build/src/server-credentials", "ServerCredentials")
@js.native
abstract class ServerCredentials () extends js.Object {
  
  def _getSettings(): SecureServerOptions | Null = js.native
  
  def _isSecure(): Boolean = js.native
}
/* static members */
@JSImport("@grpc/grpc-js/build/src/server-credentials", "ServerCredentials")
@js.native
object ServerCredentials extends js.Object {
  
  def createInsecure(): ServerCredentials = js.native
  
  def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair]): ServerCredentials = js.native
  def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): ServerCredentials = js.native
  def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair]): ServerCredentials = js.native
  def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): ServerCredentials = js.native
}

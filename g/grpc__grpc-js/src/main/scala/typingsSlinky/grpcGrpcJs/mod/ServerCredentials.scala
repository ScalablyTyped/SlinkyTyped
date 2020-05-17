package typingsSlinky.grpcGrpcJs.mod

import typingsSlinky.grpcGrpcJs.serverCredentialsMod.KeyCertPair
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js", "ServerCredentials")
@js.native
abstract class ServerCredentials ()
  extends typingsSlinky.grpcGrpcJs.serverCredentialsMod.ServerCredentials

/* static members */
@JSImport("@grpc/grpc-js", "ServerCredentials")
@js.native
object ServerCredentials extends js.Object {
  def createInsecure(): typingsSlinky.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
  def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair]): typingsSlinky.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
  def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): typingsSlinky.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
  def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair]): typingsSlinky.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
  def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): typingsSlinky.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
}


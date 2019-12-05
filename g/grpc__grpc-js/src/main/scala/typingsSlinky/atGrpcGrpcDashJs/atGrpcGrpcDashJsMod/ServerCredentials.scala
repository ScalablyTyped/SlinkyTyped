package typingsSlinky.atGrpcGrpcDashJs.atGrpcGrpcDashJsMod

import typingsSlinky.atGrpcGrpcDashJs.buildSrcServerDashCredentialsMod.KeyCertPair
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js", "ServerCredentials")
@js.native
abstract class ServerCredentials ()
  extends typingsSlinky.atGrpcGrpcDashJs.buildSrcServerDashCredentialsMod.ServerCredentials

/* static members */
@JSImport("@grpc/grpc-js", "ServerCredentials")
@js.native
object ServerCredentials extends js.Object {
  def createInsecure(): typingsSlinky.atGrpcGrpcDashJs.buildSrcServerDashCredentialsMod.ServerCredentials = js.native
  def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair]): typingsSlinky.atGrpcGrpcDashJs.buildSrcServerDashCredentialsMod.ServerCredentials = js.native
  def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): typingsSlinky.atGrpcGrpcDashJs.buildSrcServerDashCredentialsMod.ServerCredentials = js.native
  def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair]): typingsSlinky.atGrpcGrpcDashJs.buildSrcServerDashCredentialsMod.ServerCredentials = js.native
  def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): typingsSlinky.atGrpcGrpcDashJs.buildSrcServerDashCredentialsMod.ServerCredentials = js.native
}


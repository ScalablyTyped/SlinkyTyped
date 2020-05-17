package typingsSlinky.googleGax.anon

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.grpcGrpcJs.mod.ServerCredentials
import typingsSlinky.grpcGrpcJs.serverCredentialsMod.KeyCertPair
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofServerCredentials extends Instantiable0[ServerCredentials] {
  def createInsecure(): typingsSlinky.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
  def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair]): typingsSlinky.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
  def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): typingsSlinky.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
  def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair]): typingsSlinky.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
  def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): typingsSlinky.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
}


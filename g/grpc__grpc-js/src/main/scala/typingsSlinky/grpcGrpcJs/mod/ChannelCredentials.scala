package typingsSlinky.grpcGrpcJs.mod

import typingsSlinky.grpcGrpcJs.channelCredentialsMod.VerifyOptions
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js", "ChannelCredentials")
@js.native
abstract class ChannelCredentials protected ()
  extends typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials {
  protected def this(callCredentials: typingsSlinky.grpcGrpcJs.callCredentialsMod.CallCredentials) = this()
}

/* static members */
@JSImport("@grpc/grpc-js", "ChannelCredentials")
@js.native
object ChannelCredentials extends js.Object {
  /**
    * Return a new ChannelCredentials instance with no credentials.
    */
  def createInsecure(): typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
  /**
    * Return a new ChannelCredentials instance with a given set of credentials.
    * The resulting instance can be used to construct a Channel that communicates
    * over TLS.
    * @param rootCerts The root certificate data.
    * @param privateKey The client certificate private key, if available.
    * @param certChain The client certificate key chain, if available.
    */
  def createSsl(): typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Null, privateKey: Null, certChain: Null, verifyOptions: VerifyOptions): typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Null, privateKey: Null, certChain: Buffer): typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Null, privateKey: Null, certChain: Buffer, verifyOptions: VerifyOptions): typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Null, privateKey: Buffer): typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Null, privateKey: Buffer, certChain: Null, verifyOptions: VerifyOptions): typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Null, privateKey: Buffer, certChain: Buffer): typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Null, privateKey: Buffer, certChain: Buffer, verifyOptions: VerifyOptions): typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Buffer): typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Buffer, privateKey: Null, certChain: Null, verifyOptions: VerifyOptions): typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Buffer, privateKey: Null, certChain: Buffer): typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Buffer, privateKey: Null, certChain: Buffer, verifyOptions: VerifyOptions): typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Buffer, privateKey: Buffer): typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Buffer, privateKey: Buffer, certChain: Null, verifyOptions: VerifyOptions): typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Buffer, privateKey: Buffer, certChain: Buffer): typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
  def createSsl(rootCerts: Buffer, privateKey: Buffer, certChain: Buffer, verifyOptions: VerifyOptions): typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
}


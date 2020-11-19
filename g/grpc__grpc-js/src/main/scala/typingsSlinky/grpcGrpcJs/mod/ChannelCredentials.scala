package typingsSlinky.grpcGrpcJs.mod

import typingsSlinky.grpcGrpcJs.channelCredentialsMod.VerifyOptions
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def createSsl(
    rootCerts: js.UndefOr[Buffer | Null],
    privateKey: js.UndefOr[Buffer | Null],
    certChain: js.UndefOr[Buffer | Null],
    verifyOptions: js.UndefOr[VerifyOptions]
  ): typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
}

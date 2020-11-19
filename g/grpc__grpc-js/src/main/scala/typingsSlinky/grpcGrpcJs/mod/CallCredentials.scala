package typingsSlinky.grpcGrpcJs.mod

import typingsSlinky.grpcGrpcJs.callCredentialsMod.CallMetadataGenerator
import typingsSlinky.grpcGrpcJs.callCredentialsMod.OAuth2Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@grpc/grpc-js", "CallCredentials")
@js.native
abstract class CallCredentials ()
  extends typingsSlinky.grpcGrpcJs.callCredentialsMod.CallCredentials
/* static members */
@JSImport("@grpc/grpc-js", "CallCredentials")
@js.native
object CallCredentials extends js.Object {
  
  def createEmpty(): typingsSlinky.grpcGrpcJs.callCredentialsMod.CallCredentials = js.native
  
  /**
    * Create a gRPC credential from a Google credential object.
    * @param googleCredentials The authentication client to use.
    * @return The resulting CallCredentials object.
    */
  def createFromGoogleCredential(googleCredentials: OAuth2Client): typingsSlinky.grpcGrpcJs.callCredentialsMod.CallCredentials = js.native
  
  /**
    * Creates a new CallCredentials object from a given function that generates
    * Metadata objects.
    * @param metadataGenerator A function that accepts a set of options, and
    * generates a Metadata object based on these options, which is passed back
    * to the caller via a supplied (err, metadata) callback.
    */
  def createFromMetadataGenerator(metadataGenerator: CallMetadataGenerator): typingsSlinky.grpcGrpcJs.callCredentialsMod.CallCredentials = js.native
}

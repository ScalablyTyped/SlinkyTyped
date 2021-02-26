package typingsSlinky.grpc.mod

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object credentials {
  
  /**
    * Combine any number of CallCredentials into a single CallCredentials object
    * @param credentials The CallCredentials to compose
    * @return A credentials object that combines all of the input credentials
    */
  @JSImport("grpc", "credentials.combineCallCredentials")
  @js.native
  def combineCallCredentials(credentials: CallCredentials*): CallCredentials = js.native
  
  /**
    * Combine a ChannelCredentials with any number of CallCredentials into a single
    * ChannelCredentials object.
    * @param channelCredential The ChannelCredentials to start with
    * @param credentials The CallCredentials to compose
    * @return A credentials object that combines all of the input credentials
    */
  @JSImport("grpc", "credentials.combineChannelCredentials")
  @js.native
  def combineChannelCredentials(channelCredential: ChannelCredentials, credentials: CallCredentials*): ChannelCredentials = js.native
  
  /**
    * Create a gRPC credential from a Google credential object.
    * @param googleCredential The Google credential object to use
    * @return The resulting credentials object
    */
  @JSImport("grpc", "credentials.createFromGoogleCredential")
  @js.native
  def createFromGoogleCredential(googleCredential: GoogleOAuth2Client): CallCredentials = js.native
  
  /**
    * Create a gRPC credentials object from a metadata generation function. This
    * function gets the service URL and a callback as parameters. The error
    * passed to the callback can optionally have a 'code' value attached to it,
    * which corresponds to a status code that this library uses.
    * @param metadataGenerator The function that generates metadata
    * @return The credentials object
    */
  @JSImport("grpc", "credentials.createFromMetadataGenerator")
  @js.native
  def createFromMetadataGenerator(metadataGenerator: metadataGenerator): CallCredentials = js.native
  
  /**
    * Create an insecure credentials object. This is used to create a channel that
    * does not use SSL. This cannot be composed with anything.
    * @return The insecure credentials object
    */
  @JSImport("grpc", "credentials.createInsecure")
  @js.native
  def createInsecure(): ChannelCredentials = js.native
  
  /**
    * Create an SSL Credentials object. If using a client-side certificate, both
    * the second and third arguments must be passed.
    * @param rootCerts The root certificate data
    * @param privateKey The client certificate private key, if applicable
    * @param certChain The client certificate cert chain, if applicable
    * @param verifyOptions Additional peer verification options, if desired
    * @return The SSL Credentials object
    */
  @JSImport("grpc", "credentials.createSsl")
  @js.native
  def createSsl(): ChannelCredentials = js.native
  @JSImport("grpc", "credentials.createSsl")
  @js.native
  def createSsl(
    rootCerts: js.UndefOr[scala.Nothing],
    privateKey: js.UndefOr[scala.Nothing],
    certChain: js.UndefOr[scala.Nothing],
    verifyOptions: VerifyOptions
  ): ChannelCredentials = js.native
  @JSImport("grpc", "credentials.createSsl")
  @js.native
  def createSsl(rootCerts: js.UndefOr[scala.Nothing], privateKey: js.UndefOr[scala.Nothing], certChain: Buffer): ChannelCredentials = js.native
  @JSImport("grpc", "credentials.createSsl")
  @js.native
  def createSsl(
    rootCerts: js.UndefOr[scala.Nothing],
    privateKey: js.UndefOr[scala.Nothing],
    certChain: Buffer,
    verifyOptions: VerifyOptions
  ): ChannelCredentials = js.native
  @JSImport("grpc", "credentials.createSsl")
  @js.native
  def createSsl(rootCerts: js.UndefOr[scala.Nothing], privateKey: Buffer): ChannelCredentials = js.native
  @JSImport("grpc", "credentials.createSsl")
  @js.native
  def createSsl(
    rootCerts: js.UndefOr[scala.Nothing],
    privateKey: Buffer,
    certChain: js.UndefOr[scala.Nothing],
    verifyOptions: VerifyOptions
  ): ChannelCredentials = js.native
  @JSImport("grpc", "credentials.createSsl")
  @js.native
  def createSsl(rootCerts: js.UndefOr[scala.Nothing], privateKey: Buffer, certChain: Buffer): ChannelCredentials = js.native
  @JSImport("grpc", "credentials.createSsl")
  @js.native
  def createSsl(
    rootCerts: js.UndefOr[scala.Nothing],
    privateKey: Buffer,
    certChain: Buffer,
    verifyOptions: VerifyOptions
  ): ChannelCredentials = js.native
  @JSImport("grpc", "credentials.createSsl")
  @js.native
  def createSsl(rootCerts: Buffer): ChannelCredentials = js.native
  @JSImport("grpc", "credentials.createSsl")
  @js.native
  def createSsl(
    rootCerts: Buffer,
    privateKey: js.UndefOr[scala.Nothing],
    certChain: js.UndefOr[scala.Nothing],
    verifyOptions: VerifyOptions
  ): ChannelCredentials = js.native
  @JSImport("grpc", "credentials.createSsl")
  @js.native
  def createSsl(rootCerts: Buffer, privateKey: js.UndefOr[scala.Nothing], certChain: Buffer): ChannelCredentials = js.native
  @JSImport("grpc", "credentials.createSsl")
  @js.native
  def createSsl(
    rootCerts: Buffer,
    privateKey: js.UndefOr[scala.Nothing],
    certChain: Buffer,
    verifyOptions: VerifyOptions
  ): ChannelCredentials = js.native
  @JSImport("grpc", "credentials.createSsl")
  @js.native
  def createSsl(rootCerts: Buffer, privateKey: Buffer): ChannelCredentials = js.native
  @JSImport("grpc", "credentials.createSsl")
  @js.native
  def createSsl(
    rootCerts: Buffer,
    privateKey: Buffer,
    certChain: js.UndefOr[scala.Nothing],
    verifyOptions: VerifyOptions
  ): ChannelCredentials = js.native
  @JSImport("grpc", "credentials.createSsl")
  @js.native
  def createSsl(rootCerts: Buffer, privateKey: Buffer, certChain: Buffer): ChannelCredentials = js.native
  @JSImport("grpc", "credentials.createSsl")
  @js.native
  def createSsl(rootCerts: Buffer, privateKey: Buffer, certChain: Buffer, verifyOptions: VerifyOptions): ChannelCredentials = js.native
}

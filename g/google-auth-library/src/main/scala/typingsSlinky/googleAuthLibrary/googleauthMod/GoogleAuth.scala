package typingsSlinky.googleAuthLibrary.googleauthMod

import typingsSlinky.gaxios.commonMod.GaxiosOptions
import typingsSlinky.gaxios.commonMod.GaxiosResponse
import typingsSlinky.googleAuthLibrary.anon.Headers
import typingsSlinky.googleAuthLibrary.anon.TypeofDefaultTransporter
import typingsSlinky.googleAuthLibrary.computeclientMod.Compute
import typingsSlinky.googleAuthLibrary.credentialsMod.CredentialBody
import typingsSlinky.googleAuthLibrary.credentialsMod.JWTInput
import typingsSlinky.googleAuthLibrary.envDetectMod.GCPEnv
import typingsSlinky.googleAuthLibrary.idtokenclientMod.IdTokenClient
import typingsSlinky.googleAuthLibrary.jwtclientMod.JWT
import typingsSlinky.googleAuthLibrary.oauth2clientMod.RefreshOptions
import typingsSlinky.googleAuthLibrary.refreshclientMod.UserRefreshClient
import typingsSlinky.googleAuthLibrary.transportersMod.Transporter
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-auth-library/build/src/auth/googleauth", "GoogleAuth")
@js.native
class GoogleAuth () extends js.Object {
  def this(opts: GoogleAuthOptions) = this()
  
  /**
    * Return a JWT or UserRefreshClient from JavaScript object, caching both the
    * object used to instantiate and the client.
    * @param json The input object.
    * @param options The JWT or UserRefresh options for the client
    * @returns JWT or UserRefresh Client with data
    */
  var _cacheClientFromJSON: js.Any = js.native
  
  var _cachedProjectId: js.Any = js.native
  
  /**
    * Determines whether the auth layer is running on Google Compute Engine.
    * @returns A promise that resolves with the boolean.
    * @api private
    */
  def _checkIsGCE(): js.Promise[Boolean] = js.native
  
  /**
    * Attempts to load default credentials from a file at the given path..
    * @param filePath The path to the file to read.
    * @returns Promise that resolves with the OAuth2Client
    * @api private
    */
  def _getApplicationCredentialsFromFilePath(filePath: String): js.Promise[JWT | UserRefreshClient] = js.native
  def _getApplicationCredentialsFromFilePath(filePath: String, options: RefreshOptions): js.Promise[JWT | UserRefreshClient] = js.native
  
  var _getDefaultProjectIdPromise: js.Any = js.native
  
  /**
    * Determines whether the current operating system is Windows.
    * @api private
    */
  var _isWindows: js.Any = js.native
  
  /**
    * Attempts to load default credentials from the environment variable path..
    * @returns Promise that resolves with the OAuth2Client or null.
    * @api private
    */
  def _tryGetApplicationCredentialsFromEnvironmentVariable(): js.Promise[JWT | UserRefreshClient | Null] = js.native
  def _tryGetApplicationCredentialsFromEnvironmentVariable(options: RefreshOptions): js.Promise[JWT | UserRefreshClient | Null] = js.native
  
  /**
    * Attempts to load default credentials from a well-known file location
    * @return Promise that resolves with the OAuth2Client or null.
    * @api private
    */
  def _tryGetApplicationCredentialsFromWellKnownFile(): js.Promise[JWT | UserRefreshClient | Null] = js.native
  def _tryGetApplicationCredentialsFromWellKnownFile(options: RefreshOptions): js.Promise[JWT | UserRefreshClient | Null] = js.native
  
  /**
    * Obtain credentials for a request, then attach the appropriate headers to
    * the request options.
    * @param opts Axios or Request options on which to attach the headers
    */
  def authorizeRequest(opts: Headers): js.Promise[Headers] = js.native
  
  var cachedCredential: JWT | UserRefreshClient | Compute | Null = js.native
  
  /**
    * Caches a value indicating whether the auth layer is running on Google
    * Compute Engine.
    * @private
    */
  var checkIsGCE: js.Any = js.native
  
  var clientOptions: js.Any = js.native
  
  /**
    * Scopes populated by the client library by default. We differentiate between
    * these and user defined scopes when deciding whether to use a self-signed JWT.
    */
  var defaultScopes: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Create a credentials instance using the given API key string.
    * @param apiKey The API key string
    * @param options An optional options object.
    * @returns A JWT loaded from the key
    */
  def fromAPIKey(apiKey: String): JWT = js.native
  def fromAPIKey(apiKey: String, options: RefreshOptions): JWT = js.native
  
  /**
    * Create a credentials instance using the given input options.
    * @param json The input object.
    * @param options The JWT or UserRefresh options for the client
    * @returns JWT or UserRefresh Client with data
    */
  def fromJSON(json: JWTInput): JWT | UserRefreshClient = js.native
  def fromJSON(json: JWTInput, options: RefreshOptions): JWT | UserRefreshClient = js.native
  
  /**
    * Create a credentials instance using the given input stream.
    * @param inputStream The input stream.
    * @param callback Optional callback.
    */
  def fromStream(inputStream: Readable): js.Promise[JWT | UserRefreshClient] = js.native
  def fromStream(inputStream: Readable, callback: CredentialCallback): Unit = js.native
  def fromStream(inputStream: Readable, options: RefreshOptions): js.Promise[JWT | UserRefreshClient] = js.native
  def fromStream(inputStream: Readable, options: RefreshOptions, callback: CredentialCallback): Unit = js.native
  
  var fromStreamAsync: js.Any = js.native
  
  /**
    * Automatically obtain application default credentials, and return
    * an access token for making requests.
    */
  def getAccessToken(): js.Promise[js.UndefOr[String | Null]] = js.native
  
  /**
    * Obtains the default service-level credentials for the application.
    * @param callback Optional callback.
    * @returns Promise that resolves with the ADCResponse (if no callback was
    * passed).
    */
  def getApplicationDefault(): js.Promise[ADCResponse] = js.native
  def getApplicationDefault(callback: ADCCallback): Unit = js.native
  def getApplicationDefault(options: RefreshOptions): js.Promise[ADCResponse] = js.native
  def getApplicationDefault(options: RefreshOptions, callback: ADCCallback): Unit = js.native
  
  var getApplicationDefaultAsync: js.Any = js.native
  
  /**
    * Automatically obtain a client based on the provided configuration.  If no
    * options were passed, use Application Default Credentials.
    */
  def getClient(): js.Promise[Compute | JWT | UserRefreshClient] = js.native
  def getClient(options: DeprecatedGetClientOptions): js.Promise[Compute | JWT | UserRefreshClient] = js.native
  
  /**
    * The callback function handles a credential object that contains the
    * client_email and private_key (if exists).
    * getCredentials checks for these values from the user JSON at first.
    * If it doesn't exist, and the environment is on GCE, it gets the
    * client_email from the cloud metadata server.
    * @param callback Callback that handles the credential object that contains
    * a client_email and optional private key, or the error.
    * returned
    */
  def getCredentials(): js.Promise[CredentialBody] = js.native
  def getCredentials(
    callback: js.Function2[/* err */ js.Error | Null, /* credentials */ js.UndefOr[CredentialBody], Unit]
  ): Unit = js.native
  
  var getCredentialsAsync: js.Any = js.native
  
  /**
    * Run the Google Cloud SDK command that prints the default project ID
    */
  var getDefaultServiceProjectId: js.Any = js.native
  
  /**
    * Determine the compute environment in which the code is running.
    */
  def getEnv(): js.Promise[GCPEnv] = js.native
  
  /**
    * Loads the project id from the GOOGLE_APPLICATION_CREDENTIALS json file.
    * @api private
    */
  var getFileProjectId: js.Any = js.native
  
  /**
    * Gets the Compute Engine project ID if it can be inferred.
    */
  var getGCEProjectId: js.Any = js.native
  
  /**
    * Creates a client which will fetch an ID token for authorization.
    * @param targetAudience the audience for the fetched ID token.
    * @returns IdTokenClient for making HTTP calls authenticated with ID tokens.
    */
  def getIdTokenClient(targetAudience: String): js.Promise[IdTokenClient] = js.native
  
  /**
    * Loads the project id from environment variables.
    * @api private
    */
  var getProductionProjectId: js.Any = js.native
  
  /**
    * Obtains the default project ID for the application.
    * @param callback Optional callback
    * @returns Promise that resolves with project Id (if used without callback)
    */
  def getProjectId(): js.Promise[String] = js.native
  def getProjectId(callback: ProjectIdCallback): Unit = js.native
  
  var getProjectIdAsync: js.Any = js.native
  
  /**
    * Obtain the HTTP headers that will provide authorization for a given
    * request.
    */
  def getRequestHeaders(): js.Promise[typingsSlinky.googleAuthLibrary.oauth2clientMod.Headers] = js.native
  def getRequestHeaders(url: String): js.Promise[typingsSlinky.googleAuthLibrary.oauth2clientMod.Headers] = js.native
  
  def isGCE: js.UndefOr[Boolean] = js.native
  
  var jsonContent: JWTInput | Null = js.native
  
  var keyFilename: js.Any = js.native
  
  /**
    * Automatically obtain application default credentials, and make an
    * HTTP request using the given options.
    * @param opts Axios request options for the HTTP request.
    */
  def request[T](opts: GaxiosOptions): js.Promise[GaxiosResponse[T]] = js.native
  
  var scopes: js.Any = js.native
  
  /**
    * Sign the given data with the current private key, or go out
    * to the IAM API to sign it.
    * @param data The data to be signed.
    */
  def sign(data: String): js.Promise[String] = js.native
  
  var transporter: js.UndefOr[Transporter] = js.native
}
/* static members */
@JSImport("google-auth-library/build/src/auth/googleauth", "GoogleAuth")
@js.native
object GoogleAuth extends js.Object {
  
  /**
    * Export DefaultTransporter as a static property of the class.
    */
  var DefaultTransporter: TypeofDefaultTransporter = js.native
}

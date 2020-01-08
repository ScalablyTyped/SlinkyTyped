package typingsSlinky.googleDashGax.googleDashGaxMod

import typingsSlinky.googleDashAuthDashLibrary.buildSrcAuthCredentialsMod.CredentialBody
import typingsSlinky.googleDashAuthDashLibrary.buildSrcAuthJwtclientMod.JWTOptions
import typingsSlinky.googleDashAuthDashLibrary.buildSrcAuthOauth2clientMod.OAuth2ClientOptions
import typingsSlinky.googleDashAuthDashLibrary.buildSrcAuthRefreshclientMod.UserRefreshClientOptions
import typingsSlinky.googleDashGax.buildSrcGaxMod.ClientConfig
import typingsSlinky.googleDashGax.buildSrcGrpcMod.ClientStubOptions
import typingsSlinky.googleDashGax.buildSrcGrpcMod.GrpcClientOptions
import typingsSlinky.googleDashGax.buildSrcGrpcMod.GrpcModule
import typingsSlinky.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions
  extends GrpcClientOptions
     with ClientStubOptions {
  var apiEndpoint: js.UndefOr[String] = js.undefined
  var clientConfig: js.UndefOr[ClientConfig] = js.undefined
  var fallback: js.UndefOr[Boolean] = js.undefined
  var libName: js.UndefOr[String] = js.undefined
  var libVersion: js.UndefOr[String] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    apiEndpoint: String = null,
    auth: typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.GoogleAuth = null,
    clientConfig: ClientConfig = null,
    clientOptions: JWTOptions | OAuth2ClientOptions | UserRefreshClientOptions = null,
    credentials: CredentialBody = null,
    fallback: js.UndefOr[Boolean] = js.undefined,
    grpc: GrpcModule = null,
    keyFile: String = null,
    keyFilename: String = null,
    libName: String = null,
    libVersion: String = null,
    port: Int | Double = null,
    projectId: String = null,
    promise: PromiseConstructor = null,
    protocol: String = null,
    scopes: String | js.Array[String] = null,
    servicePath: String = null,
    sslCreds: js.Any = null
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (apiEndpoint != null) __obj.updateDynamic("apiEndpoint")(apiEndpoint.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (clientConfig != null) __obj.updateDynamic("clientConfig")(clientConfig.asInstanceOf[js.Any])
    if (clientOptions != null) __obj.updateDynamic("clientOptions")(clientOptions.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (!js.isUndefined(fallback)) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (grpc != null) __obj.updateDynamic("grpc")(grpc.asInstanceOf[js.Any])
    if (keyFile != null) __obj.updateDynamic("keyFile")(keyFile.asInstanceOf[js.Any])
    if (keyFilename != null) __obj.updateDynamic("keyFilename")(keyFilename.asInstanceOf[js.Any])
    if (libName != null) __obj.updateDynamic("libName")(libName.asInstanceOf[js.Any])
    if (libVersion != null) __obj.updateDynamic("libVersion")(libVersion.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (promise != null) __obj.updateDynamic("promise")(promise.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    if (servicePath != null) __obj.updateDynamic("servicePath")(servicePath.asInstanceOf[js.Any])
    if (sslCreds != null) __obj.updateDynamic("sslCreds")(sslCreds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}


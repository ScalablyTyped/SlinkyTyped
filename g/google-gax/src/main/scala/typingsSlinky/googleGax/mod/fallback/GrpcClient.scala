package typingsSlinky.googleGax.mod.fallback

import typingsSlinky.googleGax.anon.Auth
import typingsSlinky.googleGax.grpcMod.GrpcClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax", "fallback.GrpcClient")
@js.native
/**
  * gRPC-fallback version of GrpcClient
  * Implements GrpcClient API for a browser using grpc-fallback protocol (sends serialized protobuf to HTTP/1 $rpc endpoint).
  *
  * @param {Object=} options.auth - An instance of OAuth2Client to use in browser, or an instance of GoogleAuth from google-auth-library
  *  to use in Node.js. Required for browser, optional for Node.js.
  * @param {Function=} options.promise - A constructor for a promise that
  * implements the ES6 specification of promise.
  * @constructor
  */
class GrpcClient ()
  extends typingsSlinky.googleGax.fallbackMod.GrpcClient {
  def this(options: Auth) = this()
  def this(options: GrpcClientOptions) = this()
}


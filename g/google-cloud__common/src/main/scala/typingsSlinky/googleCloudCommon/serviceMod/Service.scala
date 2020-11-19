package typingsSlinky.googleCloudCommon.serviceMod

import typingsSlinky.googleAuthLibrary.mod.GoogleAuth
import typingsSlinky.googleCloudCommon.serviceObjectMod.Interceptor
import typingsSlinky.googleCloudCommon.utilMod.Abortable
import typingsSlinky.googleCloudCommon.utilMod.BodyResponseCallback
import typingsSlinky.googleCloudCommon.utilMod.DecorateRequestOptions
import typingsSlinky.googleCloudCommon.utilMod.Duplexify
import typingsSlinky.googleCloudCommon.utilMod.MakeAuthenticatedRequest
import typingsSlinky.googleCloudCommon.utilMod.MakeAuthenticatedRequestOptions
import typingsSlinky.teenyRequest.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@google-cloud/common/build/src/service", "Service")
@js.native
class Service protected () extends js.Object {
  /**
    * Service is a base class, meant to be inherited from by a "service," like
    * BigQuery or Storage.
    *
    * This handles making authenticated requests by exposing a `makeReq_`
    * function.
    *
    * @constructor
    * @alias module:common/service
    *
    * @param {object} config - Configuration object.
    * @param {string} config.baseUrl - The base URL to make API requests to.
    * @param {string[]} config.scopes - The scopes required for the request.
    * @param {object=} options - [Configuration object](#/docs).
    */
  def this(config: ServiceConfig) = this()
  def this(config: ServiceConfig, options: ServiceOptions) = this()
  
  val apiEndpoint: String = js.native
  
  var authClient: GoogleAuth = js.native
  
  var baseUrl: String = js.native
  
  var getCredentials: js.Any = js.native
  
  /**
    * Get and update the Service's project ID.
    *
    * @param {function} callback - The callback function.
    */
  def getProjectId(): js.Promise[String] = js.native
  def getProjectId(callback: js.Function2[/* err */ js.Error | Null, /* projectId */ js.UndefOr[String], Unit]): Unit = js.native
  
  /* protected */ def getProjectIdAsync(): js.Promise[String] = js.native
  
  /**
    * Return the user's custom request interceptors.
    */
  def getRequestInterceptors(): js.Array[js.Function] = js.native
  
  var globalInterceptors: js.Any = js.native
  
  var interceptors: js.Array[Interceptor] = js.native
  
  def makeAuthenticatedRequest(reqOpts: DecorateRequestOptions): Duplexify = js.native
  def makeAuthenticatedRequest(reqOpts: DecorateRequestOptions, callback: BodyResponseCallback): Unit | Abortable = js.native
  def makeAuthenticatedRequest(reqOpts: DecorateRequestOptions, options: MakeAuthenticatedRequestOptions): Unit | Abortable = js.native
  @JSName("makeAuthenticatedRequest")
  var makeAuthenticatedRequest_Original: MakeAuthenticatedRequest = js.native
  @JSName("makeAuthenticatedRequest")
  def makeAuthenticatedRequest_Union(reqOpts: DecorateRequestOptions): Unit | Abortable = js.native
  
  var packageJson: js.Any = js.native
  
  var projectId: String = js.native
  
  var projectIdRequired: js.Any = js.native
  
  var providedUserAgent: js.UndefOr[String] = js.native
  
  /**
    * Make an authenticated API request.
    *
    * @param {object} reqOpts - Request options that are passed to `request`.
    * @param {string} reqOpts.uri - A URI relative to the baseUrl.
    * @param {function} callback - The callback function passed to `request`.
    */
  def request(reqOpts: DecorateRequestOptions, callback: BodyResponseCallback): Unit = js.native
  
  /**
    * Make an authenticated API request.
    *
    * @param {object} reqOpts - Request options that are passed to `request`.
    * @param {string} reqOpts.uri - A URI relative to the baseUrl.
    */
  def requestStream(reqOpts: DecorateRequestOptions): Request = js.native
  
  /**
    * Make an authenticated API request.
    *
    * @private
    *
    * @param {object} reqOpts - Request options that are passed to `request`.
    * @param {string} reqOpts.uri - A URI relative to the baseUrl.
    * @param {function} callback - The callback function passed to `request`.
    */
  var request_ : js.Any = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}

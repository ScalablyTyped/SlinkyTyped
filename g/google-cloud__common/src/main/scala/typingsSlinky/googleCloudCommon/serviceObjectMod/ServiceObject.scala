package typingsSlinky.googleCloudCommon.serviceObjectMod

import typingsSlinky.googleCloudCommon.utilMod.BodyResponseCallback
import typingsSlinky.googleCloudCommon.utilMod.DecorateRequestOptions
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.teenyRequest.mod.Request
import typingsSlinky.teenyRequest.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ServiceObject is a base class, meant to be inherited from by a "service
  * object," like a BigQuery dataset or Storage bucket.
  *
  * Most of the time, these objects share common functionality; they can be
  * created or deleted, and you can get or set their metadata.
  *
  * By inheriting from this class, a service object will be extended with these
  * shared behaviors. Note that any method can be overridden when the service
  * object requires specific behavior.
  */
@JSImport("@google-cloud/common/build/src/service-object", "ServiceObject")
@js.native
class ServiceObject[T] protected () extends EventEmitter {
  def this(config: ServiceObjectConfig) = this()
  
  var baseUrl: js.UndefOr[String] = js.native
  
  /**
    * Create the object.
    *
    * @param {object=} options - Configuration object.
    * @param {function} callback - The callback function.
    * @param {?error} callback.err - An error returned while making this request.
    * @param {object} callback.instance - The instance.
    * @param {object} callback.apiResponse - The full API response.
    */
  def create(): js.Promise[CreateResponse[T]] = js.native
  def create(callback: CreateCallback[T]): Unit = js.native
  def create(options: CreateOptions): js.Promise[CreateResponse[T]] = js.native
  def create(options: CreateOptions, callback: CreateCallback[T]): Unit = js.native
  
  var createMethod: js.Any = js.native
  
  /**
    * Delete the object.
    *
    * @param {function=} callback - The callback function.
    * @param {?error} callback.err - An error returned while making this request.
    * @param {object} callback.apiResponse - The full API response.
    */
  def delete(): js.Promise[js.Array[Response[_]]] = js.native
  def delete(callback: DeleteCallback): Unit = js.native
  def delete(options: DeleteOptions): js.Promise[js.Array[Response[_]]] = js.native
  def delete(options: DeleteOptions, callback: DeleteCallback): Unit = js.native
  
  /**
    * Check if the object exists.
    *
    * @param {function} callback - The callback function.
    * @param {?error} callback.err - An error returned while making this request.
    * @param {boolean} callback.exists - Whether the object exists or not.
    */
  def exists(): js.Promise[js.Array[Boolean]] = js.native
  def exists(callback: ExistsCallback): Unit = js.native
  def exists(options: ExistsOptions): js.Promise[js.Array[Boolean]] = js.native
  def exists(options: ExistsOptions, callback: ExistsCallback): Unit = js.native
  
  /**
    * Get the object if it exists. Optionally have the object created if an
    * options object is provided with `autoCreate: true`.
    *
    * @param {object=} options - The configuration object that will be used to
    *     create the object if necessary.
    * @param {boolean} options.autoCreate - Create the object if it doesn't already exist.
    * @param {function} callback - The callback function.
    * @param {?error} callback.err - An error returned while making this request.
    * @param {object} callback.instance - The instance.
    * @param {object} callback.apiResponse - The full API response.
    */
  def get(): js.Promise[GetResponse[T]] = js.native
  def get(callback: InstanceResponseCallback[T]): Unit = js.native
  def get(options: GetOrCreateOptions): js.Promise[GetResponse[T]] = js.native
  def get(options: GetOrCreateOptions, callback: InstanceResponseCallback[T]): Unit = js.native
  
  /**
    * Get the metadata of this object.
    *
    * @param {function} callback - The callback function.
    * @param {?error} callback.err - An error returned while making this request.
    * @param {object} callback.metadata - The metadata for this object.
    * @param {object} callback.apiResponse - The full API response.
    */
  def getMetadata(): js.Promise[MetadataResponse] = js.native
  def getMetadata(callback: MetadataCallback): Unit = js.native
  def getMetadata(options: GetMetadataOptions): js.Promise[MetadataResponse] = js.native
  def getMetadata(options: GetMetadataOptions, callback: MetadataCallback): Unit = js.native
  
  /**
    * Return the user's custom request interceptors.
    */
  def getRequestInterceptors(): js.Array[js.Function] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var interceptors: js.Array[Interceptor] = js.native
  
  var metadata: Metadata = js.native
  
  var methods: Methods = js.native
  
  var parent: ServiceObjectParent = js.native
  
  var pollIntervalMs: js.UndefOr[Double] = js.native
  
  /**
    * Make an authenticated API request.
    *
    * @param {object} reqOpts - Request options that are passed to `request`.
    * @param {string} reqOpts.uri - A URI relative to the baseUrl.
    * @param {function} callback - The callback function passed to `request`.
    */
  def request(reqOpts: DecorateRequestOptions): js.Promise[RequestResponse] = js.native
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
  
  /**
    * Set the metadata for this object.
    *
    * @param {object} metadata - The metadata to set on this object.
    * @param {object=} options - Configuration options.
    * @param {function=} callback - The callback function.
    * @param {?error} callback.err - An error returned while making this request.
    * @param {object} callback.apiResponse - The full API response.
    */
  def setMetadata(metadata: Metadata): js.Promise[SetMetadataResponse] = js.native
  def setMetadata(metadata: Metadata, callback: MetadataCallback): Unit = js.native
  def setMetadata(metadata: Metadata, options: SetMetadataOptions): js.Promise[SetMetadataResponse] = js.native
  def setMetadata(metadata: Metadata, options: SetMetadataOptions, callback: MetadataCallback): Unit = js.native
}

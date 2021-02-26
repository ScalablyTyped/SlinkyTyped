package typingsSlinky.googleapis

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import typingsSlinky.googleapis.googleapisStrings.v1
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeconfigV1Mod {
  
  object runtimeconfigV1 {
    
    @JSImport("googleapis/build/src/apis/runtimeconfig/v1", "runtimeconfig_v1.Resource$Operations")
    @js.native
    class ResourceOperations protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      /**
        * runtimeconfig.operations.cancel
        * @desc Starts asynchronous cancellation on a long-running operation.  The
        * server makes a best effort to cancel the operation, but success is not
        * guaranteed.  If the server doesn't support this method, it returns
        * `google.rpc.Code.UNIMPLEMENTED`.  Clients can use Operations.GetOperation
        * or other methods to check whether the cancellation succeeded or whether
        * the operation completed despite cancellation. On successful cancellation,
        * the operation is not deleted; instead, it becomes an operation with an
        * Operation.error value with a google.rpc.Status.code of 1, corresponding
        * to `Code.CANCELLED`.
        * @alias runtimeconfig.operations.cancel
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.name The name of the operation resource to be cancelled.
        * @param {().CancelOperationRequest} params.resource Request body data
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def cancel(): GaxiosPromise[SchemaEmpty] = js.native
      def cancel(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
      def cancel(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
      def cancel(params: ParamsResourceOperationsCancel): GaxiosPromise[SchemaEmpty] = js.native
      def cancel(params: ParamsResourceOperationsCancel, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
      def cancel(
        params: ParamsResourceOperationsCancel,
        options: BodyResponseCallback[SchemaEmpty],
        callback: BodyResponseCallback[SchemaEmpty]
      ): Unit = js.native
      def cancel(params: ParamsResourceOperationsCancel, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
      def cancel(
        params: ParamsResourceOperationsCancel,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaEmpty]
      ): Unit = js.native
      
      var context: APIRequestContext = js.native
      
      /**
        * runtimeconfig.operations.delete
        * @desc Deletes a long-running operation. This method indicates that the
        * client is no longer interested in the operation result. It does not
        * cancel the operation. If the server doesn't support this method, it
        * returns `google.rpc.Code.UNIMPLEMENTED`.
        * @alias runtimeconfig.operations.delete
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.name The name of the operation resource to be deleted.
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def delete(): GaxiosPromise[SchemaEmpty] = js.native
      def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
      def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
      def delete(params: ParamsResourceOperationsDelete): GaxiosPromise[SchemaEmpty] = js.native
      def delete(params: ParamsResourceOperationsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
      def delete(
        params: ParamsResourceOperationsDelete,
        options: BodyResponseCallback[SchemaEmpty],
        callback: BodyResponseCallback[SchemaEmpty]
      ): Unit = js.native
      def delete(params: ParamsResourceOperationsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
      def delete(
        params: ParamsResourceOperationsDelete,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaEmpty]
      ): Unit = js.native
      
      /**
        * runtimeconfig.operations.list
        * @desc Lists operations that match the specified filter in the request. If
        * the server doesn't support this method, it returns `UNIMPLEMENTED`. NOTE:
        * the `name` binding allows API services to override the binding to use
        * different resource name schemes, such as `users/x/operations`. To
        * override the binding, API services can add a binding such as
        * `"/v1/{name=users/x}/operations"` to their service configuration. For
        * backwards compatibility, the default name includes the operations
        * collection id, however overriding users must ensure the name binding is
        * the parent resource, without the operations collection id.
        * @alias runtimeconfig.operations.list
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string=} params.filter The standard list filter.
        * @param {string} params.name The name of the operation's parent resource.
        * @param {integer=} params.pageSize The standard list page size.
        * @param {string=} params.pageToken The standard list page token.
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def list(): GaxiosPromise[SchemaListOperationsResponse] = js.native
      def list(callback: BodyResponseCallback[SchemaListOperationsResponse]): Unit = js.native
      def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListOperationsResponse] = js.native
      def list(params: ParamsResourceOperationsList): GaxiosPromise[SchemaListOperationsResponse] = js.native
      def list(params: ParamsResourceOperationsList, callback: BodyResponseCallback[SchemaListOperationsResponse]): Unit = js.native
      def list(
        params: ParamsResourceOperationsList,
        options: BodyResponseCallback[SchemaListOperationsResponse],
        callback: BodyResponseCallback[SchemaListOperationsResponse]
      ): Unit = js.native
      def list(params: ParamsResourceOperationsList, options: MethodOptions): GaxiosPromise[SchemaListOperationsResponse] = js.native
      def list(
        params: ParamsResourceOperationsList,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaListOperationsResponse]
      ): Unit = js.native
    }
    
    /**
      * Cloud Runtime Configuration API
      *
      * The Runtime Configurator allows you to dynamically configure and expose
      * variables through Google Cloud Platform. In addition, you can also set
      * Watchers and Waiters that will watch for changes to your data and return
      * based on certain conditions.
      *
      * @example
      * const {google} = require('googleapis');
      * const runtimeconfig = google.runtimeconfig('v1');
      *
      * @namespace runtimeconfig
      * @type {Function}
      * @version v1
      * @variation v1
      * @param {object=} options Options for Runtimeconfig
      */
    @JSImport("googleapis/build/src/apis/runtimeconfig/v1", "runtimeconfig_v1.Runtimeconfig")
    @js.native
    class Runtimeconfig protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var operations: ResourceOperations = js.native
    }
    
    @js.native
    trait Options extends GlobalOptions {
      
      var version: v1 = js.native
    }
    object Options {
      
      @scala.inline
      def apply(version: v1): Options = {
        val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setVersion(value: v1): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ParamsResourceOperationsCancel extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * The name of the operation resource to be cancelled.
        */
      var name: js.UndefOr[String] = js.native
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaCancelOperationRequest] = js.native
    }
    object ParamsResourceOperationsCancel {
      
      @scala.inline
      def apply(): ParamsResourceOperationsCancel = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceOperationsCancel]
      }
      
      @scala.inline
      implicit class ParamsResourceOperationsCancelMutableBuilder[Self <: ParamsResourceOperationsCancel] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setRequestBody(value: SchemaCancelOperationRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      }
    }
    
    @js.native
    trait ParamsResourceOperationsDelete extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * The name of the operation resource to be deleted.
        */
      var name: js.UndefOr[String] = js.native
    }
    object ParamsResourceOperationsDelete {
      
      @scala.inline
      def apply(): ParamsResourceOperationsDelete = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceOperationsDelete]
      }
      
      @scala.inline
      implicit class ParamsResourceOperationsDeleteMutableBuilder[Self <: ParamsResourceOperationsDelete] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    @js.native
    trait ParamsResourceOperationsList extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * The standard list filter.
        */
      var filter: js.UndefOr[String] = js.native
      
      /**
        * The name of the operation's parent resource.
        */
      var name: js.UndefOr[String] = js.native
      
      /**
        * The standard list page size.
        */
      var pageSize: js.UndefOr[Double] = js.native
      
      /**
        * The standard list page token.
        */
      var pageToken: js.UndefOr[String] = js.native
    }
    object ParamsResourceOperationsList {
      
      @scala.inline
      def apply(): ParamsResourceOperationsList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceOperationsList]
      }
      
      @scala.inline
      implicit class ParamsResourceOperationsListMutableBuilder[Self <: ParamsResourceOperationsList] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
        
        @scala.inline
        def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      }
    }
    
    /**
      * The request message for Operations.CancelOperation.
      */
    @js.native
    trait SchemaCancelOperationRequest extends StObject
    
    /**
      * A generic empty message that you can re-use to avoid defining duplicated
      * empty messages in your APIs. A typical example is to use it as the request
      * or the response type of an API method. For instance:      service Foo { rpc
      * Bar(google.protobuf.Empty) returns (google.protobuf.Empty);     }  The JSON
      * representation for `Empty` is empty JSON object `{}`.
      */
    @js.native
    trait SchemaEmpty extends StObject
    
    /**
      * The response message for Operations.ListOperations.
      */
    @js.native
    trait SchemaListOperationsResponse extends StObject {
      
      /**
        * The standard List next-page token.
        */
      var nextPageToken: js.UndefOr[String] = js.native
      
      /**
        * A list of operations that matches the specified filter in the request.
        */
      var operations: js.UndefOr[js.Array[SchemaOperation]] = js.native
    }
    object SchemaListOperationsResponse {
      
      @scala.inline
      def apply(): SchemaListOperationsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaListOperationsResponse]
      }
      
      @scala.inline
      implicit class SchemaListOperationsResponseMutableBuilder[Self <: SchemaListOperationsResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        @scala.inline
        def setOperations(value: js.Array[SchemaOperation]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
        
        @scala.inline
        def setOperationsVarargs(value: SchemaOperation*): Self = StObject.set(x, "operations", js.Array(value :_*))
      }
    }
    
    /**
      * This resource represents a long-running operation that is the result of a
      * network API call.
      */
    @js.native
    trait SchemaOperation extends StObject {
      
      /**
        * If the value is `false`, it means the operation is still in progress. If
        * `true`, the operation is completed, and either `error` or `response` is
        * available.
        */
      var done: js.UndefOr[Boolean] = js.native
      
      /**
        * The error result of the operation in case of failure or cancellation.
        */
      var error: js.UndefOr[SchemaStatus] = js.native
      
      /**
        * Service-specific metadata associated with the operation.  It typically
        * contains progress information and common metadata such as create time.
        * Some services might not provide such metadata.  Any method that returns a
        * long-running operation should document the metadata type, if any.
        */
      var metadata: js.UndefOr[StringDictionary[js.Any]] = js.native
      
      /**
        * The server-assigned name, which is only unique within the same service
        * that originally returns it. If you use the default HTTP mapping, the
        * `name` should have the format of `operations/some/unique/name`.
        */
      var name: js.UndefOr[String] = js.native
      
      /**
        * The normal response of the operation in case of success.  If the original
        * method returns no data on success, such as `Delete`, the response is
        * `google.protobuf.Empty`.  If the original method is standard
        * `Get`/`Create`/`Update`, the response should be the resource.  For other
        * methods, the response should have the type `XxxResponse`, where `Xxx` is
        * the original method name.  For example, if the original method name is
        * `TakeSnapshot()`, the inferred response type is `TakeSnapshotResponse`.
        */
      var response: js.UndefOr[StringDictionary[js.Any]] = js.native
    }
    object SchemaOperation {
      
      @scala.inline
      def apply(): SchemaOperation = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaOperation]
      }
      
      @scala.inline
      implicit class SchemaOperationMutableBuilder[Self <: SchemaOperation] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
        
        @scala.inline
        def setError(value: SchemaStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
        
        @scala.inline
        def setMetadata(value: StringDictionary[js.Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setResponse(value: StringDictionary[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
      }
    }
    
    /**
      * The `Status` type defines a logical error model that is suitable for
      * different programming environments, including REST APIs and RPC APIs. It is
      * used by [gRPC](https://github.com/grpc). The error model is designed to be:
      * - Simple to use and understand for most users - Flexible enough to meet
      * unexpected needs  # Overview  The `Status` message contains three pieces of
      * data: error code, error message, and error details. The error code should
      * be an enum value of google.rpc.Code, but it may accept additional error
      * codes if needed.  The error message should be a developer-facing English
      * message that helps developers *understand* and *resolve* the error. If a
      * localized user-facing error message is needed, put the localized message in
      * the error details or localize it in the client. The optional error details
      * may contain arbitrary information about the error. There is a predefined
      * set of error detail types in the package `google.rpc` that can be used for
      * common error conditions.  # Language mapping  The `Status` message is the
      * logical representation of the error model, but it is not necessarily the
      * actual wire format. When the `Status` message is exposed in different
      * client libraries and different wire protocols, it can be mapped
      * differently. For example, it will likely be mapped to some exceptions in
      * Java, but more likely mapped to some error codes in C.  # Other uses  The
      * error model and the `Status` message can be used in a variety of
      * environments, either with or without APIs, to provide a consistent
      * developer experience across different environments.  Example uses of this
      * error model include:  - Partial errors. If a service needs to return
      * partial errors to the client,     it may embed the `Status` in the normal
      * response to indicate the partial     errors.  - Workflow errors. A typical
      * workflow has multiple steps. Each step may     have a `Status` message for
      * error reporting.  - Batch operations. If a client uses batch request and
      * batch response, the     `Status` message should be used directly inside
      * batch response, one for     each error sub-response.  - Asynchronous
      * operations. If an API call embeds asynchronous operation     results in its
      * response, the status of those operations should be     represented directly
      * using the `Status` message.  - Logging. If some API errors are stored in
      * logs, the message `Status` could     be used directly after any stripping
      * needed for security/privacy reasons.
      */
    @js.native
    trait SchemaStatus extends StObject {
      
      /**
        * The status code, which should be an enum value of google.rpc.Code.
        */
      var code: js.UndefOr[Double] = js.native
      
      /**
        * A list of messages that carry the error details.  There is a common set
        * of message types for APIs to use.
        */
      var details: js.UndefOr[js.Array[StringDictionary[_]]] = js.native
      
      /**
        * A developer-facing error message, which should be in English. Any
        * user-facing error message should be localized and sent in the
        * google.rpc.Status.details field, or localized by the client.
        */
      var message: js.UndefOr[String] = js.native
    }
    object SchemaStatus {
      
      @scala.inline
      def apply(): SchemaStatus = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaStatus]
      }
      
      @scala.inline
      implicit class SchemaStatusMutableBuilder[Self <: SchemaStatus] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
        
        @scala.inline
        def setDetails(value: js.Array[StringDictionary[_]]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
        
        @scala.inline
        def setDetailsVarargs(value: StringDictionary[js.Any]*): Self = StObject.set(x, "details", js.Array(value :_*))
        
        @scala.inline
        def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      }
    }
    
    @js.native
    trait StandardParameters extends StObject {
      
      /**
        * V1 error format.
        */
      @JSName("$.xgafv")
      var $Dotxgafv: js.UndefOr[String] = js.native
      
      /**
        * OAuth access token.
        */
      var access_token: js.UndefOr[String] = js.native
      
      /**
        * Data format for response.
        */
      var alt: js.UndefOr[String] = js.native
      
      /**
        * JSONP
        */
      var callback: js.UndefOr[String] = js.native
      
      /**
        * Selector specifying which fields to include in a partial response.
        */
      var fields: js.UndefOr[String] = js.native
      
      /**
        * API key. Your API key identifies your project and provides you with API
        * access, quota, and reports. Required unless you provide an OAuth 2.0
        * token.
        */
      var key: js.UndefOr[String] = js.native
      
      /**
        * OAuth 2.0 token for the current user.
        */
      var oauth_token: js.UndefOr[String] = js.native
      
      /**
        * Returns response with indentations and line breaks.
        */
      var prettyPrint: js.UndefOr[Boolean] = js.native
      
      /**
        * Available to use for quota purposes for server-side applications. Can be
        * any arbitrary string assigned to a user, but should not exceed 40
        * characters.
        */
      var quotaUser: js.UndefOr[String] = js.native
      
      /**
        * Legacy upload protocol for media (e.g. "media", "multipart").
        */
      var uploadType: js.UndefOr[String] = js.native
      
      /**
        * Upload protocol for media (e.g. "raw", "multipart").
        */
      var upload_protocol: js.UndefOr[String] = js.native
    }
    object StandardParameters {
      
      @scala.inline
      def apply(): StandardParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StandardParameters]
      }
      
      @scala.inline
      implicit class StandardParametersMutableBuilder[Self <: StandardParameters] (val x: Self) extends AnyVal {
        
        @scala.inline
        def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
        
        @scala.inline
        def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
        
        @scala.inline
        def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
        
        @scala.inline
        def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
        
        @scala.inline
        def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        @scala.inline
        def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        @scala.inline
        def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
        
        @scala.inline
        def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
        
        @scala.inline
        def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
        
        @scala.inline
        def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
        
        @scala.inline
        def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
      }
    }
  }
}

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

object cloudtraceV1Mod {
  
  object cloudtraceV1 {
    
    /**
      * Stackdriver Trace API
      *
      * Sends application trace data to Stackdriver Trace for viewing. Trace data
      * is collected for all App Engine applications by default. Trace data from
      * other applications can be provided using this API. This library is used to
      * interact with the Trace API directly. If you are looking to instrument your
      * application for Stackdriver Trace, we recommend using OpenCensus.
      *
      * @example
      * const {google} = require('googleapis');
      * const cloudtrace = google.cloudtrace('v1');
      *
      * @namespace cloudtrace
      * @type {Function}
      * @version v1
      * @variation v1
      * @param {object=} options Options for Cloudtrace
      */
    @JSImport("googleapis/build/src/apis/cloudtrace/v1", "cloudtrace_v1.Cloudtrace")
    @js.native
    class Cloudtrace protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var projects: ResourceProjects = js.native
    }
    
    @JSImport("googleapis/build/src/apis/cloudtrace/v1", "cloudtrace_v1.Resource$Projects")
    @js.native
    class ResourceProjects protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      /**
        * cloudtrace.projects.patchTraces
        * @desc Sends new traces to Stackdriver Trace or updates existing traces.
        * If the ID of a trace that you send matches that of an existing trace, any
        * fields in the existing trace and its spans are overwritten by the
        * provided values, and any new fields provided are merged with the existing
        * trace data. If the ID does not match, a new trace is created.
        * @example
        * * // BEFORE RUNNING:
        * // ---------------
        * // 1. If not already done, enable the Stackdriver Trace API
        * //    and check the quota for your project at
        * //    https://console.developers.google.com/apis/api/cloudtrace
        * // 2. This sample uses Application Default Credentials for
        * authentication.
        * //    If not already done, install the gcloud CLI from
        * //    https://cloud.google.com/sdk and run
        * //    `gcloud beta auth application-default login`.
        * //    For more information, see
        * //
        * https://developers.google.com/identity/protocols/application-default-credentials
        * // 3. Install the Node.js client library by running
        * //    `npm install googleapis --save`
        *
        * var google = require('googleapis');
        * var cloudTrace = google.cloudtrace('v1');
        *
        * authorize(function(authClient) {
        *   var request = {
        *     // ID of the Cloud project where the trace data is stored.
        *     projectId: 'my-project-id',  // TODO: Update placeholder value.
        *
        *     resource: {
        *       // TODO: Add desired properties to the request body. Only these
        * properties
        *       // will be changed.
        *     },
        *
        *     auth: authClient,
        *   };
        *
        *   cloudTrace.projects.patchTraces(request, function(err) {
        *     if (err) {
        *       console.error(err);
        *       return;
        *     }
        *   });
        * });
        *
        * function authorize(callback) {
        *   google.auth.getApplicationDefault(function(err, authClient) {
        *     if (err) {
        *       console.error('authentication failed: ', err);
        *       return;
        *     }
        *     if (authClient.createScopedRequired &&
        * authClient.createScopedRequired()) { var scopes =
        * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
        * authClient.createScoped(scopes);
        *     }
        *     callback(authClient);
        *   });
        * }
        * @alias cloudtrace.projects.patchTraces
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.projectId ID of the Cloud project where the trace data is stored.
        * @param {().Traces} params.resource Request body data
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def patchTraces(): GaxiosPromise[SchemaEmpty] = js.native
      def patchTraces(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
      def patchTraces(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
      def patchTraces(params: ParamsResourceProjectsPatchtraces): GaxiosPromise[SchemaEmpty] = js.native
      def patchTraces(params: ParamsResourceProjectsPatchtraces, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
      def patchTraces(
        params: ParamsResourceProjectsPatchtraces,
        options: BodyResponseCallback[SchemaEmpty],
        callback: BodyResponseCallback[SchemaEmpty]
      ): Unit = js.native
      def patchTraces(params: ParamsResourceProjectsPatchtraces, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
      def patchTraces(
        params: ParamsResourceProjectsPatchtraces,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaEmpty]
      ): Unit = js.native
      
      var traces: ResourceProjectsTraces = js.native
    }
    
    @JSImport("googleapis/build/src/apis/cloudtrace/v1", "cloudtrace_v1.Resource$Projects$Traces")
    @js.native
    class ResourceProjectsTraces protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      /**
        * cloudtrace.projects.traces.get
        * @desc Gets a single trace by its ID.
        * @example
        * * // BEFORE RUNNING:
        * // ---------------
        * // 1. If not already done, enable the Stackdriver Trace API
        * //    and check the quota for your project at
        * //    https://console.developers.google.com/apis/api/cloudtrace
        * // 2. This sample uses Application Default Credentials for
        * authentication.
        * //    If not already done, install the gcloud CLI from
        * //    https://cloud.google.com/sdk and run
        * //    `gcloud beta auth application-default login`.
        * //    For more information, see
        * //
        * https://developers.google.com/identity/protocols/application-default-credentials
        * // 3. Install the Node.js client library by running
        * //    `npm install googleapis --save`
        *
        * var google = require('googleapis');
        * var cloudTrace = google.cloudtrace('v1');
        *
        * authorize(function(authClient) {
        *   var request = {
        *     // ID of the Cloud project where the trace data is stored.
        *     projectId: 'my-project-id',  // TODO: Update placeholder value.
        *
        *     // ID of the trace to return.
        *     traceId: 'my-trace-id',  // TODO: Update placeholder value.
        *
        *     auth: authClient,
        *   };
        *
        *   cloudTrace.projects.traces.get(request, function(err, response) {
        *     if (err) {
        *       console.error(err);
        *       return;
        *     }
        *
        *     // TODO: Change code below to process the `response` object:
        *     console.log(JSON.stringify(response, null, 2));
        *   });
        * });
        *
        * function authorize(callback) {
        *   google.auth.getApplicationDefault(function(err, authClient) {
        *     if (err) {
        *       console.error('authentication failed: ', err);
        *       return;
        *     }
        *     if (authClient.createScopedRequired &&
        * authClient.createScopedRequired()) { var scopes =
        * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
        * authClient.createScoped(scopes);
        *     }
        *     callback(authClient);
        *   });
        * }
        * @alias cloudtrace.projects.traces.get
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.projectId ID of the Cloud project where the trace data is stored.
        * @param {string} params.traceId ID of the trace to return.
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def get(): GaxiosPromise[SchemaTrace] = js.native
      def get(callback: BodyResponseCallback[SchemaTrace]): Unit = js.native
      def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTrace] = js.native
      def get(params: ParamsResourceProjectsTracesGet): GaxiosPromise[SchemaTrace] = js.native
      def get(params: ParamsResourceProjectsTracesGet, callback: BodyResponseCallback[SchemaTrace]): Unit = js.native
      def get(
        params: ParamsResourceProjectsTracesGet,
        options: BodyResponseCallback[SchemaTrace],
        callback: BodyResponseCallback[SchemaTrace]
      ): Unit = js.native
      def get(params: ParamsResourceProjectsTracesGet, options: MethodOptions): GaxiosPromise[SchemaTrace] = js.native
      def get(
        params: ParamsResourceProjectsTracesGet,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaTrace]
      ): Unit = js.native
      
      /**
        * cloudtrace.projects.traces.list
        * @desc Returns of a list of traces that match the specified filter
        * conditions.
        * @example
        * * // BEFORE RUNNING:
        * // ---------------
        * // 1. If not already done, enable the Stackdriver Trace API
        * //    and check the quota for your project at
        * //    https://console.developers.google.com/apis/api/cloudtrace
        * // 2. This sample uses Application Default Credentials for
        * authentication.
        * //    If not already done, install the gcloud CLI from
        * //    https://cloud.google.com/sdk and run
        * //    `gcloud beta auth application-default login`.
        * //    For more information, see
        * //
        * https://developers.google.com/identity/protocols/application-default-credentials
        * // 3. Install the Node.js client library by running
        * //    `npm install googleapis --save`
        *
        * var google = require('googleapis');
        * var cloudTrace = google.cloudtrace('v1');
        *
        * authorize(function(authClient) {
        *   var request = {
        *     // ID of the Cloud project where the trace data is stored.
        *     projectId: 'my-project-id',  // TODO: Update placeholder value.
        *
        *     auth: authClient,
        *   };
        *
        *   var handlePage = function(err, response) {
        *     if (err) {
        *       console.error(err);
        *       return;
        *     }
        *
        *     var tracesPage = response['traces'];
        *     if (!tracesPage) {
        *       return;
        *     }
        *     for (var i = 0; i < tracesPage.length; i++) {
        *       // TODO: Change code below to process each resource in
        * `tracesPage`: console.log(JSON.stringify(tracesPage[i], null, 2));
        *     }
        *
        *     if (response.nextPageToken) {
        *       request.pageToken = response.nextPageToken;
        *       cloudTrace.projects.traces.list(request, handlePage);
        *     }
        *   };
        *
        *   cloudTrace.projects.traces.list(request, handlePage);
        * });
        *
        * function authorize(callback) {
        *   google.auth.getApplicationDefault(function(err, authClient) {
        *     if (err) {
        *       console.error('authentication failed: ', err);
        *       return;
        *     }
        *     if (authClient.createScopedRequired &&
        * authClient.createScopedRequired()) { var scopes =
        * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
        * authClient.createScoped(scopes);
        *     }
        *     callback(authClient);
        *   });
        * }
        * @alias cloudtrace.projects.traces.list
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string=} params.endTime End of the time interval (inclusive) during which the trace data was collected from the application.
        * @param {string=} params.filter An optional filter against labels for the request.  By default, searches use prefix matching. To specify exact match, prepend a plus symbol (`+`) to the search term. Multiple terms are ANDed. Syntax:  *   `root:NAME_PREFIX` or `NAME_PREFIX`: Return traces where any root     span starts with `NAME_PREFIX`. *   `+root:NAME` or `+NAME`: Return traces where any root span's name is     exactly `NAME`. *   `span:NAME_PREFIX`: Return traces where any span starts with     `NAME_PREFIX`. *   `+span:NAME`: Return traces where any span's name is exactly     `NAME`. *   `latency:DURATION`: Return traces whose overall latency is     greater or equal to than `DURATION`. Accepted units are nanoseconds     (`ns`), milliseconds (`ms`), and seconds (`s`). Default is `ms`. For     example, `latency:24ms` returns traces whose overall latency     is greater than or equal to 24 milliseconds. *   `label:LABEL_KEY`: Return all traces containing the specified     label key (exact match, case-sensitive) regardless of the key:value     pair's value (including empty values). *   `LABEL_KEY:VALUE_PREFIX`: Return all traces containing the specified     label key (exact match, case-sensitive) whose value starts with     `VALUE_PREFIX`. Both a key and a value must be specified. *   `+LABEL_KEY:VALUE`: Return all traces containing a key:value pair     exactly matching the specified text. Both a key and a value must be     specified. *   `method:VALUE`: Equivalent to `/http/method:VALUE`. *   `url:VALUE`: Equivalent to `/http/url:VALUE`.
        * @param {string=} params.orderBy Field used to sort the returned traces. Optional. Can be one of the following:  *   `trace_id` *   `name` (`name` field of root span in the trace) *   `duration` (difference between `end_time` and `start_time` fields of      the root span) *   `start` (`start_time` field of the root span)  Descending order can be specified by appending `desc` to the sort field (for example, `name desc`).  Only one sort field is permitted.
        * @param {integer=} params.pageSize Maximum number of traces to return. If not specified or <= 0, the implementation selects a reasonable value.  The implementation may return fewer traces than the requested page size. Optional.
        * @param {string=} params.pageToken Token identifying the page of results to return. If provided, use the value of the `next_page_token` field from a previous request. Optional.
        * @param {string} params.projectId ID of the Cloud project where the trace data is stored.
        * @param {string=} params.startTime Start of the time interval (inclusive) during which the trace data was collected from the application.
        * @param {string=} params.view Type of data returned for traces in the list. Optional. Default is `MINIMAL`.
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def list(): GaxiosPromise[SchemaListTracesResponse] = js.native
      def list(callback: BodyResponseCallback[SchemaListTracesResponse]): Unit = js.native
      def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListTracesResponse] = js.native
      def list(params: ParamsResourceProjectsTracesList): GaxiosPromise[SchemaListTracesResponse] = js.native
      def list(params: ParamsResourceProjectsTracesList, callback: BodyResponseCallback[SchemaListTracesResponse]): Unit = js.native
      def list(
        params: ParamsResourceProjectsTracesList,
        options: BodyResponseCallback[SchemaListTracesResponse],
        callback: BodyResponseCallback[SchemaListTracesResponse]
      ): Unit = js.native
      def list(params: ParamsResourceProjectsTracesList, options: MethodOptions): GaxiosPromise[SchemaListTracesResponse] = js.native
      def list(
        params: ParamsResourceProjectsTracesList,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaListTracesResponse]
      ): Unit = js.native
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
    trait ParamsResourceProjectsPatchtraces extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * ID of the Cloud project where the trace data is stored.
        */
      var projectId: js.UndefOr[String] = js.native
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaTraces] = js.native
    }
    object ParamsResourceProjectsPatchtraces {
      
      @scala.inline
      def apply(): ParamsResourceProjectsPatchtraces = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceProjectsPatchtraces]
      }
      
      @scala.inline
      implicit class ParamsResourceProjectsPatchtracesMutableBuilder[Self <: ParamsResourceProjectsPatchtraces] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
        
        @scala.inline
        def setRequestBody(value: SchemaTraces): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      }
    }
    
    @js.native
    trait ParamsResourceProjectsTracesGet extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * ID of the Cloud project where the trace data is stored.
        */
      var projectId: js.UndefOr[String] = js.native
      
      /**
        * ID of the trace to return.
        */
      var traceId: js.UndefOr[String] = js.native
    }
    object ParamsResourceProjectsTracesGet {
      
      @scala.inline
      def apply(): ParamsResourceProjectsTracesGet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceProjectsTracesGet]
      }
      
      @scala.inline
      implicit class ParamsResourceProjectsTracesGetMutableBuilder[Self <: ParamsResourceProjectsTracesGet] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
        
        @scala.inline
        def setTraceId(value: String): Self = StObject.set(x, "traceId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTraceIdUndefined: Self = StObject.set(x, "traceId", js.undefined)
      }
    }
    
    @js.native
    trait ParamsResourceProjectsTracesList extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * End of the time interval (inclusive) during which the trace data was
        * collected from the application.
        */
      var endTime: js.UndefOr[String] = js.native
      
      /**
        * An optional filter against labels for the request.  By default, searches
        * use prefix matching. To specify exact match, prepend a plus symbol (`+`)
        * to the search term. Multiple terms are ANDed. Syntax:  *
        * `root:NAME_PREFIX` or `NAME_PREFIX`: Return traces where any root span
        * starts with `NAME_PREFIX`. *   `+root:NAME` or `+NAME`: Return traces
        * where any root span's name is     exactly `NAME`. *   `span:NAME_PREFIX`:
        * Return traces where any span starts with     `NAME_PREFIX`. *
        * `+span:NAME`: Return traces where any span's name is exactly     `NAME`.
        * *   `latency:DURATION`: Return traces whose overall latency is greater or
        * equal to than `DURATION`. Accepted units are nanoseconds     (`ns`),
        * milliseconds (`ms`), and seconds (`s`). Default is `ms`. For     example,
        * `latency:24ms` returns traces whose overall latency     is greater than
        * or equal to 24 milliseconds. *   `label:LABEL_KEY`: Return all traces
        * containing the specified     label key (exact match, case-sensitive)
        * regardless of the key:value     pair's value (including empty values). *
        * `LABEL_KEY:VALUE_PREFIX`: Return all traces containing the specified
        * label key (exact match, case-sensitive) whose value starts with
        * `VALUE_PREFIX`. Both a key and a value must be specified. *
        * `+LABEL_KEY:VALUE`: Return all traces containing a key:value pair exactly
        * matching the specified text. Both a key and a value must be specified. *
        * `method:VALUE`: Equivalent to `/http/method:VALUE`. *   `url:VALUE`:
        * Equivalent to `/http/url:VALUE`.
        */
      var filter: js.UndefOr[String] = js.native
      
      /**
        * Field used to sort the returned traces. Optional. Can be one of the
        * following:  *   `trace_id` *   `name` (`name` field of root span in the
        * trace) *   `duration` (difference between `end_time` and `start_time`
        * fields of      the root span) *   `start` (`start_time` field of the root
        * span)  Descending order can be specified by appending `desc` to the sort
        * field (for example, `name desc`).  Only one sort field is permitted.
        */
      var orderBy: js.UndefOr[String] = js.native
      
      /**
        * Maximum number of traces to return. If not specified or <= 0, the
        * implementation selects a reasonable value.  The implementation may return
        * fewer traces than the requested page size. Optional.
        */
      var pageSize: js.UndefOr[Double] = js.native
      
      /**
        * Token identifying the page of results to return. If provided, use the
        * value of the `next_page_token` field from a previous request. Optional.
        */
      var pageToken: js.UndefOr[String] = js.native
      
      /**
        * ID of the Cloud project where the trace data is stored.
        */
      var projectId: js.UndefOr[String] = js.native
      
      /**
        * Start of the time interval (inclusive) during which the trace data was
        * collected from the application.
        */
      var startTime: js.UndefOr[String] = js.native
      
      /**
        * Type of data returned for traces in the list. Optional. Default is
        * `MINIMAL`.
        */
      var view: js.UndefOr[String] = js.native
    }
    object ParamsResourceProjectsTracesList {
      
      @scala.inline
      def apply(): ParamsResourceProjectsTracesList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceProjectsTracesList]
      }
      
      @scala.inline
      implicit class ParamsResourceProjectsTracesListMutableBuilder[Self <: ParamsResourceProjectsTracesList] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
        
        @scala.inline
        def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
        
        @scala.inline
        def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
        
        @scala.inline
        def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
        
        @scala.inline
        def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
        
        @scala.inline
        def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
        
        @scala.inline
        def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
        
        @scala.inline
        def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
      }
    }
    
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
      * The response message for the `ListTraces` method.
      */
    @js.native
    trait SchemaListTracesResponse extends StObject {
      
      /**
        * If defined, indicates that there are more traces that match the request
        * and that this value should be passed to the next request to continue
        * retrieving additional traces.
        */
      var nextPageToken: js.UndefOr[String] = js.native
      
      /**
        * List of trace records as specified by the view parameter.
        */
      var traces: js.UndefOr[js.Array[SchemaTrace]] = js.native
    }
    object SchemaListTracesResponse {
      
      @scala.inline
      def apply(): SchemaListTracesResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaListTracesResponse]
      }
      
      @scala.inline
      implicit class SchemaListTracesResponseMutableBuilder[Self <: SchemaListTracesResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        @scala.inline
        def setTraces(value: js.Array[SchemaTrace]): Self = StObject.set(x, "traces", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTracesUndefined: Self = StObject.set(x, "traces", js.undefined)
        
        @scala.inline
        def setTracesVarargs(value: SchemaTrace*): Self = StObject.set(x, "traces", js.Array(value :_*))
      }
    }
    
    /**
      * A trace describes how long it takes for an application to perform an
      * operation. It consists of a set of spans, each of which represent a single
      * timed event within the operation.
      */
    @js.native
    trait SchemaTrace extends StObject {
      
      /**
        * Project ID of the Cloud project where the trace data is stored.
        */
      var projectId: js.UndefOr[String] = js.native
      
      /**
        * Collection of spans in the trace.
        */
      var spans: js.UndefOr[js.Array[SchemaTraceSpan]] = js.native
      
      /**
        * Globally unique identifier for the trace. This identifier is a 128-bit
        * numeric value formatted as a 32-byte hex string. For example,
        * `382d4f4c6b7bb2f4a972559d9085001d`.
        */
      var traceId: js.UndefOr[String] = js.native
    }
    object SchemaTrace {
      
      @scala.inline
      def apply(): SchemaTrace = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaTrace]
      }
      
      @scala.inline
      implicit class SchemaTraceMutableBuilder[Self <: SchemaTrace] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
        
        @scala.inline
        def setSpans(value: js.Array[SchemaTraceSpan]): Self = StObject.set(x, "spans", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpansUndefined: Self = StObject.set(x, "spans", js.undefined)
        
        @scala.inline
        def setSpansVarargs(value: SchemaTraceSpan*): Self = StObject.set(x, "spans", js.Array(value :_*))
        
        @scala.inline
        def setTraceId(value: String): Self = StObject.set(x, "traceId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTraceIdUndefined: Self = StObject.set(x, "traceId", js.undefined)
      }
    }
    
    /**
      * A span represents a single timed event within a trace. Spans can be nested
      * and form a trace tree. Often, a trace contains a root span that describes
      * the end-to-end latency of an operation and, optionally, one or more
      * subspans for its suboperations. Spans do not need to be contiguous. There
      * may be gaps between spans in a trace.
      */
    @js.native
    trait SchemaTraceSpan extends StObject {
      
      /**
        * End time of the span in nanoseconds from the UNIX epoch.
        */
      var endTime: js.UndefOr[String] = js.native
      
      /**
        * Distinguishes between spans generated in a particular context. For
        * example, two spans with the same name may be distinguished using
        * `RPC_CLIENT` and `RPC_SERVER` to identify queueing latency associated
        * with the span.
        */
      var kind: js.UndefOr[String] = js.native
      
      /**
        * Collection of labels associated with the span. Label keys must be less
        * than 128 bytes. Label values must be less than 16 kilobytes (10MB for
        * `/stacktrace` values).  Some predefined label keys exist, or you may
        * create your own. When creating your own, we recommend the following
        * formats:  * `/category/product/key` for agents of well-known products
        * (e.g.   `/db/mongodb/read_size`). * `short_host/path/key` for
        * domain-specific keys (e.g.   `foo.com/myproduct/bar`)  Predefined labels
        * include:  *   `/agent` *   `/component` *   `/error/message` *
        * `/error/name` *   `/http/client_city` *   `/http/client_country` *
        * `/http/client_protocol` *   `/http/client_region` *   `/http/host` *
        * `/http/method` *   `/http/path` *   `/http/redirected_url` *
        * `/http/request/size` *   `/http/response/size` *   `/http/route` *
        * `/http/status_code` *   `/http/url` *   `/http/user_agent` *   `/pid` *
        * `/stacktrace` *   `/tid`
        */
      var labels: js.UndefOr[StringDictionary[String]] = js.native
      
      /**
        * Name of the span. Must be less than 128 bytes. The span name is sanitized
        * and displayed in the Stackdriver Trace tool in the Google Cloud Platform
        * Console. The name may be a method name or some other per-call site name.
        * For the same executable and the same call point, a best practice is to
        * use a consistent name, which makes it easier to correlate cross-trace
        * spans.
        */
      var name: js.UndefOr[String] = js.native
      
      /**
        * ID of the parent span, if any. Optional.
        */
      var parentSpanId: js.UndefOr[String] = js.native
      
      /**
        * Identifier for the span. Must be a 64-bit integer other than 0 and unique
        * within a trace. For example, `2205310701640571284`.
        */
      var spanId: js.UndefOr[String] = js.native
      
      /**
        * Start time of the span in nanoseconds from the UNIX epoch.
        */
      var startTime: js.UndefOr[String] = js.native
    }
    object SchemaTraceSpan {
      
      @scala.inline
      def apply(): SchemaTraceSpan = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaTraceSpan]
      }
      
      @scala.inline
      implicit class SchemaTraceSpanMutableBuilder[Self <: SchemaTraceSpan] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setParentSpanId(value: String): Self = StObject.set(x, "parentSpanId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParentSpanIdUndefined: Self = StObject.set(x, "parentSpanId", js.undefined)
        
        @scala.inline
        def setSpanId(value: String): Self = StObject.set(x, "spanId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpanIdUndefined: Self = StObject.set(x, "spanId", js.undefined)
        
        @scala.inline
        def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      }
    }
    
    /**
      * List of new or updated traces.
      */
    @js.native
    trait SchemaTraces extends StObject {
      
      /**
        * List of traces.
        */
      var traces: js.UndefOr[js.Array[SchemaTrace]] = js.native
    }
    object SchemaTraces {
      
      @scala.inline
      def apply(): SchemaTraces = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaTraces]
      }
      
      @scala.inline
      implicit class SchemaTracesMutableBuilder[Self <: SchemaTraces] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setTraces(value: js.Array[SchemaTrace]): Self = StObject.set(x, "traces", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTracesUndefined: Self = StObject.set(x, "traces", js.undefined)
        
        @scala.inline
        def setTracesVarargs(value: SchemaTrace*): Self = StObject.set(x, "traces", js.Array(value :_*))
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

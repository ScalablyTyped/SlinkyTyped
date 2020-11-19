package typingsSlinky.googleapis.v2beta3Mod.cloudtasksV2beta3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * App Engine HTTP request.  The message defines the HTTP request that is sent
  * to an App Engine app when the task is dispatched.  This proto can only be
  * used for tasks in a queue which has app_engine_http_queue set.  Using
  * AppEngineHttpRequest requires
  * [`appengine.applications.get`](https://cloud.google.com/appengine/docs/admin-api/access-control)
  * Google IAM permission for the project and the following scope:
  * `https://www.googleapis.com/auth/cloud-platform`  The task will be
  * delivered to the App Engine app which belongs to the same project as the
  * queue. For more information, see [How Requests are
  * Routed](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed)
  * and how routing is affected by [dispatch
  * files](https://cloud.google.com/appengine/docs/python/config/dispatchref).
  * Traffic is encrypted during transport and never leaves Google datacenters.
  * Because this traffic is carried over a communication mechanism internal to
  * Google, you cannot explicitly set the protocol (for example, HTTP or
  * HTTPS). The request to the handler, however, will appear to have used the
  * HTTP protocol.  The AppEngineRouting used to construct the URL that the
  * task is delivered to can be set at the queue-level or task-level:  * If
  * set,    app_engine_routing_override    is used for all tasks in the queue,
  * no matter what the setting    is for the    task-level app_engine_routing.
  * The `url` that the task will be sent to is:  * `url =` host `+`
  * relative_uri  Tasks can be dispatched to secure app handlers, unsecure app
  * handlers, and URIs restricted with [`login:
  * admin`](https://cloud.google.com/appengine/docs/standard/python/config/appref).
  * Because tasks are not run as any user, they cannot be dispatched to URIs
  * restricted with [`login:
  * required`](https://cloud.google.com/appengine/docs/standard/python/config/appref)
  * Task dispatches also do not follow redirects.  The task attempt has
  * succeeded if the app&#39;s request handler returns an HTTP response code in
  * the range [`200` - `299`]. `503` is considered an App Engine system error
  * instead of an application error. Requests returning error `503` will be
  * retried regardless of retry configuration and not counted against retry
  * counts. Any other response code or a failure to receive a response before
  * the deadline is a failed attempt.
  */
@js.native
trait SchemaAppEngineHttpRequest extends js.Object {
  
  /**
    * Task-level setting for App Engine routing.  If set,
    * app_engine_routing_override is used for all tasks in the queue, no matter
    * what the setting is for the task-level app_engine_routing.
    */
  var appEngineRouting: js.UndefOr[SchemaAppEngineRouting] = js.native
  
  /**
    * HTTP request body.  A request body is allowed only if the HTTP method is
    * POST or PUT. It is an error to set a body on a task with an incompatible
    * HttpMethod.
    */
  var body: js.UndefOr[String] = js.native
  
  /**
    * HTTP request headers.  This map contains the header field names and
    * values. Headers can be set when the task is created. Repeated headers are
    * not supported but a header value can contain commas.  Cloud Tasks sets
    * some headers to default values:  * `User-Agent`: By default, this header
    * is   `&quot;AppEngine-Google; (+http://code.google.com/appengine)&quot;`.
    * This header can be modified, but Cloud Tasks will append
    * `&quot;AppEngine-Google; (+http://code.google.com/appengine)&quot;` to
    * the   modified `User-Agent`.  If the task has a body, Cloud Tasks sets
    * the following headers:  * `Content-Type`: By default, the `Content-Type`
    * header is set to   `&quot;application/octet-stream&quot;`. The default
    * can be overridden by explicitly   setting `Content-Type` to a particular
    * media type when the   task is created.   For example, `Content-Type` can
    * be set to `&quot;application/json&quot;`. * `Content-Length`: This is
    * computed by Cloud Tasks. This value is   output only.   It cannot be
    * changed.  The headers below cannot be set or overridden:  * `Host` *
    * `X-Google-*` * `X-AppEngine-*`  In addition, Cloud Tasks sets some
    * headers when the task is dispatched, such as headers containing
    * information about the task; see [request
    * headers](https://cloud.google.com/appengine/docs/python/taskqueue/push/creating-handlers#reading_request_headers).
    * These headers are set only when the task is dispatched, so they are not
    * visible when the task is returned in a Cloud Tasks response.  Although
    * there is no specific limit for the maximum number of headers or the size,
    * there is a limit on the maximum size of the Task. For more information,
    * see the CreateTask documentation.
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The HTTP method to use for the request. The default is POST.  The
    * app&#39;s request handler for the task&#39;s target URL must be able to
    * handle HTTP requests with this http_method, otherwise the task attempt
    * will fail with error code 405 (Method Not Allowed). See [Writing a push
    * task request
    * handler](https://cloud.google.com/appengine/docs/java/taskqueue/push/creating-handlers#writing_a_push_task_request_handler)
    * and the documentation for the request handlers in the language your app
    * is written in e.g. [Python Request
    * Handler](https://cloud.google.com/appengine/docs/python/tools/webapp/requesthandlerclass).
    */
  var httpMethod: js.UndefOr[String] = js.native
  
  /**
    * The relative URI.  The relative URI must begin with &quot;/&quot; and
    * must be a valid HTTP relative URI. It can contain a path and query string
    * arguments. If the relative URI is empty, then the root path &quot;/&quot;
    * will be used. No spaces are allowed, and the maximum length allowed is
    * 2083 characters.
    */
  var relativeUri: js.UndefOr[String] = js.native
}
object SchemaAppEngineHttpRequest {
  
  @scala.inline
  def apply(): SchemaAppEngineHttpRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppEngineHttpRequest]
  }
  
  @scala.inline
  implicit class SchemaAppEngineHttpRequestOps[Self <: SchemaAppEngineHttpRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppEngineRouting(value: SchemaAppEngineRouting): Self = this.set("appEngineRouting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppEngineRouting: Self = this.set("appEngineRouting", js.undefined)
    
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setHttpMethod(value: String): Self = this.set("httpMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpMethod: Self = this.set("httpMethod", js.undefined)
    
    @scala.inline
    def setRelativeUri(value: String): Self = this.set("relativeUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelativeUri: Self = this.set("relativeUri", js.undefined)
  }
}

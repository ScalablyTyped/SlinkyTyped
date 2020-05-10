package typingsSlinky.gapiClientLogging.gapi.client.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestLog extends js.Object {
  /** App Engine release version. */
  var appEngineRelease: js.UndefOr[String] = js.native
  /** Application that handled this request. */
  var appId: js.UndefOr[String] = js.native
  /** An indication of the relative cost of serving this request. */
  var cost: js.UndefOr[Double] = js.native
  /** Time when the request finished. */
  var endTime: js.UndefOr[String] = js.native
  /** Whether this request is finished or active. */
  var finished: js.UndefOr[Boolean] = js.native
  /**
    * Whether this is the first RequestLog entry for this request. If an active request has several RequestLog entries written to Stackdriver Logging, then
    * this field will be set for one of them.
    */
  var first: js.UndefOr[Boolean] = js.native
  /** Internet host and port number of the resource being requested. */
  var host: js.UndefOr[String] = js.native
  /** HTTP version of request. Example: "HTTP/1.1". */
  var httpVersion: js.UndefOr[String] = js.native
  /** An identifier for the instance that handled the request. */
  var instanceId: js.UndefOr[String] = js.native
  /**
    * If the instance processing this request belongs to a manually scaled module, then this is the 0-based index of the instance. Otherwise, this value is
    * -1.
    */
  var instanceIndex: js.UndefOr[Double] = js.native
  /** Origin IP address. */
  var ip: js.UndefOr[String] = js.native
  /** Latency of the request. */
  var latency: js.UndefOr[String] = js.native
  /** A list of log lines emitted by the application while serving this request. */
  var line: js.UndefOr[js.Array[LogLine]] = js.native
  /** Number of CPU megacycles used to process request. */
  var megaCycles: js.UndefOr[String] = js.native
  /** Request method. Example: "GET", "HEAD", "PUT", "POST", "DELETE". */
  var method: js.UndefOr[String] = js.native
  /** Module of the application that handled this request. */
  var moduleId: js.UndefOr[String] = js.native
  /**
    * The logged-in user who made the request.Most likely, this is the part of the user's email before the @ sign. The field value is the same for different
    * requests from the same user, but different users can have similar names. This information is also available to the application via the App Engine Users
    * API.This field will be populated starting with App Engine 1.9.21.
    */
  var nickname: js.UndefOr[String] = js.native
  /** Time this request spent in the pending request queue. */
  var pendingTime: js.UndefOr[String] = js.native
  /** Referrer URL of request. */
  var referrer: js.UndefOr[String] = js.native
  /**
    * Globally unique identifier for a request, which is based on the request start time. Request IDs for requests which started later will compare greater
    * as strings than those for requests which started earlier.
    */
  var requestId: js.UndefOr[String] = js.native
  /**
    * Contains the path and query portion of the URL that was requested. For example, if the URL was "http://example.com/app?name=val", the resource would be
    * "/app?name=val". The fragment identifier, which is identified by the # character, is not included.
    */
  var resource: js.UndefOr[String] = js.native
  /** Size in bytes sent back to client by request. */
  var responseSize: js.UndefOr[String] = js.native
  /**
    * Source code for the application that handled this request. There can be more than one source reference per deployed application if source code is
    * distributed among multiple repositories.
    */
  var sourceReference: js.UndefOr[js.Array[SourceReference]] = js.native
  /** Time when the request started. */
  var startTime: js.UndefOr[String] = js.native
  /** HTTP response status code. Example: 200, 404. */
  var status: js.UndefOr[Double] = js.native
  /** Task name of the request, in the case of an offline request. */
  var taskName: js.UndefOr[String] = js.native
  /** Queue name of the request, in the case of an offline request. */
  var taskQueueName: js.UndefOr[String] = js.native
  /** Stackdriver Trace identifier for this request. */
  var traceId: js.UndefOr[String] = js.native
  /** File or class that handled the request. */
  var urlMapEntry: js.UndefOr[String] = js.native
  /** User agent that made the request. */
  var userAgent: js.UndefOr[String] = js.native
  /** Version of the application that handled this request. */
  var versionId: js.UndefOr[String] = js.native
  /** Whether this was a loading request for the instance. */
  var wasLoadingRequest: js.UndefOr[Boolean] = js.native
}

object RequestLog {
  @scala.inline
  def apply(): RequestLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestLog]
  }
  @scala.inline
  implicit class RequestLogOps[Self <: RequestLog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppEngineRelease(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appEngineRelease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppEngineRelease: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appEngineRelease")(js.undefined)
        ret
    }
    @scala.inline
    def withAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(js.undefined)
        ret
    }
    @scala.inline
    def withCost(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cost")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFinished(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finished")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinished: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finished")(js.undefined)
        ret
    }
    @scala.inline
    def withFirst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(js.undefined)
        ret
    }
    @scala.inline
    def withLatency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latency")(js.undefined)
        ret
    }
    @scala.inline
    def withLine(value: js.Array[LogLine]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(js.undefined)
        ret
    }
    @scala.inline
    def withMegaCycles(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("megaCycles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMegaCycles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("megaCycles")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withModuleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModuleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleId")(js.undefined)
        ret
    }
    @scala.inline
    def withNickname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nickname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNickname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nickname")(js.undefined)
        ret
    }
    @scala.inline
    def withPendingTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPendingTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingTime")(js.undefined)
        ret
    }
    @scala.inline
    def withReferrer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferrer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrer")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(js.undefined)
        ret
    }
    @scala.inline
    def withResource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceReference(value: js.Array[SourceReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceReference")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskName")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskQueueName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskQueueName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskQueueName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskQueueName")(js.undefined)
        ret
    }
    @scala.inline
    def withTraceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTraceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceId")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlMapEntry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlMapEntry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlMapEntry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlMapEntry")(js.undefined)
        ret
    }
    @scala.inline
    def withUserAgent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionId")(js.undefined)
        ret
    }
    @scala.inline
    def withWasLoadingRequest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wasLoadingRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWasLoadingRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wasLoadingRequest")(js.undefined)
        ret
    }
  }
  
}


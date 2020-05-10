package typingsSlinky.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Common audit log format for Google Cloud Platform API operations.
  */
@js.native
trait SchemaAuditLog extends js.Object {
  /**
    * Authentication information.
    */
  var authenticationInfo: js.UndefOr[SchemaAuthenticationInfo] = js.native
  /**
    * Authorization information. If there are multiple resources or permissions
    * involved, then there is one AuthorizationInfo element for each {resource,
    * permission} tuple.
    */
  var authorizationInfo: js.UndefOr[js.Array[SchemaAuthorizationInfo]] = js.native
  /**
    * Other service-specific data about the request, response, and other
    * information associated with the current audited event.
    */
  var metadata: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The name of the service method or operation. For API calls, this should
    * be the name of the API method. For example,
    * &quot;google.datastore.v1.Datastore.RunQuery&quot;
    * &quot;google.logging.v1.LoggingService.DeleteLog&quot;
    */
  var methodName: js.UndefOr[String] = js.native
  /**
    * The number of items returned from a List or Query API method, if
    * applicable.
    */
  var numResponseItems: js.UndefOr[String] = js.native
  /**
    * The operation request. This may not include all request parameters, such
    * as those that are too large, privacy-sensitive, or duplicated elsewhere
    * in the log record. It should never include user-generated data, such as
    * file contents. When the JSON object represented here has a proto
    * equivalent, the proto name will be indicated in the `@type` property.
    */
  var request: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Metadata about the operation.
    */
  var requestMetadata: js.UndefOr[SchemaRequestMetadata] = js.native
  /**
    * The resource location information.
    */
  var resourceLocation: js.UndefOr[SchemaResourceLocation] = js.native
  /**
    * The resource or collection that is the target of the operation. The name
    * is a scheme-less URI, not including the API service name. For example:
    * &quot;shelves/SHELF_ID/books&quot;
    * &quot;shelves/SHELF_ID/books/BOOK_ID&quot;
    */
  var resourceName: js.UndefOr[String] = js.native
  /**
    * The resource&#39;s original state before mutation. Present only for
    * operations which have successfully modified the targeted resource(s). In
    * general, this field should contain all changed fields, except those that
    * are already been included in `request`, `response`, `metadata` or
    * `service_data` fields. When the JSON object represented here has a proto
    * equivalent, the proto name will be indicated in the `@type` property.
    */
  var resourceOriginalState: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The operation response. This may not include all response elements, such
    * as those that are too large, privacy-sensitive, or duplicated elsewhere
    * in the log record. It should never include user-generated data, such as
    * file contents. When the JSON object represented here has a proto
    * equivalent, the proto name will be indicated in the `@type` property.
    */
  var response: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Deprecated, use `metadata` field instead. Other service-specific data
    * about the request, response, and other activities.
    */
  var serviceData: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The name of the API service performing the operation. For example,
    * `&quot;datastore.googleapis.com&quot;`.
    */
  var serviceName: js.UndefOr[String] = js.native
  /**
    * The status of the overall operation.
    */
  var status: js.UndefOr[SchemaStatus] = js.native
}

object SchemaAuditLog {
  @scala.inline
  def apply(): SchemaAuditLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuditLog]
  }
  @scala.inline
  implicit class SchemaAuditLogOps[Self <: SchemaAuditLog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthenticationInfo(value: SchemaAuthenticationInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticationInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorizationInfo(value: js.Array[SchemaAuthorizationInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizationInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withMethodName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethodName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodName")(js.undefined)
        ret
    }
    @scala.inline
    def withNumResponseItems(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numResponseItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumResponseItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numResponseItems")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestMetadata(value: SchemaRequestMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceLocation(value: SchemaResourceLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceName")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceOriginalState(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceOriginalState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceOriginalState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceOriginalState")(js.undefined)
        ret
    }
    @scala.inline
    def withResponse(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceData(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceData")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: SchemaStatus): Self = {
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
  }
  
}


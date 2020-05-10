package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The setup operation to perform
  */
@js.native
trait TestScriptSetupActionOperation extends BackboneElement {
  /**
    * Contains extended information for property 'accept'.
    */
  var _accept: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'contentType'.
    */
  var _contentType: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'destination'.
    */
  var _destination: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'encodeRequestUrl'.
    */
  var _encodeRequestUrl: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'label'.
    */
  var _label: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'origin'.
    */
  var _origin: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'params'.
    */
  var _params: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'requestId'.
    */
  var _requestId: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'resource'.
    */
  var _resource: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'responseId'.
    */
  var _responseId: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'sourceId'.
    */
  var _sourceId: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'targetId'.
    */
  var _targetId: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.native
  /**
    * xml | json | ttl | none
    */
  var accept: js.UndefOr[code] = js.native
  /**
    * xml | json | ttl | none
    */
  var contentType: js.UndefOr[code] = js.native
  /**
    * Tracking/reporting operation description
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Server responding to the request
    */
  var destination: js.UndefOr[integer] = js.native
  /**
    * Whether or not to send the request url in encoded format
    */
  var encodeRequestUrl: js.UndefOr[Boolean] = js.native
  /**
    * Tracking/logging operation label
    */
  var label: js.UndefOr[String] = js.native
  /**
    * Server initiating the request
    */
  var origin: js.UndefOr[integer] = js.native
  /**
    * Explicitly defined path parameters
    */
  var params: js.UndefOr[String] = js.native
  /**
    * Each operation can have one or more header elements
    */
  var requestHeader: js.UndefOr[js.Array[TestScriptSetupActionOperationRequestHeader]] = js.native
  /**
    * Fixture Id of mapped request
    */
  var requestId: js.UndefOr[id] = js.native
  /**
    * Resource type
    */
  var resource: js.UndefOr[code] = js.native
  /**
    * Fixture Id of mapped response
    */
  var responseId: js.UndefOr[id] = js.native
  /**
    * Fixture Id of body for PUT and POST requests
    */
  var sourceId: js.UndefOr[id] = js.native
  /**
    * Id of fixture used for extracting the [id],  [type], and [vid] for GET requests
    */
  var targetId: js.UndefOr[id] = js.native
  /**
    * The operation code type that will be executed
    */
  var `type`: js.UndefOr[Coding] = js.native
  /**
    * Request URL
    */
  var url: js.UndefOr[String] = js.native
}

object TestScriptSetupActionOperation {
  @scala.inline
  def apply(): TestScriptSetupActionOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestScriptSetupActionOperation]
  }
  @scala.inline
  implicit class TestScriptSetupActionOperationOps[Self <: TestScriptSetupActionOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_accept(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_accept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_accept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_accept")(js.undefined)
        ret
    }
    @scala.inline
    def with_contentType(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_contentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_contentType")(js.undefined)
        ret
    }
    @scala.inline
    def with_description(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_description: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_description")(js.undefined)
        ret
    }
    @scala.inline
    def with_destination(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_destination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_destination")(js.undefined)
        ret
    }
    @scala.inline
    def with_encodeRequestUrl(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_encodeRequestUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_encodeRequestUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_encodeRequestUrl")(js.undefined)
        ret
    }
    @scala.inline
    def with_label(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_label: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_label")(js.undefined)
        ret
    }
    @scala.inline
    def with_origin(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_origin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_origin")(js.undefined)
        ret
    }
    @scala.inline
    def with_params(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_params: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_params")(js.undefined)
        ret
    }
    @scala.inline
    def with_requestId(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_requestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_requestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_requestId")(js.undefined)
        ret
    }
    @scala.inline
    def with_resource(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_resource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_resource")(js.undefined)
        ret
    }
    @scala.inline
    def with_responseId(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_responseId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_responseId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_responseId")(js.undefined)
        ret
    }
    @scala.inline
    def with_sourceId(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_sourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sourceId")(js.undefined)
        ret
    }
    @scala.inline
    def with_targetId(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_targetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_targetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_targetId")(js.undefined)
        ret
    }
    @scala.inline
    def with_url(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_url")(js.undefined)
        ret
    }
    @scala.inline
    def withAccept(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(js.undefined)
        ret
    }
    @scala.inline
    def withContentType(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDestination(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.undefined)
        ret
    }
    @scala.inline
    def withEncodeRequestUrl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeRequestUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncodeRequestUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeRequestUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigin(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestHeader(value: js.Array[TestScriptSetupActionOperationRequestHeader]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestId(value: id): Self = {
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
    def withResource(value: code): Self = {
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
    def withResponseId(value: id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseId")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceId(value: id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetId(value: id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetId")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Coding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}


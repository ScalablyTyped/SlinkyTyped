package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The assertion to perform
  */
@js.native
trait TestScriptSetupActionAssert extends BackboneElement {
  /**
    * Contains extended information for property 'compareToSourceExpression'.
    */
  var _compareToSourceExpression: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'compareToSourceId'.
    */
  var _compareToSourceId: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'compareToSourcePath'.
    */
  var _compareToSourcePath: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'contentType'.
    */
  var _contentType: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'direction'.
    */
  var _direction: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'expression'.
    */
  var _expression: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'headerField'.
    */
  var _headerField: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'label'.
    */
  var _label: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'minimumId'.
    */
  var _minimumId: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'navigationLinks'.
    */
  var _navigationLinks: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'operator'.
    */
  var _operator: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'path'.
    */
  var _path: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'requestMethod'.
    */
  var _requestMethod: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'requestURL'.
    */
  var _requestURL: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'resource'.
    */
  var _resource: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'response'.
    */
  var _response: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'responseCode'.
    */
  var _responseCode: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'sourceId'.
    */
  var _sourceId: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'validateProfileId'.
    */
  var _validateProfileId: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'warningOnly'.
    */
  var _warningOnly: js.UndefOr[Element] = js.native
  /**
    * The fluentpath expression to evaluate against the source fixture
    */
  var compareToSourceExpression: js.UndefOr[String] = js.native
  /**
    * Id of the source fixture to be evaluated
    */
  var compareToSourceId: js.UndefOr[String] = js.native
  /**
    * XPath or JSONPath expression to evaluate against the source fixture
    */
  var compareToSourcePath: js.UndefOr[String] = js.native
  /**
    * xml | json | ttl | none
    */
  var contentType: js.UndefOr[code] = js.native
  /**
    * Tracking/reporting assertion description
    */
  var description: js.UndefOr[String] = js.native
  /**
    * response | request
    */
  var direction: js.UndefOr[code] = js.native
  /**
    * The fluentpath expression to be evaluated
    */
  var expression: js.UndefOr[String] = js.native
  /**
    * HTTP header field name
    */
  var headerField: js.UndefOr[String] = js.native
  /**
    * Tracking/logging assertion label
    */
  var label: js.UndefOr[String] = js.native
  /**
    * Fixture Id of minimum content resource
    */
  var minimumId: js.UndefOr[String] = js.native
  /**
    * Perform validation on navigation links?
    */
  var navigationLinks: js.UndefOr[Boolean] = js.native
  /**
    * equals | notEquals | in | notIn | greaterThan | lessThan | empty | notEmpty | contains | notContains | eval
    */
  var operator: js.UndefOr[code] = js.native
  /**
    * XPath or JSONPath expression
    */
  var path: js.UndefOr[String] = js.native
  /**
    * delete | get | options | patch | post | put
    */
  var requestMethod: js.UndefOr[code] = js.native
  /**
    * Request URL comparison value
    */
  var requestURL: js.UndefOr[String] = js.native
  /**
    * Resource type
    */
  var resource: js.UndefOr[code] = js.native
  /**
    * okay | created | noContent | notModified | bad | forbidden | notFound | methodNotAllowed | conflict | gone | preconditionFailed | unprocessable
    */
  var response: js.UndefOr[code] = js.native
  /**
    * HTTP response code to test
    */
  var responseCode: js.UndefOr[String] = js.native
  /**
    * The reference to a TestScript.rule
    */
  var rule: js.UndefOr[TestScriptSetupActionAssertRule] = js.native
  /**
    * The reference to a TestScript.ruleset
    */
  var ruleset: js.UndefOr[TestScriptSetupActionAssertRuleset] = js.native
  /**
    * Fixture Id of source expression or headerField
    */
  var sourceId: js.UndefOr[id] = js.native
  /**
    * Profile Id of validation profile reference
    */
  var validateProfileId: js.UndefOr[id] = js.native
  /**
    * The value to compare to
    */
  var value: js.UndefOr[String] = js.native
  /**
    * Will this assert produce a warning only on error?
    */
  var warningOnly: js.UndefOr[Boolean] = js.native
}

object TestScriptSetupActionAssert {
  @scala.inline
  def apply(): TestScriptSetupActionAssert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestScriptSetupActionAssert]
  }
  @scala.inline
  implicit class TestScriptSetupActionAssertOps[Self <: TestScriptSetupActionAssert] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_compareToSourceExpression(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_compareToSourceExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_compareToSourceExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_compareToSourceExpression")(js.undefined)
        ret
    }
    @scala.inline
    def with_compareToSourceId(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_compareToSourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_compareToSourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_compareToSourceId")(js.undefined)
        ret
    }
    @scala.inline
    def with_compareToSourcePath(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_compareToSourcePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_compareToSourcePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_compareToSourcePath")(js.undefined)
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
    def with_direction(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_direction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_direction")(js.undefined)
        ret
    }
    @scala.inline
    def with_expression(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_expression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_expression")(js.undefined)
        ret
    }
    @scala.inline
    def with_headerField(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_headerField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_headerField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_headerField")(js.undefined)
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
    def with_minimumId(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_minimumId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_minimumId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_minimumId")(js.undefined)
        ret
    }
    @scala.inline
    def with_navigationLinks(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_navigationLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_navigationLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_navigationLinks")(js.undefined)
        ret
    }
    @scala.inline
    def with_operator(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_operator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_operator")(js.undefined)
        ret
    }
    @scala.inline
    def with_path(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_path: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_path")(js.undefined)
        ret
    }
    @scala.inline
    def with_requestMethod(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_requestMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_requestMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_requestMethod")(js.undefined)
        ret
    }
    @scala.inline
    def with_requestURL(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_requestURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_requestURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_requestURL")(js.undefined)
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
    def with_response(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_response: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_response")(js.undefined)
        ret
    }
    @scala.inline
    def with_responseCode(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_responseCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_responseCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_responseCode")(js.undefined)
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
    def with_validateProfileId(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_validateProfileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_validateProfileId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_validateProfileId")(js.undefined)
        ret
    }
    @scala.inline
    def with_value(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_value: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_value")(js.undefined)
        ret
    }
    @scala.inline
    def with_warningOnly(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_warningOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_warningOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_warningOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withCompareToSourceExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareToSourceExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompareToSourceExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareToSourceExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withCompareToSourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareToSourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompareToSourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareToSourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withCompareToSourcePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareToSourcePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompareToSourcePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareToSourcePath")(js.undefined)
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
    def withDirection(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerField")(js.undefined)
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
    def withMinimumId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumId")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigationLinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withOperator(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestMethod(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestURL")(js.undefined)
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
    def withResponse(value: code): Self = {
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
    def withResponseCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseCode")(js.undefined)
        ret
    }
    @scala.inline
    def withRule(value: TestScriptSetupActionAssertRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleset(value: TestScriptSetupActionAssertRuleset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleset")(js.undefined)
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
    def withValidateProfileId(value: id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateProfileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateProfileId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateProfileId")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withWarningOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarningOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningOnly")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Declare support for this event
  */
@js.native
trait CapabilityStatementMessagingEvent extends BackboneElement {
  /**
    * Contains extended information for property 'category'.
    */
  var _category: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'focus'.
    */
  var _focus: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.native
  /**
    * Consequence | Currency | Notification
    */
  var category: js.UndefOr[code] = js.native
  /**
    * Event type
    */
  var code: Coding = js.native
  /**
    * Endpoint-specific event documentation
    */
  var documentation: js.UndefOr[String] = js.native
  /**
    * Resource that's focus of message
    */
  var focus: code = js.native
  /**
    * sender | receiver
    */
  var mode: code = js.native
  /**
    * Profile that describes the request
    */
  var request: Reference = js.native
  /**
    * Profile that describes the response
    */
  var response: Reference = js.native
}

object CapabilityStatementMessagingEvent {
  @scala.inline
  def apply(code: Coding, focus: code, mode: code, request: Reference, response: Reference): CapabilityStatementMessagingEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementMessagingEvent]
  }
  @scala.inline
  implicit class CapabilityStatementMessagingEventOps[Self <: CapabilityStatementMessagingEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: Coding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocus(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponse(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_category(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_category: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_category")(js.undefined)
        ret
    }
    @scala.inline
    def with_documentation(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_documentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_documentation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_documentation")(js.undefined)
        ret
    }
    @scala.inline
    def with_focus(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_focus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_focus")(js.undefined)
        ret
    }
    @scala.inline
    def with_mode(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_mode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_mode")(js.undefined)
        ret
    }
    @scala.inline
    def withCategory(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentation")(js.undefined)
        ret
    }
  }
  
}


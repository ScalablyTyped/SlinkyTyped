package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * If messaging is supported
  */
@js.native
trait CapabilityStatementMessaging extends BackboneElement {
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'reliableCache'.
    */
  var _reliableCache: js.UndefOr[Element] = js.native
  /**
    * Messaging interface behavior details
    */
  var documentation: js.UndefOr[String] = js.native
  /**
    * Where messages should be sent
    */
  var endpoint: js.UndefOr[js.Array[CapabilityStatementMessagingEndpoint]] = js.native
  /**
    * Declare support for this event
    */
  var event: js.UndefOr[js.Array[CapabilityStatementMessagingEvent]] = js.native
  /**
    * Reliable Message Cache Length (min)
    */
  var reliableCache: js.UndefOr[unsignedInt] = js.native
  /**
    * Messages supported by this system
    */
  var supportedMessage: js.UndefOr[js.Array[CapabilityStatementMessagingSupportedMessage]] = js.native
}

object CapabilityStatementMessaging {
  @scala.inline
  def apply(): CapabilityStatementMessaging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapabilityStatementMessaging]
  }
  @scala.inline
  implicit class CapabilityStatementMessagingOps[Self <: CapabilityStatementMessaging] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def with_reliableCache(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_reliableCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_reliableCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_reliableCache")(js.undefined)
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
    @scala.inline
    def withEndpoint(value: js.Array[CapabilityStatementMessagingEndpoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withEvent(value: js.Array[CapabilityStatementMessagingEvent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.undefined)
        ret
    }
    @scala.inline
    def withReliableCache(value: unsignedInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reliableCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReliableCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reliableCache")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedMessage(value: js.Array[CapabilityStatementMessagingSupportedMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedMessage")(js.undefined)
        ret
    }
  }
  
}


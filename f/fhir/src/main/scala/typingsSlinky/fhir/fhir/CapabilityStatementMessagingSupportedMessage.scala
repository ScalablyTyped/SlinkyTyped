package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Messages supported by this system
  */
@js.native
trait CapabilityStatementMessagingSupportedMessage extends BackboneElement {
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.native
  /**
    * Message supported by this system
    */
  var definition: Reference = js.native
  /**
    * sender | receiver
    */
  var mode: code = js.native
}

object CapabilityStatementMessagingSupportedMessage {
  @scala.inline
  def apply(definition: Reference, mode: code): CapabilityStatementMessagingSupportedMessage = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementMessagingSupportedMessage]
  }
  @scala.inline
  implicit class CapabilityStatementMessagingSupportedMessageOps[Self <: CapabilityStatementMessagingSupportedMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefinition(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
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
  }
  
}


package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Responses to this message
  */
@js.native
trait MessageDefinitionAllowedResponse extends BackboneElement {
  /**
    * Contains extended information for property 'situation'.
    */
  var _situation: js.UndefOr[Element] = js.native
  /**
    * Reference to allowed message definition response
    */
  var message: Reference = js.native
  /**
    * When should this response be used
    */
  var situation: js.UndefOr[markdown] = js.native
}

object MessageDefinitionAllowedResponse {
  @scala.inline
  def apply(message: Reference): MessageDefinitionAllowedResponse = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageDefinitionAllowedResponse]
  }
  @scala.inline
  implicit class MessageDefinitionAllowedResponseOps[Self <: MessageDefinitionAllowedResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_situation(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_situation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_situation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_situation")(js.undefined)
        ret
    }
    @scala.inline
    def withSituation(value: markdown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("situation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSituation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("situation")(js.undefined)
        ret
    }
  }
  
}


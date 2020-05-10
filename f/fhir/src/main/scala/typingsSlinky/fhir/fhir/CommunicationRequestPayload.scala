package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message payload
  */
@js.native
trait CommunicationRequestPayload extends BackboneElement {
  /**
    * Contains extended information for property 'contentString'.
    */
  var _contentString: js.UndefOr[Element] = js.native
  /**
    * Message part content
    */
  var contentAttachment: js.UndefOr[Attachment] = js.native
  /**
    * Message part content
    */
  var contentReference: js.UndefOr[Reference] = js.native
  /**
    * Message part content
    */
  var contentString: js.UndefOr[String] = js.native
}

object CommunicationRequestPayload {
  @scala.inline
  def apply(): CommunicationRequestPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommunicationRequestPayload]
  }
  @scala.inline
  implicit class CommunicationRequestPayloadOps[Self <: CommunicationRequestPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_contentString(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_contentString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_contentString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_contentString")(js.undefined)
        ret
    }
    @scala.inline
    def withContentAttachment(value: Attachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentAttachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentAttachment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentAttachment")(js.undefined)
        ret
    }
    @scala.inline
    def withContentReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentReference")(js.undefined)
        ret
    }
    @scala.inline
    def withContentString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentString")(js.undefined)
        ret
    }
  }
  
}


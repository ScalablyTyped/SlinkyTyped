package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A resource that describes a message that is exchanged between systems
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait MessageHeader extends DomainResource {
  /**
    * Contains extended information for property 'timestamp'.
    */
  var _timestamp: js.UndefOr[Element] = js.native
  /**
    * The source of the decision
    */
  var author: js.UndefOr[Reference] = js.native
  /**
    * Message destination application(s)
    */
  var destination: js.UndefOr[js.Array[MessageHeaderDestination]] = js.native
  /**
    * The source of the data entry
    */
  var enterer: js.UndefOr[Reference] = js.native
  /**
    * Code for the event this message represents
    */
  var event: Coding = js.native
  /**
    * The actual content of the message
    */
  var focus: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Cause of event
    */
  var reason: js.UndefOr[CodeableConcept] = js.native
  /**
    * Intended "real-world" recipient for the data
    */
  var receiver: js.UndefOr[Reference] = js.native
  /**
    * If this is a reply to prior message
    */
  var response: js.UndefOr[MessageHeaderResponse] = js.native
  /**
    * Final responsibility for event
    */
  var responsible: js.UndefOr[Reference] = js.native
  /**
    * Real world sender of the message
    */
  var sender: js.UndefOr[Reference] = js.native
  /**
    * Message source application
    */
  var source: MessageHeaderSource = js.native
  /**
    * Time that the message was sent
    */
  var timestamp: instant = js.native
}

object MessageHeader {
  @scala.inline
  def apply(event: Coding, source: MessageHeaderSource, timestamp: instant): MessageHeader = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeader]
  }
  @scala.inline
  implicit class MessageHeaderOps[Self <: MessageHeader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: Coding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: MessageHeaderSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: instant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_timestamp(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_timestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_timestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthor(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(js.undefined)
        ret
    }
    @scala.inline
    def withDestination(value: js.Array[MessageHeaderDestination]): Self = {
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
    def withEnterer(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterer")(js.undefined)
        ret
    }
    @scala.inline
    def withFocus(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.undefined)
        ret
    }
    @scala.inline
    def withReason(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
    @scala.inline
    def withReceiver(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReceiver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiver")(js.undefined)
        ret
    }
    @scala.inline
    def withResponse(value: MessageHeaderResponse): Self = {
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
    def withResponsible(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsible")(js.undefined)
        ret
    }
    @scala.inline
    def withSender(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sender")(js.undefined)
        ret
    }
  }
  
}


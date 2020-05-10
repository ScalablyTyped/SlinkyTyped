package typingsSlinky.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Acknowledges that a message has been ingested into the specified HL7v2
  * store.
  */
@js.native
trait SchemaIngestMessageResponse extends js.Object {
  /**
    * HL7v2 ACK message.
    */
  var hl7Ack: js.UndefOr[String] = js.native
  /**
    * Created message resource.
    */
  var message: js.UndefOr[SchemaMessage] = js.native
}

object SchemaIngestMessageResponse {
  @scala.inline
  def apply(): SchemaIngestMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIngestMessageResponse]
  }
  @scala.inline
  implicit class SchemaIngestMessageResponseOps[Self <: SchemaIngestMessageResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHl7Ack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hl7Ack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHl7Ack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hl7Ack")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: SchemaMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
  }
  
}


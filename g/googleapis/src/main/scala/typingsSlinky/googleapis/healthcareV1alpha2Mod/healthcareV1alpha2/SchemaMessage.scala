package typingsSlinky.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A complete HL7v2 message. See
  * http://www.hl7.org/implement/standards/index.cfm?ref=common for details on
  * the standard.
  */
@js.native
trait SchemaMessage extends js.Object {
  /**
    * The datetime when the message was created. Set by the server.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Raw message bytes.
    */
  var data: js.UndefOr[String] = js.native
  /**
    * User-supplied key-value pairs used to organize HL7v2 stores.  Label keys
    * must be between 1 and 63 characters long, have a UTF-8 encoding of
    * maximum 128 bytes, and must conform to the following PCRE regular
    * expression: \p{Ll}\p{Lo}{0,62}  Label values are optional, must be
    * between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
    * bytes, and must conform to the following PCRE regular expression:
    * [\p{Ll}\p{Lo}\p{N}_-]{0,63}  No more than 64 labels can be associated
    * with a given store.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The message type and trigger event for this message. MSH-9.
    */
  var messageType: js.UndefOr[String] = js.native
  /**
    * Resource name of the Message, of the form
    * `projects/{project_id}/datasets/{dataset_id}/hl7V2Stores/{hl7_v2_store_id}/messages/{message_id}`.
    * Assigned by the server.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The parsed version of the raw message data.
    */
  var parsedData: js.UndefOr[SchemaParsedData] = js.native
  /**
    * All patient IDs listed in the PID-2, PID-3, and PID-4 segments of this
    * message.
    */
  var patientIds: js.UndefOr[js.Array[SchemaPatientId]] = js.native
  /**
    * The hospital that this message came from. MSH-4.
    */
  var sendFacility: js.UndefOr[String] = js.native
  /**
    * The datetime the sending application sent this message. MSH-7.
    */
  var sendTime: js.UndefOr[String] = js.native
}

object SchemaMessage {
  @scala.inline
  def apply(): SchemaMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMessage]
  }
  @scala.inline
  implicit class SchemaMessageOps[Self <: SchemaMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageType")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withParsedData(value: SchemaParsedData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsedData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParsedData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsedData")(js.undefined)
        ret
    }
    @scala.inline
    def withPatientIds(value: js.Array[SchemaPatientId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patientIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPatientIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patientIds")(js.undefined)
        ret
    }
    @scala.inline
    def withSendFacility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendFacility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendFacility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendFacility")(js.undefined)
        ret
    }
    @scala.inline
    def withSendTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendTime")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.googleapis.healthcareV1alphaMod.healthcareV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an HL7v2 store.
  */
@js.native
trait SchemaHl7V2Store extends js.Object {
  /**
    * Output only. Resource name of the HL7v2 store, of the form
    * `projects/{project_id}/datasets/{dataset_id}/hl7V2Stores/{hl7v2_store_id}`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The notification destination all messages (both Ingest &amp; Create) are
    * published on. Only the message name is sent as part of the notification.
    * If this is unset, no notifications will be sent. Supplied by the client.
    */
  var notificationConfig: js.UndefOr[SchemaNotificationConfig] = js.native
  /**
    * The configuration for the parser. It determines how the server parses the
    * messages.
    */
  var parserConfig: js.UndefOr[SchemaParserConfig] = js.native
}

object SchemaHl7V2Store {
  @scala.inline
  def apply(): SchemaHl7V2Store = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHl7V2Store]
  }
  @scala.inline
  implicit class SchemaHl7V2StoreOps[Self <: SchemaHl7V2Store] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withNotificationConfig(value: SchemaNotificationConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withParserConfig(value: SchemaParserConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parserConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParserConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parserConfig")(js.undefined)
        ret
    }
  }
  
}


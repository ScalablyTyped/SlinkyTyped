package typingsSlinky.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An email message.
  */
@js.native
trait SchemaMessage extends js.Object {
  /**
    * The ID of the last history record that modified this message.
    */
  var historyId: js.UndefOr[String] = js.native
  /**
    * The immutable ID of the message.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The internal message creation timestamp (epoch ms), which determines
    * ordering in the inbox. For normal SMTP-received email, this represents
    * the time the message was originally accepted by Google, which is more
    * reliable than the Date header. However, for API-migrated mail, it can be
    * configured by client to be based on the Date header.
    */
  var internalDate: js.UndefOr[String] = js.native
  /**
    * List of IDs of labels applied to this message.
    */
  var labelIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The parsed email structure in the message parts.
    */
  var payload: js.UndefOr[SchemaMessagePart] = js.native
  /**
    * The entire email message in an RFC 2822 formatted and base64url encoded
    * string. Returned in messages.get and drafts.get responses when the
    * format=RAW parameter is supplied.
    */
  var raw: js.UndefOr[String] = js.native
  /**
    * Estimated size in bytes of the message.
    */
  var sizeEstimate: js.UndefOr[Double] = js.native
  /**
    * A short part of the message text.
    */
  var snippet: js.UndefOr[String] = js.native
  /**
    * The ID of the thread the message belongs to. To add a message or draft to
    * a thread, the following criteria must be met:  - The requested threadId
    * must be specified on the Message or Draft.Message you supply with your
    * request.  - The References and In-Reply-To headers must be set in
    * compliance with the RFC 2822 standard.  - The Subject headers must match.
    */
  var threadId: js.UndefOr[String] = js.native
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
    def withHistoryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistoryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historyId")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInternalDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInternalDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalDate")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelIds")(js.undefined)
        ret
    }
    @scala.inline
    def withPayload(value: SchemaMessagePart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(js.undefined)
        ret
    }
    @scala.inline
    def withRaw(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeEstimate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeEstimate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeEstimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeEstimate")(js.undefined)
        ret
    }
    @scala.inline
    def withSnippet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnippet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippet")(js.undefined)
        ret
    }
    @scala.inline
    def withThreadId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threadId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreadId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threadId")(js.undefined)
        ret
    }
  }
  
}


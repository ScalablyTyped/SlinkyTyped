package typingsSlinky.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message matching criteria.
  */
@js.native
trait SchemaFilterCriteria extends js.Object {
  /**
    * Whether the response should exclude chats.
    */
  var excludeChats: js.UndefOr[Boolean] = js.native
  /**
    * The sender&#39;s display name or email address.
    */
  var from: js.UndefOr[String] = js.native
  /**
    * Whether the message has any attachment.
    */
  var hasAttachment: js.UndefOr[Boolean] = js.native
  /**
    * Only return messages not matching the specified query. Supports the same
    * query format as the Gmail search box. For example,
    * &quot;from:someuser@example.com rfc822msgid: is:unread&quot;.
    */
  var negatedQuery: js.UndefOr[String] = js.native
  /**
    * Only return messages matching the specified query. Supports the same
    * query format as the Gmail search box. For example,
    * &quot;from:someuser@example.com rfc822msgid: is:unread&quot;.
    */
  var query: js.UndefOr[String] = js.native
  /**
    * The size of the entire RFC822 message in bytes, including all headers and
    * attachments.
    */
  var size: js.UndefOr[Double] = js.native
  /**
    * How the message size in bytes should be in relation to the size field.
    */
  var sizeComparison: js.UndefOr[String] = js.native
  /**
    * Case-insensitive phrase found in the message&#39;s subject. Trailing and
    * leading whitespace are be trimmed and adjacent spaces are collapsed.
    */
  var subject: js.UndefOr[String] = js.native
  /**
    * The recipient&#39;s display name or email address. Includes recipients in
    * the &quot;to&quot;, &quot;cc&quot;, and &quot;bcc&quot; header fields.
    * You can use simply the local part of the email address. For example,
    * &quot;example&quot; and &quot;example@&quot; both match
    * &quot;example@gmail.com&quot;. This field is case-insensitive.
    */
  var to: js.UndefOr[String] = js.native
}

object SchemaFilterCriteria {
  @scala.inline
  def apply(): SchemaFilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilterCriteria]
  }
  @scala.inline
  implicit class SchemaFilterCriteriaOps[Self <: SchemaFilterCriteria] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcludeChats(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeChats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeChats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeChats")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withHasAttachment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAttachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasAttachment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAttachment")(js.undefined)
        ret
    }
    @scala.inline
    def withNegatedQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negatedQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegatedQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negatedQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeComparison(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeComparison")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeComparison: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeComparison")(js.undefined)
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
  }
  
}


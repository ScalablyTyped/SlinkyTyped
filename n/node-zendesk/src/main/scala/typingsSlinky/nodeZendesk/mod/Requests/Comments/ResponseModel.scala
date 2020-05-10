package typingsSlinky.nodeZendesk.mod.Requests.Comments

import typingsSlinky.nodeZendesk.mod.Attachments.Model
import typingsSlinky.nodeZendesk.mod.TemporalModel
import typingsSlinky.nodeZendesk.mod.Tickets.Comments.Metadata
import typingsSlinky.nodeZendesk.mod.Tickets.Via
import typingsSlinky.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseModel extends TemporalModel {
  val attachments: js.Array[Model] = js.native
  val author_id: ZendeskID = js.native
  val body: String = js.native
  val html_body: String = js.native
  val metadata: js.UndefOr[Metadata] = js.native
  val plain_body: String = js.native
  val public: Boolean = js.native
  val request_id: Double = js.native
  val `type`: RequestType = js.native
  val url: String = js.native
  val via: js.UndefOr[Via] = js.native
}

object ResponseModel {
  @scala.inline
  def apply(
    attachments: js.Array[Model],
    author_id: ZendeskID,
    body: String,
    created_at: String,
    html_body: String,
    id: ZendeskID,
    plain_body: String,
    public: Boolean,
    request_id: Double,
    `type`: RequestType,
    url: String
  ): ResponseModel = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], author_id = author_id.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], html_body = html_body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], plain_body = plain_body.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseModel]
  }
  @scala.inline
  implicit class ResponseModelOps[Self <: ResponseModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachments(value: js.Array[Model]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthor_id(value: ZendeskID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml_body(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html_body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlain_body(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plain_body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: RequestType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: Metadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withVia(value: Via): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("via")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("via")(js.undefined)
        ret
    }
  }
  
}


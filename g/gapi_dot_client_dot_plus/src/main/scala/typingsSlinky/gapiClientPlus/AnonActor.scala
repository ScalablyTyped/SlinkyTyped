package typingsSlinky.gapiClientPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonActor extends js.Object {
  /**
    * If this activity's object is itself another activity, such as when a person reshares an activity, this property specifies the original activity's
    * actor.
    */
  var actor: js.UndefOr[AnonDisplayName] = js.native
  /** The media objects attached to this activity. */
  var attachments: js.UndefOr[js.Array[AnonContent]] = js.native
  /** The HTML-formatted content, which is suitable for display. */
  var content: js.UndefOr[String] = js.native
  /** The ID of the object. When resharing an activity, this is the ID of the activity that is being reshared. */
  var id: js.UndefOr[String] = js.native
  /**
    * The type of the object. Possible values include, but are not limited to, the following values:
    * - "note" - Textual content.
    * - "activity" - A Google+ activity.
    */
  var objectType: js.UndefOr[String] = js.native
  /**
    * The content (text) as provided by the author, which is stored without any HTML formatting. When creating or updating an activity, this value must be
    * supplied as plain text in the request.
    */
  var originalContent: js.UndefOr[String] = js.native
  /** People who +1'd this activity. */
  var plusoners: js.UndefOr[AnonSelfLink] = js.native
  /** Comments in reply to this activity. */
  var replies: js.UndefOr[AnonSelfLink] = js.native
  /** People who reshared this activity. */
  var resharers: js.UndefOr[AnonSelfLink] = js.native
  /** The URL that points to the linked resource. */
  var url: js.UndefOr[String] = js.native
}

object AnonActor {
  @scala.inline
  def apply(): AnonActor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonActor]
  }
  @scala.inline
  implicit class AnonActorOps[Self <: AnonActor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActor(value: AnonDisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actor")(js.undefined)
        ret
    }
    @scala.inline
    def withAttachments(value: js.Array[AnonContent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
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
    def withObjectType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectType")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalContent")(js.undefined)
        ret
    }
    @scala.inline
    def withPlusoners(value: AnonSelfLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plusoners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlusoners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plusoners")(js.undefined)
        ret
    }
    @scala.inline
    def withReplies(value: AnonSelfLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replies")(js.undefined)
        ret
    }
    @scala.inline
    def withResharers(value: AnonSelfLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resharers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResharers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resharers")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}


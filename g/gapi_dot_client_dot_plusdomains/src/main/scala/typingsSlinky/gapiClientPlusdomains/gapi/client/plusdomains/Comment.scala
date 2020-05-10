package typingsSlinky.gapiClientPlusdomains.gapi.client.plusdomains

import typingsSlinky.gapiClientPlusdomains.AnonDisplayName
import typingsSlinky.gapiClientPlusdomains.AnonId
import typingsSlinky.gapiClientPlusdomains.AnonObjectType
import typingsSlinky.gapiClientPlusdomains.AnonTotalItems
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comment extends js.Object {
  /** The person who posted this comment. */
  var actor: js.UndefOr[AnonDisplayName] = js.native
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[String] = js.native
  /** The ID of this comment. */
  var id: js.UndefOr[String] = js.native
  /** The activity this comment replied to. */
  var inReplyTo: js.UndefOr[js.Array[AnonId]] = js.native
  /** Identifies this resource as a comment. Value: "plus#comment". */
  var kind: js.UndefOr[String] = js.native
  /** The object of this comment. */
  var `object`: js.UndefOr[AnonObjectType] = js.native
  /** People who +1'd this comment. */
  var plusoners: js.UndefOr[AnonTotalItems] = js.native
  /** The time at which this comment was initially published. Formatted as an RFC 3339 timestamp. */
  var published: js.UndefOr[String] = js.native
  /** Link to this comment resource. */
  var selfLink: js.UndefOr[String] = js.native
  /** The time at which this comment was last updated. Formatted as an RFC 3339 timestamp. */
  var updated: js.UndefOr[String] = js.native
  /**
    * This comment's verb, indicating what action was performed. Possible values are:
    * - "post" - Publish content to the stream.
    */
  var verb: js.UndefOr[String] = js.native
}

object Comment {
  @scala.inline
  def apply(): Comment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Comment]
  }
  @scala.inline
  implicit class CommentOps[Self <: Comment] (val x: Self) extends AnyVal {
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
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
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
    def withInReplyTo(value: js.Array[AnonId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inReplyTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInReplyTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inReplyTo")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withObject(value: AnonObjectType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(js.undefined)
        ret
    }
    @scala.inline
    def withPlusoners(value: AnonTotalItems): Self = {
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
    def withPublished(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublished: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(js.undefined)
        ret
    }
    @scala.inline
    def withVerb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verb")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.googleapis.mirrorV1Mod.mirrorV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Each item in the user&#39;s timeline is represented as a TimelineItem JSON
  * structure, described below.
  */
@js.native
trait SchemaTimelineItem extends js.Object {
  /**
    * A list of media attachments associated with this item. As a convenience,
    * you can refer to attachments in your HTML payloads with the attachment or
    * cid scheme. For example:   - attachment: &lt;img
    * src=&quot;attachment:attachment_index&quot;&gt; where attachment_index is
    * the 0-based index of this array.  - cid: &lt;img
    * src=&quot;cid:attachment_id&quot;&gt; where attachment_id is the ID of
    * the attachment.
    */
  var attachments: js.UndefOr[js.Array[SchemaAttachment]] = js.native
  /**
    * The bundle ID for this item. Services can specify a bundleId to group
    * many items together. They appear under a single top-level item on the
    * device.
    */
  var bundleId: js.UndefOr[String] = js.native
  /**
    * A canonical URL pointing to the canonical/high quality version of the
    * data represented by the timeline item.
    */
  var canonicalUrl: js.UndefOr[String] = js.native
  /**
    * The time at which this item was created, formatted according to RFC 3339.
    */
  var created: js.UndefOr[String] = js.native
  /**
    * The user or group that created this item.
    */
  var creator: js.UndefOr[SchemaContact] = js.native
  /**
    * The time that should be displayed when this item is viewed in the
    * timeline, formatted according to RFC 3339. This user&#39;s timeline is
    * sorted chronologically on display time, so this will also determine where
    * the item is displayed in the timeline. If not set by the service, the
    * display time defaults to the updated time.
    */
  var displayTime: js.UndefOr[String] = js.native
  /**
    * ETag for this item.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * HTML content for this item. If both text and html are provided for an
    * item, the html will be rendered in the timeline. Allowed HTML elements -
    * You can use these elements in your timeline cards.   - Headers: h1, h2,
    * h3, h4, h5, h6  - Images: img  - Lists: li, ol, ul  - HTML5 semantics:
    * article, aside, details, figure, figcaption, footer, header, nav,
    * section, summary, time  - Structural: blockquote, br, div, hr, p, span  -
    * Style: b, big, center, em, i, u, s, small, strike, strong, style, sub,
    * sup  - Tables: table, tbody, td, tfoot, th, thead, tr   Blocked HTML
    * elements: These elements and their contents are removed from HTML
    * payloads.   - Document headers: head, title  - Embeds: audio, embed,
    * object, source, video  - Frames: frame, frameset  - Scripting: applet,
    * script   Other elements: Any elements that aren&#39;t listed are removed,
    * but their contents are preserved.
    */
  var html: js.UndefOr[String] = js.native
  /**
    * The ID of the timeline item. This is unique within a user&#39;s timeline.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * If this item was generated as a reply to another item, this field will be
    * set to the ID of the item being replied to. This can be used to attach a
    * reply to the appropriate conversation or post.
    */
  var inReplyTo: js.UndefOr[String] = js.native
  /**
    * Whether this item is a bundle cover.  If an item is marked as a bundle
    * cover, it will be the entry point to the bundle of items that have the
    * same bundleId as that item. It will be shown only on the main timeline —
    * not within the opened bundle.  On the main timeline, items that are shown
    * are:   - Items that have isBundleCover set to true   - Items that do not
    * have a bundleId  In a bundle sub-timeline, items that are shown are:   -
    * Items that have the bundleId in question AND isBundleCover set to false
    */
  var isBundleCover: js.UndefOr[Boolean] = js.native
  /**
    * When true, indicates this item is deleted, and only the ID property is
    * set.
    */
  var isDeleted: js.UndefOr[Boolean] = js.native
  /**
    * When true, indicates this item is pinned, which means it&#39;s grouped
    * alongside &quot;active&quot; items like navigation and hangouts, on the
    * opposite side of the home screen from historical (non-pinned) timeline
    * items. You can allow the user to toggle the value of this property with
    * the TOGGLE_PINNED built-in menu item.
    */
  var isPinned: js.UndefOr[Boolean] = js.native
  /**
    * The type of resource. This is always mirror#timelineItem.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The geographic location associated with this item.
    */
  var location: js.UndefOr[SchemaLocation] = js.native
  /**
    * A list of menu items that will be presented to the user when this item is
    * selected in the timeline.
    */
  var menuItems: js.UndefOr[js.Array[SchemaMenuItem]] = js.native
  /**
    * Controls how notifications for this item are presented on the device. If
    * this is missing, no notification will be generated.
    */
  var notification: js.UndefOr[SchemaNotificationConfig] = js.native
  /**
    * For pinned items, this determines the order in which the item is
    * displayed in the timeline, with a higher score appearing closer to the
    * clock. Note: setting this field is currently not supported.
    */
  var pinScore: js.UndefOr[Double] = js.native
  /**
    * A list of users or groups that this item has been shared with.
    */
  var recipients: js.UndefOr[js.Array[SchemaContact]] = js.native
  /**
    * A URL that can be used to retrieve this item.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * Opaque string you can use to map a timeline item to data in your own
    * service.
    */
  var sourceItemId: js.UndefOr[String] = js.native
  /**
    * The speakable version of the content of this item. Along with the
    * READ_ALOUD menu item, use this field to provide text that would be
    * clearer when read aloud, or to provide extended information to what is
    * displayed visually on Glass.  Glassware should also specify the
    * speakableType field, which will be spoken before this text in cases where
    * the additional context is useful, for example when the user requests that
    * the item be read aloud following a notification.
    */
  var speakableText: js.UndefOr[String] = js.native
  /**
    * A speakable description of the type of this item. This will be announced
    * to the user prior to reading the content of the item in cases where the
    * additional context is useful, for example when the user requests that the
    * item be read aloud following a notification.  This should be a short,
    * simple noun phrase such as &quot;Email&quot;, &quot;Text message&quot;,
    * or &quot;Daily Planet News Update&quot;.  Glassware are encouraged to
    * populate this field for every timeline item, even if the item does not
    * contain speakableText or text so that the user can learn the type of the
    * item without looking at the screen.
    */
  var speakableType: js.UndefOr[String] = js.native
  /**
    * Text content of this item.
    */
  var text: js.UndefOr[String] = js.native
  /**
    * The title of this item.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The time at which this item was last modified, formatted according to RFC
    * 3339.
    */
  var updated: js.UndefOr[String] = js.native
}

object SchemaTimelineItem {
  @scala.inline
  def apply(): SchemaTimelineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimelineItem]
  }
  @scala.inline
  implicit class SchemaTimelineItemOps[Self <: SchemaTimelineItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachments(value: js.Array[SchemaAttachment]): Self = {
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
    def withBundleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBundleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleId")(js.undefined)
        ret
    }
    @scala.inline
    def withCanonicalUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canonicalUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanonicalUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canonicalUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withCreator(value: SchemaContact): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creator")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayTime")(js.undefined)
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
    def withHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.undefined)
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
    def withInReplyTo(value: String): Self = {
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
    def withIsBundleCover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBundleCover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBundleCover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBundleCover")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDeleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDeleted")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPinned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPinned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPinned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPinned")(js.undefined)
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
    def withLocation(value: SchemaLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuItems(value: js.Array[SchemaMenuItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItems")(js.undefined)
        ret
    }
    @scala.inline
    def withNotification(value: SchemaNotificationConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notification")(js.undefined)
        ret
    }
    @scala.inline
    def withPinScore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinScore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinScore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinScore")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipients(value: js.Array[SchemaContact]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipients: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipients")(js.undefined)
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
    def withSourceItemId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceItemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceItemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceItemId")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeakableText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speakableText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeakableText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speakableText")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeakableType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speakableType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeakableType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speakableType")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
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
  }
  
}


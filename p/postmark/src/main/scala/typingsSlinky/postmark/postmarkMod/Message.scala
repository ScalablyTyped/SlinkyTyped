package typingsSlinky.postmark.postmarkMod

import typingsSlinky.postmark.distClientModelsClientSupportingTypesMod.Hash
import typingsSlinky.postmark.distClientModelsMessageSupportingTypesMod.LinkTrackingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark", "Message")
@js.native
class Message protected ()
  extends typingsSlinky.postmark.distClientModelsMod.Message {
  def this(
    From: String,
    Subject: String,
    HtmlBody: js.UndefOr[String],
    TextBody: js.UndefOr[String],
    To: js.UndefOr[String],
    Cc: js.UndefOr[String],
    Bcc: js.UndefOr[String],
    ReplyTo: js.UndefOr[String],
    Tag: js.UndefOr[String],
    TrackOpens: js.UndefOr[Boolean],
    TrackLinks: js.UndefOr[LinkTrackingOptions],
    Headers: js.UndefOr[
        js.Array[typingsSlinky.postmark.distClientModelsMessageSupportingTypesMod.Header]
      ],
    Attachments: js.UndefOr[
        js.Array[typingsSlinky.postmark.distClientModelsMessageSupportingTypesMod.Attachment]
      ],
    Metadata: js.UndefOr[Hash[String]]
  ) = this()
}


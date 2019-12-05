package typingsSlinky.postmark.distClientModelsMod

import typingsSlinky.postmark.distClientModelsClientSupportingTypesMod.Hash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark/dist/client/models", "Message")
@js.native
class Message protected ()
  extends typingsSlinky.postmark.distClientModelsMessageMessageMod.Message {
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
    TrackLinks: js.UndefOr[
        typingsSlinky.postmark.distClientModelsMessageSupportingTypesMod.LinkTrackingOptions
      ],
    Headers: js.UndefOr[
        js.Array[typingsSlinky.postmark.distClientModelsMessageSupportingTypesMod.Header]
      ],
    Attachments: js.UndefOr[
        js.Array[typingsSlinky.postmark.distClientModelsMessageSupportingTypesMod.Attachment]
      ],
    Metadata: js.UndefOr[Hash[String]]
  ) = this()
}


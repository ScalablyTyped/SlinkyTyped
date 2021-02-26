package typingsSlinky.postmark.mod.Models

import typingsSlinky.postmark.supportingTypesMod.Hash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark", "Models.Message")
@js.native
class Message protected ()
  extends typingsSlinky.postmark.modelsMod.Message {
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
    TrackLinks: js.UndefOr[typingsSlinky.postmark.messageSupportingTypesMod.LinkTrackingOptions],
    Headers: js.UndefOr[js.Array[typingsSlinky.postmark.messageSupportingTypesMod.Header]],
    Attachments: js.UndefOr[js.Array[typingsSlinky.postmark.messageSupportingTypesMod.Attachment]],
    Metadata: js.UndefOr[Hash[String]]
  ) = this()
}

package typingsSlinky.postmark.messageMod

import typingsSlinky.postmark.messageSupportingTypesMod.Attachment
import typingsSlinky.postmark.messageSupportingTypesMod.Header
import typingsSlinky.postmark.messageSupportingTypesMod.LinkTrackingOptions
import typingsSlinky.postmark.supportingTypesMod.Hash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark/dist/client/models/message/Message", "Message")
@js.native
class Message protected () extends js.Object {
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
    Headers: js.UndefOr[js.Array[Header]],
    Attachments: js.UndefOr[js.Array[Attachment]],
    Metadata: js.UndefOr[Hash[String]]
  ) = this()
  
  var Attachments: js.UndefOr[js.Array[Attachment]] = js.native
  
  var Bcc: js.UndefOr[String] = js.native
  
  var Cc: js.UndefOr[String] = js.native
  
  var From: String = js.native
  
  var Headers: js.UndefOr[js.Array[Header]] = js.native
  
  var HtmlBody: js.UndefOr[String] = js.native
  
  var MessageStream: js.UndefOr[String] = js.native
  
  var Metadata: js.UndefOr[Hash[String]] = js.native
  
  var ReplyTo: js.UndefOr[String] = js.native
  
  var Subject: String = js.native
  
  var Tag: js.UndefOr[String] = js.native
  
  var TextBody: js.UndefOr[String] = js.native
  
  var To: js.UndefOr[String] = js.native
  
  var TrackLinks: js.UndefOr[LinkTrackingOptions] = js.native
  
  var TrackOpens: js.UndefOr[Boolean] = js.native
}

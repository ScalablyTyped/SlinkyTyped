package typingsSlinky.postmark.templateMod

import typingsSlinky.postmark.messageSupportingTypesMod.Attachment
import typingsSlinky.postmark.messageSupportingTypesMod.Header
import typingsSlinky.postmark.messageSupportingTypesMod.LinkTrackingOptions
import typingsSlinky.postmark.supportingTypesMod.Hash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark/dist/client/models/templates/Template", "TemplatedMessage")
@js.native
class TemplatedMessage protected () extends js.Object {
  def this(
    from: String,
    templateIdOrAlias: Double | String,
    templateModel: js.Object,
    to: js.UndefOr[String],
    cc: js.UndefOr[String],
    bcc: js.UndefOr[String],
    replyTo: js.UndefOr[String],
    tag: js.UndefOr[String],
    trackOpens: js.UndefOr[Boolean],
    trackLinks: js.UndefOr[LinkTrackingOptions],
    headers: js.UndefOr[js.Array[Header]],
    attachments: js.UndefOr[js.Array[Attachment]]
  ) = this()
  
  var Attachments: js.UndefOr[js.Array[Attachment]] = js.native
  
  var Bcc: js.UndefOr[String] = js.native
  
  var Cc: js.UndefOr[String] = js.native
  
  var From: String = js.native
  
  var Headers: js.UndefOr[js.Array[Header]] = js.native
  
  var InlineCss: js.UndefOr[Boolean] = js.native
  
  var MessageStream: js.UndefOr[String] = js.native
  
  var Metadata: js.UndefOr[Hash[String]] = js.native
  
  var ReplyTo: js.UndefOr[String] = js.native
  
  var Tag: js.UndefOr[String] = js.native
  
  var TemplateAlias: js.UndefOr[String] = js.native
  
  var TemplateId: js.UndefOr[Double] = js.native
  
  var TemplateModel: js.UndefOr[js.Object] = js.native
  
  var To: js.UndefOr[String] = js.native
  
  var TrackLinks: js.UndefOr[LinkTrackingOptions] = js.native
  
  var TrackOpens: js.UndefOr[Boolean] = js.native
}

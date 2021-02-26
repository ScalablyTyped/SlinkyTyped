package typingsSlinky.postmark.mod

import typingsSlinky.postmark.messageSupportingTypesMod.LinkTrackingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark", "TemplatedMessage")
@js.native
class TemplatedMessage protected ()
  extends typingsSlinky.postmark.modelsMod.TemplatedMessage {
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
    headers: js.UndefOr[js.Array[typingsSlinky.postmark.messageSupportingTypesMod.Header]],
    attachments: js.UndefOr[js.Array[typingsSlinky.postmark.messageSupportingTypesMod.Attachment]]
  ) = this()
}

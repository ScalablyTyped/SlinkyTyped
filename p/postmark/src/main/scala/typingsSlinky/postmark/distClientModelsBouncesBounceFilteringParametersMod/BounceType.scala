package typingsSlinky.postmark.distClientModelsBouncesBounceFilteringParametersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BounceType extends js.Object

@JSImport("postmark/dist/client/models/bounces/BounceFilteringParameters", "BounceType")
@js.native
object BounceType extends js.Object {
  @js.native
  sealed trait AddressChange extends BounceType
  
  @js.native
  sealed trait AutoResponder extends BounceType
  
  @js.native
  sealed trait BadEmailAddress extends BounceType
  
  @js.native
  sealed trait Blocked extends BounceType
  
  @js.native
  sealed trait ChallengeVerification extends BounceType
  
  @js.native
  sealed trait DMARCPolicy extends BounceType
  
  @js.native
  sealed trait DnsError extends BounceType
  
  @js.native
  sealed trait HardBounce extends BounceType
  
  @js.native
  sealed trait InboundError extends BounceType
  
  @js.native
  sealed trait ManuallyDeactivated extends BounceType
  
  @js.native
  sealed trait OpenRelayTest extends BounceType
  
  @js.native
  sealed trait SMTPApiError extends BounceType
  
  @js.native
  sealed trait SoftBounce extends BounceType
  
  @js.native
  sealed trait SpamComplaint extends BounceType
  
  @js.native
  sealed trait SpamNotification extends BounceType
  
  @js.native
  sealed trait Subscribe extends BounceType
  
  @js.native
  sealed trait TemplateRenderingFailed extends BounceType
  
  @js.native
  sealed trait Transient extends BounceType
  
  @js.native
  sealed trait Unconfirmed extends BounceType
  
  @js.native
  sealed trait Unknown extends BounceType
  
  @js.native
  sealed trait Unsubscribe extends BounceType
  
  @js.native
  sealed trait VirusNotification extends BounceType
  
  /* "AddressChange" */ val AddressChange: typingsSlinky.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.AddressChange with String = js.native
  /* "AutoResponder" */ val AutoResponder: typingsSlinky.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.AutoResponder with String = js.native
  /* "BadEmailAddress" */ val BadEmailAddress: typingsSlinky.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.BadEmailAddress with String = js.native
  /* "Blocked" */ val Blocked: typingsSlinky.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.Blocked with String = js.native
  /* "ChallengeVerification" */ val ChallengeVerification: typingsSlinky.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.ChallengeVerification with String = js.native
  /* "DMARCPolicy" */ val DMARCPolicy: typingsSlinky.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.DMARCPolicy with String = js.native
  /* "DnsError" */ val DnsError: typingsSlinky.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.DnsError with String = js.native
  /* "HardBounce" */ val HardBounce: typingsSlinky.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.HardBounce with String = js.native
  /* "InboundError" */ val InboundError: typingsSlinky.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.InboundError with String = js.native
  /* "ManuallyDeactivated" */ val ManuallyDeactivated: typingsSlinky.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.ManuallyDeactivated with String = js.native
  /* "OpenRelayTest" */ val OpenRelayTest: typingsSlinky.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.OpenRelayTest with String = js.native
  /* "SMTPApiError" */ val SMTPApiError: typingsSlinky.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.SMTPApiError with String = js.native
  /* "SoftBounce" */ val SoftBounce: typingsSlinky.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.SoftBounce with String = js.native
  /* "SpamComplaint" */ val SpamComplaint: typingsSlinky.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.SpamComplaint with String = js.native
  /* "SpamNotification" */ val SpamNotification: typingsSlinky.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.SpamNotification with String = js.native
  /* "Subscribe" */ val Subscribe: typingsSlinky.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.Subscribe with String = js.native
  /* "TemplateRenderingFailed" */ val TemplateRenderingFailed: typingsSlinky.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.TemplateRenderingFailed with String = js.native
  /* "Transient" */ val Transient: typingsSlinky.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.Transient with String = js.native
  /* "Unconfirmed" */ val Unconfirmed: typingsSlinky.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.Unconfirmed with String = js.native
  /* "Unknown" */ val Unknown: typingsSlinky.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.Unknown with String = js.native
  /* "Unsubscribe" */ val Unsubscribe: typingsSlinky.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.Unsubscribe with String = js.native
  /* "VirusNotification" */ val VirusNotification: typingsSlinky.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.VirusNotification with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BounceType with String] = js.native
}


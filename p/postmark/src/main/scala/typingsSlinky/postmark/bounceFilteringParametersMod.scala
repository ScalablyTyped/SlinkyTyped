package typingsSlinky.postmark

import typingsSlinky.postmark.filteringParametersMod.FilteringParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bounceFilteringParametersMod {
  
  @JSImport("postmark/dist/client/models/bounces/BounceFilteringParameters", "BounceFilteringParameters")
  @js.native
  class BounceFilteringParameters protected () extends FilteringParameters {
    def this(
      count: js.UndefOr[Double],
      offset: js.UndefOr[Double],
      `type`: js.UndefOr[BounceType],
      inactive: js.UndefOr[Boolean],
      emailFilter: js.UndefOr[String],
      tag: js.UndefOr[String],
      messageID: js.UndefOr[String],
      fromDate: js.UndefOr[String],
      toDate: js.UndefOr[String],
      messageStream: js.UndefOr[String]
    ) = this()
    
    var emailFilter: js.UndefOr[String] = js.native
    
    var fromDate: js.UndefOr[String] = js.native
    
    var inactive: js.UndefOr[Boolean] = js.native
    
    var messageID: js.UndefOr[String] = js.native
    
    var messageStream: js.UndefOr[String] = js.native
    
    var tag: js.UndefOr[String] = js.native
    
    var toDate: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[BounceType] = js.native
  }
  
  @js.native
  sealed trait BounceType extends StObject
  @JSImport("postmark/dist/client/models/bounces/BounceFilteringParameters", "BounceType")
  @js.native
  object BounceType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[BounceType with String] = js.native
    
    @js.native
    sealed trait AddressChange extends BounceType
    /* "AddressChange" */ val AddressChange: typingsSlinky.postmark.bounceFilteringParametersMod.BounceType.AddressChange with String = js.native
    
    @js.native
    sealed trait AutoResponder extends BounceType
    /* "AutoResponder" */ val AutoResponder: typingsSlinky.postmark.bounceFilteringParametersMod.BounceType.AutoResponder with String = js.native
    
    @js.native
    sealed trait BadEmailAddress extends BounceType
    /* "BadEmailAddress" */ val BadEmailAddress: typingsSlinky.postmark.bounceFilteringParametersMod.BounceType.BadEmailAddress with String = js.native
    
    @js.native
    sealed trait Blocked extends BounceType
    /* "Blocked" */ val Blocked: typingsSlinky.postmark.bounceFilteringParametersMod.BounceType.Blocked with String = js.native
    
    @js.native
    sealed trait ChallengeVerification extends BounceType
    /* "ChallengeVerification" */ val ChallengeVerification: typingsSlinky.postmark.bounceFilteringParametersMod.BounceType.ChallengeVerification with String = js.native
    
    @js.native
    sealed trait DMARCPolicy extends BounceType
    /* "DMARCPolicy" */ val DMARCPolicy: typingsSlinky.postmark.bounceFilteringParametersMod.BounceType.DMARCPolicy with String = js.native
    
    @js.native
    sealed trait DnsError extends BounceType
    /* "DnsError" */ val DnsError: typingsSlinky.postmark.bounceFilteringParametersMod.BounceType.DnsError with String = js.native
    
    @js.native
    sealed trait HardBounce extends BounceType
    /* "HardBounce" */ val HardBounce: typingsSlinky.postmark.bounceFilteringParametersMod.BounceType.HardBounce with String = js.native
    
    @js.native
    sealed trait InboundError extends BounceType
    /* "InboundError" */ val InboundError: typingsSlinky.postmark.bounceFilteringParametersMod.BounceType.InboundError with String = js.native
    
    @js.native
    sealed trait ManuallyDeactivated extends BounceType
    /* "ManuallyDeactivated" */ val ManuallyDeactivated: typingsSlinky.postmark.bounceFilteringParametersMod.BounceType.ManuallyDeactivated with String = js.native
    
    @js.native
    sealed trait OpenRelayTest extends BounceType
    /* "OpenRelayTest" */ val OpenRelayTest: typingsSlinky.postmark.bounceFilteringParametersMod.BounceType.OpenRelayTest with String = js.native
    
    @js.native
    sealed trait SMTPApiError extends BounceType
    /* "SMTPApiError" */ val SMTPApiError: typingsSlinky.postmark.bounceFilteringParametersMod.BounceType.SMTPApiError with String = js.native
    
    @js.native
    sealed trait SoftBounce extends BounceType
    /* "SoftBounce" */ val SoftBounce: typingsSlinky.postmark.bounceFilteringParametersMod.BounceType.SoftBounce with String = js.native
    
    @js.native
    sealed trait SpamComplaint extends BounceType
    /* "SpamComplaint" */ val SpamComplaint: typingsSlinky.postmark.bounceFilteringParametersMod.BounceType.SpamComplaint with String = js.native
    
    @js.native
    sealed trait SpamNotification extends BounceType
    /* "SpamNotification" */ val SpamNotification: typingsSlinky.postmark.bounceFilteringParametersMod.BounceType.SpamNotification with String = js.native
    
    @js.native
    sealed trait Subscribe extends BounceType
    /* "Subscribe" */ val Subscribe: typingsSlinky.postmark.bounceFilteringParametersMod.BounceType.Subscribe with String = js.native
    
    @js.native
    sealed trait TemplateRenderingFailed extends BounceType
    /* "TemplateRenderingFailed" */ val TemplateRenderingFailed: typingsSlinky.postmark.bounceFilteringParametersMod.BounceType.TemplateRenderingFailed with String = js.native
    
    @js.native
    sealed trait Transient extends BounceType
    /* "Transient" */ val Transient: typingsSlinky.postmark.bounceFilteringParametersMod.BounceType.Transient with String = js.native
    
    @js.native
    sealed trait Unconfirmed extends BounceType
    /* "Unconfirmed" */ val Unconfirmed: typingsSlinky.postmark.bounceFilteringParametersMod.BounceType.Unconfirmed with String = js.native
    
    @js.native
    sealed trait Unknown extends BounceType
    /* "Unknown" */ val Unknown: typingsSlinky.postmark.bounceFilteringParametersMod.BounceType.Unknown with String = js.native
    
    @js.native
    sealed trait Unsubscribe extends BounceType
    /* "Unsubscribe" */ val Unsubscribe: typingsSlinky.postmark.bounceFilteringParametersMod.BounceType.Unsubscribe with String = js.native
    
    @js.native
    sealed trait VirusNotification extends BounceType
    /* "VirusNotification" */ val VirusNotification: typingsSlinky.postmark.bounceFilteringParametersMod.BounceType.VirusNotification with String = js.native
  }
}

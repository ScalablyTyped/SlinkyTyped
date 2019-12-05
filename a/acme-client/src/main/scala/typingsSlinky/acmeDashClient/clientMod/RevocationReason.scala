package typingsSlinky.acmeDashClient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RevocationReason extends js.Object

@JSImport("acme-client/client", "RevocationReason")
@js.native
object RevocationReason extends js.Object {
  @js.native
  sealed trait AACompromise extends RevocationReason
  
  @js.native
  sealed trait AffiliationChanged extends RevocationReason
  
  @js.native
  sealed trait CACompromise extends RevocationReason
  
  @js.native
  sealed trait CertificateHold extends RevocationReason
  
  @js.native
  sealed trait CessationOfOperation extends RevocationReason
  
  @js.native
  sealed trait KeyCompromise extends RevocationReason
  
  @js.native
  sealed trait PrivilegeWithdrawn extends RevocationReason
  
  @js.native
  sealed trait RemoveFromCRL extends RevocationReason
  
  @js.native
  sealed trait Supersedeed extends RevocationReason
  
  @js.native
  sealed trait Unspecified extends RevocationReason
  
  /* 10 */ val AACompromise: typingsSlinky.acmeDashClient.clientMod.RevocationReason.AACompromise with Double = js.native
  /* 3 */ val AffiliationChanged: typingsSlinky.acmeDashClient.clientMod.RevocationReason.AffiliationChanged with Double = js.native
  /* 2 */ val CACompromise: typingsSlinky.acmeDashClient.clientMod.RevocationReason.CACompromise with Double = js.native
  /* 6 */ val CertificateHold: typingsSlinky.acmeDashClient.clientMod.RevocationReason.CertificateHold with Double = js.native
  /* 5 */ val CessationOfOperation: typingsSlinky.acmeDashClient.clientMod.RevocationReason.CessationOfOperation with Double = js.native
  /* 1 */ val KeyCompromise: typingsSlinky.acmeDashClient.clientMod.RevocationReason.KeyCompromise with Double = js.native
  /* 9 */ val PrivilegeWithdrawn: typingsSlinky.acmeDashClient.clientMod.RevocationReason.PrivilegeWithdrawn with Double = js.native
  /* 8 */ val RemoveFromCRL: typingsSlinky.acmeDashClient.clientMod.RevocationReason.RemoveFromCRL with Double = js.native
  /* 4 */ val Supersedeed: typingsSlinky.acmeDashClient.clientMod.RevocationReason.Supersedeed with Double = js.native
  /* 0 */ val Unspecified: typingsSlinky.acmeDashClient.clientMod.RevocationReason.Unspecified with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RevocationReason with Double] = js.native
}


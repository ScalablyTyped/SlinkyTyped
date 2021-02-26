package typingsSlinky.acmeClient.rfc8555Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CertificateRevocationReason extends StObject
@JSImport("acme-client/types/rfc8555", "CertificateRevocationReason")
@js.native
object CertificateRevocationReason extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CertificateRevocationReason with Double] = js.native
  
  @js.native
  sealed trait AACompromise extends CertificateRevocationReason
  /* 10 */ val AACompromise: typingsSlinky.acmeClient.rfc8555Mod.CertificateRevocationReason.AACompromise with Double = js.native
  
  @js.native
  sealed trait AffiliationChanged extends CertificateRevocationReason
  /* 3 */ val AffiliationChanged: typingsSlinky.acmeClient.rfc8555Mod.CertificateRevocationReason.AffiliationChanged with Double = js.native
  
  @js.native
  sealed trait CACompromise extends CertificateRevocationReason
  /* 2 */ val CACompromise: typingsSlinky.acmeClient.rfc8555Mod.CertificateRevocationReason.CACompromise with Double = js.native
  
  @js.native
  sealed trait CertificateHold extends CertificateRevocationReason
  /* 6 */ val CertificateHold: typingsSlinky.acmeClient.rfc8555Mod.CertificateRevocationReason.CertificateHold with Double = js.native
  
  @js.native
  sealed trait CessationOfOperation extends CertificateRevocationReason
  /* 5 */ val CessationOfOperation: typingsSlinky.acmeClient.rfc8555Mod.CertificateRevocationReason.CessationOfOperation with Double = js.native
  
  @js.native
  sealed trait KeyCompromise extends CertificateRevocationReason
  /* 1 */ val KeyCompromise: typingsSlinky.acmeClient.rfc8555Mod.CertificateRevocationReason.KeyCompromise with Double = js.native
  
  @js.native
  sealed trait PrivilegeWithdrawn extends CertificateRevocationReason
  /* 9 */ val PrivilegeWithdrawn: typingsSlinky.acmeClient.rfc8555Mod.CertificateRevocationReason.PrivilegeWithdrawn with Double = js.native
  
  @js.native
  sealed trait RemoveFromCRL extends CertificateRevocationReason
  /* 8 */ val RemoveFromCRL: typingsSlinky.acmeClient.rfc8555Mod.CertificateRevocationReason.RemoveFromCRL with Double = js.native
  
  @js.native
  sealed trait Superseded extends CertificateRevocationReason
  /* 4 */ val Superseded: typingsSlinky.acmeClient.rfc8555Mod.CertificateRevocationReason.Superseded with Double = js.native
  
  @js.native
  sealed trait Unspecified extends CertificateRevocationReason
  /* 0 */ val Unspecified: typingsSlinky.acmeClient.rfc8555Mod.CertificateRevocationReason.Unspecified with Double = js.native
}

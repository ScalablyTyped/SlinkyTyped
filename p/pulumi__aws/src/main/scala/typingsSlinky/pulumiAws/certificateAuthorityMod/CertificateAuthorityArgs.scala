package typingsSlinky.pulumiAws.certificateAuthorityMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.acmpca.CertificateAuthorityCertificateAuthorityConfiguration
import typingsSlinky.pulumiAws.inputMod.acmpca.CertificateAuthorityRevocationConfiguration
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateAuthorityArgs extends js.Object {
  /**
    * Nested argument containing algorithms and certificate subject information. Defined below.
    */
  val certificateAuthorityConfiguration: Input[CertificateAuthorityCertificateAuthorityConfiguration] = js.native
  /**
    * Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. Defaults to `false`.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The number of days to make a CA restorable after it has been deleted, must be between 7 to 30 days, with default to 30 days.
    */
  val permanentDeletionTimeInDays: js.UndefOr[Input[Double]] = js.native
  /**
    * Nested argument containing revocation configuration. Defined below.
    */
  val revocationConfiguration: js.UndefOr[Input[CertificateAuthorityRevocationConfiguration]] = js.native
  /**
    * Specifies a key-value map of user-defined tags that are attached to the certificate authority.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The type of the certificate authority. Defaults to `SUBORDINATE`. Valid values: `ROOT` and `SUBORDINATE`.
    */
  val `type`: js.UndefOr[Input[String]] = js.native
}

object CertificateAuthorityArgs {
  @scala.inline
  def apply(certificateAuthorityConfiguration: Input[CertificateAuthorityCertificateAuthorityConfiguration]): CertificateAuthorityArgs = {
    val __obj = js.Dynamic.literal(certificateAuthorityConfiguration = certificateAuthorityConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateAuthorityArgs]
  }
  @scala.inline
  implicit class CertificateAuthorityArgsOps[Self <: CertificateAuthorityArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateAuthorityConfiguration(value: Input[CertificateAuthorityCertificateAuthorityConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateAuthorityConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withPermanentDeletionTimeInDays(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permanentDeletionTimeInDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermanentDeletionTimeInDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permanentDeletionTimeInDays")(js.undefined)
        ret
    }
    @scala.inline
    def withRevocationConfiguration(value: Input[CertificateAuthorityRevocationConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revocationConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevocationConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revocationConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.pulumiAws.certificateMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.acm.CertificateOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateArgs extends js.Object {
  /**
    * ARN of an ACMPCA
    */
  val certificateAuthorityArn: js.UndefOr[Input[String]] = js.native
  /**
    * The certificate's PEM-formatted public key
    */
  val certificateBody: js.UndefOr[Input[String]] = js.native
  /**
    * The certificate's PEM-formatted chain
    * * Creating a private CA issued certificate
    */
  val certificateChain: js.UndefOr[Input[String]] = js.native
  /**
    * A domain name for which the certificate should be issued
    */
  val domainName: js.UndefOr[Input[String]] = js.native
  val options: js.UndefOr[Input[CertificateOptions]] = js.native
  /**
    * The certificate's PEM-formatted private key
    */
  val privateKey: js.UndefOr[Input[String]] = js.native
  /**
    * A list of domains that should be SANs in the issued certificate
    */
  val subjectAlternativeNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Which method to use for validation. `DNS` or `EMAIL` are valid, `NONE` can be used for certificates that were imported into ACM and then into state managed by this provider.
    * * Importing an existing certificate
    */
  val validationMethod: js.UndefOr[Input[String]] = js.native
}

object CertificateArgs {
  @scala.inline
  def apply(): CertificateArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateArgs]
  }
  @scala.inline
  implicit class CertificateArgsOps[Self <: CertificateArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateAuthorityArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateAuthorityArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateAuthorityArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateAuthorityArn")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificateBody(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateBody")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificateChain(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateChain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateChain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateChain")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: Input[CertificateOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateKey(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSubjectAlternativeNames(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subjectAlternativeNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubjectAlternativeNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subjectAlternativeNames")(js.undefined)
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
    def withValidationMethod(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationMethod")(js.undefined)
        ret
    }
  }
  
}


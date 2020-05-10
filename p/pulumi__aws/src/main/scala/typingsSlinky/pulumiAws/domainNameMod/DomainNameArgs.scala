package typingsSlinky.pulumiAws.domainNameMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.apigateway.DomainNameEndpointConfiguration
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainNameArgs extends js.Object {
  /**
    * The ARN for an AWS-managed certificate. AWS Certificate Manager is the only supported source. Used when an edge-optimized domain name is desired. Conflicts with `certificateName`, `certificateBody`, `certificateChain`, `certificatePrivateKey`, `regionalCertificateArn`, and `regionalCertificateName`.
    */
  val certificateArn: js.UndefOr[Input[String]] = js.native
  /**
    * The certificate issued for the domain name
    * being registered, in PEM format. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificateArn`, `regionalCertificateArn`, and
    * `regionalCertificateName`.
    */
  val certificateBody: js.UndefOr[Input[String]] = js.native
  /**
    * The certificate for the CA that issued the
    * certificate, along with any intermediate CA certificates required to
    * create an unbroken chain to a certificate trusted by the intended API clients. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificateArn`,
    * `regionalCertificateArn`, and `regionalCertificateName`.
    */
  val certificateChain: js.UndefOr[Input[String]] = js.native
  /**
    * The unique name to use when registering this
    * certificate as an IAM server certificate. Conflicts with `certificateArn`, `regionalCertificateArn`, and
    * `regionalCertificateName`. Required if `certificateArn` is not set.
    */
  val certificateName: js.UndefOr[Input[String]] = js.native
  /**
    * The private key associated with the
    * domain certificate given in `certificateBody`. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificateArn`, `regionalCertificateArn`, and `regionalCertificateName`.
    */
  val certificatePrivateKey: js.UndefOr[Input[String]] = js.native
  /**
    * The fully-qualified domain name to register
    */
  val domainName: Input[String] = js.native
  /**
    * Configuration block defining API endpoint information including type. Defined below.
    */
  val endpointConfiguration: js.UndefOr[Input[DomainNameEndpointConfiguration]] = js.native
  /**
    * The ARN for an AWS-managed certificate. AWS Certificate Manager is the only supported source. Used when a regional domain name is desired. Conflicts with `certificateArn`, `certificateName`, `certificateBody`, `certificateChain`, and `certificatePrivateKey`.
    */
  val regionalCertificateArn: js.UndefOr[Input[String]] = js.native
  /**
    * The user-friendly name of the certificate that will be used by regional endpoint for this domain name. Conflicts with `certificateArn`, `certificateName`, `certificateBody`, `certificateChain`, and
    * `certificatePrivateKey`.
    */
  val regionalCertificateName: js.UndefOr[Input[String]] = js.native
  /**
    * The Transport Layer Security (TLS) version + cipher suite for this DomainName. The valid values are `TLS_1_0` and `TLS_1_2`. Must be configured to perform drift detection.
    */
  val securityPolicy: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object DomainNameArgs {
  @scala.inline
  def apply(domainName: Input[String]): DomainNameArgs = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainNameArgs]
  }
  @scala.inline
  implicit class DomainNameArgsOps[Self <: DomainNameArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCertificateArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateArn")(js.undefined)
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
    def withCertificateName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateName")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificatePrivateKey(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificatePrivateKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificatePrivateKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificatePrivateKey")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointConfiguration(value: Input[DomainNameEndpointConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withRegionalCertificateArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionalCertificateArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegionalCertificateArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionalCertificateArn")(js.undefined)
        ret
    }
    @scala.inline
    def withRegionalCertificateName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionalCertificateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegionalCertificateName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionalCertificateName")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityPolicy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityPolicy")(js.undefined)
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
  }
  
}


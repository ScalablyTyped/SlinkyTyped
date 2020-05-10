package typingsSlinky.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyListenerInput extends js.Object {
  /**
    * [HTTPS and TLS listeners] The default certificate for the listener. You must provide exactly one certificate. Set CertificateArn to the certificate ARN but do not set IsDefault. To create a certificate list, use AddListenerCertificates.
    */
  var Certificates: js.UndefOr[CertificateList] = js.native
  /**
    * The actions for the default rule. The rule must include one forward action or one or more fixed-response actions. If the action type is forward, you specify one or more target groups. The protocol of the target group must be HTTP or HTTPS for an Application Load Balancer. The protocol of the target group must be TCP, TLS, UDP, or TCP_UDP for a Network Load Balancer. [HTTPS listeners] If the action type is authenticate-oidc, you authenticate users through an identity provider that is OpenID Connect (OIDC) compliant. [HTTPS listeners] If the action type is authenticate-cognito, you authenticate users through the user pools supported by Amazon Cognito. [Application Load Balancer] If the action type is redirect, you redirect specified client requests from one URL to another. [Application Load Balancer] If the action type is fixed-response, you drop specified client requests and return a custom HTTP response.
    */
  var DefaultActions: js.UndefOr[Actions] = js.native
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var ListenerArn: typingsSlinky.awsSdk.elbv2Mod.ListenerArn = js.native
  /**
    * The port for connections from clients to the load balancer.
    */
  var Port: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.Port] = js.native
  /**
    * The protocol for connections from clients to the load balancer. Application Load Balancers support the HTTP and HTTPS protocols. Network Load Balancers support the TCP, TLS, UDP, and TCP_UDP protocols.
    */
  var Protocol: js.UndefOr[ProtocolEnum] = js.native
  /**
    * [HTTPS and TLS listeners] The security policy that defines which protocols and ciphers are supported. The following are the possible values:    ELBSecurityPolicy-2016-08     ELBSecurityPolicy-TLS-1-0-2015-04     ELBSecurityPolicy-TLS-1-1-2017-01     ELBSecurityPolicy-TLS-1-2-2017-01     ELBSecurityPolicy-TLS-1-2-Ext-2018-06     ELBSecurityPolicy-FS-2018-06     ELBSecurityPolicy-FS-1-1-2019-08     ELBSecurityPolicy-FS-1-2-2019-08     ELBSecurityPolicy-FS-1-2-Res-2019-08    For more information, see Security Policies in the Application Load Balancers Guide and Security Policies in the Network Load Balancers Guide.
    */
  var SslPolicy: js.UndefOr[SslPolicyName] = js.native
}

object ModifyListenerInput {
  @scala.inline
  def apply(ListenerArn: ListenerArn): ModifyListenerInput = {
    val __obj = js.Dynamic.literal(ListenerArn = ListenerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyListenerInput]
  }
  @scala.inline
  implicit class ModifyListenerInputOps[Self <: ModifyListenerInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withListenerArn(value: ListenerArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListenerArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCertificates(value: CertificateList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Certificates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Certificates")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultActions(value: Actions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultActions")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Port): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Port")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: ProtocolEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withSslPolicy(value: SslPolicyName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SslPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SslPolicy")(js.undefined)
        ret
    }
  }
  
}


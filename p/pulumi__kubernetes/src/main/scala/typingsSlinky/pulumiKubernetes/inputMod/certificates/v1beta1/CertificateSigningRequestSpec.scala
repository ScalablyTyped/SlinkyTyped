package typingsSlinky.pulumiKubernetes.inputMod.certificates.v1beta1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This information is immutable after the request is created. Only the Request and Usages
  * fields can be set on creation, other fields are derived by Kubernetes and cannot be modified
  * by users.
  */
@js.native
trait CertificateSigningRequestSpec extends js.Object {
  /**
    * Extra information about the requesting user. See user.Info interface for details.
    */
  var extra: js.UndefOr[Input[js.Object]] = js.native
  /**
    * Group information about the requesting user. See user.Info interface for details.
    */
  var groups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Base64-encoded PKCS#10 CSR data
    */
  var request: Input[String] = js.native
  /**
    * UID information about the requesting user. See user.Info interface for details.
    */
  var uid: js.UndefOr[Input[String]] = js.native
  /**
    * allowedUsages specifies a set of usage contexts the key will be valid for. See:
    * https://tools.ietf.org/html/rfc5280#section-4.2.1.3
    *      https://tools.ietf.org/html/rfc5280#section-4.2.1.12
    */
  var usages: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Information about the requesting user. See user.Info interface for details.
    */
  var username: js.UndefOr[Input[String]] = js.native
}

object CertificateSigningRequestSpec {
  @scala.inline
  def apply(request: Input[String]): CertificateSigningRequestSpec = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateSigningRequestSpec]
  }
  @scala.inline
  implicit class CertificateSigningRequestSpecOps[Self <: CertificateSigningRequestSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequest(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtra(value: Input[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtra: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(js.undefined)
        ret
    }
    @scala.inline
    def withGroups(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(js.undefined)
        ret
    }
    @scala.inline
    def withUid(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(js.undefined)
        ret
    }
    @scala.inline
    def withUsages(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usages")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
  }
  
}


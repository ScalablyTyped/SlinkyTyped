package typingsSlinky.pulumiKubernetes.outputMod.certificates.v1beta1

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
  val extra: js.Object = js.native
  /**
    * Group information about the requesting user. See user.Info interface for details.
    */
  val groups: js.Array[String] = js.native
  /**
    * Base64-encoded PKCS#10 CSR data
    */
  val request: String = js.native
  /**
    * UID information about the requesting user. See user.Info interface for details.
    */
  val uid: String = js.native
  /**
    * allowedUsages specifies a set of usage contexts the key will be valid for. See:
    * https://tools.ietf.org/html/rfc5280#section-4.2.1.3
    *      https://tools.ietf.org/html/rfc5280#section-4.2.1.12
    */
  val usages: js.Array[String] = js.native
  /**
    * Information about the requesting user. See user.Info interface for details.
    */
  val username: String = js.native
}

object CertificateSigningRequestSpec {
  @scala.inline
  def apply(
    extra: js.Object,
    groups: js.Array[String],
    request: String,
    uid: String,
    usages: js.Array[String],
    username: String
  ): CertificateSigningRequestSpec = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], usages = usages.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateSigningRequestSpec]
  }
  @scala.inline
  implicit class CertificateSigningRequestSpecOps[Self <: CertificateSigningRequestSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtra(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroups(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


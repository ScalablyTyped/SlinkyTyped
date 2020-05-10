package typingsSlinky.firebaseAdmin.admin.projectManagement

import typingsSlinky.firebaseAdmin.firebaseAdminStrings.sha1_
import typingsSlinky.firebaseAdmin.firebaseAdminStrings.sha256_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A SHA-1 or SHA-256 certificate.
  *
  * Do not call this constructor directly. Instead, use
  * [`projectManagement.shaCertificate()`](admin.projectManagement.ProjectManagement#shaCertificate).
  */
@js.native
trait ShaCertificate extends js.Object {
  /**
    * The SHA certificate type.
    *
    * @example
    * ```javascript
    * var certType = shaCertificate.certType;
    * ```
    */
  var certType: sha1_ | sha256_ = js.native
  /**
    * The fully-qualified resource name that identifies this sha-key.
    *
    * This is useful when manually constructing requests for Firebase's public API.
    *
    * @example
    * ```javascript
    * var resourceName = shaCertificate.resourceName;
    * ```
    */
  var resourceName: js.UndefOr[String] = js.native
  /**
    * The SHA-1 or SHA-256 hash for this certificate.
    *
    * @example
    * ```javascript
    * var shaHash = shaCertificate.shaHash;
    * ```
    */
  var shaHash: String = js.native
}

object ShaCertificate {
  @scala.inline
  def apply(certType: sha1_ | sha256_, shaHash: String): ShaCertificate = {
    val __obj = js.Dynamic.literal(certType = certType.asInstanceOf[js.Any], shaHash = shaHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShaCertificate]
  }
  @scala.inline
  implicit class ShaCertificateOps[Self <: ShaCertificate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertType(value: sha1_ | sha256_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShaHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shaHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceName")(js.undefined)
        ret
    }
  }
  
}


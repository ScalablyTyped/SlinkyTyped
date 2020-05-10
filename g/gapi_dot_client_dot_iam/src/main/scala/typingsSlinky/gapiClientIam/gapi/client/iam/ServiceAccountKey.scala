package typingsSlinky.gapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceAccountKey extends js.Object {
  /** Specifies the algorithm (and possibly key size) for the key. */
  var keyAlgorithm: js.UndefOr[String] = js.native
  /**
    * The resource name of the service account key in the following format
    * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{key}`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The private key data. Only provided in `CreateServiceAccountKey`
    * responses. Make sure to keep the private key data secure because it
    * allows for the assertion of the service account identity.
    * When decoded, the private key data can be used to authenticate with
    * Google API client libraries and with
    * <a href="/sdk/gcloud/reference/auth/activate-service-account">gcloud
    * auth activate-service-account</a>.
    */
  var privateKeyData: js.UndefOr[String] = js.native
  /**
    * The output format for the private key.
    * Only provided in `CreateServiceAccountKey` responses, not
    * in `GetServiceAccountKey` or `ListServiceAccountKey` responses.
    *
    * Google never exposes system-managed private keys, and never retains
    * user-managed private keys.
    */
  var privateKeyType: js.UndefOr[String] = js.native
  /** The public key data. Only provided in `GetServiceAccountKey` responses. */
  var publicKeyData: js.UndefOr[String] = js.native
  /** The key can be used after this timestamp. */
  var validAfterTime: js.UndefOr[String] = js.native
  /** The key can be used before this timestamp. */
  var validBeforeTime: js.UndefOr[String] = js.native
}

object ServiceAccountKey {
  @scala.inline
  def apply(): ServiceAccountKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceAccountKey]
  }
  @scala.inline
  implicit class ServiceAccountKeyOps[Self <: ServiceAccountKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateKeyData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKeyData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateKeyData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKeyData")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateKeyType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKeyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateKeyType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKeyType")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicKeyData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKeyData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicKeyData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKeyData")(js.undefined)
        ret
    }
    @scala.inline
    def withValidAfterTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validAfterTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidAfterTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validAfterTime")(js.undefined)
        ret
    }
    @scala.inline
    def withValidBeforeTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validBeforeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidBeforeTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validBeforeTime")(js.undefined)
        ret
    }
  }
  
}


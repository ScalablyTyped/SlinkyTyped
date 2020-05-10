package typingsSlinky.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentitytoolkitRelyingpartyUploadAccountRequest extends js.Object {
  /** Whether allow overwrite existing account when user local_id exists. */
  var allowOverwrite: js.UndefOr[Boolean] = js.native
  var blockSize: js.UndefOr[Double] = js.native
  /** The following 4 fields are for standard scrypt algorithm. */
  var cpuMemCost: js.UndefOr[Double] = js.native
  /** GCP project number of the requesting delegated app. Currently only intended for Firebase V1 migration. */
  var delegatedProjectNumber: js.UndefOr[String] = js.native
  var dkLen: js.UndefOr[Double] = js.native
  /** The password hash algorithm. */
  var hashAlgorithm: js.UndefOr[String] = js.native
  /** Memory cost for hash calculation. Used by scrypt similar algorithms. */
  var memoryCost: js.UndefOr[Double] = js.native
  var parallelization: js.UndefOr[Double] = js.native
  /** Rounds for hash calculation. Used by scrypt and similar algorithms. */
  var rounds: js.UndefOr[Double] = js.native
  /** The salt separator. */
  var saltSeparator: js.UndefOr[String] = js.native
  /** If true, backend will do sanity check(including duplicate email and federated id) when uploading account. */
  var sanityCheck: js.UndefOr[Boolean] = js.native
  /** The key for to hash the password. */
  var signerKey: js.UndefOr[String] = js.native
  /** Specify which project (field value is actually project id) to operate. Only used when provided credential. */
  var targetProjectId: js.UndefOr[String] = js.native
  /** The account info to be stored. */
  var users: js.UndefOr[js.Array[UserInfo]] = js.native
}

object IdentitytoolkitRelyingpartyUploadAccountRequest {
  @scala.inline
  def apply(): IdentitytoolkitRelyingpartyUploadAccountRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyUploadAccountRequest]
  }
  @scala.inline
  implicit class IdentitytoolkitRelyingpartyUploadAccountRequestOps[Self <: IdentitytoolkitRelyingpartyUploadAccountRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowOverwrite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowOverwrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowOverwrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowOverwrite")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockSize")(js.undefined)
        ret
    }
    @scala.inline
    def withCpuMemCost(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuMemCost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpuMemCost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuMemCost")(js.undefined)
        ret
    }
    @scala.inline
    def withDelegatedProjectNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegatedProjectNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelegatedProjectNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegatedProjectNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withDkLen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dkLen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDkLen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dkLen")(js.undefined)
        ret
    }
    @scala.inline
    def withHashAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withMemoryCost(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryCost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemoryCost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryCost")(js.undefined)
        ret
    }
    @scala.inline
    def withParallelization(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallelization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelization")(js.undefined)
        ret
    }
    @scala.inline
    def withRounds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rounds")(js.undefined)
        ret
    }
    @scala.inline
    def withSaltSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saltSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaltSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saltSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withSanityCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanityCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSanityCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanityCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withSignerKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signerKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignerKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signerKey")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetProjectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetProjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetProjectId")(js.undefined)
        ret
    }
    @scala.inline
    def withUsers(value: js.Array[UserInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(js.undefined)
        ret
    }
  }
  
}


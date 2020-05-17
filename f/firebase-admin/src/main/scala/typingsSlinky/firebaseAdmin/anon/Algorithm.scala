package typingsSlinky.firebaseAdmin.anon

import typingsSlinky.firebaseAdmin.admin.auth.HashAlgorithmType
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Algorithm extends js.Object {
  /**
    * The password hashing algorithm identifier. The following algorithm
    * identifiers are supported:
    * `SCRYPT`, `STANDARD_SCRYPT`, `HMAC_SHA512`, `HMAC_SHA256`, `HMAC_SHA1`,
    * `HMAC_MD5`, `MD5`, `PBKDF_SHA1`, `BCRYPT`, `PBKDF2_SHA256`, `SHA512`,
    * `SHA256` and `SHA1`.
    */
  var algorithm: HashAlgorithmType = js.native
  /**
    * The block size (normally 8) of the hashing algorithm. Required for the
    * `STANDARD_SCRYPT` algorithm.
    */
  var blockSize: js.UndefOr[Double] = js.native
  /**
    * The derived key length of the hashing algorithm. Required for the
    * `STANDARD_SCRYPT` algorithm.
    */
  var derivedKeyLength: js.UndefOr[Double] = js.native
  /**
    * The signing key used in the hash algorithm in buffer bytes.
    * Required by hashing algorithms `SCRYPT`, `HMAC_SHA512`, `HMAC_SHA256`,
    * `HAMC_SHA1` and `HMAC_MD5`.
    */
  var key: js.UndefOr[Buffer] = js.native
  /**
    * The memory cost required for `SCRYPT` algorithm, or the CPU/memory cost.
    * Required for `STANDARD_SCRYPT` algorithm.
    */
  var memoryCost: js.UndefOr[Double] = js.native
  /**
    * The parallelization of the hashing algorithm. Required for the
    * `STANDARD_SCRYPT` algorithm.
    */
  var parallelization: js.UndefOr[Double] = js.native
  /**
    * The number of rounds for hashing calculation.
    * Required for `SCRYPT`, `MD5`, `SHA512`, `SHA256`, `SHA1`, `PBKDF_SHA1` and
    * `PBKDF2_SHA256`.
    */
  var rounds: js.UndefOr[Double] = js.native
  /**
    * The salt separator in buffer bytes which is appended to salt when
    * verifying a password. This is only used by the `SCRYPT` algorithm.
    */
  var saltSeparator: js.UndefOr[Buffer] = js.native
}

object Algorithm {
  @scala.inline
  def apply(algorithm: HashAlgorithmType): Algorithm = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Algorithm]
  }
  @scala.inline
  implicit class AlgorithmOps[Self <: Algorithm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithm(value: HashAlgorithmType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(value.asInstanceOf[js.Any])
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
    def withDerivedKeyLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("derivedKeyLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDerivedKeyLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("derivedKeyLength")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
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
    def withSaltSeparator(value: Buffer): Self = {
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
  }
  
}


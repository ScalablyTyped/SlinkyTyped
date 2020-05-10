package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetaGetResponseSshKeyFingerprints extends js.Object {
  var MD5_DSA: String = js.native
  var MD5_RSA: String = js.native
  var SHA256_DSA: String = js.native
  var SHA256_RSA: String = js.native
}

object MetaGetResponseSshKeyFingerprints {
  @scala.inline
  def apply(MD5_DSA: String, MD5_RSA: String, SHA256_DSA: String, SHA256_RSA: String): MetaGetResponseSshKeyFingerprints = {
    val __obj = js.Dynamic.literal(MD5_DSA = MD5_DSA.asInstanceOf[js.Any], MD5_RSA = MD5_RSA.asInstanceOf[js.Any], SHA256_DSA = SHA256_DSA.asInstanceOf[js.Any], SHA256_RSA = SHA256_RSA.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaGetResponseSshKeyFingerprints]
  }
  @scala.inline
  implicit class MetaGetResponseSshKeyFingerprintsOps[Self <: MetaGetResponseSshKeyFingerprints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMD5_DSA(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MD5_DSA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMD5_RSA(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MD5_RSA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSHA256_DSA(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHA256_DSA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSHA256_RSA(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHA256_RSA")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


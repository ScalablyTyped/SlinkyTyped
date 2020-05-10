package typingsSlinky.loopback

import typingsSlinky.loopback.mod.ACL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHashAlgorithm extends js.Object {
  var acls: js.Array[ACL] = js.native
  var hashAlgorithm: String = js.native
  var http: AnonPath = js.native
  var ignoreErrors: Boolean = js.native
}

object AnonHashAlgorithm {
  @scala.inline
  def apply(acls: js.Array[ACL], hashAlgorithm: String, http: AnonPath, ignoreErrors: Boolean): AnonHashAlgorithm = {
    val __obj = js.Dynamic.literal(acls = acls.asInstanceOf[js.Any], hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], ignoreErrors = ignoreErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHashAlgorithm]
  }
  @scala.inline
  implicit class AnonHashAlgorithmOps[Self <: AnonHashAlgorithm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcls(value: js.Array[ACL]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHashAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttp(value: AnonPath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoreErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreErrors")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


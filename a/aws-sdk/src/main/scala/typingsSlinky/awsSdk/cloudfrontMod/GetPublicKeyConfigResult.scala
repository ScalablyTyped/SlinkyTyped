package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPublicKeyConfigResult extends js.Object {
  /**
    * The current version of the public key configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * Return the result for the public key configuration.
    */
  var PublicKeyConfig: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.PublicKeyConfig] = js.native
}

object GetPublicKeyConfigResult {
  @scala.inline
  def apply(): GetPublicKeyConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPublicKeyConfigResult]
  }
  @scala.inline
  implicit class GetPublicKeyConfigResultOps[Self <: GetPublicKeyConfigResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withETag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ETag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutETag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ETag")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicKeyConfig(value: PublicKeyConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicKeyConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicKeyConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicKeyConfig")(js.undefined)
        ret
    }
  }
  
}


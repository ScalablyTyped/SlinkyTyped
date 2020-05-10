package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePublicKeyResult extends js.Object {
  /**
    * The current version of the update public key result. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * Return the results of updating the public key.
    */
  var PublicKey: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.PublicKey] = js.native
}

object UpdatePublicKeyResult {
  @scala.inline
  def apply(): UpdatePublicKeyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePublicKeyResult]
  }
  @scala.inline
  implicit class UpdatePublicKeyResultOps[Self <: UpdatePublicKeyResult] (val x: Self) extends AnyVal {
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
    def withPublicKey(value: PublicKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicKey")(js.undefined)
        ret
    }
  }
  
}


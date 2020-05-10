package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPublicKeysResult extends js.Object {
  /**
    * Returns a list of all public keys that have been added to CloudFront for this account.
    */
  var PublicKeyList: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.PublicKeyList] = js.native
}

object ListPublicKeysResult {
  @scala.inline
  def apply(): ListPublicKeysResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPublicKeysResult]
  }
  @scala.inline
  implicit class ListPublicKeysResultOps[Self <: ListPublicKeysResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPublicKeyList(value: PublicKeyList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicKeyList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicKeyList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicKeyList")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPublicKeysResponse extends js.Object {
  /**
    * Reserved for future use.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Contains an array of PublicKey objects.  The returned public keys may have validity time ranges that overlap. 
    */
  var PublicKeyList: js.UndefOr[typingsSlinky.awsSdk.cloudtrailMod.PublicKeyList] = js.native
}

object ListPublicKeysResponse {
  @scala.inline
  def apply(): ListPublicKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPublicKeysResponse]
  }
  @scala.inline
  implicit class ListPublicKeysResponseOps[Self <: ListPublicKeysResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
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


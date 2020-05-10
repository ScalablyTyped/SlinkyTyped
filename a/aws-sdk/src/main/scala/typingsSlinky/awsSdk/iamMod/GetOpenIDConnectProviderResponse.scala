package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOpenIDConnectProviderResponse extends js.Object {
  /**
    * A list of client IDs (also known as audiences) that are associated with the specified IAM OIDC provider resource object. For more information, see CreateOpenIDConnectProvider.
    */
  var ClientIDList: js.UndefOr[clientIDListType] = js.native
  /**
    * The date and time when the IAM OIDC provider resource object was created in the AWS account.
    */
  var CreateDate: js.UndefOr[js.Date] = js.native
  /**
    * A list of certificate thumbprints that are associated with the specified IAM OIDC provider resource object. For more information, see CreateOpenIDConnectProvider. 
    */
  var ThumbprintList: js.UndefOr[thumbprintListType] = js.native
  /**
    * The URL that the IAM OIDC provider resource object is associated with. For more information, see CreateOpenIDConnectProvider.
    */
  var Url: js.UndefOr[OpenIDConnectProviderUrlType] = js.native
}

object GetOpenIDConnectProviderResponse {
  @scala.inline
  def apply(): GetOpenIDConnectProviderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOpenIDConnectProviderResponse]
  }
  @scala.inline
  implicit class GetOpenIDConnectProviderResponseOps[Self <: GetOpenIDConnectProviderResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientIDList(value: clientIDListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientIDList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientIDList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientIDList")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateDate")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbprintList(value: thumbprintListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThumbprintList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbprintList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThumbprintList")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: OpenIDConnectProviderUrlType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.mangopay2NodejsSdk.anon

import typingsSlinky.mangopay2NodejsSdk.typesMod.DeepPartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.DeepPartial<{  clientId  :string,   apiVersion  :string,  readonly id  :string}> */
@js.native
trait DeepPartialclientIdstring extends js.Object {
  var apiVersion: js.UndefOr[DeepPartial[String]] = js.native
  var clientId: js.UndefOr[DeepPartial[String]] = js.native
  var id: js.UndefOr[DeepPartial[String]] = js.native
}

object DeepPartialclientIdstring {
  @scala.inline
  def apply(): DeepPartialclientIdstring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeepPartialclientIdstring]
  }
  @scala.inline
  implicit class DeepPartialclientIdstringOps[Self <: DeepPartialclientIdstring] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiVersion(value: DeepPartial[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withClientId(value: DeepPartial[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: DeepPartial[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
  }
  
}


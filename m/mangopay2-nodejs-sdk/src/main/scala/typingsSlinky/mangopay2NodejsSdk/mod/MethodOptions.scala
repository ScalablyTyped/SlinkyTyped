package typingsSlinky.mangopay2NodejsSdk.mod

import typingsSlinky.mangopay2NodejsSdk.DeepPartialPartialHeaders
import typingsSlinky.mangopay2NodejsSdk.DeepPartialclientIdstring
import typingsSlinky.mangopay2NodejsSdk.DeepPartialtimeoutnumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.DeepPartial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.RequestOptions> */
@js.native
trait MethodOptions extends js.Object {
  var data: js.UndefOr[WithToJson[js.Object] | String] = js.native
  var headers: js.UndefOr[DeepPartialPartialHeaders] = js.native
  var parameters: js.UndefOr[FilterOptions with PaginationOptions] = js.native
  var path: js.UndefOr[DeepPartialclientIdstring] = js.native
  var requestConfig: js.UndefOr[DeepPartialtimeoutnumber] = js.native
  var responseConfig: js.UndefOr[DeepPartialtimeoutnumber] = js.native
}

object MethodOptions {
  @scala.inline
  def apply(): MethodOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MethodOptions]
  }
  @scala.inline
  implicit class MethodOptionsOps[Self <: MethodOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: WithToJson[js.Object] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: DeepPartialPartialHeaders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: FilterOptions with PaginationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: DeepPartialclientIdstring): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestConfig(value: DeepPartialtimeoutnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseConfig(value: DeepPartialtimeoutnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseConfig")(js.undefined)
        ret
    }
  }
  
}


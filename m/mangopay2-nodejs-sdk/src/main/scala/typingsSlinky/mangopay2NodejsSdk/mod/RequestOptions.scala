package typingsSlinky.mangopay2NodejsSdk.mod

import typingsSlinky.mangopay2NodejsSdk.AnonApiVersion
import typingsSlinky.mangopay2NodejsSdk.AnonTimeout
import typingsSlinky.mangopay2NodejsSdk.PartialHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestOptions extends js.Object {
  var headers: PartialHeaders = js.native
  /**
    * Path options are replacing the ${placeholders} from apiMethods
    */
  var path: AnonApiVersion = js.native
  var requestConfig: AnonTimeout = js.native
  var responseConfig: AnonTimeout = js.native
}

object RequestOptions {
  @scala.inline
  def apply(
    headers: PartialHeaders,
    path: AnonApiVersion,
    requestConfig: AnonTimeout,
    responseConfig: AnonTimeout
  ): RequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requestConfig = requestConfig.asInstanceOf[js.Any], responseConfig = responseConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
  @scala.inline
  implicit class RequestOptionsOps[Self <: RequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeaders(value: PartialHeaders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: AnonApiVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestConfig(value: AnonTimeout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseConfig(value: AnonTimeout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseConfig")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


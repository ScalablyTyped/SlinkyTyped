package typingsSlinky.atGoogleDashCloudCommon.buildSrcUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedHttpResponseBody extends js.Object {
  var body: ResponseBody
  var err: js.UndefOr[js.Error] = js.undefined
}

object ParsedHttpResponseBody {
  @scala.inline
  def apply(body: ResponseBody, err: js.Error = null): ParsedHttpResponseBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (err != null) __obj.updateDynamic("err")(err.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedHttpResponseBody]
  }
}


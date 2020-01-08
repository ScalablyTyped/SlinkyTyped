package typingsSlinky.rnDashFetchDashBlob.rnDashFetchDashBlobMod

import typingsSlinky.rnDashFetchDashBlob.rnDashFetchDashBlobStrings._empty
import typingsSlinky.rnDashFetchDashBlob.rnDashFetchDashBlobStrings.ascii
import typingsSlinky.rnDashFetchDashBlob.rnDashFetchDashBlobStrings.base64
import typingsSlinky.rnDashFetchDashBlob.rnDashFetchDashBlobStrings.blob
import typingsSlinky.rnDashFetchDashBlob.rnDashFetchDashBlobStrings.json
import typingsSlinky.rnDashFetchDashBlob.rnDashFetchDashBlobStrings.path
import typingsSlinky.rnDashFetchDashBlob.rnDashFetchDashBlobStrings.text
import typingsSlinky.rnDashFetchDashBlob.rnDashFetchDashBlobStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RNFetchBlobResponseInfo extends js.Object {
  var headers: js.Any
  var respType: text | blob | _empty | json
  var rnfbEncode: path | base64 | ascii | utf8
  var state: Double
  var status: Double
  var taskId: String
}

object RNFetchBlobResponseInfo {
  @scala.inline
  def apply(
    headers: js.Any,
    respType: text | blob | _empty | json,
    rnfbEncode: path | base64 | ascii | utf8,
    state: Double,
    status: Double,
    taskId: String
  ): RNFetchBlobResponseInfo = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], respType = respType.asInstanceOf[js.Any], rnfbEncode = rnfbEncode.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RNFetchBlobResponseInfo]
  }
}


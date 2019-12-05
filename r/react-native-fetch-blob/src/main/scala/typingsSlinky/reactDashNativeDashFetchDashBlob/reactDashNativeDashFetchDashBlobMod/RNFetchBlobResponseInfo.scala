package typingsSlinky.reactDashNativeDashFetchDashBlob.reactDashNativeDashFetchDashBlobMod

import typingsSlinky.reactDashNativeDashFetchDashBlob.reactDashNativeDashFetchDashBlobStrings.Empty
import typingsSlinky.reactDashNativeDashFetchDashBlob.reactDashNativeDashFetchDashBlobStrings.ascii
import typingsSlinky.reactDashNativeDashFetchDashBlob.reactDashNativeDashFetchDashBlobStrings.base64
import typingsSlinky.reactDashNativeDashFetchDashBlob.reactDashNativeDashFetchDashBlobStrings.blob
import typingsSlinky.reactDashNativeDashFetchDashBlob.reactDashNativeDashFetchDashBlobStrings.json
import typingsSlinky.reactDashNativeDashFetchDashBlob.reactDashNativeDashFetchDashBlobStrings.path
import typingsSlinky.reactDashNativeDashFetchDashBlob.reactDashNativeDashFetchDashBlobStrings.text
import typingsSlinky.reactDashNativeDashFetchDashBlob.reactDashNativeDashFetchDashBlobStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RNFetchBlobResponseInfo extends js.Object {
  var headers: js.Any
  var respType: text | blob | Empty | json
  var rnfbEncode: path | base64 | ascii | utf8
  var state: Double
  var status: Double
  var taskId: String
}

object RNFetchBlobResponseInfo {
  @scala.inline
  def apply(
    headers: js.Any,
    respType: text | blob | Empty | json,
    rnfbEncode: path | base64 | ascii | utf8,
    state: Double,
    status: Double,
    taskId: String
  ): RNFetchBlobResponseInfo = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], respType = respType.asInstanceOf[js.Any], rnfbEncode = rnfbEncode.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RNFetchBlobResponseInfo]
  }
}


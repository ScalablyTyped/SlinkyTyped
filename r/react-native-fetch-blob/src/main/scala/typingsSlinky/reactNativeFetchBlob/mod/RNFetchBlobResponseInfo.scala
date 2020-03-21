package typingsSlinky.reactNativeFetchBlob.mod

import typingsSlinky.reactNativeFetchBlob.reactNativeFetchBlobStrings._empty
import typingsSlinky.reactNativeFetchBlob.reactNativeFetchBlobStrings.ascii
import typingsSlinky.reactNativeFetchBlob.reactNativeFetchBlobStrings.base64
import typingsSlinky.reactNativeFetchBlob.reactNativeFetchBlobStrings.blob
import typingsSlinky.reactNativeFetchBlob.reactNativeFetchBlobStrings.json
import typingsSlinky.reactNativeFetchBlob.reactNativeFetchBlobStrings.path
import typingsSlinky.reactNativeFetchBlob.reactNativeFetchBlobStrings.text
import typingsSlinky.reactNativeFetchBlob.reactNativeFetchBlobStrings.utf8
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


package typingsSlinky.rnFetchBlob.mod

import typingsSlinky.rnFetchBlob.rnFetchBlobStrings._empty
import typingsSlinky.rnFetchBlob.rnFetchBlobStrings.ascii
import typingsSlinky.rnFetchBlob.rnFetchBlobStrings.base64
import typingsSlinky.rnFetchBlob.rnFetchBlobStrings.blob
import typingsSlinky.rnFetchBlob.rnFetchBlobStrings.json
import typingsSlinky.rnFetchBlob.rnFetchBlobStrings.path
import typingsSlinky.rnFetchBlob.rnFetchBlobStrings.text
import typingsSlinky.rnFetchBlob.rnFetchBlobStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RNFetchBlobResponseInfo extends js.Object {
  var headers: js.Any = js.native
  var respType: text | blob | _empty | json = js.native
  var rnfbEncode: path | base64 | ascii | utf8 = js.native
  var state: Double = js.native
  var status: Double = js.native
  var taskId: String = js.native
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
  @scala.inline
  implicit class RNFetchBlobResponseInfoOps[Self <: RNFetchBlobResponseInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRespType(value: text | blob | _empty | json): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("respType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRnfbEncode(value: path | base64 | ascii | utf8): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rnfbEncode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


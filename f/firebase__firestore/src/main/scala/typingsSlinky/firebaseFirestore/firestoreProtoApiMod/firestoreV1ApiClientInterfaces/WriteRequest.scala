package typingsSlinky.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteRequest extends js.Object {
  var labels: js.UndefOr[ApiClientObjectMap[String]] = js.native
  var streamId: js.UndefOr[String] = js.native
  var streamToken: js.UndefOr[String] = js.native
  var writes: js.UndefOr[js.Array[Write]] = js.native
}

object WriteRequest {
  @scala.inline
  def apply(): WriteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteRequest]
  }
  @scala.inline
  implicit class WriteRequestOps[Self <: WriteRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabels(value: ApiClientObjectMap[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamId")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamToken")(js.undefined)
        ret
    }
    @scala.inline
    def withWrites(value: js.Array[Write]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrites: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writes")(js.undefined)
        ret
    }
  }
  
}


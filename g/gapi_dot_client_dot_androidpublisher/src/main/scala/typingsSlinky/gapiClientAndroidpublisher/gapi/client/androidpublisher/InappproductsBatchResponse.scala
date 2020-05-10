package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InappproductsBatchResponse extends js.Object {
  var entrys: js.UndefOr[js.Array[InappproductsBatchResponseEntry]] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "androidpublisher#inappproductsBatchResponse". */
  var kind: js.UndefOr[String] = js.native
}

object InappproductsBatchResponse {
  @scala.inline
  def apply(): InappproductsBatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InappproductsBatchResponse]
  }
  @scala.inline
  implicit class InappproductsBatchResponseOps[Self <: InappproductsBatchResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntrys(value: js.Array[InappproductsBatchResponseEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entrys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntrys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entrys")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}


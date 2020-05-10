package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGossipBlockRequest extends js.Object {
  /** GossipBlockRequest blockId */
  var blockId: js.UndefOr[String | Null] = js.native
  /** GossipBlockRequest nonce */
  var nonce: js.UndefOr[String | Null] = js.native
  /** GossipBlockRequest timeToLive */
  var timeToLive: js.UndefOr[Double | Null] = js.native
}

object IGossipBlockRequest {
  @scala.inline
  def apply(): IGossipBlockRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGossipBlockRequest]
  }
  @scala.inline
  implicit class IGossipBlockRequestOps[Self <: IGossipBlockRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockId")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockId")(null)
        ret
    }
    @scala.inline
    def withNonce(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(js.undefined)
        ret
    }
    @scala.inline
    def withNonceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(null)
        ret
    }
    @scala.inline
    def withTimeToLive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeToLive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeToLive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeToLive")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeToLiveNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeToLive")(null)
        ret
    }
  }
  
}


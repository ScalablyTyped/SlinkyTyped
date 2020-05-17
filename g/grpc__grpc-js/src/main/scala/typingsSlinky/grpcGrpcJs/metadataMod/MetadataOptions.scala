package typingsSlinky.grpcGrpcJs.metadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataOptions extends js.Object {
  var cacheableRequest: js.UndefOr[Boolean] = js.native
  var corked: js.UndefOr[Boolean] = js.native
  var idempotentRequest: js.UndefOr[Boolean] = js.native
  var waitForReady: js.UndefOr[Boolean] = js.native
}

object MetadataOptions {
  @scala.inline
  def apply(): MetadataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataOptions]
  }
  @scala.inline
  implicit class MetadataOptionsOps[Self <: MetadataOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheableRequest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheableRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheableRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheableRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withCorked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corked")(js.undefined)
        ret
    }
    @scala.inline
    def withIdempotentRequest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idempotentRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdempotentRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idempotentRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForReady(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForReady")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForReady")(js.undefined)
        ret
    }
  }
  
}


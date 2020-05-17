package typingsSlinky.pubnub.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FreeSocketKeepAliveTimeout extends js.Object {
  var freeSocketKeepAliveTimeout: js.UndefOr[Double] = js.native
  var keepAliveMsecs: js.UndefOr[Double] = js.native
  var maxFreeSockets: js.UndefOr[Double] = js.native
  var maxSockets: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object FreeSocketKeepAliveTimeout {
  @scala.inline
  def apply(): FreeSocketKeepAliveTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FreeSocketKeepAliveTimeout]
  }
  @scala.inline
  implicit class FreeSocketKeepAliveTimeoutOps[Self <: FreeSocketKeepAliveTimeout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFreeSocketKeepAliveTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeSocketKeepAliveTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreeSocketKeepAliveTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeSocketKeepAliveTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepAliveMsecs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAliveMsecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepAliveMsecs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAliveMsecs")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFreeSockets(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFreeSockets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFreeSockets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFreeSockets")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSockets(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSockets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSockets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSockets")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}


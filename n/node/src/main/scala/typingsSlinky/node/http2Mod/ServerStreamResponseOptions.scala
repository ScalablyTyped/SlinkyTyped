package typingsSlinky.node.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerStreamResponseOptions extends js.Object {
  var endStream: js.UndefOr[Boolean] = js.native
  var waitForTrailers: js.UndefOr[Boolean] = js.native
}

object ServerStreamResponseOptions {
  @scala.inline
  def apply(): ServerStreamResponseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerStreamResponseOptions]
  }
  @scala.inline
  implicit class ServerStreamResponseOptionsOps[Self <: ServerStreamResponseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndStream(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endStream")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForTrailers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForTrailers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForTrailers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForTrailers")(js.undefined)
        ret
    }
  }
  
}


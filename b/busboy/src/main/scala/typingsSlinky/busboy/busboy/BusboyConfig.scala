package typingsSlinky.busboy.busboy

import typingsSlinky.busboy.anon.FieldNameSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BusboyConfig extends js.Object {
  var defCharset: js.UndefOr[String] = js.native
  var fileHwm: js.UndefOr[Double] = js.native
  var headers: js.UndefOr[js.Any] = js.native
  var highWaterMark: js.UndefOr[Double] = js.native
  var limits: js.UndefOr[FieldNameSize] = js.native
  var preservePath: js.UndefOr[Boolean] = js.native
}

object BusboyConfig {
  @scala.inline
  def apply(): BusboyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusboyConfig]
  }
  @scala.inline
  implicit class BusboyConfigOps[Self <: BusboyConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefCharset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defCharset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefCharset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defCharset")(js.undefined)
        ret
    }
    @scala.inline
    def withFileHwm(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileHwm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileHwm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileHwm")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withHighWaterMark(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highWaterMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighWaterMark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highWaterMark")(js.undefined)
        ret
    }
    @scala.inline
    def withLimits(value: FieldNameSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limits")(js.undefined)
        ret
    }
    @scala.inline
    def withPreservePath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preservePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreservePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preservePath")(js.undefined)
        ret
    }
  }
  
}


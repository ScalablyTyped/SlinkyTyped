package typingsSlinky.openseadragon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMaxImageCacheCount extends js.Object {
  var maxImageCacheCount: js.UndefOr[Double] = js.native
}

object AnonMaxImageCacheCount {
  @scala.inline
  def apply(): AnonMaxImageCacheCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMaxImageCacheCount]
  }
  @scala.inline
  implicit class AnonMaxImageCacheCountOps[Self <: AnonMaxImageCacheCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxImageCacheCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxImageCacheCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxImageCacheCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxImageCacheCount")(js.undefined)
        ret
    }
  }
  
}


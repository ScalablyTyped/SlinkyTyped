package typingsSlinky.reReselect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCacheSize extends js.Object {
  var cacheSize: Double = js.native
}

object AnonCacheSize {
  @scala.inline
  def apply(cacheSize: Double): AnonCacheSize = {
    val __obj = js.Dynamic.literal(cacheSize = cacheSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCacheSize]
  }
  @scala.inline
  implicit class AnonCacheSizeOps[Self <: AnonCacheSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


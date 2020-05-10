package typingsSlinky.easyXHeaders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHeapTotal extends js.Object {
  var heapTotal: Double = js.native
  var heapUsed: Double = js.native
  var rss: Double = js.native
}

object AnonHeapTotal {
  @scala.inline
  def apply(heapTotal: Double, heapUsed: Double, rss: Double): AnonHeapTotal = {
    val __obj = js.Dynamic.literal(heapTotal = heapTotal.asInstanceOf[js.Any], heapUsed = heapUsed.asInstanceOf[js.Any], rss = rss.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeapTotal]
  }
  @scala.inline
  implicit class AnonHeapTotalOps[Self <: AnonHeapTotal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeapTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heapTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeapUsed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heapUsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRss(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rss")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


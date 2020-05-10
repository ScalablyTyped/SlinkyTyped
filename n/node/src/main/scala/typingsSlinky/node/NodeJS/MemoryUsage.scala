package typingsSlinky.node.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemoryUsage extends js.Object {
  var arrayBuffers: Double = js.native
  var external: Double = js.native
  var heapTotal: Double = js.native
  var heapUsed: Double = js.native
  var rss: Double = js.native
}

object MemoryUsage {
  @scala.inline
  def apply(arrayBuffers: Double, external: Double, heapTotal: Double, heapUsed: Double, rss: Double): MemoryUsage = {
    val __obj = js.Dynamic.literal(arrayBuffers = arrayBuffers.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any], heapTotal = heapTotal.asInstanceOf[js.Any], heapUsed = heapUsed.asInstanceOf[js.Any], rss = rss.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryUsage]
  }
  @scala.inline
  implicit class MemoryUsageOps[Self <: MemoryUsage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrayBuffers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayBuffers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external")(value.asInstanceOf[js.Any])
        ret
    }
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


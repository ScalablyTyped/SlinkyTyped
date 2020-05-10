package typingsSlinky.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatsConnectionTypes extends js.Object {
  var all: StatsResourceCount = js.native
  var plain: StatsResourceCount = js.native
  var tls: StatsResourceCount = js.native
}

object StatsConnectionTypes {
  @scala.inline
  def apply(all: StatsResourceCount, plain: StatsResourceCount, tls: StatsResourceCount): StatsConnectionTypes = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], plain = plain.asInstanceOf[js.Any], tls = tls.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatsConnectionTypes]
  }
  @scala.inline
  implicit class StatsConnectionTypesOps[Self <: StatsConnectionTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: StatsResourceCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlain(value: StatsResourceCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTls(value: StatsResourceCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tls")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


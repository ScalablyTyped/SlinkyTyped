package typingsSlinky.mongodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxStalenessSeconds extends js.Object {
  /**
    * Max Secondary Read Staleness in Seconds
    */
  var maxStalenessSeconds: js.UndefOr[Double] = js.native
}

object MaxStalenessSeconds {
  @scala.inline
  def apply(): MaxStalenessSeconds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxStalenessSeconds]
  }
  @scala.inline
  implicit class MaxStalenessSecondsOps[Self <: MaxStalenessSeconds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxStalenessSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxStalenessSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxStalenessSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxStalenessSeconds")(js.undefined)
        ret
    }
  }
  
}


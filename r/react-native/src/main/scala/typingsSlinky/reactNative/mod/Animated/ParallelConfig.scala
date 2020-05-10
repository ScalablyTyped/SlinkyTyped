package typingsSlinky.reactNative.mod.Animated

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParallelConfig extends js.Object {
  var stopTogether: js.UndefOr[Boolean] = js.native
}

object ParallelConfig {
  @scala.inline
  def apply(): ParallelConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParallelConfig]
  }
  @scala.inline
  implicit class ParallelConfigOps[Self <: ParallelConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStopTogether(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopTogether")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopTogether: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopTogether")(js.undefined)
        ret
    }
  }
  
}


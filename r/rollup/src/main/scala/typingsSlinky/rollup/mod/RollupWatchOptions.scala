package typingsSlinky.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RollupWatchOptions extends InputOptions {
  var output: js.UndefOr[OutputOptions | js.Array[OutputOptions]] = js.native
}

object RollupWatchOptions {
  @scala.inline
  def apply(): RollupWatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollupWatchOptions]
  }
  @scala.inline
  implicit class RollupWatchOptionsOps[Self <: RollupWatchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutput(value: OutputOptions | js.Array[OutputOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
        ret
    }
  }
  
}


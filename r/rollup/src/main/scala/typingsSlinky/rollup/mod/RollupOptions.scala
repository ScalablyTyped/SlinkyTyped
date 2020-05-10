package typingsSlinky.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RollupOptions extends InputOptions {
  // This is included for compatibility with config files but ignored by rollup.rollup
  var output: js.UndefOr[OutputOptions | js.Array[OutputOptions]] = js.native
}

object RollupOptions {
  @scala.inline
  def apply(): RollupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollupOptions]
  }
  @scala.inline
  implicit class RollupOptionsOps[Self <: RollupOptions] (val x: Self) extends AnyVal {
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


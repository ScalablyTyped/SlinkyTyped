package typingsSlinky.logform.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PadLevelsOptions extends js.Object {
  /**
    * Log levels. Defaults to `configs.npm.levels` from [triple-beam](https://github.com/winstonjs/triple-beam)
    * module.
    */
  var levels: js.UndefOr[Record[String, Double]] = js.native
}

object PadLevelsOptions {
  @scala.inline
  def apply(): PadLevelsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PadLevelsOptions]
  }
  @scala.inline
  implicit class PadLevelsOptionsOps[Self <: PadLevelsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLevels(value: Record[String, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levels")(js.undefined)
        ret
    }
  }
  
}


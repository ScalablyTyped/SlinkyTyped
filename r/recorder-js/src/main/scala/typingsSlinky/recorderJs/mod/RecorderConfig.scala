package typingsSlinky.recorderJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecorderConfig extends js.Object {
  var onAnalysed: js.UndefOr[OnAnalysedHandler] = js.native
}

object RecorderConfig {
  @scala.inline
  def apply(): RecorderConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecorderConfig]
  }
  @scala.inline
  implicit class RecorderConfigOps[Self <: RecorderConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnAnalysed(value: (/* data */ js.Array[Double], /* lastNonZero */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnalysed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnAnalysed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnalysed")(js.undefined)
        ret
    }
  }
  
}


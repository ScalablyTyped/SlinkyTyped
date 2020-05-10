package typingsSlinky.reactSparklines.mod

import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparklinesNormalBandProps extends js.Object {
  var style: js.UndefOr[CSSProperties] = js.native
}

object SparklinesNormalBandProps {
  @scala.inline
  def apply(): SparklinesNormalBandProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklinesNormalBandProps]
  }
  @scala.inline
  implicit class SparklinesNormalBandPropsOps[Self <: SparklinesNormalBandProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}


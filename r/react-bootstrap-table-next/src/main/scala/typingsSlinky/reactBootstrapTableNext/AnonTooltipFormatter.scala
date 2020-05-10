package typingsSlinky.reactBootstrapTableNext

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTooltipFormatter[T /* <: js.Object */] extends js.Object {
  var tooltipFormatter: js.UndefOr[js.Function1[/* row */ T, ReactElement]] = js.native
}

object AnonTooltipFormatter {
  @scala.inline
  def apply[T](): AnonTooltipFormatter[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonTooltipFormatter[T]]
  }
  @scala.inline
  implicit class AnonTooltipFormatterOps[Self[t] <: AnonTooltipFormatter[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withTooltipFormatter(value: /* row */ T => ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipFormatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTooltipFormatter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipFormatter")(js.undefined)
        ret
    }
  }
  
}


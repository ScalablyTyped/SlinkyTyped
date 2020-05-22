package typingsSlinky.reactBootstrapTableNext.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipFormatter[T /* <: js.Object */] extends js.Object {
  var tooltipFormatter: js.UndefOr[js.Function1[/* row */ T, ReactElement]] = js.undefined
}

object TooltipFormatter {
  @scala.inline
  def apply[T](tooltipFormatter: /* row */ T => ReactElement = null): TooltipFormatter[T] = {
    val __obj = js.Dynamic.literal()
    if (tooltipFormatter != null) __obj.updateDynamic("tooltipFormatter")(js.Any.fromFunction1(tooltipFormatter))
    __obj.asInstanceOf[TooltipFormatter[T]]
  }
}


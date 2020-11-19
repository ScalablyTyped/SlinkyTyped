package typingsSlinky.reactBootstrapTableNext.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipFormatter[T /* <: js.Object */] extends js.Object {
  
  var tooltipFormatter: js.UndefOr[js.Function1[/* row */ T, ReactElement]] = js.native
}
object TooltipFormatter {
  
  @scala.inline
  def apply[T /* <: js.Object */](): TooltipFormatter[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipFormatter[T]]
  }
  
  @scala.inline
  implicit class TooltipFormatterOps[Self <: TooltipFormatter[_], T /* <: js.Object */] (val x: Self with TooltipFormatter[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTooltipFormatter(value: /* row */ T => ReactElement): Self = this.set("tooltipFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTooltipFormatter: Self = this.set("tooltipFormatter", js.undefined)
  }
}

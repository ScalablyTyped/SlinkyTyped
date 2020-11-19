package typingsSlinky.reactTapEventPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrategyOverrides extends js.Object {
  
  var shouldRejectClick: js.UndefOr[
    js.Function2[/* lastTouchEventTimestamp */ js.Date, /* clickEventTimestamp */ js.Date, Boolean]
  ] = js.native
}
object StrategyOverrides {
  
  @scala.inline
  def apply(): StrategyOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrategyOverrides]
  }
  
  @scala.inline
  implicit class StrategyOverridesOps[Self <: StrategyOverrides] (val x: Self) extends AnyVal {
    
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
    def setShouldRejectClick(value: (/* lastTouchEventTimestamp */ js.Date, /* clickEventTimestamp */ js.Date) => Boolean): Self = this.set("shouldRejectClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteShouldRejectClick: Self = this.set("shouldRejectClick", js.undefined)
  }
}
